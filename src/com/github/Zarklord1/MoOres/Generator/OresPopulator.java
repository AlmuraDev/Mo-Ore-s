package com.github.Zarklord1.MoOres.Generator;

import java.util.Random;

import com.github.Zarklord1.MoOres.Custom.Blocks.CustomOres;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;
import org.getspout.spoutapi.Spout;

public class OresPopulator extends BlockPopulator {

    public OresPopulator() {}

    @Override
    public void populate(World world, Random random, Chunk chunk) {
        int freq, maxY, minY;
        for (CustomOres block:BlockLoader.customores) {
        	freq = block.getFreq();
        	minY = block.getMinY();
        	maxY = block.getMaxY();
        	runcustom(freq,minY,maxY,random,world,chunk,block);
        }
    }
    
    private void runcustom(int freq, int minY, int maxY, Random random, World world, Chunk chunk, CustomOres type) {
        int x,y,z;
        Block block;

        for (x = 0; x < 16; ++x){
            for (z = 0; z < 16; ++z){
                if((maxY - minY) < 25){
                    if(random.nextInt(700) < freq){
                        y = maxY - random.nextInt(maxY - (minY - 1));
                        block = chunk.getBlock(x, y, z);
                        if(block.getType() == Material.STONE){
                            Spout.getServer().getWorld(world.getName()).getChunkAt(block).setCustomBlock(x, y, z, type);
                        }
                    }
                } else {
                    if(random.nextInt(200) < freq){
                        y = maxY - random.nextInt(maxY - (minY - 1));
                        block = chunk.getBlock(x, y, z);
                        if(block.getType() == Material.STONE){
                            Spout.getServer().getWorld(world.getName()).getChunkAt(block).setCustomBlock(x, y, z, type);
                        }
                    }
                }
            }
        }
    }
}