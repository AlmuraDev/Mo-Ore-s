package com.github.Zarklord1.MoOres.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Generator.OresPopulator;

public class MoOresWorldListener implements Listener {
	   
    public MoOresWorldListener() {}
	
	//pickup any custom arrows
    @EventHandler(priority = EventPriority.LOWEST)
    public void onWorldInit(WorldInitEvent event) {
    	for (String worldname:Configuration.config.getStringList("generator.Generate Custom Ores.List")) {
    		if (worldname.equals(event.getWorld().getName())) {
    			event.getWorld().getPopulators().add(new OresPopulator());
    		}
    	}
    }
}
