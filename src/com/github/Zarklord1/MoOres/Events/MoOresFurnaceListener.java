package com.github.Zarklord1.MoOres.Events;


import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.FurnaceRecipes;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.inventory.ItemStack;

public class MoOresFurnaceListener implements Listener{

	public static MoOres plugin;

	public MoOresFurnaceListener(MoOres instance) {
        plugin = instance; 
    }

	  @EventHandler
  public void onFurnaceSmelt(FurnaceSmeltEvent event) {
    ItemStack result = event.getResult();
    ItemStack source = event.getSource();
    if (FurnaceRecipes.customrecipes.containsKey(Short.valueOf(source.getDurability()))) {
      ItemStack r = (ItemStack)FurnaceRecipes.customrecipes.get(Short.valueOf(source.getDurability()));
      event.setResult(r);
    } else if (source.getDurability() > 1600) {
      Bukkit.broadcastMessage("test");
      event.setCancelled(true);
    }
  }
}