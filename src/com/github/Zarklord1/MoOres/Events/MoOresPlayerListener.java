package com.github.Zarklord1.MoOres.Events;

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
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Custom.Items.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.CustomFishes;
import com.github.Zarklord1.MoOres.Custom.Items.CustomTools;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

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
                                CustomTools.setDurability(splayer.getItemInHand(), (short) (CustomTools.getDurability(splayer.getItemInHand()) + 1));
                            }
                        } 
                    } else if(tool.isAxe() || tool.isHoe() || tool.isShovel()) {
                    	CustomTools.setDurability(splayer.getItemInHand(), (short) (CustomTools.getDurability(splayer.getItemInHand()) + 1));
                    } else {
                    	CustomTools.setDurability(splayer.getItemInHand(), (short) (CustomTools.getDurability(splayer.getItemInHand()) + 2));
                    	Bukkit.broadcastMessage("" + CustomTools.getDurability(splayer.getItemInHand()));
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
    	//check if the action is the bow fire action...
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
        	SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
        	//check if the player is running spoutcraft...
        	if (player.isSpoutCraftEnabled()) {
        		for (CustomTools bow:BlockLoader.customtools) {
        			//check if the tool is a bow...
        			if (bow.isBow()) {
        				//check if the player is holding the bow!
        				if (player.getItemInHand().getDurability() == bow.getCustomId()) {
        					CustomArrows arrow;
        					ItemStack arrowstack;
        					PlayerInventory inventory = player.getInventory();
        					for (CustomArrows arrows:BlockLoader.customarrows) {
        						boolean hasArrows = false;
        						ItemStack stack = null;
        						for (int i = 1; i <= 64; i++) {
        		                stack = new SpoutItemStack(arrows, i);
        		                	if (inventory.contains(stack)) {
        		                		hasArrows = true;
        		                	}
        						}
        		                //does the inventory have any arrows?
        		                if (hasArrows) {
        		                    arrow = arrows;
        		                    //remove one arrow from the inventory
        		                    arrowstack = inventory.getItem(inventory.first(stack));
        		                    if (arrowstack.getAmount() > 1) {
        		                    	arrowstack.setAmount(arrowstack.getAmount() - 1);
        		                    } else {
        		                    	inventory.setItem(inventory.first(stack), null);
        		                    }
        		                    //fire the arrow
        		                    CustomTools.setDurability(player.getItemInHand(), (short) (CustomTools.getDurability(player.getItemInHand()) + 1));
        		                    Arrow spawnedarrow = player.launchProjectile(Arrow.class);
        		                    spawnedarrow.setVelocity(spawnedarrow.getVelocity().multiply(2.5));
        		                    //SpoutManager.setEntitySkin(spawnedarrow, String url, EntitySkinType.valueOf(spawnedarrow.toString()));
        		                    //set the arrows atributes
        		                    spawnedarrow.setMetadata(spawnedarrow.getUniqueId().toString(), new FixedMetadataValue(MoOres.plugin, arrow));
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
    		//get the entities within 2 blocks of the player...
    		for (Entity entity:player.getNearbyEntities(2.0D, 2.0D, 2.0D)) {
    			//check if that entity is a fired arrow
    			if (entity instanceof Arrow) {
    				Arrow arrow = (Arrow)entity;
    				List<MetadataValue> list = arrow.getMetadata(arrow.getUniqueId().toString());
                	for (MetadataValue value:list) {
                		if (value.getOwningPlugin().equals(MoOres.plugin)) {
                			Object obj = value.value();
                			if (obj instanceof CustomArrows) {
                				CustomArrows itemarrow = (CustomArrows) obj;
                				arrow.remove();
                				player.getInventory().addItem(new SpoutItemStack(itemarrow));
                			}
                		}
                	}
    			}
    		}
    	}
    }
}