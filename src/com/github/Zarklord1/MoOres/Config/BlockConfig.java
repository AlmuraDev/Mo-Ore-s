package com.github.Zarklord1.MoOres.Config;


	public class BlockConfig
	{
		public static void set()
		{
			
			if (!Configuration.Blocks.contains("Custom Blocks.Crystalite Ore.textureID")) {
				Configuration.Blocks.set("Custom Blocks.Crystalite Ore.textureID", Integer.valueOf(255));
			}
			if (!Configuration.Blocks.contains("Custom Blocks.Crystalite.frequency")) {
				Configuration.Blocks.set("Custom Blocks.Crystalite Ore.frequency", Integer.valueOf(3));
			}
			if (!Configuration.Blocks.contains("Custom Blocks.Crystalite Ore.minheight")) {
				Configuration.Blocks.set("Custom Blocks.Crystalite Ore.minheight", Integer.valueOf(2));
			}
			if (!Configuration.Blocks.contains("Custom Blocks.Crystalite Ore.maxheight")) {
				Configuration.Blocks.set("Custom Blocks.Crystalite Ore.maxheight", Integer.valueOf(10));
			}
			if (!Configuration.Blocks.contains("Custom Blocks.Crystalite Ore.hardness")) {
				Configuration.Blocks.set("Custom Blocks.Crystalite Ore.hardness", Integer.valueOf(8));
			}
		}
	}