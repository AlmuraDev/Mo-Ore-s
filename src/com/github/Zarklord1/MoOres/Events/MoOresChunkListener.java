package com.github.Zarklord1.MoOres.Events;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Populator.OresPopulator;

public class MoOresChunkListener implements Listener {
	public static HashSet<Chunk> hasOres = new LinkedHashSet<Chunk>();
	   
    public MoOresChunkListener() {}
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChunkLoad(ChunkLoadEvent event) {
    	for (String worldname:Configuration.config.getStringList("generator.Generate Custom Ores.List")) {
    		if (worldname.equals(event.getWorld().getName())) {
    			if (!hasOres.contains(event.getChunk())) {
    				new OresPopulator().populate(event.getWorld(), new Random(), event.getChunk());
    				hasOres.add(event.getChunk());
    			}
    		}
    	}
    }
}
