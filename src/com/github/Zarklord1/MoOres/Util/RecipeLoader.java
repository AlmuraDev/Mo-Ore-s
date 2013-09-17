package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.FurnaceApi.FurnaceRecipes;
import com.github.Zarklord1.MoOres.Config.Configuration;
import java.util.Iterator;
import java.util.List;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class RecipeLoader {
    private static String[] Ingredient;
    private static String[] SplitRecipe;
    private static String[] FurnaceResult;
    private static String[] SourceResult;
    private static SpoutShapedRecipe shapedrecipe;
    private static SpoutShapelessRecipe shaplessrecipe;
    
    public static void addAllRecipes() {
        addShapedRecipes();
        addShaplessRecipes();
        addFurnaceRecipes();
    }
    
    private static void addShapedRecipes() {
        if (Configuration.recipe.contains("Shaped Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shaped Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; true; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        if (BlockLoader.customblocksmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customblocksmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (BlockLoader.customtoolsmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customtoolsmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (BlockLoader.customfoodmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customfoodmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (BlockLoader.customfishmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customfishmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (BlockLoader.customitemsmap.containsKey(resultname)) { 
                            ItemStack result = new SpoutItemStack(BlockLoader.customitemsmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else {
                            if (resultname.contains(":")) {
                                SplitRecipe = resultname.split(":");
                                ItemStack result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(SplitRecipe[0]), Short.parseShort(SplitRecipe[1])), amount);
                                shapedrecipe = new SpoutShapedRecipe(result);
                            } else {
                                ItemStack result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(resultname)), amount);
                                shapedrecipe = new SpoutShapedRecipe(result);
                            }
                        }
                        List<String> recshape = Configuration.recipe.getStringList("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".Shape");
                        Iterator<String> rec = recshape.iterator();
                        if (recshape.size() == 1) {
                            shapedrecipe.shape(rec.next().toString());
                        } else if (recshape.size() == 2) {
                            shapedrecipe.shape(rec.next().toString(), rec.next().toString());
                        } else if (recshape.size() == 3) {
                            shapedrecipe.shape(rec.next().toString(), rec.next().toString(), rec.next().toString());
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".a")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".a"), shapedrecipe, 'a');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".b")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".b"), shapedrecipe, 'b');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".c")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".c"), shapedrecipe, 'c');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".d")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".d"), shapedrecipe, 'd');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".e")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".e"), shapedrecipe, 'e');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".f")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".f"), shapedrecipe, 'f');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".g")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".g"), shapedrecipe, 'g');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".h")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".h"), shapedrecipe, 'h');
                        }
                        if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".i")) {
                            addIngredient(Configuration.recipe.getString("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".i"), shapedrecipe, 'i');
                        }
                        SpoutManager.getMaterialManager().registerSpoutRecipe(shapedrecipe);
                    } else {
                        break;
                    }
                }
            }   
        }
    }
    private static void addShaplessRecipes() {
        if (Configuration.recipe.contains("Shapeless Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shapeless Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; true; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shapeless Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Shapeless Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        if (BlockLoader.customblocksmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customblocksmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (BlockLoader.customtoolsmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customtoolsmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (BlockLoader.customfoodmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customfoodmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (BlockLoader.customfishmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(BlockLoader.customfishmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (BlockLoader.customitemsmap.containsKey(resultname)) { 
                            ItemStack result = new SpoutItemStack(BlockLoader.customitemsmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else {
                            if (resultname.contains(":")) {
                                SplitRecipe = resultname.split(":");
                                ItemStack result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(SplitRecipe[0]), Short.parseShort(SplitRecipe[1])), amount);
                                shaplessrecipe = new SpoutShapelessRecipe(result);
                            } else {
                                ItemStack result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(resultname)), amount);
                                shaplessrecipe = new SpoutShapelessRecipe(result);
                            }
                        }
                        for (int count = 1; Configuration.recipe.contains("Shapeless Recipes." + resultname + ".Recipe" + rpcnum + ".ingredient" + count); count++) {
                            String ingredient = Configuration.recipe.getString("Shapeless Recipes." + resultname + ".Recipe" + rpcnum + ".ingredient" + count);
                            if (BlockLoader.customblocksmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(BlockLoader.customblocksmap.get(ingredient));
                            } else if (BlockLoader.customtoolsmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(BlockLoader.customtoolsmap.get(ingredient));
                            } else if (BlockLoader.customfoodmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(BlockLoader.customfoodmap.get(ingredient));
                            } else if (BlockLoader.customfishmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(BlockLoader.customfishmap.get(ingredient));
                            } else if (BlockLoader.customitemsmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(BlockLoader.customitemsmap.get(ingredient));
                            } else {
                                if (ingredient.contains(":")) {
                                    SourceResult = ingredient.split(":");
                                    int id = Integer.parseInt(SourceResult[0]);
                                    short data = Short.parseShort(SourceResult[1]);
                                    shaplessrecipe.addIngredient(MaterialData.getMaterial(id, data));
                                } else {
                                    int id = Integer.parseInt(ingredient);
                                    shaplessrecipe.addIngredient(MaterialData.getMaterial(id));
                                }
                            }
                            if (count == 9) break;
                        }
                        SpoutManager.getMaterialManager().registerSpoutRecipe(shaplessrecipe);
                    } else {
                        break;
                    }
                }
            }
        }
    }
    private static void addFurnaceRecipes() {
        if (Configuration.recipe.contains("Furnace Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Furnace Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; true; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Furnace Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Furnace Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        String source = Configuration.recipe.getString("Furnace Recipes." + resultname + ".Recipe" + rpcnum + ".ingredient");
                        ItemStack result;
                        int id;
                        int data;
                        if (BlockLoader.customblocksmap.containsKey(resultname)) {
                            result = new SpoutItemStack(BlockLoader.customblocksmap.get(resultname), amount);
                        } else if (BlockLoader.customtoolsmap.containsKey(resultname)) {
                            result = new SpoutItemStack(BlockLoader.customtoolsmap.get(resultname), amount);
                        } else if (BlockLoader.customfoodmap.containsKey(resultname)) {
                            result = new SpoutItemStack(BlockLoader.customfoodmap.get(resultname), amount);
                        } else if (BlockLoader.customfishmap.containsKey(resultname)) {
                            result = new SpoutItemStack(BlockLoader.customfishmap.get(resultname), amount);
                        } else if (BlockLoader.customitemsmap.containsKey(resultname)) {
                            result = new SpoutItemStack(BlockLoader.customitemsmap.get(resultname), amount);
                        } else {
                            if (resultname.contains(":")) {
                                FurnaceResult = resultname.split(":");
                                result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(FurnaceResult[0]), Short.parseShort(FurnaceResult[1])), amount);
                            } else {
                                result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(resultname)), amount);
                            }
                        }
                        
                        if (BlockLoader.customblocksmap.containsKey(source)) {
                            data = BlockLoader.customblocksmap.get(source).getCustomId();
                            id = BlockLoader.customblocksmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (BlockLoader.customtoolsmap.containsKey(source)) {
                            data = BlockLoader.customtoolsmap.get(source).getCustomId();
                            id = BlockLoader.customtoolsmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (BlockLoader.customfoodmap.containsKey(source)) {
                            data = BlockLoader.customfoodmap.get(source).getCustomId();
                            id = BlockLoader.customfoodmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (BlockLoader.customfishmap.containsKey(source)) {
                            data = BlockLoader.customfishmap.get(source).getCustomId();
                            id = BlockLoader.customfishmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (BlockLoader.customitemsmap.containsKey(source)) {
                            data = BlockLoader.customitemsmap.get(source).getCustomId();
                            id = BlockLoader.customitemsmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else {
                            if (source.contains(":")) {
                                SourceResult = source.split(":");
                                id = Integer.parseInt(SourceResult[0]);
                                data = Integer.parseInt(SourceResult[1]);
                                FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                            } else {
                                id = Integer.parseInt(source);
                                FurnaceRecipes.CustomFurnaceRecipe(result, id, 0);
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }
    private static void addIngredient(String ingredientName, SpoutShapedRecipe recipe, char letter) {
        int customId;
        if(BlockLoader.customitemsmap.containsKey(ingredientName)){
            customId = BlockLoader.customitemsmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
        } else if(BlockLoader.customblocksmap.containsKey(ingredientName)){
            customId = BlockLoader.customblocksmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
        } else if(BlockLoader.customtoolsmap.containsKey(ingredientName)){
            customId = BlockLoader.customtoolsmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
        } else if(BlockLoader.customfoodmap.containsKey(ingredientName)){
            customId = BlockLoader.customfoodmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
        } else if(BlockLoader.customfishmap.containsKey(ingredientName)){
            customId = BlockLoader.customfishmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
        } else {
            if (ingredientName.contains(":")) {
                Ingredient = ingredientName.split(":");
                shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient[0]), Short.parseShort(Ingredient[1])));
            } else {
                shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(ingredientName)));  
            }
        }
    }
}