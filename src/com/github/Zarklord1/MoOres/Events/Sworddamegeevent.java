package com.github.Zarklord1.MoOres.Events;




import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.getspout.commons.entity.Player;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.Util.Hashmaps;

public class Sworddamegeevent implements Listener  {
	@EventHandler(priority = EventPriority.NORMAL)
    public void onEntityDamage ( EntityDamageByEntityEvent event )
    {
		if( event.getCause() == DamageCause.ENTITY_ATTACK ) {
    	Entity entityhit = event.getEntity();
    	Entity entityhitting = event.getDamager();
    	SpoutPlayer splayer = SpoutManager.getPlayer( (org.bukkit.entity.Player) (entityhitting) );
    	if (entityhitting instanceof Player){
    		for (GenericCustomTool tool:Hashmaps.customtools) {
    			SpoutItemStack itemInHand = new SpoutItemStack(splayer.getItemInHand());
    			if (itemInHand == tool) {
    				
    			}
    			}
    		}   	
    	}
    }
}
