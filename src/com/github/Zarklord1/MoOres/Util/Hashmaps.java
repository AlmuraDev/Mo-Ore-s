package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Custom.Blocks.Bushes.CustomBush;
import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.OriginalOres;
import com.github.Zarklord1.MoOres.Custom.Items.CustomItems;
import com.github.Zarklord1.MoOres.Custom.Items.Arrows.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFishes;
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
/*  42 */   public static Set<CustomItems> customitems = new LinkedHashSet();
	    public static HashMap<String, CustomItems> customitemsmap = new LinkedHashMap();

/*  45 */   public static Set<CustomTools> customtools = new LinkedHashSet();
/*  46 */   public static HashMap<String, CustomTools> customtoolsmap = new LinkedHashMap();
/*     */ 
/*  48 */   public static Set<CustomFood> customfood = new LinkedHashSet();
/*  49 */   public static HashMap<String, CustomFood> customfoodmap = new LinkedHashMap();

/*  48 */   public static Set<CustomArrows> customarrows = new LinkedHashSet();
/*  49 */   public static HashMap<String, CustomArrows> customarrowsmap = new LinkedHashMap();
/*     */ 
/*  51 */   public static Set<CustomFishes> customfish = new LinkedHashSet();
/*  52 */   public static HashMap<String, CustomFishes> customfishmap = new LinkedHashMap();

