package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Arrows.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.Arrows.MoArrow;
import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFishes;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
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
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.event.player.PlayerInteractEvent;
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
    public void onItemInteract(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
        	SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
        	if (player.isSpoutCraftEnabled()) {
        		for (CustomTools bow:BlockLoader.customtools) {
        			if (bow.isBow()) {
        				if (player.getItemInHand().getDurability() == bow.getCustomId()) {
        					CustomArrows arrow;
        					ItemStack arrowstack;
        					PlayerInventory inventory = player.getInventory();
        					for (CustomArrows arrows:BlockLoader.customarrows) {
        		                ItemStack stack = new SpoutItemStack(arrows);
        		                if (inventory.contains(stack)) {
        		                    arrow = arrows;
        		                    arrowstack = inventory.getItem(inventory.first(arrowstack));
        		                    if (arrowstack.getAmount() > 1) {
        		                    	arrowstack.setAmount(arrowstack.getAmount() - 1);
        		                    } else {
        		                    	player.setItemInHand(null);
        		                    }
        		                    Vector direction = player.getEyeLocation().getDirection().multiply(2.5);
        		                    Arrow spawnedarrow = player.getWorld().spawnArrow(player.getLocation(), direction, this.getSpeed() + arrow.getSpeedModifier(), 12);
        		                    MoArrow.setDamage(spawnedarrow, arrow.getArrowDamage());
        		                    MoArrow.setIsFireArrow(spawnedarrow, arrow.isFireArrow());
        		                    MoArrow.setIsPoisonArrow(spawnedarrow, arrow.isPoisonArrow());
        		                    MoArrow.setIsLightningArrow(spawnedarrow, arrow.isLighntingArrow());
        		                    MoArrow.setIsExplosiveArrow(spawnedarrow, arrow.isExplosiveArrow());
        		                    MoArrow.setFireTicks(spawnedarrow, arrow.getFireTicks());
        		                    MoArrow.setPoisonTicks(spawnedarrow, arrow.getpoisonTicks());
        		                    MoArrow.setNumberOfLightningBolts(spawnedarrow, arrow.getNumOfBolts());
        		                    MoArrow.setExplosionPower(spawnedarrow, arrow.getExplosionRadius());
        		                    EntityShootBowEvent evt = new EntityShootBowEvent(player, player.getItemInHand(), spawnedarrow, this.getSpeed() + arrow.getSpeedModifier());
        		                    Bukkit.getPluginManager().callEvent(evt);
        		                }
        		            }
        				}
        			}
        		}
        	}
        }
    }
}
