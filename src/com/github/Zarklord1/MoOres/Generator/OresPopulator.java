package com.github.Zarklord1.MoOres.Generator;

import java.util.Random;

import com.github.Zarklord1.MoOres.*;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.*;
import com.github.Zarklord1.MoOres.Config.*;
import com.github.Zarklord1.MoOres.Util.Hashmaps;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;
import org.getspout.spoutapi.Spout;

public class OresPopulator extends BlockPopulator {
	private MoOres plugin;

	private boolean cmorelogged = false;
	private boolean orelogged = false;

	public OresPopulator(MoOres plugin) {
		this.plugin = plugin;
	}

	public void populate(World world, Random random, Chunk chunk) {
		int freq, maxY, minY;
		Material material;

		if(Configuration.generator.getBoolean("Generator.Ores.Custom") == true){
			for (CustomOres block:Hashmaps.customores) {
				freq = block.getFreq();
				minY = block.getMinY();
				maxY = block.getMaxY();
				runcustom(freq,minY,maxY,random,world,chunk,block);
			}
		} else {
			if(cmorelogged == false){
				MoOres.log.info("[Mo Ores] Custom ores generation disabled");
				cmorelogged = true;
			}
		}

		if(Configuration.generator.getBoolean("Generator.Ores.Original") == true){
			for (OriginalOres block:Hashmaps.originalores){
				freq = block.getfreq();
				minY = block.getminY();
				maxY = block.getmaxY();
				material = block.getmaterial();
				run(freq, minY, maxY, random, world, chunk, material);
			}
		}else {
			if(orelogged == false){
				MoOres.log.info("[Mo Ores] Original ores generation disabled");
				orelogged = true;
			}
		}

		int x,y,z;
		Block block;
		for (x = 0; x < 16; ++x){
			for (z = 0; z < 16; ++z){
				//random bedrock
				if(random.nextInt(100) < 70){
					y = 2 - random.nextInt(1);
					block = chunk.getBlock(x, y, z);
					block.setTypeId(Material.BEDROCK.getId());
				}
			}
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
	private void run(int freq, int minY, int maxY, Random random, World world, Chunk chunk, Material type) {
		int x,y,z;
		Block block;
		for (x = 0; x < 16; ++x){
			for (z = 0; z < 16; ++z){
				if(random.nextInt(100) < freq){
					y = maxY - random.nextInt(maxY - (minY - 1));
					block = chunk.getBlock(x, y, z);
					if(block.getTypeId() == Material.STONE.getId()){
						block.setTypeId(type.getId());
					}
				}
			}
		}
	}
}