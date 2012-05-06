package com.github.Zarklord1.MoOres.Util;

import java.util.Iterator;
import java.util.List;
import com.github.Zarklord1.MoOres.*;
import com.github.Zarklord1.MoOres.Custom.Blocks.*;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.*;
import com.github.Zarklord1.MoOres.Custom.Blocks.Bushes.*;
import com.github.Zarklord1.MoOres.Config.*;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.material.item.GenericCustomFood;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.material.item.GenericItem;

public class Recipes {

	private static String[] row1dv1;
	private static String[] row1dv2;
	private static String[] row1dv3;
	private static String[] row2dv1;
	private static String[] row2dv2;
	private static String[] row2dv3;
	private static String[] row3dv1;
	private static String[] row3dv2;
	private static String[] row3dv3;

	public static void addItemShapedRecipe(MoOres plugin){
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
		for (GenericCustomTool tool:Hashmaps.customtools){
			checkitem("Tools",tool);
		}	
	}
	  public static void addFoodShapedRecipe(MoOres plugin) {
		for (GenericCustomFood food : Hashmaps.customfood)
	      checkitem("Food", food);
	  }
	
		
	
	public static int i = 0;
	private static SpoutShapedRecipe recipe;
	private static String rowletter;
	public static void checkitem(String type, GenericItem item){
		for(int rpc = 1; rpc < 10; rpc++){
			if(Configuration.items.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
				int amount = Configuration.items.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
				List list = Configuration.items.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
				Iterator keys = list.iterator();
				String[] row1 = keys.next().toString().split(",");
				String[] row2 = keys.next().toString().split(",");
				String[] row3 = keys.next().toString().split(",");
				String srow1 = "";
				String srow2 = "";
				String srow3 = "";

				ItemStack result = new SpoutItemStack(item, amount);
				recipe = new SpoutShapedRecipe(result);
				recipe.shape("ghi", "def", "abc");

				char letter = 0;

				for(int count=0; count<3; count ++){
					if(row1[count].contains(":")){
						if(count == 0){
							row1dv1 = row1[count].split(":");
						}else if(count == 1){
							row1dv2 = row1[count].split(":");
						}else if(count == 2){
							row1dv3 = row1[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(row2[count].contains(":")){
						if(count == 0){
							row2dv1 = row2[count].split(":");
						}else if(count == 1){
							row2dv2 = row2[count].split(":");
						}else if(count == 2){
							row2dv3 = row2[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(row3[count].contains(":")){
						if(count == 0){
							row3dv1 = row3[count].split(":");
						}else if(count == 1){
							row3dv2 = row3[count].split(":");
						}else if(count == 2){
							row3dv3 = row3[count].split(":");
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
							if(!row1[i].equals("-")){
								try{
									if(i == 0){
										if(row1dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
											srow1 = srow1 + rowletter;
											row1dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}else if(i == 1){
										if(row1dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
											srow1 = srow1 + rowletter;
											row1dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}else{
										if(row1dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
											srow1 = srow1 + rowletter;
											row1dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									int customId = 0;
									if(Hashmaps.customitemsmap.containsKey(row1[i])){
										customId = Hashmaps.customitemsmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row1[i])){
										customId = Hashmaps.customoresmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row1[i])){
										customId = Hashmaps.customtoolsmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row1[i])){
										customId = Hashmaps.customfoodmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
							if(!row2[i].equals("-")){
								try{
									if(i == 0){
										if(row2dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
											srow2 = srow2 + rowletter;
											row2dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}else if(i == 1){
										if(row2dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
											srow2 = srow2 + rowletter;
											row2dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}else{
										if(row2dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
											srow2 = srow2 + rowletter;
											row2dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									int customId = 0;
									if(Hashmaps.customitemsmap.containsKey(row2[i])){
										customId = Hashmaps.customitemsmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row2[i])){
										customId = Hashmaps.customoresmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row2[i])){
										customId = Hashmaps.customtoolsmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row2[i])){
										customId = Hashmaps.customfoodmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
							if(!row3[i].equals("-")){
								try{
									if(i == 0){
										if(row3dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
											srow3 = srow3 + rowletter;
											row3dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}else if(i == 1){
										if(row3dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
											srow3 = srow3 + rowletter;
											row3dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}else{
										if(row3dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
											srow3 = srow3 + rowletter;
											row3dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									int customId = 0;
									if(Hashmaps.customitemsmap.containsKey(row3[i])){
										customId = Hashmaps.customitemsmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row3[i])){
										customId = Hashmaps.customoresmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row3[i])){
										customId = Hashmaps.customtoolsmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row3[i])){
										customId = Hashmaps.customfoodmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
						FurnaceRecipes.CustomFurnaceRecipe(result, Material.FLINT, (short) customId);
					}
				}
			}
		}
	}
	public static void checkore(String type, CustomOres item){
		for(int rpc = 1; rpc < 10; ++rpc){
			if(Configuration.Ores.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
				int amount = Configuration.Ores.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
				List list = Configuration.Ores.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
				int customId = 0;
				Iterator keys = list.iterator();
				String[] row1 = keys.next().toString().split(",");
				String[] row2 = keys.next().toString().split(",");
				String[] row3 = keys.next().toString().split(",");
				String srow1 = "";
				String srow2 = "";
				String srow3 = "";

				ItemStack result = new SpoutItemStack(item, amount);
				recipe = new SpoutShapedRecipe(result);
				recipe.shape("ghi", "def", "abc");

				char letter = 0;

				for(int count=0; count<3; count ++){
					if(row1[count].contains(":")){
						if(count == 0){
							row1dv1 = row1[count].split(":");
						}else if(count == 1){
							row1dv2 = row1[count].split(":");
						}else if(count == 2){
							row1dv3 = row1[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(row2[count].contains(":")){
						if(count == 0){
							row2dv1 = row2[count].split(":");
						}else if(count == 1){
							row2dv2 = row2[count].split(":");
						}else if(count == 2){
							row2dv3 = row2[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(row3[count].contains(":")){
						if(count == 0){
							row3dv1 = row3[count].split(":");
						}else if(count == 1){
							row3dv2 = row3[count].split(":");
						}else if(count == 2){
							row3dv3 = row3[count].split(":");
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
							if(!row1[i].equals("-")){
								try{
									if(i == 0){
										if(row1dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
											srow1 = srow1 + rowletter;
											row1dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}else if(i == 1){
										if(row1dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
											srow1 = srow1 + rowletter;
											row1dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}else{
										if(row1dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
											srow1 = srow1 + rowletter;
											row1dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(row1[i])){
										customId = Hashmaps.customitemsmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row1[i])){
										customId = Hashmaps.customoresmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row1[i])){
										customId = Hashmaps.customtoolsmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row1[i])){
										customId = Hashmaps.customfoodmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
							if(!row2[i].equals("-")){
								try{
									if(i == 0){
										if(row2dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
											srow2 = srow2 + rowletter;
											row2dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}else if(i == 1){
										if(row2dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
											srow2 = srow2 + rowletter;
											row2dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}else{
										if(row2dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
											srow2 = srow2 + rowletter;
											row2dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(row2[i])){
										customId = Hashmaps.customitemsmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row2[i])){
										customId = Hashmaps.customoresmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row2[i])){
										customId = Hashmaps.customtoolsmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row2[i])){
										customId = Hashmaps.customfoodmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
							if(!row3[i].equals("-")){
								try{
									if(i == 0){
										if(row3dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
											srow3 = srow3 + rowletter;
											row3dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}else if(i == 1){
										if(row3dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
											srow3 = srow3 + rowletter;
											row3dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}else{
										if(row3dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
											srow3 = srow3 + rowletter;
											row3dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(row3[i])){
										customId = Hashmaps.customitemsmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row3[i])){
										customId = Hashmaps.customoresmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row3[i])){
										customId = Hashmaps.customtoolsmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row3[i])){
										customId = Hashmaps.customfoodmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
			if(Configuration.Blocks.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
				int amount = Configuration.Blocks.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
				List list = Configuration.Blocks.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
				int customId = 0;
				Iterator keys = list.iterator();
				String[] row1 = keys.next().toString().split(",");
				String[] row2 = keys.next().toString().split(",");
				String[] row3 = keys.next().toString().split(",");
				String srow1 = "";
				String srow2 = "";
				String srow3 = "";

				ItemStack result = new SpoutItemStack(item, amount);
				recipe = new SpoutShapedRecipe(result);
				recipe.shape("ghi", "def", "abc");

				char letter = 0;

				for(int count=0; count<3; count ++){
					if(row1[count].contains(":")){
						if(count == 0){
							row1dv1 = row1[count].split(":");
						}else if(count == 1){
							row1dv2 = row1[count].split(":");
						}else if(count == 2){
							row1dv3 = row1[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(row2[count].contains(":")){
						if(count == 0){
							row2dv1 = row2[count].split(":");
						}else if(count == 1){
							row2dv2 = row2[count].split(":");
						}else if(count == 2){
							row2dv3 = row2[count].split(":");
						}
					}
				}
				for(int count=0; count<3; count ++){
					if(row3[count].contains(":")){
						if(count == 0){
							row3dv1 = row3[count].split(":");
						}else if(count == 1){
							row3dv2 = row3[count].split(":");
						}else if(count == 2){
							row3dv3 = row3[count].split(":");
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
							if(!row1[i].equals("-")){
								try{
									if(i == 0){
										if(row1dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
											srow1 = srow1 + rowletter;
											row1dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}else if(i == 1){
										if(row1dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
											srow1 = srow1 + rowletter;
											row1dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}else{
										if(row1dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
											srow1 = srow1 + rowletter;
											row1dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
											srow1 = srow1 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(row1[i])){
										customId = Hashmaps.customitemsmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row1[i])){
										customId = Hashmaps.customoresmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row1[i])){
										customId = Hashmaps.customtoolsmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row1[i])){
										customId = Hashmaps.customfoodmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
							if(!row2[i].equals("-")){
								try{
									if(i == 0){
										if(row2dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
											srow2 = srow2 + rowletter;
											row2dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}else if(i == 1){
										if(row2dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
											srow2 = srow2 + rowletter;
											row2dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}else{
										if(row2dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
											srow2 = srow2 + rowletter;
											row2dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
											srow2 = srow2 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(row2[i])){
										customId = Hashmaps.customitemsmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row2[i])){
										customId = Hashmaps.customoresmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row2[i])){
										customId = Hashmaps.customtoolsmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row2[i])){
										customId = Hashmaps.customfoodmap.get(row2[i]).getCustomId();
										srow2 = srow2 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
							if(!row3[i].equals("-")){
								try{
									if(i == 0){
										if(row3dv1 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
											srow3 = srow3 + rowletter;
											row3dv1 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}else if(i == 1){
										if(row3dv2 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
											srow3 = srow3 + rowletter;
											row3dv2 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}else{
										if(row3dv3 != null){
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
											srow3 = srow3 + rowletter;
											row3dv3 = null;
										}else{
											recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
											srow3 = srow3 + rowletter;
										}
									}
								}catch(NumberFormatException e){
									if(Hashmaps.customitemsmap.containsKey(row3[i])){
										customId = Hashmaps.customitemsmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customoresmap.containsKey(row3[i])){
										customId = Hashmaps.customoresmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
										customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
										srow1 = srow1 + rowletter;
									}else if(Hashmaps.customtoolsmap.containsKey(row3[i])){
										customId = Hashmaps.customtoolsmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.customfoodmap.containsKey(row3[i])){
										customId = Hashmaps.customfoodmap.get(row3[i]).getCustomId();
										srow3 = srow3 + rowletter;
									}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
										customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
				if(Configuration.Blocks.contains("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc)){
					int amount = Configuration.Blocks.getInt("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".amount");
					List list = Configuration.Blocks.getList("Custom " + type + "." + item.getName() + ".shaped recipe"+ rpc +".ingredients");
					int customId = 0;
					Iterator keys = list.iterator();
					String[] row1 = keys.next().toString().split(",");
					String[] row2 = keys.next().toString().split(",");
					String[] row3 = keys.next().toString().split(",");
					String srow1 = "";
					String srow2 = "";
					String srow3 = "";

					ItemStack result = new SpoutItemStack(item, amount);
					recipe = new SpoutShapedRecipe(result);
					recipe.shape("ghi", "def", "abc");

					char letter = 0;

					for(int count=0; count<3; count ++){
						if(row1[count].contains(":")){
							if(count == 0){
								row1dv1 = row1[count].split(":");
							}else if(count == 1){
								row1dv2 = row1[count].split(":");
							}else if(count == 2){
								row1dv3 = row1[count].split(":");
							}
						}
					}
					for(int count=0; count<3; count ++){
						if(row2[count].contains(":")){
							if(count == 0){
								row2dv1 = row2[count].split(":");
							}else if(count == 1){
								row2dv2 = row2[count].split(":");
							}else if(count == 2){
								row2dv3 = row2[count].split(":");
							}
						}
					}
					for(int count=0; count<3; count ++){
						if(row3[count].contains(":")){
							if(count == 0){
								row3dv1 = row3[count].split(":");
							}else if(count == 1){
								row3dv2 = row3[count].split(":");
							}else if(count == 2){
								row3dv3 = row3[count].split(":");
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
								if(!row1[i].equals("-")){
									try{
										if(i == 0){
											if(row1dv1 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv1[0]), Short.parseShort(row1dv1[1])));
												srow1 = srow1 + rowletter;
												row1dv1 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
												srow1 = srow1 + rowletter;
											}
										}else if(i == 1){
											if(row1dv2 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv2[0]), Short.parseShort(row1dv2[1])));
												srow1 = srow1 + rowletter;
												row1dv2 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
												srow1 = srow1 + rowletter;
											}
										}else{
											if(row1dv3 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1dv3[0]), Short.parseShort(row1dv3[1])));
												srow1 = srow1 + rowletter;
												row1dv3 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row1[i])));
												srow1 = srow1 + rowletter;
											}
										}
									}catch(NumberFormatException e){
										if(Hashmaps.customitemsmap.containsKey(row1[i])){
											customId = Hashmaps.customitemsmap.get(row1[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customoresmap.containsKey(row1[i])){
											customId = Hashmaps.customoresmap.get(row1[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
											customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customtoolsmap.containsKey(row1[i])){
											customId = Hashmaps.customtoolsmap.get(row1[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customfoodmap.containsKey(row1[i])){
											customId = Hashmaps.customfoodmap.get(row1[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
											customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
								if(!row2[i].equals("-")){
									try{
										if(i == 0){
											if(row2dv1 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv1[0]), Short.parseShort(row2dv1[1])));
												srow2 = srow2 + rowletter;
												row2dv1 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
												srow2 = srow2 + rowletter;
											}
										}else if(i == 1){
											if(row2dv2 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv2[0]), Short.parseShort(row2dv2[1])));
												srow2 = srow2 + rowletter;
												row2dv2 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
												srow2 = srow2 + rowletter;
											}
										}else{
											if(row2dv3 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2dv3[0]), Short.parseShort(row2dv3[1])));
												srow2 = srow2 + rowletter;
												row2dv3 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row2[i])));
												srow2 = srow2 + rowletter;
											}
										}
									}catch(NumberFormatException e){
										if(Hashmaps.customitemsmap.containsKey(row2[i])){
											customId = Hashmaps.customitemsmap.get(row2[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.customoresmap.containsKey(row2[i])){
											customId = Hashmaps.customoresmap.get(row2[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
											customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customtoolsmap.containsKey(row2[i])){
											customId = Hashmaps.customtoolsmap.get(row2[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.customfoodmap.containsKey(row2[i])){
											customId = Hashmaps.customfoodmap.get(row2[i]).getCustomId();
											srow2 = srow2 + rowletter;
										}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
											customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
								if(!row3[i].equals("-")){
									try{
										if(i == 0){
											if(row3dv1 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv1[0]), Short.parseShort(row3dv1[1])));
												srow3 = srow3 + rowletter;
												row3dv1 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
												srow3 = srow3 + rowletter;
											}
										}else if(i == 1){
											if(row3dv2 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv2[0]), Short.parseShort(row3dv2[1])));
												srow3 = srow3 + rowletter;
												row3dv2 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
												srow3 = srow3 + rowletter;
											}
										}else{
											if(row3dv3 != null){
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3dv3[0]), Short.parseShort(row3dv3[1])));
												srow3 = srow3 + rowletter;
												row3dv3 = null;
											}else{
												recipe.setIngredient(letter, MaterialData.getMaterial(Integer.parseInt(row3[i])));
												srow3 = srow3 + rowletter;
											}
										}
									}catch(NumberFormatException e){
										if(Hashmaps.customitemsmap.containsKey(row3[i])){
											customId = Hashmaps.customitemsmap.get(row3[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.customoresmap.containsKey(row3[i])){
											customId = Hashmaps.customoresmap.get(row3[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.customblocksmap.containsKey(row1[i])){
											customId = Hashmaps.customblocksmap.get(row1[i]).getCustomId();
											srow1 = srow1 + rowletter;
										}else if(Hashmaps.customtoolsmap.containsKey(row3[i])){
											customId = Hashmaps.customtoolsmap.get(row3[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.customfoodmap.containsKey(row3[i])){
											customId = Hashmaps.customfoodmap.get(row3[i]).getCustomId();
											srow3 = srow3 + rowletter;
										}else if(Hashmaps.custombushesmap.containsKey(row1[i])){
											customId = Hashmaps.custombushesmap.get(row1[i]).getCustomId();
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
}