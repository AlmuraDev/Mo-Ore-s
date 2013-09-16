package com.github.Zarklord1.MoOres.WGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.WorldInitEvent;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Config.Configuration;

public class MoOresOrePopulator implements Listener {
	public static List<Chunk> hasOres = new ArrayList<Chunk>();
	   
    public MoOresOrePopulator() {}
    
    @EventHandler(priority = EventPriority.HIGH)
    public void onChunkLoad(ChunkLoadEvent event) {
    	if (Configuration.wGen.getBoolean("wGen.Generate In Old Chunks")) {
    		if (event.getWorld().getPopulators().contains(MoOres.oresPop)) {
    			if (!event.isNewChunk() && !hasOres.contains(event.getChunk())) {
    				hasOres.remove(event.getChunk());
    				MoOres.oresPop.populate(event.getWorld(), new Random(), event.getChunk());
    			}	
    		}
    	}
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onWorldInit(WorldInitEvent event) {
    	if (Configuration.wGen.getBoolean("wGen.Generate Custom Ores")) {
    		for (String worldname:Configuration.wGen.getStringList("wGen.Overworld Name")) {
    			if (worldname.equalsIgnoreCase(event.getWorld().getName())) {
    				event.getWorld().getPopulators().add(MoOres.oresPop);
        			MoOres.log.info("[Mo Ores] Added Ores Populator For: " + event.getWorld().getName());
    			}
    		}
    	}    
    }
}