/*  55 */   public static Set<CustomBush> custombushes = new LinkedHashSet();
/*  55 */   public static HashMap<String, CustomBush> custombushesmap = new LinkedHashMap();
/*     */ 
/*  54 */   public static Set<OriginalOres> originalores = new LinkedHashSet();
/*  57 */   public static Set<GenericCubeCustomBlock> plants = new LinkedHashSet();
/*     */
/*     */   public static void CustomOres(MoOres plugin) {
/*  65 */     ConfigurationSection section = Configuration.ore.getConfigurationSection("Custom Ores");
	      Iterator keys = section.getKeys(false).iterator();
/*  67 */     while (keys.hasNext()) {
/*  68 */       String name = (String)keys.next();
/*  69 */       int textureID = Configuration.ore.getInt("Custom Ores." + name + ".textureID");
/*  70 */       int freq = Configuration.ore.getInt("Custom Ores." + name + ".frequency");
/*  71 */       int minY = Configuration.ore.getInt("Custom Ores." + name + ".minheight");
/*  72 */       int maxY = Configuration.ore.getInt("Custom Ores." + name + ".maxheight");
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
                String drop = null;
/*     */ 
/*  82 */       if (Configuration.ore.contains("Custom Ores." + name + ".hardness")) {
/*  83 */         hard = Configuration.ore.getInt("Custom Ores." + name + ".hardness");
/*     */       }
                if (Configuration.ore.contains("Custom Ores." + name + ".block id")) {
                    id = Configuration.ore.getInt("Custom Ores." + name + ".block id");
                }
                if (Configuration.ore.contains("Custom Ores." + name + ".metadata id")) {
                    metadata = Configuration.ore.getInt("Custom Ores." + name + ".metadata id");
                }
/*  85 */       if (Configuration.ore.contains("Custom Ores." + name + ".lightlevel")) {
/*  86 */         light = Configuration.ore.getInt("Custom Ores." + name + ".lightlevel");
/*     */       }
/*  88 */       if (Configuration.ore.contains("Custom Ores." + name + ".friction")) {
/*  89 */         friction = Configuration.ore.getInt("Custom Ores." + name + ".friction");
/*     */       }
/*  91 */       if (Configuration.ore.contains("Custom Ores." + name + ".drop")) {
                  drop = Configuration.ore.getString("Custom Ores." + name + ".drop");
/*  92 */         if (Configuration.ore.contains("Custom Ores." + name + ".amount")) {
/*  93 */           amount = Configuration.ore.getInt("Custom Ores." + name + ".amount");
                    } else {
                 amount = 1;
                 if (customblocksmap.containsKey(drop)) {
                   bdrop = customblocksmap.get(drop);
                   addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
                 } else if (custombushesmap.containsKey(drop)) {
                   bdrop = custombushesmap.get(drop);
                   addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
                 } else if (customitemsmap.containsKey(drop)) {
                   idrop = customitemsmap.get(drop);
                   addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                 } else {
                     if (drop.contains(":")) {
                         
                     } else {
                         
                     }
                 }
}
}
}
}
/*  95 */     public static void CustomBushes(MoOres plugin) {
/*  65 */     ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Bushes");
              Iterator keys = section.getKeys(false).iterator();
/*  67 */     while (keys.hasNext()) {
/*  68 */       String name = (String)keys.next();
/*  69 */       int textureID = Configuration.block.getInt("Custom Bushes." + name + ".textureID");
/*  70 */       int freq = Configuration.block.getInt("Custom Bushes." + name + ".frequency");
/*  98 */       addbushes(plugin, name, new int[] {textureID, textureID, textureID, textureID, textureID, textureID}, freq);
/*  98 */     }
/*  98 */	}
/*     */ 
/*     */   public static void CustomBlock(MoOres plugin) {
/* 121 */     ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Blocks");
/* 122 */     Iterator keys = section.getKeys(false).iterator();
/* 123 */     while (keys.hasNext()) {
/* 124 */       String name = (String)keys.next();
/* 125 */       int textureID = Configuration.block.getInt("Custom Blocks." + name + ".textureID");
/* 126 */       float hard = Configuration.block.getInt("Custom Blocks." + name + ".hardness");
/* 127 */       int light = Configuration.block.getInt("Custom Blocks." + name + ".lightlevel");
/* 128 */       float friction = Configuration.block.getInt("Custom Blocks." + name + ".friction");
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
                boolean poison = Configuration.items.getBoolean("Custom Tools." + name + ".Sword.setpoison");
                boolean lightning = Configuration.items.getBoolean("Custom Tools." + name + ".Sword.strikelightning");
                int damage = Configuration.items.getInt("Custom Tools." + name + ".Sword.damage");
                int fireticks = Configuration.items.getInt("Custom Tools." + name + ".Sword.Fire Ticks");
                int poisonticks = Configuration.items.getInt("Custom Tools." + name + ".Sword.Poison Ticks");
/*     */       short durability = (short) durability1;
/*     */       float strength = (float) strength1;
/* 147 */       addTool(plugin, name, textureurl, durability, strength, Pickaxe, Axe, Shovel, Hoe, Bow, Sword, damage, fire, fireticks, poison, lightning, poisonticks);
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
                int chance = Configuration.items.getInt("Custom Fish." + name + ".chance", 100);
/* 164 */       addFish(plugin, name, textureurl, restore, chance);
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
			private static void addFish(MoOres plugin, String name, String textureurl, int restore, int chance) {
				CustomFishes fish = new CustomFishes(plugin, name, textureurl, restore, chance);
				customfish.add(fish);
				customfishmap.put(name, fish);
			}
			
			private static void addTool(MoOres plugin, String name, String textureurl, short durability, float strength, boolean Pickaxe, boolean Axe, boolean Shovel, boolean Hoe, boolean Bow, boolean Sword, int damage, boolean fire, int ticks, boolean lightning, boolean poison, int poisonticks) {
				CustomTools tool = new CustomTools(plugin, name, textureurl, durability, strength, Pickaxe, Axe, Shovel, Hoe, Bow, Sword, damage, fire, ticks, lightning, poison, poisonticks);
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
/* 216 */     OriginalOres CoalOre = new OriginalOres(plugin, Material.COAL_ORE, Configuration.ore.getInt("Original Ores.Coal Ore.frequency"), Configuration.ore.getInt("Original Ores.Coal Ore.minheight"), Configuration.ore.getInt("Original Ores.Coal Ore.maxheight"));
/* 217 */     OriginalOres IronOre = new OriginalOres(plugin, Material.IRON_ORE, Configuration.ore.getInt("Original Ores.Iron Ore.frequency"), Configuration.ore.getInt("Original Ores.Iron Ore.minheight"), Configuration.ore.getInt("Original Ores.Iron Ore.maxheight"));
/* 218 */     OriginalOres LapisOre = new OriginalOres(plugin, Material.LAPIS_ORE, Configuration.ore.getInt("Original Ores.Lapis Ore.frequency"), Configuration.ore.getInt("Original Ores.Lapis Ore.minheight"), Configuration.ore.getInt("Original Ores.Lapis Ore.maxheight"));
/* 219 */     OriginalOres GoldOre = new OriginalOres(plugin, Material.GOLD_ORE, Configuration.ore.getInt("Original Ores.Gold Ore.frequency"), Configuration.ore.getInt("Original Ores.Gold Ore.minheight"), Configuration.ore.getInt("Original Ores.Gold Ore.maxheight"));
/* 220 */     OriginalOres RedstoneOre = new OriginalOres(plugin, Material.REDSTONE_ORE, Configuration.ore.getInt("Original Ores.Redstone Ore.frequency"), Configuration.ore.getInt("Original Ores.Redstone Ore.minheight"), Configuration.ore.getInt("Original Ores.Redstone Ore.maxheight"));
/* 221 */     OriginalOres DiamondOre = new OriginalOres(plugin, Material.DIAMOND_ORE, Configuration.ore.getInt("Original Ores.Diamond Ore.frequency"), Configuration.ore.getInt("Original Ores.Diamond Ore.minheight"), Configuration.ore.getInt("Original Ores.Diamond Ore.maxheight"));
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
