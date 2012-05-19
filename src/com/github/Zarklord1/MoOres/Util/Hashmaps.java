package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Custom.Blocks.Bushes.CustomBush;
import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.OriginalOres;
import com.github.Zarklord1.MoOres.Custom.Items.CustomItems;
import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFood;
import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import java.util.*;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.getspout.spoutapi.material.Block;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.CustomItem;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.material.item.GenericCustomFood;
import org.getspout.spoutapi.material.item.GenericCustomItem;


/*     */ public class Hashmaps
/*     */ {
    	private static String[] pick;
	private static String[] axe;
	private static String[] shovel;
	private static String[] sword;
/*  36 */   public static Set<CustomOres> customores = new LinkedHashSet();
/*  37 */   public static HashMap<String, CustomOres> customoresmap = new LinkedHashMap();

            public static Set<Block> Pickaxebreackableblocks = new LinkedHashSet();
            public static Set<Block> Swordbreackableblocks = new LinkedHashSet();
            public static Set<Block> Axebreackableblocks = new LinkedHashSet();
            public static Set<Block> Shovelbreackableblocks = new LinkedHashSet();
/*     */ 
	    public static Set<CustomBlocks> customblocks = new LinkedHashSet();
/*  37 */   public static HashMap<String, CustomBlocks> customblocksmap = new LinkedHashMap();
/*     */ 
/*  42 */   public static Set<GenericCustomItem> customitems = new LinkedHashSet();
	    public static HashMap<String, GenericCustomItem> customitemsmap = new LinkedHashMap();

/*  45 */   public static Set<CustomTools> customtools = new LinkedHashSet();
/*  46 */   public static HashMap<String, CustomTools> customtoolsmap = new LinkedHashMap();
/*     */ 
/*  48 */   public static Set<GenericCustomFood> customfood = new LinkedHashSet();
/*  49 */   public static HashMap<String, GenericCustomFood> customfoodmap = new LinkedHashMap();
/*     */ 
/*  51 */   public static Set<GenericCustomFood> customfish = new LinkedHashSet();
/*  52 */   public static HashMap<String, GenericCustomFood> customfishmap = new LinkedHashMap();

/*  55 */   public static Set<CustomBush> custombushes = new LinkedHashSet();
/*  55 */   public static HashMap<String, CustomBush> custombushesmap = new LinkedHashMap();
/*     */ 
/*  54 */   public static Set<OriginalOres> originalores = new LinkedHashSet();
/*  57 */   public static Set<GenericCubeCustomBlock> plants = new LinkedHashSet();
/*     */
/*     */   public static void CustomOres(MoOres plugin) {
/*  65 */     ConfigurationSection section = Configuration.Ores.getConfigurationSection("Custom Ores");
	      Iterator keys = section.getKeys(false).iterator();
/*  67 */     while (keys.hasNext()) {
/*  68 */       String name = (String)keys.next();
/*  69 */       int textureID = Configuration.Ores.getInt("Custom Ores." + name + ".textureID");
/*  70 */       int freq = Configuration.Ores.getInt("Custom Ores." + name + ".frequency");
/*  71 */       int minY = Configuration.Ores.getInt("Custom Ores." + name + ".minheight");
/*  72 */       int maxY = Configuration.Ores.getInt("Custom Ores." + name + ".maxheight");
/*     */ 
/*  74 */       float hard = 0.0F;
/*  75 */       float friction = 0.0F;
/*  76 */       int light = 0;
/*  77 */       int amount = 0;
                int id = 1;
                int metadata = 0;
/*  78 */       CustomItem idrop = null;
/*  79 */       CustomBlock bdrop = null;
/*  80 */       Material mdrop = null;
/*     */ 
/*  82 */       if (Configuration.Ores.contains("Custom Ores." + name + ".hardness")) {
/*  83 */         hard = Configuration.Ores.getInt("Custom Ores." + name + ".hardness");
/*     */       }
                if (Configuration.Ores.contains("Custom Ores." + name + ".block id")) {
                    id = Configuration.Ores.getInt("Custom Ores." + name + ".block id");
                }
                if (Configuration.Ores.contains("Custom Ores." + name + ".metadata id")) {
                    metadata = Configuration.Ores.getInt("Custom Ores." + name + ".metadata id");
                }
/*  85 */       if (Configuration.Ores.contains("Custom Ores." + name + ".lightlevel")) {
/*  86 */         light = Configuration.Ores.getInt("Custom Ores." + name + ".lightlevel");
/*     */       }
/*  88 */       if (Configuration.Ores.contains("Custom Ores." + name + ".friction")) {
/*  89 */         friction = Configuration.Ores.getInt("Custom Ores." + name + ".friction");
/*     */       }
/*  91 */       if (Configuration.Ores.contains("Custom Ores." + name + ".drop")) {
/*  92 */         if (Configuration.Ores.contains("Custom Ores." + name + ".droopamount")) {
/*  93 */           amount = Configuration.Ores.getInt("Custom Ores." + name + ".droopamount");
/*     */         }
/*  95 */         String sdrop = Configuration.Ores.getString("Custom Ores." + name + ".drop");
/*     */         try {
/*  97 */           mdrop = Material.getMaterial(Integer.parseInt(sdrop));
/*  98 */           addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, mdrop, amount, id, metadata);
/*     */         } catch (NumberFormatException e) {
/* 100 */           if (customblocksmap.containsKey(sdrop))
/* 101 */             bdrop = (CustomBlock)customblocksmap.get(sdrop);
/* 102 */           else if (customitemsmap.containsKey(sdrop))
/* 103 */             idrop = (CustomItem)customitemsmap.get(sdrop);
/* 104 */           else if (customfoodmap.containsKey(sdrop))
/* 105 */             idrop = (CustomItem)customfoodmap.get(sdrop);
/* 106 */           else if (customtoolsmap.containsKey(sdrop)) {
/* 107 */             idrop = (CustomItem)customfoodmap.get(sdrop);
/*     */           }
/*     */         }
/*     */       }
/* 111 */       if (bdrop != null)
/* 112 */         addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
/* 113 */       else if (idrop != null)
/* 114 */         addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
/*     */       else
/* 116 */         addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
/*     */     }
/*     */   }

