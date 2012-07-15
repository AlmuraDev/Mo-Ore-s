package com.github.Zarklord1.MoOres.Generator;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.getspout.spoutapi.Spout;

import com.github.Zarklord1.MoOres.Custom.Blocks.CustomOres;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

public class OresPopulator extends BlockPopulator {

    public OresPopulator() {}

    @Override
    public void populate(World world, Random random, Chunk chunk) {
        for (CustomOres block:BlockLoader.customores) {
        	for (byte i = 0; i < block.getVeinsPerChunk(); i++) {
				final int x = chunk.getX() + random.nextInt(15);
				int y = random.nextInt(block.getMaxY());
				while (y < block.getMinY()) {
					y = random.nextInt(block.getMaxY());
				}
				final int z = chunk.getZ() + random.nextInt(15);
				int veinSize = random.nextInt(block.getMaxVeinSize());
				while (veinSize < block.getMinVeinSize()) {
					veinSize = random.nextInt(block.getMinVeinSize());
				}
				this.placeObject(world, x, y, z, veinSize, random , block);
			}
        }
    }
    
            
            public void placeObject(World world, int originX, int originY, int originZ, int clusterSize, Random random, CustomOres block) {
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
        								if (sizeX + sizeY + sizeZ < 1 && world.getBlockAt(x, y, z).getType() == Material.STONE) {
        									Spout.getServer().getWorld(world.getName()).getChunkAt(x, y, z).setCustomBlock(x, y, z, block);
        								}
        							}
        						}
        					}
        				}
        			}
        		}
            }
}