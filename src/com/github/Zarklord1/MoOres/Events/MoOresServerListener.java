package com.github.Zarklord1.MoOres.Events;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.metadata.MetadataValue;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.event.spout.ServerTickEvent;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Custom.Items.CustomArrows;

public class MoOresServerListener implements Listener {
	public static HashSet<UUID> isMoving = new LinkedHashSet<UUID>();
	   
    public MoOresServerListener() {}
	
	//pickup any custom arrows
    @SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.LOWEST)
    public void onServerTick(ServerTickEvent event) {
    	for (Player pl:MoOres.plugin.getServer().getOnlinePlayers()) {
    		//check if the player is using the spoutcraft client
    		SpoutPlayer player = SpoutManager.getPlayer(pl);
    		if (player.isSpoutCraftEnabled()) {
    			//get the entities within 2 blocks of the player...
    			for (Entity entity:player.getNearbyEntities(2.0D, 2.0D, 2.0D)) {
    				//is the entity a fired arrow
    				if (entity instanceof Arrow) {
    					Arrow arrow = (Arrow)entity;
    					List<MetadataValue> list = arrow.getMetadata(arrow.getUniqueId().toString());
    					for (MetadataValue value:list) {
    						if (value.getOwningPlugin().equals(MoOres.plugin)) {
    							if (value.value() instanceof CustomArrows) {
                					CustomArrows itemarrow = (CustomArrows)value.value();
                					//is the arrow moving?
                					for (UUID id:isMoving) {
                						if (id.equals(arrow.getUniqueId())) {
                							//remove the arrow from the world
                							arrow.remove();
                							//add the arroitem to the player's inventory
                							player.getInventory().addItem(new SpoutItemStack(itemarrow, 1));
                							player.updateInventory();
                						}
                					}
                				}
                			}
                		}
    				}
    			}
    		}
    	}
    }
}
