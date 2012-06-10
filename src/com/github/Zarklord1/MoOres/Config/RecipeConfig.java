package com.github.Zarklord1.MoOres.Config;

public class RecipeConfig {
    public static void set() {
        if (!Configuration.recipe.contains("Shaped Recipes")) {
            
        }
        if (!Configuration.recipe.contains("Shapless Recipes")) {
            
        }
        if (!Configuration.recipe.contains("Furnace Recipes.Flarite Ingot.Recipe1.amount")) {
            Configuration.recipe.set("Furnace Recipes.Flarite Ingot.Recipe1.amount", Integer.valueOf(1));
        }
        if (!Configuration.recipe.contains("Furnace Recipes.Flarite Ingot.Recipe1.ingredient")) {
            Configuration.recipe.set("Furnace Recipes.Flarite Ingot.Recipe1.ingredient", "Flarite Ore");
        }
        if (!Configuration.recipe.contains("Furnace Recipes.Silver Ingot.Recipe1.amount")) {
            Configuration.recipe.set("Furnace Recipes.Silver Ingot.Recipe1.amount", Integer.valueOf(1));
        }
        if (!Configuration.recipe.contains("Furnace Recipes.Silver Ingot.Recipe1.ingredient")) {
            Configuration.recipe.set("Furnace Recipes.Silver Ingot.Recipe1.ingredient", "Silver Ore");
        }
    }
}
