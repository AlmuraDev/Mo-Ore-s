package com.github.Zarklord1.MoOres.Events;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

public class MoOresEntityListener implements Listener  {
    	public static MoOres plugin;
    
    public MoOresEntityListener() {}
    
    @EventHandler(priority = EventPriority.LOW)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if(event.getCause() == DamageCause.PROJECTILE) {
            Entity entityhit = event.getEntity();
            if (event.getDamager() instanceof Arrow) {
                Arrow arrow = (Arrow) event.getDamager();
                if (arrow.getShooter() instanceof SpoutPlayer) {
                    SpoutPlayer player = (SpoutPlayer)arrow.getShooter();
                    if (player.isSpoutCraftEnabled()) {
                    	List<MetadataValue> list = arrow.getMetadata(arrow.getUniqueId().toString());
                    	for (MetadataValue value:list) {
                    		if (value.getOwningPlugin().equals(MoOres.plugin)) {
                    			if (value.value() instanceof CustomArrows) {
                    				CustomArrows itemarrow = (CustomArrows) value.value();
                    				event.setDamage(itemarrow.getDamage());
                                    if (itemarrow.isExplosiveArrow()) {
                                    	player.getWorld().createExplosion(entityhit.getLocation(), itemarrow.getExplosionPower(), true);
                                    }
                                    if (itemarrow.isFireArrow()) {
                                        entityhit.setFireTicks(itemarrow.getFireTicks());
                                    }
                                    if (itemarrow.isLightningArrow()) {
                                        for (int i = 0; i < itemarrow.getNumOfBolts(); i++) {
                                            player.getWorld().strikeLightning(entityhit.getLocation());
                                        }
                                    }
                                    
                                    if (entityhit instanceof LivingEntity && itemarrow.isPoisonArrow()) {
                                    	LivingEntity hit = (LivingEntity) entityhit;
                                    	hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, itemarrow.getPoisonTicks(), 1));
                                    }
                                    
                                    if (itemarrow.isEntityArrow()) {
                                    	player.getWorld().spawnEntity(entityhit.getLocation(), itemarrow.getEntityToSpawn().getType());
                                    }
                                    return;
                    			}
                    		}
                    	}
                    }
                }
            }
        } else if(event.getCause() == DamageCause.ENTITY_ATTACK) {
            Entity entityhit = event.getEntity();
            Entity entityhitting = event.getDamager();
            if (entityhitting instanceof SpoutPlayer) {
            	SpoutPlayer player = SpoutManager.getPlayer((Player) entityhitting);
            	for (CustomTools tool:BlockLoader.customtools){
            		if (player.isSpoutCraftEnabled()) {
            			if (player.getItemInHand().getTypeId() == 318 && player.getItemInHand().getDurability() == tool.getCustomId()) {
            				if (tool.isSword()) {
            					event.setDamage(tool.getdamage());
            					if (tool.isFireSword()) {
            						entityhit.setFireTicks(tool.getFireTicks());
            					}
            					if (entityhit instanceof LivingEntity && tool.isPoisonSword()) {
            						LivingEntity hit = (LivingEntity) entityhit;
            						hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, tool.getPoisonTicks(), 1));
            					}
            					if (tool.isLightningSword()) {
            						player.getWorld().strikeLightning(entityhit.getLocation());
            					}
            					CustomTools.setDurability(player.getItemInHand(), (short) (CustomTools.getDurability(player.getItemInHand()) + 1));
            					return;
            				} else {
                        		CustomTools.setDurability(player.getItemInHand(), (short) (CustomTools.getDurability(player.getItemInHand()) + 2));
                        		return;
                        	}
                    	} 
                    }
                }
            }                
        }
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onArrowShotFromBow(EntityShootBowEvent event) {
    	if (event.getEntity() instanceof Skeleton) {
    		@SuppressWarnings("unused")
    		Skeleton skelly = (Skeleton) event.getEntity();
    		//TODO add configuration to skeleton for custom arrows...
    	}
    }
    	
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onProjectileHit(ProjectileHitEvent event) {
    	MoOres.log.info("Called");
    	if (event.getEntity() instanceof Arrow) {
    		Arrow arrow = (Arrow) event.getEntity();
    		List<MetadataValue> list = arrow.getMetadata(arrow.getUniqueId().toString());
    		for (MetadataValue value:list) {
    			if (value.getOwningPlugin().equals(MoOres.plugin)) {
    				if (value.value() instanceof CustomArrows) {
    					CustomArrows itemarrow = (CustomArrows) value.value();
    					if (itemarrow.getRemove()) {
    						arrow.remove();
    					} else {
    						MoOresServerListener.isMoving.add(arrow.getUniqueId());
    					}
    					if (itemarrow.isExplosiveArrow()) {
    						arrow.getWorld().createExplosion(arrow.getLocation(), itemarrow.getExplosionPower(), true);
    					}
    					if (itemarrow.isFireArrow()) {
    						arrow.getLocation().getBlock().setType(Material.FIRE);
    					}
    					if (itemarrow.isLightningArrow()) {
    						for (int i = 0; i < itemarrow.getNumOfBolts(); i++) {
    							arrow.getWorld().strikeLightning(arrow.getLocation());
    						}
    					}
    					if (itemarrow.isEntityArrow()) {
    						arrow.getWorld().spawnEntity(arrow.getLocation(), itemarrow.getEntityToSpawn().getType());
    					}
    				}
    			}
    		}
    	}
    }
}
	
