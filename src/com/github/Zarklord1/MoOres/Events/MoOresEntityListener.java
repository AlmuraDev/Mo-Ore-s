package com.github.Zarklord1.MoOres.Events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Custom.Items.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.CustomTools;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

public class MoOresEntityListener implements Listener  {
    	public static MoOres plugin;
    
    public MoOresEntityListener() {}
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDamage ( EntityDamageByEntityEvent event )
    {
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
                    				Bukkit.broadcastMessage("Hi!");
                    				event.setDamage(itemarrow.getArrowDamage());
                                    if (itemarrow.isExplosiveArrow()) {
                                    	player.getWorld().createExplosion(player.getLocation(), itemarrow.getExplosionPower(), true);
                                    }
                                    if (itemarrow.isFireArrow()) {
                                        entityhit.setFireTicks(itemarrow.getFireTicks());
                                        Bukkit.broadcastMessage("Fire: " + itemarrow.isFireArrow() + " Ticks: " + itemarrow.getFireTicks());
                                    }
                                    if (itemarrow.isLighntingArrow()) {
                                        for (int i = 0; i < itemarrow.getNumOfBolts(); i++) {
                                            player.getWorld().strikeLightning(entityhit.getLocation());
                                        }
                                    }
                                    if (entityhit instanceof LivingEntity && itemarrow.isPoisonArrow()) {
                                    	LivingEntity hit = (LivingEntity) entityhit;
                                    	hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, itemarrow.getPoisonTicks(), 1));
                                    }
                                    return;
                    			}
                    		}
                    	}
                    }
                }
            }
        }
        if(event.getCause() == DamageCause.ENTITY_ATTACK) {
            Entity entityhit = event.getEntity();
            Entity entityhitting = event.getDamager();
                if (entityhitting instanceof SpoutPlayer) {
                    SpoutPlayer splayer = SpoutManager.getPlayer((Player) entityhitting);
                    for (CustomTools tool:BlockLoader.customtools){
                    	if (splayer.isSpoutCraftEnabled()) {
                    		if (tool.isSword()) {
                    			if (splayer.getItemInHand().getDurability() == tool.getCustomId()) {
                    				event.setDamage(tool.getdamage());
                    				if (tool.isFireSword()) {
                    					entityhit.setFireTicks(tool.getFireTicks());
                    				}
                    				if (entityhit instanceof LivingEntity && tool.isPoisonSword()) {
                    					LivingEntity hit = (LivingEntity) entityhit;
                                    	hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, tool.getPoisonTicks(), 1));
                    				}
                    				if (tool.isLightningSword()) {
                    					splayer.getWorld().strikeLightning(entityhit.getLocation());
                    				}
                    				CustomTools.setDurability(splayer.getItemInHand(), (short) (CustomTools.getDurability(splayer.getItemInHand()) + 1));
                                	Bukkit.broadcastMessage("" + CustomTools.getDurability(splayer.getItemInHand()));
                    				return;
                    			}
                    		} else {
                    			CustomTools.setDurability(splayer.getItemInHand(), (short) (CustomTools.getDurability(splayer.getItemInHand()) + 2));
                    		}
                    	}
                    }
                }                
        	}
    	}
	}