/*     */   public static void CustomBushes(MoOres plugin) {
/*  65 */     ConfigurationSection section = Configuration.Blocks.getConfigurationSection("Custom Bushes");
              Iterator keys = section.getKeys(false).iterator();
/*  67 */     while (keys.hasNext()) {
/*  68 */       String name = (String)keys.next();
/*  69 */       int textureID = Configuration.Blocks.getInt("Custom Bushes." + name + ".textureID");
/*  70 */       int freq = Configuration.Blocks.getInt("Custom Bushes." + name + ".frequency");
/*  98 */       addbushes(plugin, name, new int[] {textureID, textureID, textureID, textureID, textureID, textureID}, freq);
/*  98 */     }
/*  98 */	}
/*     */ 
/*     */   public static void CustomBlock(MoOres plugin) {
/* 121 */     ConfigurationSection section = Configuration.Blocks.getConfigurationSection("Custom Blocks");
/* 122 */     Iterator keys = section.getKeys(false).iterator();
/* 123 */     while (keys.hasNext()) {
/* 124 */       String name = (String)keys.next();
/* 125 */       int textureID = Configuration.Blocks.getInt("Custom Blocks." + name + ".textureID");
/* 126 */       float hard = Configuration.Blocks.getInt("Custom Blocks." + name + ".hardness");
/* 127 */       int light = Configuration.Blocks.getInt("Custom Blocks." + name + ".lightlevel");
/* 128 */       float friction = Configuration.Blocks.getInt("Custom Blocks." + name + ".friction");
                int id = 1;//Configuration.Blocks.getInt("Custom Blocks." + name + ".block id");
                int metadata = 0;//Configuration.Blocks.getInt("Custom Blocks." + name + ".metadata id");
/* 129 */       addblock(plugin, name, textureID, hard, light, friction, id, metadata);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void CustomItems(MoOres plugin) {
/* 134 */     ConfigurationSection section = Configuration.items.getConfigurationSection("Custom Items");
/* 135 */     Iterator keys = section.getKeys(false).iterator();
/* 136 */     while (keys.hasNext()) {
/* 137 */       String name = (String)keys.next();
/* 138 */       String textureurl = Configuration.items.getString("Custom Items." + name + ".texture url");
/* 139 */       addItem(plugin, name, textureurl);
/*     */   
/*     */     }
/* 141 */     ConfigurationSection section2 = Configuration.items.getConfigurationSection("Custom Tools");
/* 142 */     Iterator keys2 = section2.getKeys(false).iterator();
/* 143 */     while (keys2.hasNext()) {
/* 144 */       String name = (String)keys2.next();
/* 145 */       String textureurl = Configuration.items.getString("Custom Tools." + name + ".texture url");
/* 146 */       int durability1 = Configuration.items.getInt("Custom Tools." + name + ".durability");
/*     */       int strength1 = Configuration.items.getInt("Custom Tools." + name + ".toolstrength");
                boolean Pickaxe = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Pickaxe");
                boolean Axe = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Axe");
                boolean Shovel = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Shovel");
                boolean Hoe = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Hoe");
                boolean Bow = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Bow");
                boolean Sword = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Sword");
                boolean fire = Configuration.items.getBoolean("Custom Tools." + name + ".Sword.setfire");
                int damage = Configuration.items.getInt("Custom Tools." + name + ".damage");
                int firetime = Configuration.items.getInt("Custom Tools." + name + ".Sword.Firetime");
/*     */       short durability = (short) durability1;
/*     */       float strength = (float) strength1;
/* 147 */       addTool(plugin, name, textureurl, durability, strength, Pickaxe, Axe, Shovel, Hoe, Bow, Sword, damage, fire, firetime);
/*     */     }
/* 149 */     ConfigurationSection section3 = Configuration.items.getConfigurationSection("Custom Food");
/* 150 */     Iterator keys3 = section3.getKeys(false).iterator();
/* 151 */     while (keys3.hasNext()) {
/* 152 */       String name = (String)keys3.next();
/* 153 */       String textureurl = Configuration.items.getString("Custom Food." + name + ".texture url");
/* 154 */       int restore = Configuration.items.getInt("Custom Food." + name + ".restore");
/* 155 */       addFood(plugin, name, textureurl, restore);
/*     */     }
/* 157 */     ConfigurationSection section4 = Configuration.items.getConfigurationSection("Custom Fish");
/* 158 */     Iterator keys4 = section4.getKeys(false).iterator();

/* 159 */     while (keys4.hasNext()) {
/* 160 */       String name = (String)keys4.next();
/* 161 */       String textureurl = Configuration.items.getString("Custom Fish." + name + ".texture url");
/* 162 */       int restore = Configuration.items.getInt("Custom Fish." + name + ".restore");
/* 163 */       addFood(plugin, name, textureurl, restore);
/* 164 */       addFish(plugin, name, textureurl);
/*     */     }
/*     */   }
/*     */ 
/*     */   private static void addblock(MoOres plugin, String name, int textureID, float hard, int light, float friction, int id , int metadata) {
/* 169 */     CustomBlocks block = new CustomBlocks(plugin, name, textureID, hard, light, friction, id ,metadata);
/* 170 */     customblocks.add(block);
/* 171 */     customblocksmap.put(name, block);
/*     */   }
/*     */ 
/*     */   private static void addOre(MoOres plugin, String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, CustomBlock drop, int amount, int id , int metadata) {
/* 175 */     CustomOres ore = new CustomOres(plugin, name, textureID, freq, minY, maxY, drop, hard, light, friction, amount, id ,metadata);
/* 176 */     customores.add(ore);
/* 177 */     customoresmap.put(name, ore);
/*     */   }
/*     */   private static void addOre(MoOres plugin, String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, CustomItem drop, int amount, int id , int metadata) {
/* 180 */     CustomOres ore = new CustomOres(plugin, name, textureID, freq, minY, maxY, drop, hard, light, friction, amount, id ,metadata);
/* 181 */     customores.add(ore);
/* 182 */     customoresmap.put(name, ore);
/*     */   }
/*     */   private static void addOre(MoOres plugin, String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, Material drop, int amount, int id , int metadata) {
/* 185 */     	CustomOres ore = new CustomOres(plugin, name, textureID, freq, minY, maxY, drop, hard, light, friction, amount, id ,metadata);
/* 186 */     	customores.add(ore);
/* 187 */     	customoresmap.put(name, ore);
/*     */   }
			private static void addItem(MoOres plugin, String name, String textureurl) {
				CustomItems item = new CustomItems(plugin, name, textureurl);
				customitems.add(item);
				customitemsmap.put(name, item);
			}
			private static void addFood(MoOres plugin, String name, String textureurl, int restore) {
				CustomFood food = new CustomFood(plugin, name, textureurl, restore);
				customfood.add(food);
				customfoodmap.put(name, food);
			}
			private static void addFish(MoOres plugin, String name, String textureurl) {
				GenericCustomFood fish = (GenericCustomFood)customfoodmap.get(name);
				customfish.add(fish);
				customfishmap.put(name, fish);
			}
			
			private static void addTool(MoOres plugin, String name, String textureurl, short durability, float strength, boolean Pickaxe, boolean Axe, boolean Shovel, boolean Hoe, boolean Bow, boolean Sword, int damage, boolean fire, int firetime) {
				CustomTools tool = new CustomTools(plugin, name, textureurl, durability, strength, Pickaxe, Axe, Shovel, Hoe, Bow, Sword, damage, fire, firetime);
				customtools.add(tool);
				customtoolsmap.put(name, tool);
			}
			
			private static void addbushes(MoOres plugin, String name, int[] textureids, int freq) {
/* 175 */     CustomBush bush = new CustomBush(plugin, name, textureids, freq);
/* 176 */     custombushes.add(bush);
/* 177 */     custombushesmap.put(name, bush);
/*     */   }
/*     */ 
/*     */
/*     */   public static void registerBlocks(MoOres plugin)
/*     */   {
/* 216 */     OriginalOres CoalOre = new OriginalOres(plugin, Material.COAL_ORE, Configuration.Ores.getInt("Original Ores.Coal Ore.frequency"), Configuration.Ores.getInt("Original Ores.Coal Ore.minheight"), Configuration.Ores.getInt("Original Ores.Coal Ore.maxheight"));
/* 217 */     OriginalOres IronOre = new OriginalOres(plugin, Material.IRON_ORE, Configuration.Ores.getInt("Original Ores.Iron Ore.frequency"), Configuration.Ores.getInt("Original Ores.Iron Ore.minheight"), Configuration.Ores.getInt("Original Ores.Iron Ore.maxheight"));
/* 218 */     OriginalOres LapisOre = new OriginalOres(plugin, Material.LAPIS_ORE, Configuration.Ores.getInt("Original Ores.Lapis Ore.frequency"), Configuration.Ores.getInt("Original Ores.Lapis Ore.minheight"), Configuration.Ores.getInt("Original Ores.Lapis Ore.maxheight"));
/* 219 */     OriginalOres GoldOre = new OriginalOres(plugin, Material.GOLD_ORE, Configuration.Ores.getInt("Original Ores.Gold Ore.frequency"), Configuration.Ores.getInt("Original Ores.Gold Ore.minheight"), Configuration.Ores.getInt("Original Ores.Gold Ore.maxheight"));
/* 220 */     OriginalOres RedstoneOre = new OriginalOres(plugin, Material.REDSTONE_ORE, Configuration.Ores.getInt("Original Ores.Redstone Ore.frequency"), Configuration.Ores.getInt("Original Ores.Redstone Ore.minheight"), Configuration.Ores.getInt("Original Ores.Redstone Ore.maxheight"));
/* 221 */     OriginalOres DiamondOre = new OriginalOres(plugin, Material.DIAMOND_ORE, Configuration.Ores.getInt("Original Ores.Diamond Ore.frequency"), Configuration.Ores.getInt("Original Ores.Diamond Ore.minheight"), Configuration.Ores.getInt("Original Ores.Diamond Ore.maxheight"));
/* 222 */     originalores.add(CoalOre);
/* 223 */     originalores.add(IronOre);
/* 224 */     originalores.add(LapisOre);
/* 225 */     originalores.add(GoldOre);
/* 226 */     originalores.add(RedstoneOre);
/* 227 */     originalores.add(DiamondOre);
/* 230 */     CustomBlock(plugin);
/* 231 */     CustomOres(plugin);
/*  98 */     CustomBushes(plugin);
/*     */     CustomItems(plugin);
/*     */  
/*     */   }
            public static void addvanillablocks(MoOres plugin) {
                List<?> list = Configuration.config.getList("tools.Pickaxebreackableblockids");
		Object[] arraylist = list.toArray();
		for(int pos = 0; pos < arraylist.length; pos++){
                    String x = (String) arraylist[pos];
                    if (x.contains(":")) {
                        pick = x.split(":");
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(pick[0]), Short.parseShort(pick[1]));
                        Pickaxebreackableblocks.add(materialdata);
                    } else {
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(x));
                        Pickaxebreackableblocks.add(materialdata);
                    }
		}
                list = Configuration.config.getList("tools.Axebreackableblockids");
		arraylist = list.toArray();
		for(int pos = 0; pos < arraylist.length; pos++){
                    String x = (String) arraylist[pos];
                    if (x.contains(":")) {
                        axe = x.split(":");
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(axe[0]), Short.parseShort(axe[1]));
                        Axebreackableblocks.add(materialdata);
                        
                    } else {
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(x));
                        Axebreackableblocks.add(materialdata);
                    }
		}
                list = Configuration.config.getList("tools.Shovelbreackableblockids");
		arraylist = list.toArray();
		for(int pos = 0; pos < arraylist.length; pos++){
                    String x = (String) arraylist[pos];
                    if (x.contains(":")) {
                        shovel = x.split(":");
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(shovel[0]), Short.parseShort(shovel[1]));
                        Shovelbreackableblocks.add(materialdata);
                    } else {
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(x));
                        Shovelbreackableblocks.add(materialdata);
                    }
		}
                list = Configuration.config.getList("tools.Swordbreackableblockids");
		arraylist = list.toArray();
		for(int pos = 0; pos < arraylist.length; pos++){
                    String x = (String) arraylist[pos];
                    if (x.contains(":")) {
                        sword = x.split(":");
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(sword[0]), Short.parseShort(sword[1]));
                        Swordbreackableblocks.add(materialdata);
                    } else {
                        Block materialdata = (Block) MaterialData.getMaterial(Integer.parseInt(x));
                        Swordbreackableblocks.add(materialdata);
                    }
		}
            }
     }
