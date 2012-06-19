package com.github.Zarklord1.MoOres.Util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;

public class frecipe {
    public static void addFurnaceRecipe(ItemStack Result, Material material) {
        Bukkit.getServer().addRecipe(new FurnaceRecipe(Result, material));
    }
}
