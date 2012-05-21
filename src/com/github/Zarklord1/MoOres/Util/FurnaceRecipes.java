package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.MoOres.Custom.Blocks.Bushes.CustomBush;
import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Custom.Items.CustomItems;
import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFishes;
import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFood;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;

public class FurnaceRecipes {

	public static void MaterialFurnaceRecipe(ItemStack result, int id){

		FurnaceRecipe fr = new FurnaceRecipe(result, (new MaterialData(id)));

		Bukkit.getServer().addRecipe(fr);

	}

	public static void CustomFurnaceRecipe(ItemStack result, Material stone, int CustomId) {

		int durability = CustomId;

		MaterialData customblock = new MaterialData(stone, (byte) durability);

		FurnaceRecipe fr = new FurnaceRecipe(result, customblock);

		Bukkit.getServer().addRecipe(fr);

	}
        
        public static void MaterialDataFurnaceRecipe(ItemStack result, int id, int data){

		FurnaceRecipe fr = new FurnaceRecipe(result, (new MaterialData(id, (byte) data)));

		Bukkit.getServer().addRecipe(fr);

	}
}