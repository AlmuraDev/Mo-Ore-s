package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.CustomFishes;
import com.github.Zarklord1.MoOres.Custom.Items.CustomTools;
import com.github.Zarklord1.MoOres.Custom.Items.MoArrow;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.BlockLoader;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.util.Vector;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

public class MoOresPlayerListener implements Listener {
    public static MoOres plugin;
    Boolean fishchanged = false;
        
        
    public MoOresPlayerListener(MoOres instance) {
        plugin = instance; 
    }
    
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerFish(PlayerFishEvent event) {
        State state = event.getState();
        Player player = event.getPlayer();
        Random randomgen = new Random();
        if (player instanceof SpoutPlayer) {
            SpoutPlayer splayer = SpoutManager.getPlayer(player);
            if (splayer.isSpoutCraftEnabled()) {
                if (state.equals(State.CAUGHT_FISH)) {
                    List<Entity> nearbyEntities = splayer.getNearbyEntities(5.0D, 5.0D, 5.0D);
                    for (Entity entity:nearbyEntities) {
                        if (entity instanceof Item) {
                            Item item = (Item) entity;
                            ItemStack fishstack = new ItemStack(349, 1);
                            if (item.getItemStack() == fishstack) {
                                for (CustomFishes fishie:BlockLoader.customfish) {
                                    ItemStack customfishiestack = new SpoutItemStack(fishie, 1);
                                    int nextInt = randomgen.nextInt(100);
                                    if (fishie.getchance() <= nextInt) {
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
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak( BlockBreakEvent event ) {
        Block block = event.getBlock();
        Player player = event.getPlayer();
        if (player instanceof SpoutPlayer){
            SpoutPlayer splayer = (SpoutPlayer) player;
            for (CustomTools tool:BlockLoader.customtools) {
                if (splayer.getItemInHand().getDurability() == tool.getCustomId() && splayer.isSpoutCraftEnabled()) {
                    if (tool.isPickaxe()) {
                       for (Material material:BlockLoader.Pickaxebreackableblocks) {
                            if (block.getType() == material) {
                                block.breakNaturally();
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
    public void onItemInteract(PlayerInteractEvent event) {
    	//check if the action is the boW fire action...
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
        	SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
        	//check if the player is running spoutcraft...
        	if (player.isSpoutCraftEnabled()) {
        		for (CustomTools bow:BlockLoader.customtools) {
        			//check if the tool s a bow...
        			if (bow.isBow()) {
        				//check if the player is holding the bow!
        				if (player.getItemInHand().getDurability() == bow.getCustomId()) {
        					CustomArrows arrow;
        					ItemStack arrowstack;
        					PlayerInventory inventory = player.getInventory();
        					for (CustomArrows arrows:BlockLoader.customarrows) {
        		                ItemStack stack = new SpoutItemStack(arrows);
        		                //check if the inventory has any arrows?
        		                if (inventory.contains(stack)) {
        		                    arrow = arrows;
        		                    //remove one arrow from the inventory
        		                    arrowstack = inventory.getItem(inventory.first(stack));
        		                    if (arrowstack.getAmount() > 1) {
        		                    	arrowstack.setAmount(arrowstack.getAmount() - 1);
        		                    } else {
        		                    	player.setItemInHand(null);
        		                    }
        		                    Vector direction = player.getEyeLocation().getDirection().multiply(2.5);
        		                    //fire the arrow
        		                    Arrow spawnedarrow = player.getWorld().spawnArrow(player.getLocation(), direction, bow.getSpeed() + arrow.getSpeedModifier(), 12);
        		                    //set the arrows atributes
        		                    MoArrow.setDamage(spawnedarrow, arrow.getArrowDamage());
        		                    MoArrow.setIsFireArrow(spawnedarrow, arrow.isFireArrow());
        		                    MoArrow.setIsPoisonArrow(spawnedarrow, arrow.isPoisonArrow());
        		                    MoArrow.setIsLightningArrow(spawnedarrow, arrow.isLighntingArrow());
        		                    MoArrow.setIsExplosiveArrow(spawnedarrow, arrow.isExplosiveArrow());
        		                    MoArrow.setFireTicks(spawnedarrow, arrow.getFireTicks());
        		                    MoArrow.setPoisonTicks(spawnedarrow, arrow.getPoisonTicks());
        		                    MoArrow.setNumberOfLightningBolts(spawnedarrow, arrow.getNumOfBolts());
        		                    MoArrow.setExplosionPower(spawnedarrow, arrow.getExplosionPower());
        		                    //call the bukkit event so people will now that a bow was fired
        		                    EntityShootBowEvent evt = new EntityShootBowEvent(player, player.getItemInHand(), spawnedarrow, bow.getSpeed() + arrow.getSpeedModifier());
        		                    Bukkit.getPluginManager().callEvent(evt);
        		                }
        		            }
        				}
        			}
        		}
        	}
        }
    }
    //pickup any custom arrows...
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerMove(PlayerMoveEvent event) {
    	SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
    	//check if the player is using the spoutcraft client
    	if (player.isSpoutCraftEnabled()) {
    		for (Entity entity:player.getNearbyEntities(2.0D, 2.0D, 2.0D)) {
    			if (entity instanceof Arrow) {
    				Arrow arrow = (Arrow)entity;
    				for (CustomArrows itemarrow:BlockLoader.customarrows) {
    					//check if the arrow propertes are the same
    					if (MoArrow.getDamage(arrow) == itemarrow.getArrowDamage()) {
    						if (MoArrow.IsExplosiveArrow(arrow) == itemarrow.isExplosiveArrow()) {
    							if (MoArrow.IsFireArrow(arrow) == itemarrow.isFireArrow()) {
    								if (MoArrow.IsLightningArrow(arrow) == itemarrow.isLighntingArrow()) {
    									if (MoArrow.IsPoisonArrow(arrow) == itemarrow.isPoisonArrow()) {
    										if (MoArrow.getExplosionPower(arrow) == itemarrow.getExplosionPower()) {
    											if (MoArrow.getFireTicks(arrow) == itemarrow.getFireTicks()) {
    												if (MoArrow.getNumberOfLightningBolts(arrow) == itemarrow.getNumOfBolts()) {
    													if (MoArrow.getPoisonTicks(arrow) == itemarrow.getPoisonTicks()) {
    														//add the arrow to the inventory
    			    			    						player.getInventory().addItem(new SpoutItemStack(itemarrow, 1));
    			    			    						//remove the entity arrow...
    			    			    						arrow.remove();
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
    		}
    	}
    }
}