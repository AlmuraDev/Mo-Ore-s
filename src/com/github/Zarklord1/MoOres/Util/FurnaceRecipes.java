package com.github.Zarklord1.MoOres.Util;

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
        
        public static void MaterialDataFurnaceRecipe(ItemStack result, int id, int data){

		FurnaceRecipe fr = new FurnaceRecipe(result, (new MaterialData(id, (byte) data)));

		Bukkit.getServer().addRecipe(fr);

	}
}