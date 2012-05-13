package com.github.Zarklord1.MoOres.Custom.Items.Food;

import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomFood;
import org.getspout.spoutapi.player.SpoutPlayer;

public class CustomFood extends GenericCustomFood
{
  int restore;

  public CustomFood(Plugin plugin, String name, String texture, int restore)
  {
    super(plugin, name, texture, restore);
    this.restore = restore;
  }

  public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
    player.setHealth(this.restore);
    return true;
  }
}