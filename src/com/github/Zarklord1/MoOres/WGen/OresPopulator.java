package com.github.Zarklord1.MoOres.WGen;

import static com.github.Zarklord1.MoOres.WGen.MoOresOrePopulator.hasOres;

import java.util.Iterator;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.generator.BlockPopulator;
import org.getspout.spoutapi.block.SpoutChunk;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

public class OresPopulator extends BlockPopulator {

    public OresPopulator() {}

    @Override
    public void populate(World world, Random random, Chunk chunk) {
    	hasOres.add(chunk);
    	ConfigurationSection section = Configuration.wGen.getConfigurationSection("wGen.Ores");
        Iterator<String> keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = (String)keys.next();
            int minY = Configuration.wGen.getInt("wGen.Ores." + name + ".Min Height");
            int maxY = Configuration.wGen.getInt("wGen.Ores." + name + ".Max Height");
            int minVeinSize = Configuration.wGen.getInt("wGen.Ores." + name + ".Min Vein Size");
            int maxVeinSize = Configuration.wGen.getInt("wGen.Ores." + name + ".Max Vein Size");
            int minVeinsPerChunk = Configuration.wGen.getInt("wGen.Ores." + name + ".Min Veins Per Chunk");
            int maxVeinsPerChunk = Configuration.wGen.getInt("wGen.Ores." + name + ".Max Veins Per Chunk");
        	final int veinsPerChunk = random.nextInt(maxVeinsPerChunk - minVeinsPerChunk) + maxVeinsPerChunk;
        	for (int i = 0; i < veinsPerChunk; i++) {
        		final int x = random.nextInt(16);
            	final int y = random.nextInt(maxY - minY) + minY;
            	final int z = random.nextInt(16);
            	final int veinSize = random.nextInt(maxVeinSize - minVeinSize) + minVeinSize;
            	for (CustomBlocks ore:BlockLoader.customblocks) {
            		if (ore.getBlockName().equalsIgnoreCase(name)) {
        				this.placeObject(world, chunk, x, y, z, veinSize, random, ore);
            		}
            	}
			}
        }
    }
    
            
    public void placeObject(World world, Chunk c, int originX, int originY, int originZ, int clusterSize, Random random, CustomBlocks ore) {
    	final double angle = random.nextDouble() * Math.PI;
    	final double x1 = ((originX + 8) + Math.sin(angle) * clusterSize / 8);
    	final double x2 = ((originX + 8) - Math.sin(angle) * clusterSize / 8);
    	final double z1 = ((originZ + 8) + Math.cos(angle) * clusterSize / 8);
    	final double z2 = ((originZ + 8) - Math.cos(angle) * clusterSize / 8);
    	final double y1 = (originY + random.nextInt(3) + 2);
    	final double y2 = (originY + random.nextInt(3) + 2);

    	for (int i = 0; i < clusterSize; i++) {
    		final double seedX = x1 + (x2 - x1) * i / clusterSize;
    		final double seedY = y1 + (y2 - y1) * i / clusterSize;
    		final double seedZ = z1 + (z2 - z1) * i / clusterSize;
    		final double size = ((Math.sin(i * Math.PI / clusterSize) + 1) * random.nextDouble() * clusterSize / 16 + 1) / 2;
    		
    		final int startX = (int) (seedX - size);
    		final int startY = (int) (seedY - size);
    		final int startZ = (int) (seedZ - size);
    		final int endX = (int) (seedX + size);
    		final int endY = (int) (seedY + size);
    		final int endZ = (int) (seedZ + size);

    		for (int x = startX; x <= endX; x++) {
    			double sizeX = (x + 0.5 - seedX) / size;
    			sizeX *= sizeX;
    			
    			if (sizeX < 1) {
    				for (int y = startY; y <= endY; y++) {
    					double sizeY = (y + 0.5 - seedY) / size;
    					sizeY *= sizeY;
    					
    					if (sizeX + sizeY < 1) {
    						for (int z = startZ; z <= endZ; z++) {
    							double sizeZ = (z + 0.5 - seedZ) / size;
    							sizeZ *= sizeZ;
    							if (sizeX + sizeY + sizeZ < 1) {
    								if (world.getBlockAt(x, y, z).getType().equals(Material.STONE)) {
    									SpoutChunk chunk = (SpoutChunk) c;
    									chunk.setCustomBlock(x, y, z, ore);
    								} else {
    									SpoutChunk chunk = (SpoutChunk) c;
        								chunk.setCustomBlock(x, y, z, ore);
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    }
}