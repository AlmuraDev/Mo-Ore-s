package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.item.GenericCustomTool;

public class CustomTools extends GenericCustomTool
{
  public CustomTools(Plugin plugin, String name, String texture, short durability)
  {
    super(plugin, name, texture);
    setDurability(durability);
  }
}