package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
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
            
        }
        if(event.getCause() == DamageCause.ENTITY_ATTACK) {
            Entity entityhit = event.getEntity();
            Entity entityhitting = event.getDamager();
            if (entityhitting instanceof Player){
                Player player = (Player) entityhitting;
                if (player instanceof SpoutPlayer) {
                    SpoutPlayer splayer = SpoutManager.getPlayer(player);
                    World world = splayer.getWorld();
                    for (CustomTools tool:Hashmaps.customtools){
                        if (tool.isSword()) {
                            if (splayer.getItemInHand().getDurability() == tool.getCustomId()) {
                                event.setDamage(tool.getdamage());
                                if (tool.isFireSword()) {
                                    entityhit.setFireTicks(tool.getFireTicks());
                                }
                                if (entityhit instanceof Player && tool.isPoisonSword()) {
                                    Player playerhit = (Player) entityhit;
                                    playerhit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, tool.getPoisonTicks(), 1));
                                }
                                if (tool.isLightningSword()) {
                                    Location location = entityhit.getLocation();
                                    world.strikeLightning(location);
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
