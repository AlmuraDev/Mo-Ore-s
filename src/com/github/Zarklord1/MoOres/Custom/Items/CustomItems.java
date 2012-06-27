package com.github.Zarklord1.MoOres.Custom.Items;

import org.bukkit.Material;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class CustomItems extends GenericCustomItem{
  public CustomItems(Plugin plugin, String name, String texture){
    super(plugin, name, texture);
  }
  public int getId() {
      return 318;
   }
}