package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.getspout.spoutapi.player.SpoutPlayer;

public class MoOresBlockBreakEventListener {
    public static MoOres plugin;
    boolean cblockbool;
    boolean isholding;
    CustomTools tool;
    
    public MoOresBlockBreakEventListener(MoOres instance) {
        plugin = instance; 
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreakEvent (BlockBreakEvent event)
    {
        Block block = event.getBlock();
        Player player = event.getPlayer();
        if (player instanceof SpoutPlayer){
            SpoutPlayer splayer = (SpoutPlayer) player;
            for (CustomTools tools:Hashmaps.customtools) {
                if (splayer.getItemInHand().equals(tools)) {
                    if (tools.isPickaxe()) {
                        this.tool = tools;
                        isholding = true;
                    }
                } else {
                    if (!isholding) {
                        isholding = false;
                    }
                }
            }
            if (isholding) {
                if (isVanilla(block)) {
                    block.breakNaturally();
                } else if (isCustomOre(block)) {
                    block.breakNaturally();
                } else if (isCustomStoneBlock(block)) {
                    block.breakNaturally();
                }
            }  
        }
    }
    public static boolean isVanilla(Block block) {
        for (org.getspout.spoutapi.material.Block blok:Hashmaps.Pickaxebreackableblocks) {
            if (block.equals(blok)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isCustomOre(Block block) {
        for (CustomOres blok:Hashmaps.customores) {
            if (block.equals(blok)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isCustomStoneBlock(Block block) {
        for (CustomBlocks blok:Hashmaps.customblocks) {
            if (block.equals(blok)) {
                return true;
            }
        }
        return false;
    }
            
}
