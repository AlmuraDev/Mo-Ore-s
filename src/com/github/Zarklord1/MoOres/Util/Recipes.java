package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.FurnaceApi.FurnaceRecipes;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.MoOres;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class Recipes {
    private static String[] Ingredient;
    private static String[] SplitRecipe;
    private static String[] FurnaceResult;
    private static String[] SourceResult;
    private static SpoutShapedRecipe shapedrecipe;
    private static SpoutShapelessRecipe shaplessrecipe;
    
    public static void addAllRecipes(MoOres plugin) {
        addShapedRecipes();
        addShaplessRecipes();
        addFurnaceRecipes();
    }
    
    private static void addShapedRecipes() {
        System.out.println(1);
        if (Configuration.recipe.contains("Shaped Recipes")) {
            System.out.println(2);
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shaped Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; rpcnum == rpcnum; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        if (Hashmaps.customblocksmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customblocksmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (Hashmaps.customoresmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customoresmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (Hashmaps.custombushesmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.custombushesmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (Hashmaps.customtoolsmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customtoolsmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (Hashmaps.customfoodmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customfoodmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (Hashmaps.customfishmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customfishmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (Hashmaps.customitemsmap.containsKey(resultname)) { 
                            ItemStack result = new SpoutItemStack(Hashmaps.customitemsmap.get(resultname), amount);
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
                        Iterator rec = recshape.iterator();
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
                for (int rpcnum = 1; rpcnum == rpcnum; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shapeless Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Shapeless Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        if (Hashmaps.customblocksmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customblocksmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (Hashmaps.customoresmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customoresmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (Hashmaps.custombushesmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.custombushesmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (Hashmaps.customtoolsmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customtoolsmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (Hashmaps.customfoodmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customfoodmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (Hashmaps.customfishmap.containsKey(resultname)) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customfishmap.get(resultname), amount);
                            shaplessrecipe = new SpoutShapelessRecipe(result);
                        } else if (Hashmaps.customitemsmap.containsKey(resultname)) { 
                            ItemStack result = new SpoutItemStack(Hashmaps.customitemsmap.get(resultname), amount);
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
                            if (Hashmaps.customblocksmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(Hashmaps.customblocksmap.get(ingredient));
                            } else if (Hashmaps.customoresmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(Hashmaps.customoresmap.get(ingredient));
                            } else if (Hashmaps.custombushesmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(Hashmaps.custombushesmap.get(ingredient));
                            } else if (Hashmaps.customtoolsmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(Hashmaps.customtoolsmap.get(ingredient));
                            } else if (Hashmaps.customfoodmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(Hashmaps.customfoodmap.get(ingredient));
                            } else if (Hashmaps.customfishmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(Hashmaps.customfishmap.get(ingredient));
                            } else if (Hashmaps.customitemsmap.containsKey(ingredient)) {
                                shaplessrecipe.addIngredient(Hashmaps.customitemsmap.get(ingredient));
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
                for (int rpcnum = 1; rpcnum == rpcnum; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Furnace Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Furnace Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        String source = Configuration.recipe.getString("Furnace Recipes." + resultname + ".Recipe" + rpcnum + ".ingredient");
                        ItemStack result;
                        int id;
                        int data;
                        if (Hashmaps.customblocksmap.containsKey(resultname)) {
                            result = new SpoutItemStack(Hashmaps.customblocksmap.get(resultname), amount);
                        } else if (Hashmaps.customoresmap.containsKey(resultname)) {
                            result = new SpoutItemStack(Hashmaps.customoresmap.get(resultname), amount);
                        } else if (Hashmaps.custombushesmap.containsKey(resultname)) {
                            result = new SpoutItemStack(Hashmaps.custombushesmap.get(resultname), amount);
                        } else if (Hashmaps.customtoolsmap.containsKey(resultname)) {
                            result = new SpoutItemStack(Hashmaps.customtoolsmap.get(resultname), amount);
                        } else if (Hashmaps.customfoodmap.containsKey(resultname)) {
                            result = new SpoutItemStack(Hashmaps.customfoodmap.get(resultname), amount);
                        } else if (Hashmaps.customfishmap.containsKey(resultname)) {
                            result = new SpoutItemStack(Hashmaps.customfishmap.get(resultname), amount);
                        } else if (Hashmaps.customitemsmap.containsKey(resultname)) {
                            result = new SpoutItemStack(Hashmaps.customitemsmap.get(resultname), amount);
                        } else {
                            if (resultname.contains(":")) {
                                FurnaceResult = resultname.split(":");
                                result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(FurnaceResult[0]), Short.parseShort(FurnaceResult[1])), amount);
                            } else {
                                result = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(resultname)), amount);
                            }
                        }
                        
                        if (Hashmaps.customblocksmap.containsKey(source)) {
                            data = Hashmaps.customblocksmap.get(source).getCustomId();
                            id = Hashmaps.customblocksmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (Hashmaps.customoresmap.containsKey(source)) {
                            data = Hashmaps.customoresmap.get(source).getCustomId();
                            id = Hashmaps.customoresmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (Hashmaps.custombushesmap.containsKey(source)) {
                            data = Hashmaps.custombushesmap.get(source).getCustomId();
                            id = Hashmaps.custombushesmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (Hashmaps.customtoolsmap.containsKey(source)) {
                            data = Hashmaps.customtoolsmap.get(source).getCustomId();
                            id = Hashmaps.customtoolsmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (Hashmaps.customfoodmap.containsKey(source)) {
                            data = Hashmaps.customfoodmap.get(source).getCustomId();
                            id = Hashmaps.customfoodmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (Hashmaps.customfishmap.containsKey(source)) {
                            data = Hashmaps.customfishmap.get(source).getCustomId();
                            id = Hashmaps.customfishmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else if (Hashmaps.customitemsmap.containsKey(source)) {
                            data = Hashmaps.customitemsmap.get(source).getCustomId();
                            id = Hashmaps.customitemsmap.get(source).getId();
                            FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                        } else {
                            if (source.contains(":")) {
                                SourceResult = source.split(":");
                                id = Integer.parseInt(SourceResult[0]);
                                data = Integer.parseInt(SourceResult[1]);
                                FurnaceRecipes.CustomFurnaceRecipe(result, id, data);
                            } else {
                                id = Integer.parseInt(source);
                                frecipe.addFurnaceRecipe(result, Material.getMaterial(id));
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
        if(Hashmaps.customitemsmap.containsKey(ingredientName)){
            customId = Hashmaps.customitemsmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
        }else if(Hashmaps.customoresmap.containsKey(ingredientName)){
            customId = Hashmaps.customoresmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
        }else if(Hashmaps.customblocksmap.containsKey(ingredientName)){
            customId = Hashmaps.customblocksmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
        }else if(Hashmaps.customtoolsmap.containsKey(ingredientName)){
            customId = Hashmaps.customtoolsmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
        }else if(Hashmaps.customfoodmap.containsKey(ingredientName)){
            customId = Hashmaps.customfoodmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
        }else if(Hashmaps.custombushesmap.containsKey(ingredientName)){
            customId = Hashmaps.custombushesmap.get(ingredientName).getCustomId();
            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
        }else if(Hashmaps.customfishmap.containsKey(ingredientName)){
            customId = Hashmaps.customfishmap.get(ingredientName).getCustomId();
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