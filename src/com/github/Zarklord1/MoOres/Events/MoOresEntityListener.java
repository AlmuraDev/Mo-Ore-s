package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.getspout.commons.entity.Player;
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
                    SpoutPlayer splayer = (SpoutPlayer) player;
                    //SpoutPlayer splayer = SpoutManager.getPlayer(player);
                    for (CustomTools tool:Hashmaps.customtools){
                        //if (tool.isSword()) {
                            if (splayer.getItemInHand().equals(tool)) {
                                MoOres.log.info("wind");
                                int damage = tool.getdamage();
                                event.setDamage(damage);
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
