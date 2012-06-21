package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.FurnaceApi.FurnaceRecipes;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.MoOres;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Bukkit;
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
    private static String letter1 = "a";
    private static char letter11 = 'a';
    private static String letter2 = "b";
    private static char letter22 = 'b';
    private static String letter3 = "c";
    private static char letter33 = 'c';
    private static String letter4 = "d";
    private static char letter44 = 'd';
    private static String letter5 = "e";
    private static char letter55 = 'e';
    private static String letter6 = "f";
    private static char letter66 = 'f';
    private static String letter7 = "g";
    private static char letter77 = 'g';
    private static String letter8 = "h";
    private static char letter88 = 'h';
    private static String letter9 = "i";
    private static char letter99 = 'i';
    private static int a;
    private static int b;
    private static int c;        
    private static int d;
    private static int e;
    private static int f;   
    private static int g;
    private static int h;
    private static int i;
    
    public static void addAllRecipes(MoOres plugin) {
        addShapedRecipes();
        addShaplessRecipes();
        addFurnaceRecipes();
    }

    private static String[] TopRow;
    private static String[] MiddleRow;
    private static String[] BottomRow;
    private static String[] recipeshape = {"", "", ""};
    private static SpoutShapedRecipe shapedrecipe;
    private static SpoutShapelessRecipe shaplessrecipe;
    private static void addShapedRecipes() {
        boolean recipeinit = false;
        if (Configuration.recipe.contains("Shaped Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shaped Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; rpcnum < 30; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum)) {
                        recipeinit = true;
                        int amount = Configuration.recipe.getInt("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        List list = Configuration.recipe.getList("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".ingredients");
                        Iterator recipekeys = list.iterator();
                        TopRow = recipekeys.next().toString().split(",");
                        MiddleRow = recipekeys.next().toString().split(",");
                        BottomRow = recipekeys.next().toString().split(",");
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
                        DetermineShape();
                        shapedrecipe.shape(recipeshape[0], recipeshape[1], recipeshape[2]);
                        for (int t = 1; 1 < 3; t++) {
                            if (!TopRow[t].equals("-")) {
                                t += 1;
                                int customId;
                                char letter = 0;
                                if (a == t) 
                                    letter = letter11;
                                else if (b == t)
                                    letter = letter22;
                                else if (c == t)
                                    letter = letter33;
                                t -= 1;
                                    if(Hashmaps.customitemsmap.containsKey(TopRow[t])){
                                            customId = Hashmaps.customitemsmap.get(TopRow[t]).getCustomId();
                                            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(TopRow[t])){
                                            customId = Hashmaps.customoresmap.get(TopRow[t]).getCustomId();
                                            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(TopRow[t])){
                                            customId = Hashmaps.customblocksmap.get(TopRow[t]).getCustomId();
                                            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(TopRow[t])){
                                           customId = Hashmaps.customtoolsmap.get(TopRow[t]).getCustomId();
                                            shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(TopRow[t])){
                                            customId = Hashmaps.customfoodmap.get(TopRow[t]).getCustomId();
                                            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(TopRow[t])){
                                            customId = Hashmaps.custombushesmap.get(TopRow[t]).getCustomId();
                                            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(TopRow[t])){
                                            customId = Hashmaps.customfishmap.get(TopRow[t]).getCustomId();
                                            shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    } else {
                                        if (TopRow[0].contains(":")) {
                                            Ingredient = TopRow[t].split(":");
                                            shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient[0]), Short.parseShort(Ingredient[1])));
                                        } else {
                                            shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[t])));  
                                        }
                                    }
                                }
                            if (!MiddleRow[t].equals("-")) {
                                t += 4;
                                int customId;
                                char letter = 0;
                                if (d == t) 
                                    letter = letter44;
                                else if (e == t)
                                    letter = letter55;
                                else if (f == t)
                                    letter = letter66;
                                t -= 4;
                                if(Hashmaps.customitemsmap.containsKey(MiddleRow[t])){
                                    customId = Hashmaps.customitemsmap.get(MiddleRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                }else if(Hashmaps.customoresmap.containsKey(MiddleRow[t])){
                                        customId = Hashmaps.customoresmap.get(MiddleRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                }else if(Hashmaps.customblocksmap.containsKey(MiddleRow[t])){
                                        customId = Hashmaps.customblocksmap.get(MiddleRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                }else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[t])){
                                        customId = Hashmaps.customtoolsmap.get(MiddleRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                }else if(Hashmaps.customfoodmap.containsKey(MiddleRow[t])){
                                        customId = Hashmaps.customfoodmap.get(MiddleRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                }else if(Hashmaps.custombushesmap.containsKey(MiddleRow[t])){
                                        customId = Hashmaps.custombushesmap.get(MiddleRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                }else if(Hashmaps.customfishmap.containsKey(MiddleRow[t])){
                                        customId = Hashmaps.customfishmap.get(MiddleRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                } else {
                                    if (MiddleRow[t].contains(":")) {
                                        Ingredient = MiddleRow[t].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient[0]), Short.parseShort(Ingredient[1])));
                                    } else {
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[t])));  
                                    }
                                }
                            }
                            if (!BottomRow[t].equals("-")) {
                                t += 7;
                                int customId;
                                char letter = 0;
                                if (g == t) 
                                    letter = letter77;
                                else if (h == t)
                                    letter = letter88;
                                else if (i == t)
                                    letter = letter99;
                                t -= 7;
                                if(Hashmaps.customitemsmap.containsKey(BottomRow[t])){
                                    customId = Hashmaps.customitemsmap.get(BottomRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                }else if(Hashmaps.customoresmap.containsKey(BottomRow[t])){
                                        customId = Hashmaps.customoresmap.get(BottomRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                }else if(Hashmaps.customblocksmap.containsKey(BottomRow[t])){
                                        customId = Hashmaps.customblocksmap.get(BottomRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                }else if(Hashmaps.customtoolsmap.containsKey(BottomRow[t])){
                                        customId = Hashmaps.customtoolsmap.get(BottomRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                }else if(Hashmaps.customfoodmap.containsKey(BottomRow[t])){
                                        customId = Hashmaps.customfoodmap.get(BottomRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                }else if(Hashmaps.custombushesmap.containsKey(BottomRow[t])){
                                        customId = Hashmaps.custombushesmap.get(BottomRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                }else if(Hashmaps.customfishmap.containsKey(BottomRow[t])){
                                        customId = Hashmaps.customfishmap.get(BottomRow[t]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                } else {
                                    if (MiddleRow[t].contains(":")) {
                                        Ingredient = BottomRow[t].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient[0]), Short.parseShort(Ingredient[1])));
                                    } else {
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[t])));  
                                    }
                                }
                            }
                        }
                    }
                    if (recipeinit) {
                        SpoutManager.getMaterialManager().registerSpoutRecipe(shapedrecipe);
                    }
                }
            }   
        }
    }
    private static void addShaplessRecipes() {
        if (Configuration.recipe.contains("Shapless Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shapless Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; rpcnum < 30; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shapless Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Shapless Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
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
                        for (int count = 1; Configuration.recipe.contains("Shapless Recipes." + resultname + ".Recipe" + rpcnum + ".ingredient" + count); count++) {
                            String ingredient = Configuration.recipe.getString("Shapless Recipes." + resultname + ".Recipe" + rpcnum + ".ingredient" + count);
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
                for (int rpcnum = 1; rpcnum < 30; rpcnum++) {
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
                    }
                }
            }
        }
    }
    private static void DetermineShape() {
        if (!TopRow[0].equals("-")) {
                    recipeshape[2] = recipeshape[2] + letter1;
                    a = 1;
        } else if (!TopRow[1].equals("-")) {
                    recipeshape[2] = recipeshape[2] + letter2;
                    b = 2; 
        } else if (!TopRow[2].equals("-")) {
                    recipeshape[2] = recipeshape[2] + letter3;
                    c = 3; 
        } else if (!MiddleRow[0].equals("-")) {
                    recipeshape[1] = recipeshape[1] + letter4;
                    d = 4; 
        } else if (!MiddleRow[1].equals("-")) {
                    recipeshape[1] = recipeshape[1] + letter5;
                    e = 5;
        } else if (!MiddleRow[2].equals("-")) {
                    recipeshape[1] = recipeshape[1] + letter6;
                    f = 6;
        } else if (!BottomRow[0].equals("-")) {
                    recipeshape[0] = recipeshape[0] + letter7;
                    g = 7;
        } else if (!BottomRow[1].equals("-")) {
                    recipeshape[0] = recipeshape[0] + letter8;
                    h = 8; 
        } else if (!BottomRow[2].contains("-")) {
                    recipeshape[0] = recipeshape[0] + letter9;
                    i = 9;
        }
        if (recipeshape[2].equals("abc") || recipeshape[1].equals("def") || recipeshape[0].equals("ghi")) {
            if (a == 1 || b == 2 || c == 3) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
            }
                if (d == 4 || e == 5 || f == 6) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
            }
                if (g == 7 || h == 8 || i == 9) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
            i = 9;
            } 
        } else if (recipeshape[2].equals("bc")) {
            if (recipeshape[1].equals("de") || recipeshape[0].equals("gh")) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else if (recipeshape[1].equals("d") || recipeshape[0].equals("g")) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                }
            } else if (recipeshape[1].equals("df") || recipeshape[0].equals("gi")) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4; 
                    e = 5;
                    f = 6;
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else {
                recipeshape[2] = letter2 + letter3;
                recipeshape[1] = letter5 + letter6;
                recipeshape[0] = letter8 + letter9;
                b = 2;
                c = 3;
                e = 5;
                f = 6;
                h = 8;
                i = 9;
            }
        } else if (recipeshape[2].equals("ab")) {
           if (recipeshape[1].equals("ef") || recipeshape[0].equals("hi")) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else if (recipeshape[1].equals("f") || recipeshape[0].equals("i")) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                }
            } else if (recipeshape[1].equals("df") || recipeshape[0].equals("gi")) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4; 
                    e = 5;
                    f = 6;
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else {
                recipeshape[2] = letter1 + letter2;
                recipeshape[1] = letter4 + letter5;
                recipeshape[0] = letter7 + letter8;
                a = 1;
                b = 2;
                d = 4;
                e = 5;
                g = 7;
                h = 8;
            }
        } else if (recipeshape[2].equals("ac")) {
            recipeshape[2] = letter1 + letter2 + letter3;
            a = 1;
            b = 2;
            c = 3;
            if (d == 4 || e == 5 || f == 6) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
            }
            if (g == 7 || h == 8 || i == 9) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
            } 
        } else if (recipeshape[1].equals("ef")) {
            if (recipeshape[2].equals("ab") || recipeshape[0].equals("gh")) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else if (recipeshape[2].equals("a") || recipeshape[0].equals("g")) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                }
            } else if (recipeshape[2].equals("ac") || recipeshape[0].equals("gi")) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else {
                recipeshape[2] = letter2 + letter3;
                recipeshape[1] = letter5 + letter6;
                recipeshape[0] = letter8 + letter9;
                b = 2;
                c = 3;
                e = 5;
                f = 6;
                h = 8;
                i = 9;
            }
        } else if (recipeshape[1].equals("de")) {
           if (recipeshape[2].equals("bc") || recipeshape[0].equals("hi")) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else if (recipeshape[2].equals("c") || recipeshape[0].equals("i")) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                }
            } else if (recipeshape[2].equals("ac") || recipeshape[0].equals("gi")) {
                recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4; 
                    e = 5;
                    f = 6;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3;   
                }
                if (g == 7 || h == 8 || i == 9) {
                    recipeshape[0] = letter7 + letter8 + letter9;
                    g = 7;
                    h = 8;
                    i = 9;
                } 
            } else {
                recipeshape[2] = letter1 + letter2;
                recipeshape[1] = letter4 + letter5;
                recipeshape[0] = letter7 + letter8;
                a = 1;
                b = 2;
                d = 4;
                e = 5;
                g = 7;
                h = 8;
            }
        } else if (recipeshape[1].equals("df")) {
            recipeshape[1] = letter4 + letter5 + letter6;
            d = 4;
            e = 5;
            f = 6;
            if (a == 1 || b == 2 || c == 3) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3;
            }
            if (g == 7 || h == 8 || i == 9) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
            } 
        } else if (recipeshape[0].equals("hi")) {
            if (recipeshape[1].equals("de") || recipeshape[2].equals("ab")) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                } 
            } else if (recipeshape[1].equals("d") || recipeshape[2].equals("a")) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                }
            } else if (recipeshape[1].equals("df") || recipeshape[2].equals("ac")) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                } 
            } else {
                recipeshape[2] = letter2 + letter3;
                recipeshape[1] = letter5 + letter6;
                recipeshape[0] = letter8 + letter9;
                b = 2;
                c = 3;
                e = 5;
                f = 6;
                h = 8;
                i = 9;
            }
        } else if (recipeshape[0].equals("gh")) {
           if (recipeshape[1].equals("ef") || recipeshape[2].equals("bc")) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                } 
            } else if (recipeshape[1].equals("f") || recipeshape[2].equals("c")) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                }
            } else if (recipeshape[1].equals("df") || recipeshape[2].equals("ac")) {
                recipeshape[0] = letter7 + letter8 + letter9;
                g = 7;
                h = 8;
                i = 9;
                if (d == 4 || e == 5 || f == 6) {
                    recipeshape[1] = letter4 + letter5 + letter6;
                    d = 4;
                    e = 5;
                    f = 6;
                }
                if (a == 1 || b == 2 || c == 3) {
                    recipeshape[2] = letter1 + letter2 + letter3;
                    a = 1;
                    b = 2;
                    c = 3; 
                } 
            } else {
                recipeshape[2] = letter1 + letter2;
                recipeshape[1] = letter4 + letter5;
                recipeshape[0] = letter7 + letter8;
                a = 1;
                b = 2;
                d = 4;
                e = 5;
                g = 7;
                h = 8;
            }
        } else if (recipeshape[0].equals("gi")) {
            recipeshape[0] = letter7 + letter8 + letter9;
            g = 7;
            h = 8;
            i = 9;
            if (d == 4 || e == 5 || f == 6) {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
            }
            if (a == 1 || b == 2 || c == 3) {
                recipeshape[2] = letter1 + letter2 + letter3;
                a = 1;
                b = 2;
                c = 3; 
            } 
        }
        if (TopRow[2].equals("-") && TopRow[1].equals("-") && TopRow[0].equals("-")) {
            recipeshape[2] = null;
            a = 0;
            b = 0;
            c = 0;
        }
        if (MiddleRow[2].equals("-") && MiddleRow[1].equals("-") && MiddleRow[0].equals("-")) {
            recipeshape[1] = null;
            d = 0;
            e = 0;
            f = 0;
        }
        if (BottomRow[2].equals("-") && BottomRow[1].equals("-") && BottomRow[0].equals("-")) {
            recipeshape[0] = null;
            g = 0;
            h = 0;
            i = 0;
        }
    }
}