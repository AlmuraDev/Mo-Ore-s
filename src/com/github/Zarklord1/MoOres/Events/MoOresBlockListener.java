package com.github.Zarklord1.MoOres.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.Custom.Items.CustomTools;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

public class MoOresBlockListener implements Listener {
	   
    public MoOresBlockListener() {}
	
    @EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockBreak(BlockBreakEvent event) {
    	Block block = event.getBlock();
        SpoutPlayer player = SpoutManager.getPlayer(event.getPlayer());
        if (player.isSpoutCraftEnabled()) {
            for (CustomTools tool:BlockLoader.customtools) {
                if (player.getItemInHand().getDurability() == tool.getCustomId()) {
                    if (tool.isPickaxe()) {
                       for (Material material:BlockLoader.Pickaxebreackableblocks) {
                            if (block.getType().equals(material)) {
                                block.breakNaturally();
                            }
                        } 
                    }
                }
            }
        }
    }
}
