package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
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
        if( event.getCause() == DamageCause.ENTITY_ATTACK ) {
            Entity entityhit = event.getEntity();
            Entity entityhitting = event.getDamager();
            if (entityhitting instanceof Player){
                Player player = (Player) entityhitting;
                if (player instanceof SpoutPlayer) {
                    SpoutPlayer splayer = SpoutManager.getPlayerManager().getPlayer(player);
                    for (CustomTools tool:Hashmaps.customtools){
                        //if (tool.isSword()) {
                            if (splayer.getItemInHand().equals(tool)) {
                                event.setDamage(tool.getdamage());
                                Bukkit.broadcastMessage("" + tool.getdamage());
                                if (tool.isFireSword()) {
                                int firetime = tool.getfireticks();
                                entityhit.setFireTicks(firetime);
                                return;
                                } else {
                                    return;
                                }
                            }
                        //}
                    }
                }                
            } 
        }
    }
}
