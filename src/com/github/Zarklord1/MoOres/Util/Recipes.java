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
        private static int x = 1;
        private static int y = 4;
        private static int z = 7;
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
          public static void addAllRecipes(MoOres plugin) {
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
							i++;
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
    
    private static String[] TopRow;
    private static String[] MiddleRow;
    private static String[] BottomRow;
    private static String[] recipeshape = {"", "", ""};
    private static SpoutShapedRecipe shapedrecipe;
    private static SpoutShapelessRecipe shaplessrecipe;
    private static FurnaceRecipe furnacerecipe;
    private static void addRecipes() {
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
                        DetermineLetters();
                        shapedrecipe.shape(recipeshape[2], recipeshape[1], recipeshape[0]);
                        if (!TopRow[0].contains("-")) {
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
                        if (!TopRow[1].contains("-")) {
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
                                        Ingredient1 = TopRow[1].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0]), Short.parseShort(Ingredient1[1])));
                                    } else {
                                      Ingredient1[0] = TopRow[1];
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0])));  
                                    }
                                }
                            }
                        }
                        if (!TopRow[2].contains("-")) {
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
                                        Ingredient1 = TopRow[2].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0]), Short.parseShort(Ingredient1[1])));
                                    } else {
                                      Ingredient1[0] = TopRow[2];
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0])));  
                                    }
                                }
                            }
                        }
                        if (!MiddleRow[0].contains("-")) {
                            int customId;
                            char letter = 0;
                                if (d == 4) {
                                    letter = letter33;
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
                                        Ingredient1 = MiddleRow[2].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0]), Short.parseShort(Ingredient1[1])));
                                    } else {
                                      Ingredient1[0] = MiddleRow[2];
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0])));  
                                    }
                                }
                        }
                        if (!MiddleRow[1].contains("-")) {
                            if (a == 1) {
                                int customId;
                                char letter = 0;
                                if (a == 1) {
                                    letter = letter11;
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
                                        Ingredient1 = MiddleRow[1].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0]), Short.parseShort(Ingredient1[1])));
                                    } else {
                                      Ingredient1[0] = MiddleRow[1];
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0])));  
                                    }
                                }
                            }
                        }
                        if (!MiddleRow[0].contains("-")) {
                            if (a == 1) {
                                int customId;
                                char letter = 0;
                                if (a == 1) {
                                    letter = letter11;
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
                                        Ingredient1 = MiddleRow[0].split(":");
                                        shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0]), Short.parseShort(Ingredient1[1])));
                                    } else {
                                      Ingredient1[0] = MiddleRow[0];
                                      shapedrecipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(Ingredient1[0])));  
                                    }
                                }
                            }
                        }
                        if (!BottomRow[0].contains("-")) {
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
                        if (!TopRow[0].contains("-")) {
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
                        if (!TopRow[0].contains("-")) {
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
                    }
                }
            }
        } else if (Configuration.recipe.contains("Shapless Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Shapless Recipes");
            Iterator keys = section.getKeys(false).iterator();
            while (keys.hasNext()) {
                for (int rpcnum = 0; rpcnum > 30; rpcnum++) {
                    String resultname = (String)keys.next();
                }
            }
        } else if (Configuration.recipe.contains("Furnace Recipes")) {
            ConfigurationSection section = Configuration.recipe.getConfigurationSection("Furnace Recipes");
            Iterator keys = section.getKeys(false).iterator();
            while (keys.hasNext()) {
                for (int rpcnum = 0; rpcnum > 30; rpcnum++) {
                    String resultname = (String)keys.next();
                }
                
            }
        }     
    }

    private static void DetermineLetters() {
        if (!TopRow[0].contains("-")) {
            switch (x) {
                case 1:
                    recipeshape[2] = letter1;
                    x++;
                    a = 1;
                case 2:
                    recipeshape[2] = recipeshape[2] + letter2;
                    x++;
                    b = 2;
                case 3:
                    recipeshape[2] = recipeshape[2] + letter3;
                    x++;
                    c = 3;
                    break;
            }            
        } else if (!TopRow[1].contains("-")) {
            switch (x) {
                case 1:
                    recipeshape[2] = letter1;
                    x++;
                    a = 1;
                case 2:
                    recipeshape[2] = recipeshape[2] + letter2;
                    x++;
                    b = 2;
                case 3:
                    recipeshape[2] = recipeshape[2] + letter3;
                    x++;
                    c = 3;
                    break;
            }
        } else if (!TopRow[2].contains("-")) {
            switch (x) {
                case 1:
                    recipeshape[2] = letter1;
                    x++;
                    a = 1;
                case 2:
                    recipeshape[2] = recipeshape[2] + letter2;
                    x++;
                    b = 2;
                case 3:
                    recipeshape[2] = recipeshape[2] + letter3;
                    x++;
                    c = 3;
                    break;
            }
        } else if (!MiddleRow[0].contains("-")) {
            if (!recipeshape[2].equals("abc")) {
                switch (y) {
                    case 4:
                        recipeshape[1] = letter4;
                        y++;
                        d = 4;
                        break;
                    case 5:
                        recipeshape[1] = recipeshape[1] + letter5;
                        y++;
                        e = 5;
                        break;
                    case 6:
                        recipeshape[1] = recipeshape[1] + letter6;
                        y++;
                        f = 6;
                        break;
                }
            } else {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
            }
        } else if (!MiddleRow[1].contains("-")) {
            if (!recipeshape[2].equals("abc")) {
                switch (y) {
                    case 4:
                        recipeshape[1] = letter4;
                        y++;
                        d = 4;
                        break;
                    case 5:
                        recipeshape[1] = recipeshape[1] + letter5;
                        y++;
                        e = 5;
                        break;
                    case 6:
                        recipeshape[1] = recipeshape[1] + letter6;
                        y++;
                        f = 6;
                        break;
                }
            } else {
                recipeshape[1] = letter4 + letter5 + letter6;
                d = 4;
                e = 5;
                f = 6;
            }
        } else if (!MiddleRow[2].contains("-")) {
            if (!recipeshape[2].equals("abc")) {
                switch (y) {
                    case 4:
                        recipeshape[1] = letter4;
                        y++;
                        d = 4;
                        break;
                    case 5:
                        recipeshape[1] = recipeshape[1] + letter5;
                        y++;
                        e = 5;
                        break;
                    case 6:
                        recipeshape[1] = recipeshape[1] + letter6;
                        y++;
                        f = 6;
                        break;
                } 
            } else {
               recipeshape[1] = letter4 + letter5 + letter6;
               d = 4;
               e = 5;
               f = 6;
            }
        } else if (!BottomRow[0].contains("-")) {
            if (!recipeshape[2].equals("abc") && !recipeshape[1].equals("def")) {
                switch (z) {
                    case 7:
                        recipeshape[0] = letter7;
                        z++;
                        g = 7;
                        break;
                    case 8:
                        recipeshape[0] = recipeshape[0] + letter8;
                        z++;
                        h = 8;
                        break;
                    case 9:
                        recipeshape[0] = recipeshape[0] + letter9;
                        z++;
                        i = 9;
                        break;
                } 
            } else {
               recipeshape[2] = letter7 + letter8 + letter9;
               g = 4;
               h = 5;
               i = 6;
            }
        } else if (!BottomRow[1].contains("-")) {
            if (!recipeshape[2].equals("abc") && !recipeshape[1].equals("def")) {
                switch (z) {
                    case 7:
                        recipeshape[0] = letter7;
                        z++;
                        g = 7;
                        break;
                    case 8:
                        recipeshape[0] = recipeshape[0] + letter8;
                        z++;
                        h = 8;
                        break;
                    case 9:
                        recipeshape[0] = recipeshape[0] + letter9;
                        z++;
                        i = 9;
                        break;
                } 
            } else {
               recipeshape[2] = letter7 + letter8 + letter9;
               g = 4;
               h = 5;
               i = 6;
            }
        } else if (!BottomRow[2].contains("-")) {
            if (!recipeshape[2].equals("abc") && !recipeshape[1].equals("def")) {
                switch (z) {
                    case 7:
                        recipeshape[0] = letter7;
                        z++;
                        break;
                    case 8:
                        recipeshape[0] = recipeshape[0] + letter8;
                        z++;
                        break;
                    case 9:
                        recipeshape[0] = recipeshape[0] + letter9;
                        z++;
                        break;
                } 
            } else {
               recipeshape[2] = letter7 + letter8 + letter9;
               g = 4;
               h = 5;
               i = 6;
            }
        }
    }
}