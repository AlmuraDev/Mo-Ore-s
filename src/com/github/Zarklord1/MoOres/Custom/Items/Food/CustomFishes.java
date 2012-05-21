package com.github.Zarklord1.MoOres.Custom.Items.Food;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomFood;
import org.getspout.spoutapi.player.SpoutPlayer;


public class CustomFishes extends GenericCustomFood {
    int restore;
    int chance;
    
    public CustomFishes(Plugin plugin, String name, String texture, int restore, int chance){
        super(plugin, name, texture, restore);
        this.restore = restore;
        this.chance = chance;
    }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
        player.setHealth(this.restore);
        return true;
    }
    public int getchance() {
        return chance;
    }
    public Material getMaterial() {
        return Material.FLINT;
    }
}
