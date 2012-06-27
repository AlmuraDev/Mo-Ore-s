package com.github.Zarklord1.MoOres.Generator;

import java.util.Random;

import com.github.Zarklord1.MoOres.*;
import com.github.Zarklord1.MoOres.Config.Configuration;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.generator.BlockPopulator;

public class BiomesPopulator extends BlockPopulator {
	public static MoOres plugin;
	public BiomesPopulator(MoOres instance) {
        plugin = instance;  
    }

	private boolean sealogged = false;
	private boolean desertlogged = false;
	private boolean mounlogged = false;
	private boolean beachlogged = false;

	public void populate(World world, Random random, Chunk chunk) {
		int x,y,z;
		Block block;

		for (x = 0; x < 16; ++x){
			for (z = 0; z < 16; ++z){
				for (y = 80; chunk.getBlock(x,y,z).getType() == Material.AIR; --y);
				 block = chunk.getBlock(x,y,z);

				//dirt bottom
				if(Configuration.generator.getBoolean("Generator.Biomes.Sea") == true){
				    if(y <= 63 && block.getType() == Material.GRASS){
				    	block.setType(Material.DIRT);
				    }
			    }else {
			    	if(sealogged == false){
			    		MoOres.log.info("[Mo Ores] Sea generation disabled");
			    		sealogged = true;
			    	}
				}

			    //desert
			    if(Configuration.generator.getBoolean("Generator.Biomes.Desert") == true){
					if((block.getBiome() == Biome.DESERT) || (block.getBiome() == Biome.SHRUBLAND) || (block.getBiome() == Biome.ICE_DESERT)){
						if((block.getType() == Material.GRASS) || (block.getType() == Material.SAND)){
							for (int a = 0; a <= 5; a++){
								block.setType(Material.SAND);
								block = chunk.getBlock(x, y - a, z);
							}
							block.setType(Material.SANDSTONE);
						}
					}
				}else {
					if(desertlogged == false){
						MoOres.log.info("[Mo Ores] Desert generation disabled");
						desertlogged = true;
					}
				}

				//beach
				if(Configuration.generator.getBoolean("Generator.Biomes.Beach") == true){
				    if(y <= 65 && block.getType() == Material.GRASS){
				    	for (int a = 0; a <= 5; a++){
							block.setType(Material.SAND);
							block = chunk.getBlock(x, y - a, z);
						}
						block.setType(Material.SANDSTONE);
				    }
			    }else {
			    	if(beachlogged == false){
			    		MoOres.log.info("[Mo Ores] Beach generation disabled");
			    		beachlogged = true;
			    	}
				}

				//sea
				if(Configuration.generator.getBoolean("Generator.Biomes.Sea") == true){
					for (y = 64; chunk.getBlock(x,y,z).getType() == Material.AIR; y--){
							block = chunk.getBlock(x,y,z);
							block.setType(Material.STATIONARY_WATER);
					}
				}
			}
		}
	}
}