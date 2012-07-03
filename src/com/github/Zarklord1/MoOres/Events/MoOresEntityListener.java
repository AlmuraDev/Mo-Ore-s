package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Arrows.MoArrow;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.BlockLoader;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

public class MoOresEntityListener implements Listener  {
    	public static MoOres plugin;
    
    public MoOresEntityListener(MoOres instance) {
        plugin = instance; 
    }
    
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
                        event.setDamage(MoArrow.getDamage(arrow));
                        if (MoArrow.IsExplosiveArrow(arrow)) {
                        	player.getWorld().createExplosion(player.getLocation(), MoArrow.getExplosionRadius(arrow), true);
                        }
                        if (MoArrow.IsFireArrow(arrow)) {
                            entityhit.setFireTicks(MoArrow.getFireTicks(arrow));
                        }
                        if (MoArrow.IsLightningArrow(arrow)) {
                            for (int i = 0; i < MoArrow.getNumberOfLightningBolts(arrow); i++) {
                                player.getWorld().strikeLightning(entityhit.getLocation());
                            }
                        }
                        if (entityhit instanceof LivingEntity && MoArrow.IsPoisonArrow(arrow)) {
                            LivingEntity hit = (LivingEntity) entityhit;
                            hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, MoArrow.getPoisonTicks(arrow), 1));
                        }
                    }
                }
            }
        }
        if(event.getCause() == DamageCause.ENTITY_ATTACK) {
            Entity entityhit = event.getEntity();
            Entity entityhitting = event.getDamager();
            if (entityhitting instanceof Player){
                Player player = (Player) entityhitting;
                if (player instanceof SpoutPlayer) {
                    SpoutPlayer splayer = SpoutManager.getPlayer(player);
                    for (CustomTools tool:BlockLoader.customtools){
                        if (tool.isSword() && splayer.isSpoutCraftEnabled()) {
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
                                return;
                            }
                        }
                    }
                }                
            } 
        }
    }
}
