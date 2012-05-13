package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.getspout.commons.entity.Player;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.Util.Hashmaps;

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
                    SpoutPlayer splayer = (SpoutPlayer) player;
                    for (CustomTools tool:Hashmaps.customtools){
                        if (tool.isPickaxe()) {
                            if (splayer.getItemInHand().equals(tool)) {
                                int damage = tool.getdamage();
                                event.setDamage(damage);
                                if (tool.isFireTool()) {
                                int firetime = Configuration.items.getInt("Custom Tools." + tool.getName() + ".fire ticks");
                                entityhit.setFireTicks(firetime);
                                }
                            }
                        }
                    }
                }                
            }
        }
    }
}
