package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFishes;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import java.util.List;
import java.util.Random;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.inventory.ItemStack;
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
                if (state.equals(state.CAUGHT_FISH)) {
                    List<Entity> nearbyEntities = splayer.getNearbyEntities(5.0D, 5.0D, 5.0D);
                    for (Entity entity:nearbyEntities) {
                        if (entity instanceof Item) {
                            Item item = (Item) entity;
                            ItemStack fishstack = new ItemStack(349, 1);
                            if (item.getItemStack() == fishstack) {
                                for (CustomFishes fishie:Hashmaps.customfish) {
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
    
    boolean cblockbool;
    boolean isholding;
    CustomTools tool;
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreak( BlockBreakEvent event )
    {
        Block block = event.getBlock();
        Player player = event.getPlayer();
        if (player instanceof SpoutPlayer){
            SpoutPlayer splayer = (SpoutPlayer) player;
            for (CustomTools tools:Hashmaps.customtools) {
                if (splayer.getItemInHand().getDurability() == tool.getCustomId() && splayer.isSpoutCraftEnabled()) {
                    if (tools.isPickaxe()) {
                        this.tool = tools;
                        isholding = true;
                    }
                }
            }
            if (isholding) {
                if (isVanilla(block)) {
                    block.breakNaturally();
                } else if (isCustomOre(block)) {
                    block.breakNaturally();
                } else if (isCustomStone(block)) {
                    block.breakNaturally();
                }
            }  
        }
    }
    public boolean isVanilla(Block block) {
        for (org.getspout.spoutapi.material.Block blok:Hashmaps.Pickaxebreackableblocks) {
            if (block.equals(blok)) {
                return true;
            }
        }
        return false;
    }
    public boolean isCustomOre(Block block) {
        for (CustomOres blok:Hashmaps.customores) {
            if (block.equals(blok)) {
                return true;
            }
        }
        return false;
    }
    public boolean isCustomStone(Block block) {
        for (CustomBlocks blok:Hashmaps.customblocks) {
            if (block.equals(blok)) {
                return true;
            }
        }
        return false;
    }
}
