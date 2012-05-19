package com.github.Zarklord1.MoOres.Events;


import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.FurnaceRecipes;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.inventory.ItemStack;

public class MoOresFurnaceListener implements Listener{

	public static MoOres plugin;

	public MoOresFurnaceListener(MoOres instance) {
        plugin = instance; 
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onFurnaceSmelt(FurnaceSmeltEvent event){
	ItemStack result = event.getResult();
	ItemStack source = event.getSource();
            if(FurnaceRecipes.customrecipes.containsKey(source.getDurability())){
		ItemStack r = FurnaceRecipes.customrecipes.get(source.getDurability());
		event.setResult(r);
            } else if (source.getDurability() > 1600) {
        Bukkit.broadcastMessage("test");
        event.setCancelled(true);
    }
  }
}