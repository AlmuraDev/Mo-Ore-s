package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.MoOres;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.getspout.commons.block.Block;
import org.getspout.commons.material.MaterialData;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;

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
        private static String[] resultsplit;
        String letter1 = "a";
        char letter11 = 'a';
        String letter2 = "a";
        char letter22 = 'a';
        String letter3 = "a";
        char letter33 = 'a';
        String letter4 = "a";
        char letter44 = 'a';
        String letter5 = "a";
        char letter55 = 'a';
        String letter6 = "a";
        char letter66 = 'a';
        String letter7 = "a";
        char letter77 = 'a';
        String letter8 = "a";
        char letter88 = 'a';
        String letter9 = "a";
        char letter99 = 'a';
        int x = 1;
        int y = 4;
        int z = 7;
	/*public static void addItemShapedRecipe(MoOres plugin){
		for (GenericCustomItem item:Hashmaps.customitems) {
			checkitem("Items",item);
		}
	}
	public static void addBlockShapedRecipe(MoOres plugin){
		for (CustomOres block:Hashmaps.customores) {
			checkore("Ores",block);
		}
		for (CustomBlocks block:Hashmaps.customblocks) {
			checkblock("Blocks",block);
		}
		for (CustomBush Bush:Hashmaps.custombushes) {
			checkbush("Bushes", Bush);
		}
	}
	public static void addToolShapedRecipe(MoOres plugin){
                int y = 0;
		for (GenericCustomTool tool:Hashmaps.customtools){
                    checkitem("Tools",tool);
                    y++;
                    MoOres.log.info(y + " recipes");
		}	
	}
	  public static void addFoodShapedRecipe(MoOres plugin) {
		for (GenericCustomFood food : Hashmaps.customfood)
	      checkitem("Food", food);
	  }*/
          public void addAllRecipes(MoOres plugin) {
              addRecipes();
          }
	
		
	
	/*public static int i = 0;
	private static SpoutShapedRecipe recipe;
	private static String rowletter;
	public static void checkitem(String type, GenericItem item){
		for(int rpc = 1; rpc < 10; rpc++){
			if(Configuration.items.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
				int amount = Configuration.items.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
				List list = Configuration.items.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
				Iterator keys = list.iterator();
				String[] TopRow = keys.next().toString().split(",");
				String[] MiddleRow = keys.next().toString().split(",");
				String[] BottomRow = keys.next().toString().split(",");
				String srow1 = "";
				String srow2 = "";
				String srow3 = "";

				ItemStack result = new SpoutItemStack(item, amount);
				recipe = new SpoutShapedRecipe(result);
				recipe.shape("ghi", "def", "abc");

				char letter = 0;

				for(int count=0; count<3; count ++){
					if(TopRow[count].contains(":")){
 
						if(count == 0){
							row1dv1 = TopRow[count].split(":");
						}else if(count == 1){
							row1dv2 = TopRow[count].split(":");
						}else if(count == 2){
							row1dv3 = TopRow[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(MiddleRow[count].contains(":")){
 
						if(count == 0){
							row2dv1 = MiddleRow[count].split(":");
						}else if(count == 1){
							row2dv2 = MiddleRow[count].split(":");
						}else if(count == 2){
							row2dv3 = MiddleRow[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(BottomRow[count].contains(":")){
 
						if(count == 0){
							row3dv1 = BottomRow[count].split(":");
						}else if(count == 1){
							row3dv2 = BottomRow[count].split(":");
						}else if(count == 2){
							row3dv3 = BottomRow[count].split(":");
						}
					}
				}

				for(int rowi = 0; rowi<3; ++rowi){
					if(rowi == 0){
						for(i = 0; i<3;){
         
							if(i == 0){
								letter = 'a';
								rowletter = "a";
							}else if(i == 1){
								letter = 'b';
								rowletter = "b";
							}else if(i == 2){
								letter = 'c';
								rowletter = "c";
							}
							if(!TopRow[i].equals("-")){
                 
								try{
									if(i == 0){
										if(row1dv1 != null){
                                         
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
											srow1 = srow1 + rowletter;
											row1dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}else if(i == 1){
										if(row1dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
											srow1 = srow1 + rowletter;
											row1dv2 = null;
										}else{
                                         
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}else{
										if(row1dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
											srow1 = srow1 + rowletter;
											row1dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									int customId = 0;
									if(Hashmaps.customitemsmap.containsKey(TopRow[i])){
										customId = Hashmaps.customitemsmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(TopRow[i])){
										customId = Hashmaps.customoresmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(TopRow[i])){
                                 
										customId = Hashmaps.customtoolsmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(TopRow[i])){
										customId = Hashmaps.customfoodmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow1 = srow1 + " ";
							}
							++i;
						}
					}else if(rowi == 1){
						for(int i = 0; i<3;){
         
							if(i == 0){
								letter = 'd';
								rowletter = "d";
							}else if(i == 1){
								letter = 'e';
								rowletter = "e";
							}else if(i == 2){
								letter = 'f';
								rowletter = "f";
							}
							if(!MiddleRow[i].equals("-")){
								try{
									if(i == 0){
                                 
										if(row2dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
											srow2 = srow2 + rowletter;
											row2dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}else if(i == 1){
										if(row2dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
											srow2 = srow2 + rowletter;
											row2dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}else{
										if(row2dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
											srow2 = srow2 + rowletter;
											row2dv3 = null;
										}else{
                                         
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									int customId = 0;
									if(Hashmaps.customitemsmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customitemsmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customoresmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customtoolsmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
                                     
									}else if(Hashmaps.customfoodmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customfoodmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow2 = srow2 + " ";
							}
							++i;
						}
					}else if(rowi == 2){
						for(int i = 0; i<3;){
							if(i == 0){
								letter = 'g';
								rowletter = "g";
							}else if(i == 1){
								letter = 'h';
								rowletter = "h";
							}else if(i == 2){
								letter = 'i';
								rowletter = "i";
                     
							}
							if(!BottomRow[i].equals("-")){
								try{
									if(i == 0){
										if(row3dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
											srow3 = srow3 + rowletter;
											row3dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}else if(i == 1){
										if(row3dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
											srow3 = srow3 + rowletter;
											row3dv2 = null;
										}else{
                                         
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}else{
										if(row3dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
											srow3 = srow3 + rowletter;
											row3dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}
								}catch(NumberFormatException e){
                         
									int customId = 0;
									if(Hashmaps.customitemsmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customitemsmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customoresmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customtoolsmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customfoodmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
                 
								srow3 = srow3 + " ";
							}
							++i;
						}
					}
				}
				recipe.shape(srow1, srow2, srow3);
				SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
			}
			if(Configuration.items.contains("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc)){
				int amount = Configuration.items.getInt("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".amount");
				String ingredientraw = Configuration.items.getString("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".ingredient");
				int customId = 0;
				ItemStack result = new SpoutItemStack(item, amount);
				try{
					int ingredient = Integer.parseInt(ingredientraw);
					FurnaceRecipes.NewFurnaceRecipe(result, ingredient);
				}catch(NumberFormatException e){
					if(Hashmaps.customoresmap.containsKey(ingredientraw)){
						customId = Hashmaps.customoresmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}else if(Hashmaps.customblocksmap.containsKey(ingredientraw)){
						customId = Hashmaps.customblocksmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}else if(Hashmaps.customitemsmap.containsKey(ingredientraw)){
						customId = Hashmaps.customitemsmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.customtoolsmap.containsKey(ingredientraw)){
						customId = Hashmaps.customtoolsmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.customfoodmap.containsKey(ingredientraw)){
						customId = Hashmaps.customfoodmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.custombushesmap.containsKey(ingredientraw)){
 
						customId = Hashmaps.custombushesmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}
				}
			}
		}
	}
	public static void checkore(String type, CustomOres item){
		for(int rpc = 1; rpc < 10; ++rpc){
			if(Configuration.ore.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
				int amount = Configuration.ore.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
				List list = Configuration.ore.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
				int customId = 0;
				Iterator keys = list.iterator();
				String[] TopRow = keys.next().toString().split(",");
				String[] MiddleRow = keys.next().toString().split(",");
				String[] BottomRow = keys.next().toString().split(",");
				String srow1 = "";
				String srow2 = "";
				String srow3 = "";

				ItemStack result = new SpoutItemStack(item, amount);
				recipe = new SpoutShapedRecipe(result);
				recipe.shape("ghi", "def", "abc");

				char letter = 0;

				for(int count=0; count<3; count ++){
					if(TopRow[count].contains(":")){
						if(count == 0){
							row1dv1 = TopRow[count].split(":");
						}else if(count == 1){
							row1dv2 = TopRow[count].split(":");
						}else if(count == 2){
							row1dv3 = TopRow[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(MiddleRow[count].contains(":")){
						if(count == 0){
							row2dv1 = MiddleRow[count].split(":");
						}else if(count == 1){
							row2dv2 = MiddleRow[count].split(":");
						}else if(count == 2){
							row2dv3 = MiddleRow[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(BottomRow[count].contains(":")){
						if(count == 0){
							row3dv1 = BottomRow[count].split(":");
						}else if(count == 1){
							row3dv2 = BottomRow[count].split(":");
						}else if(count == 2){
							row3dv3 = BottomRow[count].split(":");
						}
					}
				}

				for(int rowi = 0; rowi<3; ++rowi){
					if(rowi == 0){
						for(i = 0; i<3;){
							if(i == 0){
								letter = 'a';
								rowletter = "a";
							}else if(i == 1){
								letter = 'b';
								rowletter = "b";
							}else if(i == 2){
								letter = 'c';
								rowletter = "c";
							}
							if(!TopRow[i].equals("-")){
								try{
									if(i == 0){
										if(row1dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
											srow1 = srow1 + rowletter;
											row1dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}else if(i == 1){
										if(row1dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
											srow1 = srow1 + rowletter;
											row1dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}else{
										if(row1dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
											srow1 = srow1 + rowletter;
											row1dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(TopRow[i])){
										customId = Hashmaps.customitemsmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(TopRow[i])){
										customId = Hashmaps.customoresmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(TopRow[i])){
										customId = Hashmaps.customtoolsmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(TopRow[i])){
										customId = Hashmaps.customfoodmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow1 = srow1 + " ";
							}
							++i;
						}
					}else if(rowi == 1){
						for(int i = 0; i<3;){
							if(i == 0){
								letter = 'd';
								rowletter = "d";
							}else if(i == 1){
								letter = 'e';
								rowletter = "e";
							}else if(i == 2){
								letter = 'f';
								rowletter = "f";
							}
							if(!MiddleRow[i].equals("-")){
								try{
									if(i == 0){
										if(row2dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
											srow2 = srow2 + rowletter;
											row2dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}else if(i == 1){
										if(row2dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
											srow2 = srow2 + rowletter;
											row2dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}else{
										if(row2dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
											srow2 = srow2 + rowletter;
											row2dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customitemsmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customoresmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customtoolsmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customfoodmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow2 = srow2 + " ";
							}
							++i;
						}
					}else if(rowi == 2){
						for(int i = 0; i<3;){
							if(i == 0){
								letter = 'g';
								rowletter = "g";
							}else if(i == 1){
								letter = 'h';
								rowletter = "h";
							}else if(i == 2){
								letter = 'i';
								rowletter = "i";
							}
							if(!BottomRow[i].equals("-")){
								try{
									if(i == 0){
										if(row3dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
											srow3 = srow3 + rowletter;
											row3dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}else if(i == 1){
										if(row3dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
											srow3 = srow3 + rowletter;
											row3dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}else{
										if(row3dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
											srow3 = srow3 + rowletter;
											row3dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customitemsmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customoresmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customtoolsmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customfoodmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow3 = srow3 + " ";
							}
							++i;
						}
					}
				}
				recipe.shape(srow1, srow2, srow3);
				SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
			}
			if(Configuration.items.contains("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc)){
				int amount = Configuration.items.getInt("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".amount");
				String ingredientraw = Configuration.items.getString("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".ingredient");
				int customId = 0;
				ItemStack result = new SpoutItemStack(item, amount);
				try{
					int ingredient = Integer.parseInt(ingredientraw);
					FurnaceRecipes.NewFurnaceRecipe(result, ingredient);
				}catch(NumberFormatException e){
					GenericCustomItem test2 = Hashmaps.customitemsmap.get(ingredientraw);
					GenericCustomTool test3 = Hashmaps.customtoolsmap.get(ingredientraw);
					if(Hashmaps.customoresmap.containsKey(ingredientraw)){
						customId = Hashmaps.customoresmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}else if(Hashmaps.customblocksmap.containsKey(ingredientraw)){
						customId = Hashmaps.customblocksmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}else if(Hashmaps.customitemsmap.containsKey(ingredientraw)){
						customId = Hashmaps.customitemsmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.customtoolsmap.containsKey(ingredientraw)){
						customId = Hashmaps.customtoolsmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.customfoodmap.containsKey(ingredientraw)){
						customId = Hashmaps.customfoodmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.custombushesmap.containsKey(ingredientraw)){
						customId = Hashmaps.custombushesmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}
				}
			}
		}
	}
	public static void checkblock(String type, CustomBlocks item){
		for(int rpc = 1; rpc < 10; ++rpc){
			if(Configuration.block.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
				int amount = Configuration.block.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
				List list = Configuration.block.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
				int customId = 0;
				Iterator keys = list.iterator();
				String[] TopRow = keys.next().toString().split(",");
				String[] MiddleRow = keys.next().toString().split(",");
				String[] BottomRow = keys.next().toString().split(",");
				String srow1 = "";
				String srow2 = "";
				String srow3 = "";

				ItemStack result = new SpoutItemStack(item, amount);
				recipe = new SpoutShapedRecipe(result);
				recipe.shape("ghi", "def", "abc");

				char letter = 0;

				for(int count=0; count<3; count ++){
					if(TopRow[count].contains(":")){
						if(count == 0){
							row1dv1 = TopRow[count].split(":");
						}else if(count == 1){
							row1dv2 = TopRow[count].split(":");
						}else if(count == 2){
							row1dv3 = TopRow[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(MiddleRow[count].contains(":")){
						if(count == 0){
							row2dv1 = MiddleRow[count].split(":");
						}else if(count == 1){
							row2dv2 = MiddleRow[count].split(":");
						}else if(count == 2){
							row2dv3 = MiddleRow[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(BottomRow[count].contains(":")){
						if(count == 0){
							row3dv1 = BottomRow[count].split(":");
						}else if(count == 1){
							row3dv2 = BottomRow[count].split(":");
						}else if(count == 2){
							row3dv3 = BottomRow[count].split(":");
						}
					}
				}

				for(int rowi = 0; rowi<3; ++rowi){
					if(rowi == 0){
						for(i = 0; i<3;){
							if(i == 0){
								letter = 'a';
								rowletter = "a";
							}else if(i == 1){
								letter = 'b';
								rowletter = "b";
							}else if(i == 2){
								letter = 'c';
								rowletter = "c";
							}
							if(!TopRow[i].equals("-")){
								try{
									if(i == 0){
										if(row1dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
											srow1 = srow1 + rowletter;
											row1dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}else if(i == 1){
										if(row1dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
											srow1 = srow1 + rowletter;
											row1dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}else{
										if(row1dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
											srow1 = srow1 + rowletter;
											row1dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
											srow1 = srow1 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(TopRow[i])){
										customId = Hashmaps.customitemsmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(TopRow[i])){
										customId = Hashmaps.customoresmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(TopRow[i])){
										customId = Hashmaps.customtoolsmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(TopRow[i])){
										customId = Hashmaps.customfoodmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									
									
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow1 = srow1 + " ";
							}
							++i;
						}
					}else if(rowi == 1){
						for(int i = 0; i<3;){
							if(i == 0){
								letter = 'd';
								rowletter = "d";
							}else if(i == 1){
								letter = 'e';
								rowletter = "e";
							}else if(i == 2){
								letter = 'f';
								rowletter = "f";
							}
							if(!MiddleRow[i].equals("-")){
								try{
									if(i == 0){
										if(row2dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
											srow2 = srow2 + rowletter;
											row2dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}else if(i == 1){
										if(row2dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
											srow2 = srow2 + rowletter;
											row2dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}else{
										if(row2dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
											srow2 = srow2 + rowletter;
											row2dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
											srow2 = srow2 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customitemsmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customoresmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customtoolsmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(MiddleRow[i])){
										customId = Hashmaps.customfoodmap.get(MiddleRow[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow2 = srow2 + " ";
							}
							++i;
						}
					}else if(rowi == 2){
						for(int i = 0; i<3;){
							if(i == 0){
								letter = 'g';
								rowletter = "g";
							}else if(i == 1){
								letter = 'h';
								rowletter = "h";
							}else if(i == 2){
								letter = 'i';
								rowletter = "i";
							}
							if(!BottomRow[i].equals("-")){
								try{
									if(i == 0){
										if(row3dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
											srow3 = srow3 + rowletter;
											row3dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}else if(i == 1){
										if(row3dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
											srow3 = srow3 + rowletter;
											row3dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}else{
										if(row3dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
											srow3 = srow3 + rowletter;
											row3dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
											srow3 = srow3 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customitemsmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customoresmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
										customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customtoolsmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(BottomRow[i])){
										customId = Hashmaps.customfoodmap.get(BottomRow[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
										customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}
									recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
								}
							} else {
								srow3 = srow3 + " ";
							}
							++i;
						}
					}
				}
				recipe.shape(srow1, srow2, srow3);
				SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
			}
			if(Configuration.items.contains("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc)){
				int amount = Configuration.items.getInt("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".amount");
				String ingredientraw = Configuration.items.getString("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".ingredient");
				int customId = 0;
				ItemStack result = new SpoutItemStack(item, amount);
				try{
					int ingredient = Integer.parseInt(ingredientraw);
					FurnaceRecipes.NewFurnaceRecipe(result, ingredient);
				}catch(NumberFormatException e){
					GenericCustomItem test2 = Hashmaps.customitemsmap.get(ingredientraw);
					GenericCustomTool test3 = Hashmaps.customtoolsmap.get(ingredientraw);
					if(Hashmaps.customoresmap.containsKey(ingredientraw)){
						customId = Hashmaps.customoresmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}else if(Hashmaps.customblocksmap.containsKey(ingredientraw)){
						customId = Hashmaps.customblocksmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}else if(Hashmaps.customitemsmap.containsKey(ingredientraw)){
						customId = Hashmaps.customitemsmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.customtoolsmap.containsKey(ingredientraw)){
						customId = Hashmaps.customtoolsmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.customfoodmap.containsKey(ingredientraw)){
						customId = Hashmaps.customfoodmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}else if(Hashmaps.custombushesmap.containsKey(ingredientraw)){
						customId = Hashmaps.custombushesmap.get(ingredientraw).getCustomId();
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
					}
				}
			}
		}
	}
		public static void checkbush(String type, CustomBush item){
			for(int rpc = 1; rpc < 10; ++rpc){
				if(Configuration.block.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
					int amount = Configuration.block.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
					List list = Configuration.block.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
					int customId = 0;
					Iterator keys = list.iterator();
					String[] TopRow = keys.next().toString().split(",");
					String[] MiddleRow = keys.next().toString().split(",");
					String[] BottomRow = keys.next().toString().split(",");
					String srow1 = "";
					String srow2 = "";
					String srow3 = "";

					ItemStack result = new SpoutItemStack(item, amount);
					recipe = new SpoutShapedRecipe(result);
					recipe.shape("ghi", "def", "abc");

					char letter = 0;

					for(int count=0; count<3; count ++){
						if(TopRow[count].contains(":")){
							if(count == 0){
								row1dv1 = TopRow[count].split(":");
							}else if(count == 1){
								row1dv2 = TopRow[count].split(":");
							}else if(count == 2){
								row1dv3 = TopRow[count].split(":");
							}
						}
					}
					for(int count=0; count<3; count ++){
						if(MiddleRow[count].contains(":")){
							if(count == 0){
								row2dv1 = MiddleRow[count].split(":");
							}else if(count == 1){
								row2dv2 = MiddleRow[count].split(":");
							}else if(count == 2){
								row2dv3 = MiddleRow[count].split(":");
							}
						}
					}
					for(int count=0; count<3; count ++){
						if(BottomRow[count].contains(":")){
							if(count == 0){
								row3dv1 = BottomRow[count].split(":");
							}else if(count == 1){
								row3dv2 = BottomRow[count].split(":");
							}else if(count == 2){
								row3dv3 = BottomRow[count].split(":");
							}
						}
					}

					for(int rowi = 0; rowi<3; ++rowi){
						if(rowi == 0){
							for(i = 0; i<3;){
								if(i == 0){
									letter = 'a';
									rowletter = "a";
								}else if(i == 1){
									letter = 'b';
									rowletter = "b";
								}else if(i == 2){
									letter = 'c';
									rowletter = "c";
								}
								if(!TopRow[i].equals("-")){
									try{
										if(i == 0){
											if(row1dv1 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
												srow1 = srow1 + rowletter;
												row1dv1 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
												srow1 = srow1 + rowletter;
											}
										}else if(i == 1){
											if(row1dv2 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
												srow1 = srow1 + rowletter;
												row1dv2 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
												srow1 = srow1 + rowletter;
											}
										}else{
											if(row1dv3 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
												srow1 = srow1 + rowletter;
												row1dv3 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(TopRow[i])));
												srow1 = srow1 + rowletter;
											}
										}
									}catch(NumberFormatException e){
										if(Hashmaps.customitemsmap.containsKey(TopRow[i])){
											customId = Hashmaps.customitemsmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customoresmap.containsKey(TopRow[i])){
											customId = Hashmaps.customoresmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
											customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customtoolsmap.containsKey(TopRow[i])){
											customId = Hashmaps.customtoolsmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customfoodmap.containsKey(TopRow[i])){
											customId = Hashmaps.customfoodmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
											customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}
										
										
										recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
									}
								} else {
									srow1 = srow1 + " ";
								}
								++i;
							}
						}else if(rowi == 1){
							for(int i = 0; i<3;){
								if(i == 0){
									letter = 'd';
									rowletter = "d";
								}else if(i == 1){
									letter = 'e';
									rowletter = "e";
								}else if(i == 2){
									letter = 'f';
									rowletter = "f";
								}
								if(!MiddleRow[i].equals("-")){
									try{
										if(i == 0){
											if(row2dv1 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
												srow2 = srow2 + rowletter;
												row2dv1 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
												srow2 = srow2 + rowletter;
											}
										}else if(i == 1){
											if(row2dv2 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
												srow2 = srow2 + rowletter;
												row2dv2 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
												srow2 = srow2 + rowletter;
											}
										}else{
											if(row2dv3 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
												srow2 = srow2 + rowletter;
												row2dv3 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(MiddleRow[i])));
												srow2 = srow2 + rowletter;
											}
										}
									}catch(NumberFormatException e){
										if(Hashmaps.customitemsmap.containsKey(MiddleRow[i])){
											customId = Hashmaps.customitemsmap.get(MiddleRow[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.customoresmap.containsKey(MiddleRow[i])){
											customId = Hashmaps.customoresmap.get(MiddleRow[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
											customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customtoolsmap.containsKey(MiddleRow[i])){
											customId = Hashmaps.customtoolsmap.get(MiddleRow[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.customfoodmap.containsKey(MiddleRow[i])){
											customId = Hashmaps.customfoodmap.get(MiddleRow[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
											customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}
										
										recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
									}
								} else {
									srow2 = srow2 + " ";
								}
								++i;
							}
						}else if(rowi == 2){
							for(int i = 0; i<3;){
								if(i == 0){
									letter = 'g';
									rowletter = "g";
								}else if(i == 1){
									letter = 'h';
									rowletter = "h";
								}else if(i == 2){
									letter = 'i';
									rowletter = "i";
								}
								if(!BottomRow[i].equals("-")){
									try{
										if(i == 0){
											if(row3dv1 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
												srow3 = srow3 + rowletter;
												row3dv1 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
												srow3 = srow3 + rowletter;
											}
										}else if(i == 1){
											if(row3dv2 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
												srow3 = srow3 + rowletter;
												row3dv2 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
												srow3 = srow3 + rowletter;
											}
										}else{
											if(row3dv3 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
												srow3 = srow3 + rowletter;
												row3dv3 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(BottomRow[i])));
												srow3 = srow3 + rowletter;
											}
										}
									}catch(NumberFormatException e){
										if(Hashmaps.customitemsmap.containsKey(BottomRow[i])){
											customId = Hashmaps.customitemsmap.get(BottomRow[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.customoresmap.containsKey(BottomRow[i])){
											customId = Hashmaps.customoresmap.get(BottomRow[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.customblocksmap.containsKey(TopRow[i])){
											customId = Hashmaps.customblocksmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customtoolsmap.containsKey(BottomRow[i])){
											customId = Hashmaps.customtoolsmap.get(BottomRow[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.customfoodmap.containsKey(BottomRow[i])){
											customId = Hashmaps.customfoodmap.get(BottomRow[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.custombushesmap.containsKey(TopRow[i])){
											customId = Hashmaps.custombushesmap.get(TopRow[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}
										recipe.setIngredient(letter, MaterialData.getCustomItem(customId));
									}
								} else {
									srow3 = srow3 + " ";
								}
								++i;
							}
						}
					}
					recipe.shape(srow1, srow2, srow3);
					SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
				}
				if(Configuration.items.contains("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc)){
					int amount = Configuration.items.getInt("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".amount");
					String ingredientraw = Configuration.items.getString("Custom " + type + "." + item.getName() + ".furnace recipe"+ rpc +".ingredient");
					int customId = 0;
					ItemStack result = new SpoutItemStack(item, amount);
					try{
						int ingredient = Integer.parseInt(ingredientraw);
						FurnaceRecipes.NewFurnaceRecipe(result, ingredient);
					}catch(NumberFormatException e){
						GenericCustomItem test2 = Hashmaps.customitemsmap.get(ingredientraw);
						GenericCustomTool test3 = Hashmaps.customtoolsmap.get(ingredientraw);
						if(Hashmaps.customoresmap.containsKey(ingredientraw)){
							customId = Hashmaps.customoresmap.get(ingredientraw).getCustomId();
							FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
						}else if(Hashmaps.customblocksmap.containsKey(ingredientraw)){
							customId = Hashmaps.customblocksmap.get(ingredientraw).getCustomId();
							FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
						}else if(Hashmaps.customitemsmap.containsKey(ingredientraw)){
							customId = Hashmaps.customitemsmap.get(ingredientraw).getCustomId();
							FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
						}else if(Hashmaps.customtoolsmap.containsKey(ingredientraw)){
							customId = Hashmaps.customtoolsmap.get(ingredientraw).getCustomId();
							FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
						}else if(Hashmaps.customfoodmap.containsKey(ingredientraw)){
							customId = Hashmaps.customfoodmap.get(ingredientraw).getCustomId();
							FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
						}else if(Hashmaps.custombushesmap.containsKey(ingredientraw)){
							customId = Hashmaps.custombushesmap.get(ingredientraw).getCustomId();
							FurnaceRecipes.CustomFurnaceRecipe(result, Material.STONE, (short) customId);
						}
					}
				}
			}
	}*/
    String[] TopRow;
    String[] MiddleRow;
    String[] BottomRow;
    String[] recipeshape = {"", "", ""};
    private static SpoutShapedRecipe shapedrecipe;
    private static SpoutShapelessRecipe shaplessrecipe;
    private static FurnaceRecipe furnacerecipe;
    private void addRecipes() {
        if (Configuration.recipe.contains("Shaped Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shaped Recipes");
            Iterator keys = section.getKeys(false).iterator();
            boolean isblock = false;
            boolean isore = false;
            boolean isbush = false;
            boolean istool = false;
            boolean isfood = false;
            boolean isfish = false;
            boolean isitem = false;    
            while (keys.hasNext()) {
                for (int rpcnum = 0; rpcnum > 30; rpcnum++) {
                    String resultname = (String)keys.next();
                    if (Configuration.recipe.contains("Shaped Recipes." + resultname + ".Recipe" + rpcnum)) {
                        int amount = Configuration.recipe.getInt("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".amount");
                        List list = Configuration.recipe.getList("Shaped Recipes." + resultname + ".Recipe" + rpcnum + ".ingredients");
                        Iterator recipekeys = list.iterator();
                        TopRow = recipekeys.next().toString().split(",");
                        MiddleRow = recipekeys.next().toString().split(",");
                        BottomRow = recipekeys.next().toString().split(",");
                        if (Hashmaps.customblocksmap.containsKey(resultname)) {
                            isblock = true;
                        } else if (Hashmaps.customoresmap.containsKey(resultname)) {
                            isore = true;
                        } else if (Hashmaps.custombushesmap.containsKey(resultname)) {
                            isbush = true;
                        } else if (Hashmaps.customtoolsmap.containsKey(resultname)) {
                            istool = true;
                        } else if (Hashmaps.customfoodmap.containsKey(resultname)) {
                            isfood = true;
                        } else if (Hashmaps.customfishmap.containsKey(resultname)) {
                            isfish = true;
                        } else if (Hashmaps.customitemsmap.containsKey(resultname)) { 
                            isitem = true;
                        }
                        if (isblock) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customblocksmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (isore) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customoresmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (isbush) {
                            ItemStack result = new SpoutItemStack(Hashmaps.custombushesmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (istool) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customtoolsmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (isfood) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customfoodmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (isfish) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customfishmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else if (isitem) {
                            ItemStack result = new SpoutItemStack(Hashmaps.customitemsmap.get(resultname), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        } else {
                            ItemStack result = new ItemStack(Material.getMaterial(Integer.parseInt(resultname)), amount);
                            shapedrecipe = new SpoutShapedRecipe(result);
                        }
                        DetermineLetter();
                        for(int count=0; count<3; count++) {
                            
                        }
                    }
                }
            }
        } else if (Configuration.recipe.contains("Shapless Recipes")) {
            ConfigurationSection section = Configuration.ore.getConfigurationSection("Shapless Recipes");
            Iterator keys = section.getKeys(false).iterator();
            while (keys.hasNext()) {
                for (int rpcnum = 0; rpcnum > 30; rpcnum++) {
                    String resultname = (String)keys.next();
                }
            }
        } else if (Configuration.recipe.contains("Furnace Recipes")) {
            ConfigurationSection section = Configuration.ore.getConfigurationSection("Furnace Recipes");
            Iterator keys = section.getKeys(false).iterator();
            while (keys.hasNext()) {
                for (int rpcnum = 0; rpcnum > 30; rpcnum++) {
                    String resultname = (String)keys.next();
                }
                
            }
        }     
    }

    private void DetermineLetter() {
        if (!TopRow[0].contains("-")) {
            switch (x) {
                case 1:
                    recipeshape[2] = letter1;
                    x++;
                    break;
                case 2:
                    recipeshape[2] = letter1 + letter2;
                    x++;
                    break;
                case 3:
                    recipeshape[2] = letter1 + letter2 + letter3;
                    x++;
                    break;
            }            
        } else if (!TopRow[1].contains("-")) {
            switch (x) {
                case 1:
                    recipeshape[2] = letter1;
                    x++;
                    break;
                case 2:
                    recipeshape[2] = letter1 + letter2;
                    x++;
                    break;
                case 3:
                    recipeshape[2] = letter1 + letter2 + letter3;
                    x++;
                    break;
            }
        } else if (!TopRow[2].contains("-")) {
            switch (x) {
                case 1:
                    recipeshape[2] = letter1;
                    x++;
                    break;
                case 2:
                    recipeshape[2] = letter1 + letter2;
                    x++;
                    break;
                case 3:
                    recipeshape[2] = letter1 + letter2 + letter3;
                    x++;
                    break;
            }
            
        } else if (!MiddleRow[0].contains("-")) {
            switch (y) {
                    case 4:
                        recipeshape[1] = letter4;
                        y++;
                        break;
                    case 5:
                        recipeshape[1] = letter4 + letter5;
                        y++;
                        break;
                    case 6:
                        recipeshape[1] = letter4 + letter5 + letter6;
                        y++;
                        break;
                }
        } else if (!MiddleRow[1].contains("-")) {
            switch (y) {
                case 4:
                    recipeshape[1] = letter4;
                    y++;
                    break;
                case 5:
                    recipeshape[1] = letter4 + letter5;
                    y++;
                    break;
                case 6:
                    recipeshape[1] = letter4 + letter5 + letter6;
                    y++;
                    break;
            }
        } else if (!MiddleRow[2].contains("-")) {
            switch (y) {
                case 4:
                    recipeshape[1] = letter4;
                    y++;
                    break;
                case 5:
                    recipeshape[1] = letter4 + letter5;
                    y++;
                    break;
                case 6:
                    recipeshape[1] = letter4 + letter5 + letter6;
                    y++;
                    break;
            }
        } else if (!BottomRow[0].contains("-")) {
            switch (z) {
                case 7:
                    recipeshape[0] = letter7;
                    z++;
                    break;
                case 8:
                    recipeshape[0] = letter7 + letter8;
                    z++;
                    break;
                case 9:
                    recipeshape[0] = letter7 + letter8 + letter9;
                    z++;
                    break;
            } 
        } else if (!BottomRow[1].contains("-")) {
            switch (z) {
                case 7:
                    recipeshape[0] = letter7;
                    z++;
                    break;
                case 8:
                    recipeshape[0] = letter7 + letter8;
                    z++;
                    break;
                case 9:
                    recipeshape[0] = letter7 + letter8 + letter9;
                    z++;
                    break;
            }
        } else if (!BottomRow[2].contains("-")) {
            switch (z) {
                case 7:
                    recipeshape[0] = letter7;
                    z++;
                    break;
                case 8:
                    recipeshape[0] = letter7 + letter8;
                    z++;
                    break;
                case 9:
                    recipeshape[0] = letter7 + letter8 + letter9;
                    z++;
                    break;
            }
        }
    }
}