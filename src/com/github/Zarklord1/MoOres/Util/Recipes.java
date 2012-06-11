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

	private static String[] Ingredient1;
	private static String[] Ingredient2;
	private static String[] Ingredient3;
	private static String[] Ingredient4;
	private static String[] Ingredient5;
	private static String[] Ingredient6;
	private static String[] Ingredient7;
	private static String[] Ingredient8;
	private static String[] Ingredient9;
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
              addRecipes();
          }

    private static String[] TopRow;
    private static String[] MiddleRow;
    private static String[] BottomRow;
    private static String[] recipeshape = {"", "", ""};
    private static SpoutShapedRecipe shapedrecipe;
    private static SpoutShapelessRecipe shaplessrecipe;
    private static void addRecipes() {
        if (Configuration.recipe.contains("Shaped Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shaped Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; rpcnum < 30; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum)) {
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
                        if (!TopRow[0].equals("-")) {
                            if (a == 1) {
                                int customId;
                                char letter = 0;
                                if (a == 1) {
                                    letter = letter11;
                                    if(Hashmaps.customitemsmap.containsKey(TopRow[0])){
                                        customId = Hashmaps.customitemsmap.get(TopRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(TopRow[0])){
                                        customId = Hashmaps.customoresmap.get(TopRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(TopRow[0])){
                                        customId = Hashmaps.customblocksmap.get(TopRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(TopRow[0])){
                                        customId = Hashmaps.customtoolsmap.get(TopRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(TopRow[0])){
                                        customId = Hashmaps.customfoodmap.get(TopRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(TopRow[0])){
                                        customId = Hashmaps.custombushesmap.get(TopRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(TopRow[0])){
                                        customId = Hashmaps.customfishmap.get(TopRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (TopRow[0].contains(":")) {
                                        Ingredient1 = TopRow[0].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0]), Short.parseShort(Ingredient1[1])));
                                    } else {
                                      Ingredient1[0] = TopRow[0];
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0])));  
                                    }
                                }
                            }
                        }
                        if (!TopRow[1].equals("-")) {
                            if (b == 2) {
                                int customId;
                                char letter = 0;
                                if (b == 2) {
                                    letter = letter22;
                                    if(Hashmaps.customitemsmap.containsKey(TopRow[1])){
                                        customId = Hashmaps.customitemsmap.get(TopRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(TopRow[1])){
                                        customId = Hashmaps.customoresmap.get(TopRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(TopRow[1])){
                                        customId = Hashmaps.customblocksmap.get(TopRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(TopRow[1])){
                                        customId = Hashmaps.customtoolsmap.get(TopRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(TopRow[1])){
                                        customId = Hashmaps.customfoodmap.get(TopRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(TopRow[1])){
                                        customId = Hashmaps.custombushesmap.get(TopRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(TopRow[1])){
                                        customId = Hashmaps.customfishmap.get(TopRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (TopRow[1].contains(":")) {
                                        Ingredient2 = TopRow[1].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient2[0]), Short.parseShort(Ingredient2[1])));
                                    } else {
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[1])));  
                                    }
                                }
                            }
                        }
                        if (!TopRow[2].equals("-")) {
                            if (c == 3) {
                                int customId;
                                char letter = 0;
                                if (c == 3) {
                                    letter = letter33;
                                    if(Hashmaps.customitemsmap.containsKey(TopRow[2])){
                                        customId = Hashmaps.customitemsmap.get(TopRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(TopRow[2])){
                                        customId = Hashmaps.customoresmap.get(TopRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(TopRow[2])){
                                        customId = Hashmaps.customblocksmap.get(TopRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(TopRow[2])){
                                        customId = Hashmaps.customtoolsmap.get(TopRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(TopRow[2])){
                                        customId = Hashmaps.customfoodmap.get(TopRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(TopRow[2])){
                                        customId = Hashmaps.custombushesmap.get(TopRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(TopRow[2])){
                                        customId = Hashmaps.customfishmap.get(TopRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (TopRow[2].contains(":")) {
                                        Ingredient3 = TopRow[2].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient3[0]), Short.parseShort(Ingredient3[1])));
                                    } else {
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[2])));  
                                    }
                                }
                            }
                        }
                        if (!MiddleRow[0].equals("-")) {
                            int customId;
                            char letter = 0;
                                if (d == 4) {
                                    letter = letter44;
                                    if(Hashmaps.customitemsmap.containsKey(MiddleRow[0])){
                                        customId = Hashmaps.customitemsmap.get(MiddleRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(MiddleRow[0])){
                                        customId = Hashmaps.customoresmap.get(MiddleRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(MiddleRow[0])){
                                        customId = Hashmaps.customblocksmap.get(MiddleRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[0])){
                                        customId = Hashmaps.customtoolsmap.get(MiddleRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(MiddleRow[0])){
                                        customId = Hashmaps.customfoodmap.get(MiddleRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(MiddleRow[0])){
                                        customId = Hashmaps.custombushesmap.get(MiddleRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(MiddleRow[0])){
                                        customId = Hashmaps.customfishmap.get(MiddleRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (MiddleRow[0].contains(":")) {
                                        Ingredient4 = MiddleRow[0].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient4[0]), Short.parseShort(Ingredient4[1])));
                                    } else {
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[0])));  
                                    }
                                }
                        }
                        if (!MiddleRow[1].equals("-")) {
                            if (e == 5) {
                                int customId;
                                char letter = 0;
                                if (e == 5) {
                                    letter = letter55;
                                    if(Hashmaps.customitemsmap.containsKey(MiddleRow[1])){
                                        customId = Hashmaps.customitemsmap.get(MiddleRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(MiddleRow[1])){
                                        customId = Hashmaps.customoresmap.get(MiddleRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(MiddleRow[1])){
                                        customId = Hashmaps.customblocksmap.get(MiddleRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[1])){
                                        customId = Hashmaps.customtoolsmap.get(MiddleRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(MiddleRow[1])){
                                        customId = Hashmaps.customfoodmap.get(MiddleRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(MiddleRow[1])){
                                        customId = Hashmaps.custombushesmap.get(MiddleRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(MiddleRow[1])){
                                        customId = Hashmaps.customfishmap.get(MiddleRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (MiddleRow[1].contains(":")) {
                                        Ingredient5 = MiddleRow[1].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient5[0]), Short.parseShort(Ingredient5[1])));
                                    } else {
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[1])));  
                                    }
                                }
                            }
                        }
                        if (!MiddleRow[2].equals("-")) {
                            if (f == 6) {
                                int customId;
                                char letter = 0;
                                if (f == 6) {
                                    letter = letter66;
                                    if(Hashmaps.customitemsmap.containsKey(MiddleRow[2])){
                                        customId = Hashmaps.customitemsmap.get(MiddleRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(MiddleRow[2])){
                                        customId = Hashmaps.customoresmap.get(MiddleRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(MiddleRow[2])){
                                        customId = Hashmaps.customblocksmap.get(MiddleRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[2])){
                                        customId = Hashmaps.customtoolsmap.get(MiddleRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(MiddleRow[2])){
                                        customId = Hashmaps.customfoodmap.get(MiddleRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(MiddleRow[2])){
                                        customId = Hashmaps.custombushesmap.get(MiddleRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(MiddleRow[2])){
                                        customId = Hashmaps.customfishmap.get(MiddleRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (MiddleRow[2].contains(":")) {
                                        Ingredient6 = MiddleRow[2].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient6[0]), Short.parseShort(Ingredient6[1])));
                                    } else {
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[2])));  
                                    }
                                }
                            }
                        }
                        if (!BottomRow[0].equals("-")) {
                            if (g == 7) {
                                int customId;
                                char letter = 0;
                                if (g == 7) {
                                    letter = letter77;
                                    if(Hashmaps.customitemsmap.containsKey(BottomRow[0])){
                                        customId = Hashmaps.customitemsmap.get(BottomRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(BottomRow[0])){
                                        customId = Hashmaps.customoresmap.get(BottomRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(BottomRow[0])){
                                        customId = Hashmaps.customblocksmap.get(BottomRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(BottomRow[0])){
                                        customId = Hashmaps.customtoolsmap.get(BottomRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(BottomRow[0])){
                                        customId = Hashmaps.customfoodmap.get(BottomRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(BottomRow[0])){
                                        customId = Hashmaps.custombushesmap.get(BottomRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(BottomRow[0])){
                                        customId = Hashmaps.customfishmap.get(BottomRow[0]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (BottomRow[0].contains(":")) {
                                        Ingredient7 = BottomRow[0].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient7[0]), Short.parseShort(Ingredient7[1])));
                                    } else {
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[0])));  
                                    }
                                }
                            }
                        }
                        if (!BottomRow[1].equals("-")) {
                            if (h == 8) {
                                int customId;
                                char letter = 0;
                                if (h == 8) {
                                    letter = letter88;
                                    if(Hashmaps.customitemsmap.containsKey(BottomRow[1])){
                                        customId = Hashmaps.customitemsmap.get(BottomRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(BottomRow[1])){
                                        customId = Hashmaps.customoresmap.get(BottomRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(BottomRow[1])){
                                        customId = Hashmaps.customblocksmap.get(BottomRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(BottomRow[1])){
                                        customId = Hashmaps.customtoolsmap.get(BottomRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(BottomRow[1])){
                                        customId = Hashmaps.customfoodmap.get(BottomRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(BottomRow[1])){
                                        customId = Hashmaps.custombushesmap.get(BottomRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(BottomRow[1])){
                                        customId = Hashmaps.customfishmap.get(BottomRow[1]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (BottomRow[1].contains(":")) {
                                        Ingredient8 = BottomRow[1].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient8[0]), Short.parseShort(Ingredient8[1])));
                                    } else {
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[1])));  
                                    }
                                }
                            }
                        }
                        if (!BottomRow[2].equals("-")) {
                            if (i == 9) {
                                int customId;
                                char letter = 0;
                                if (i == 9) {
                                    letter = letter99;
                                    if(Hashmaps.customitemsmap.containsKey(BottomRow[2])){
                                        customId = Hashmaps.customitemsmap.get(BottomRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customoresmap.containsKey(BottomRow[2])){
                                        customId = Hashmaps.customoresmap.get(BottomRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customblocksmap.containsKey(BottomRow[2])){
                                        customId = Hashmaps.customblocksmap.get(BottomRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customtoolsmap.containsKey(BottomRow[2])){
                                        customId = Hashmaps.customtoolsmap.get(BottomRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomBlock(customId));
                                    }else if(Hashmaps.customfoodmap.containsKey(BottomRow[2])){
                                        customId = Hashmaps.customfoodmap.get(BottomRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.custombushesmap.containsKey(BottomRow[2])){
                                        customId = Hashmaps.custombushesmap.get(BottomRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }else if(Hashmaps.customfishmap.containsKey(BottomRow[2])){
                                        customId = Hashmaps.customfishmap.get(BottomRow[2]).getCustomId();
                                        shapedrecipe.setIngredient(letter, MaterialData.getCustomItem(customId));
                                    }
                                    if (BottomRow[2].contains(":")) {
                                        Ingredient9 = BottomRow[2].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient9[0]), Short.parseShort(Ingredient9[1])));
                                    } else {
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[2])));  
                                    }
                                }
                            }
                        }
                    }
                    SpoutManager.getMaterialManager().registerSpoutRecipe(shapedrecipe);
                }
            }
        }
        if (Configuration.recipe.contains("Shapless Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shapless Recipes");
            Object[] keys = section.getKeys(false).toArray();
            for (int num = 0; num < keys.length; num++) {
                for (int rpcnum = 1; rpcnum < 30; rpcnum++) {
                    String resultname = (String)keys[num];
                    if (Configuration.recipe.contains("Shapless Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Shapless Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                    }
                }
            }
        }
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