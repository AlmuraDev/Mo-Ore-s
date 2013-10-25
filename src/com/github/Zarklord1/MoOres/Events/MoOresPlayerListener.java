package com.github.Zarklord1.MoOres.Events;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.event.input.KeyPressedEvent;
import org.getspout.spoutapi.gui.GenericItemWidget;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.gui.GenericTexture;
import org.getspout.spoutapi.gui.PopupScreen;
import org.getspout.spoutapi.gui.RenderPriority;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.keyboard.Keyboard;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Custom.Items.CustomFishes;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomArrows;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

public class MoOresPlayerListener implements Listener {

    public MoOresPlayerListener() {}
    
    
    
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerFish(PlayerFishEvent event) {
        State state = event.getState();
        SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
        Random ran = new Random();
        if (player.isSpoutCraftEnabled()) {
        	Bukkit.broadcastMessage("Spout Client Enabled");
        	if (state.equals(State.CAUGHT_FISH)) {
        		Bukkit.broadcastMessage("Player Has Caugh A Fish");
        		for (Entity entity:player.getNearbyEntities(15.0D, 15.0D, 15.0D)) {
        			Bukkit.broadcastMessage("Got Nearby Entities Within 15 Blocks Of The Player");
        			if (entity instanceof Item) {
        				Bukkit.broadcastMessage("Nearby Entity Is Item");
        				Item item = (Item)entity;
        				ItemStack fishstack = new ItemStack(Material.COOKED_FISH, 1);
        				if (item.getItemStack() == fishstack) {
        					Bukkit.broadcastMessage("Item Is A Fish");
        					for (CustomFishes fishie:BlockLoader.customfish) {
        						ItemStack customfishiestack = new SpoutItemStack(fishie, 1);
        						int nextInt = ran.nextInt(100);
        						if (fishie.getchance() <= nextInt) {
        							Bukkit.broadcastMessage("Item Was Replaced With Custom Fish");
        							item.setItemStack(customfishiestack);
        							return;
        						}
        					}
        				}
        			}
        		}
        	}
        }
    }   
   /* @SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onItemInteract(PlayerInteractEvent event) {
    	//check if the action is the bow fire action...
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
        	SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
        	//check if the player is running spoutcraft...
        	if (player.isSpoutCraftEnabled()) {
        		for (CustomBows bow:BlockLoader.customtools) {
        			//check if the tool is a bow...
        			if (bow.isBow()) {
        				//check if the player is holding the bow!
        				if (player.getItemInHand().getDurability() == bow.getCustomId()) {
        					PlayerInventory inventory = player.getInventory();
        					for (CustomArrows arrows:BlockLoader.customarrows) {
            					CustomArrows arrow;
        						boolean hasArrows = false;
        						ItemStack stack = null;
        						for (int i = 1; i <= 64; i++) {
        		                stack = new SpoutItemStack(arrows, i);
        		                	if (inventory.contains(stack)) {
        		                		hasArrows = true;
        		                		break;
        		                	}
        						}
        		                //does the inventory have any arrows? or is he in creative mode?
        		                if (hasArrows || player.getGameMode() == GameMode.CREATIVE) {
        		                    arrow = arrows;
        		                    //remove one arrow from the inventory if not in creative mode
        		                    if (player.getGameMode() != GameMode.CREATIVE) {
        		                    	if (inventory.getItem(inventory.first(stack)).getAmount() > 1) {
        		                    		inventory.getItem(inventory.first(stack)).setAmount(inventory.getItem(inventory.first(stack)).getAmount() - 1);
                							player.updateInventory();
        		                    	} else {
        		                    		inventory.setItem(inventory.first(stack), null);
                							player.updateInventory();
        		                    	}
        		                    }
        		                    //fire the arrow
        		                    CustomTools.setDurability(player.getItemInHand(), (short) (CustomTools.getDurability(player.getItemInHand()) + 1));
        		                    Arrow spawnedarrow = player.launchProjectile(Arrow.class);
        		                    spawnedarrow.setVelocity(spawnedarrow.getVelocity().multiply(bow.getSpeed() + arrow.getSpeedModifier()));
        		                    //set the arrows atributes
        		                    spawnedarrow.setMetadata(spawnedarrow.getUniqueId().toString(), new FixedMetadataValue(MoOres.plugin, arrow));
        		                    //call the bukkit event so people will now that a bow was fired
        		                    EntityShootBowEvent evt = new EntityShootBowEvent(player, player.getItemInHand(), spawnedarrow, bow.getSpeed() + arrow.getSpeedModifier());
        		                    Bukkit.getPluginManager().callEvent(evt);
        		                    if (evt.isCancelled()) {
        		                    	spawnedarrow.remove();
        		                    	inventory.getItem(inventory.first(stack)).setAmount(inventory.getItem(inventory.first(stack)).getAmount() + 1);
        		                    }
        		                    return;
        		                }
        		            }
        					boolean hasArrows = false;
        					ItemStack stack = null;
        					for (int i = 1; i <= 64; i++) {
        						stack = new SpoutItemStack(MaterialData.arrow, i);
        						if (inventory.contains(stack)) {
        							hasArrows = true;
        							break;
        		                }
        					}
        					//does the inventory have any arrows?
        					if (hasArrows) {
        						//remove one arrow from the inventory
        						if (inventory.getItem(inventory.first(stack)).getAmount() > 1) {
        							inventory.getItem(inventory.first(stack)).setAmount(inventory.getItem(inventory.first(stack)).getAmount() - 1);
        							player.updateInventory();
        		                } else {
        		                	inventory.setItem(inventory.first(stack), null);
        		                	player.updateInventory();
        						}
        						//fire the arrow
        						CustomTools.setDurability(player.getItemInHand(), (short) (CustomTools.getDurability(player.getItemInHand()) + 1));
        						Arrow spawnedarrow = player.launchProjectile(Arrow.class);
        						//call the bukkit event so people will now that a bow was fired
        						EntityShootBowEvent evt = new EntityShootBowEvent(player, player.getItemInHand(), spawnedarrow, 6);
        						Bukkit.getPluginManager().callEvent(evt);
        						if (evt.isCancelled()) {
        							spawnedarrow.remove();
        							inventory.getItem(inventory.first(stack)).setAmount(inventory.getItem(inventory.first(stack)).getAmount() + 1);
        						}
        					}
        				}
        			}
        		}
        	}
        }
    }*/
    //pickup custom arrows
    @SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {
        SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
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
        						for (UUID id:MoOresServerListener.isMoving) {
        							if (id.equals(arrow.getUniqueId())) {
        								//remove the arrow from the world
        								arrow.remove();
        								//add the arrowitem to the player's inventory
        								player.getInventory().addItem(new SpoutItemStack(itemarrow, 1));
            							player.updateInventory();
            							break;
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