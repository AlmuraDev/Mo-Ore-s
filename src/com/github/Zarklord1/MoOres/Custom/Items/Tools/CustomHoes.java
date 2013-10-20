package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.player.SpoutPlayer;

public class CustomHoes extends GenericCustomTool {
	public CustomHoes(Plugin plugin, String name, String texture) {
		super(plugin, name, texture);
		// TODO Auto-generated constructor stub
	}

	@Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
    	if (player.isSpoutCraftEnabled()) {
    			if (block.equals(MaterialData.dirt) || block.equals(MaterialData.grass)) {
    				block.setType(Material.SOIL);
    				CustomTools.setDurability(player.getItemInHand(), (short) (CustomTools.getDurability(player.getItemInHand()) + 1));
    			}
    		}
        return true;
    }
}
