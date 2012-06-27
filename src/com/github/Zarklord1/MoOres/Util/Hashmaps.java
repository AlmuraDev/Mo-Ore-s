package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Custom.Blocks.Bushes.CustomBush;
import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.OriginalOres;
import com.github.Zarklord1.MoOres.Custom.Items.Arrows.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.CustomItems;
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


public class Hashmaps {
    private static String[] ores;
    
    public static Set<Material> Pickaxebreackableblocks = new LinkedHashSet();
    public static Set<Material> Swordbreackableblocks = new LinkedHashSet();
    public static Set<Material> Axebreackableblocks = new LinkedHashSet();
    public static Set<Material> Shovelbreackableblocks = new LinkedHashSet();
    public static Set<Block> PickaxeSpeedIds = new LinkedHashSet();
    public static Set<Block> SwordSpeedIds = new LinkedHashSet();
    public static Set<Block> AxeSpeedIds = new LinkedHashSet();
    public static Set<Block> ShovelSpeedIds = new LinkedHashSet();
    
    public static Set<CustomOres> customores = new LinkedHashSet();
    public static HashMap<String, CustomOres> customoresmap = new LinkedHashMap();
    
    public static Set<CustomBlocks> customblocks = new LinkedHashSet();
    public static HashMap<String, CustomBlocks> customblocksmap = new LinkedHashMap();
    
    public static Set<CustomItems> customitems = new LinkedHashSet();
    public static HashMap<String, CustomItems> customitemsmap = new LinkedHashMap();
    
    public static Set<CustomTools> customtools = new LinkedHashSet();
    public static HashMap<String, CustomTools> customtoolsmap = new LinkedHashMap();
    
    public static Set<CustomFood> customfood = new LinkedHashSet();
    public static HashMap<String, CustomFood> customfoodmap = new LinkedHashMap();
    
    public static Set<CustomArrows> customarrows = new LinkedHashSet();
    public static HashMap<String, CustomArrows> customarrowsmap = new LinkedHashMap();
    
    public static Set<CustomFishes> customfish = new LinkedHashSet();
    public static HashMap<String, CustomFishes> customfishmap = new LinkedHashMap();
    
    public static Set<CustomBush> custombushes = new LinkedHashSet();
    public static HashMap<String, CustomBush> custombushesmap = new LinkedHashMap();
    
    public static Set<OriginalOres> originalores = new LinkedHashSet();
    public static Set<GenericCubeCustomBlock> plants = new LinkedHashSet();
    
    public static void CustomOres(MoOres plugin) {
        ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Ores");
        Iterator<String> keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = keys.next();
            int textureID = Configuration.block.getInt("Custom Ores." + name + ".textureID");
            int freq = Configuration.block.getInt("Custom Ores." + name + ".frequency");
            int minY = Configuration.block.getInt("Custom Ores." + name + ".minheight");
            int maxY = Configuration.block.getInt("Custom Ores." + name + ".maxheight");
            float hard = 0.0F;
            float friction = 0.0F;
            int light = 0;
            int amount = 1;
            int id = 1;
            int metadata = 0;
            CustomItem idrop = null;
            CustomBlock bdrop = null;
            String drop = null;
            if (Configuration.block.contains("Custom Ores." + name + ".hardness")) {
                hard = Configuration.block.getInt("Custom Ores." + name + ".hardness");
            }
            if (Configuration.block.contains("Custom Ores." + name + ".block id")) {
                id = Configuration.block.getInt("Custom Ores." + name + ".block id");
            }
            if (Configuration.block.contains("Custom Ores." + name + ".metadata id")) {
                metadata = Configuration.block.getInt("Custom Ores." + name + ".metadata id");
            }
            if (Configuration.block.contains("Custom Ores." + name + ".lightlevel")) {
                light = Configuration.block.getInt("Custom Ores." + name + ".lightlevel");
            }
            if (Configuration.block.contains("Custom Ores." + name + ".friction")) {
                friction = Configuration.block.getInt("Custom Ores." + name + ".friction");
            }
            if (Configuration.block.contains("Custom Ores." + name + ".amount")) {
                amount = Configuration.block.getInt("Custom Ores." + name + ".amount");
            }
            if (Configuration.block.contains("Custom Ores." + name + ".drop")) {
                drop = Configuration.block.getString("Custom Ores." + name + ".drop");
                if (customblocksmap.containsKey(drop)) {
                    bdrop = customblocksmap.get(drop);
                    addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
                } else if (custombushesmap.containsKey(drop)) {
                    bdrop = custombushesmap.get(drop);
                    addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
                } else if (customitemsmap.containsKey(drop)) {
                    idrop = customitemsmap.get(drop);
                    addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customfishmap.containsKey(drop)) {
                    idrop = customfishmap.get(drop);
                    addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customarrowsmap.containsKey(drop)) {
                    idrop = customarrowsmap.get(drop);
                    addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customfoodmap.containsKey(drop)) {
                    idrop = customfoodmap.get(drop);
                    addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customtoolsmap.containsKey(drop)) {
                    idrop = customtoolsmap.get(drop);
                    addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else {
                    if (drop.contains(":")) {
                        ores = drop.split(":");
                        addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, amount, id, metadata, Integer.parseInt(ores[0]), Short.parseShort(ores[1]));
                    } else {
                        addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, amount, id, metadata, Integer.parseInt(drop), Short.parseShort("o"));
                    }
                }
            } else {
                addOre(plugin, name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
            }
        }
    }
    public static void CustomBushes(MoOres plugin) {
        ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Bushes");
        Iterator keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = (String)keys.next();
            int textureID = Configuration.block.getInt("Custom Bushes." + name + ".textureID");
            int freq = Configuration.block.getInt("Custom Bushes." + name + ".frequency");
            addbushes(plugin, name, new int[] {textureID, textureID, textureID, textureID, textureID, textureID}, freq);
        }
    }
    public static void CustomBlock(MoOres plugin) {
        ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Blocks");
        Iterator keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = (String)keys.next();
            int id = 1;
            int metadata = 0;
            int textureID = Configuration.block.getInt("Custom Blocks." + name + ".textureID");
            float hard = Configuration.block.getInt("Custom Blocks." + name + ".hardness");
            int light = Configuration.block.getInt("Custom Blocks." + name + ".lightlevel");
            float friction = Configuration.block.getInt("Custom Blocks." + name + ".friction");
            
            if (Configuration.block.contains("Custom Blocks." + name + ".block id")) {
                id = Configuration.block.getInt("Custom Blocks." + name + ".block id");
            }
            
            if (Configuration.block.contains("Custom Blocks." + name + ".metadata id")) {
                metadata = Configuration.block.getInt("Custom Blocks." + name + ".metadata id");
            }
            addblock(plugin, name, textureID, hard, light, friction, id, metadata);
        }
    }
    public static void CustomItems(MoOres plugin) {
        ConfigurationSection section = Configuration.items.getConfigurationSection("Custom Items");
        Iterator keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = (String)keys.next();
            String textureurl = Configuration.items.getString("Custom Items." + name + ".texture url");
            addItem(plugin, name, textureurl);
        }
        ConfigurationSection section2 = Configuration.items.getConfigurationSection("Custom Tools");
        Iterator keys2 = section2.getKeys(false).iterator();
        while (keys2.hasNext()) {
            String name = (String)keys2.next();
            String textureurl = Configuration.items.getString("Custom Tools." + name + ".texture url");
            short durability = Configuration.items.getShort("Custom Tools." + name + ".durability");
            float strength = Configuration.items.getFloat("Custom Tools." + name + ".Tool Strength");
            boolean Pickaxe = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Pickaxe");
            boolean Axe = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Axe");
            boolean Shovel = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Shovel");
            boolean Hoe = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Hoe");
            boolean Bow = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Bow");
            boolean Sword = Configuration.items.getBoolean("Custom Tools." + name + ".tooltype.Sword");
            boolean fire = Configuration.items.getBoolean("Custom Tools." + name + ".Sword.Set Fire");
            boolean poison = Configuration.items.getBoolean("Custom Tools." + name + ".Sword.Set Poison");
            boolean lightning = Configuration.items.getBoolean("Custom Tools." + name + ".Sword.Strike Lightning");
            int damage = Configuration.items.getInt("Custom Tools." + name + ".Sword.damage");
            int fireticks = Configuration.items.getInt("Custom Tools." + name + ".Sword.Fire Ticks");
            int poisonticks = Configuration.items.getInt("Custom Tools." + name + ".Sword.Poison Ticks");
            addTool(plugin, name, textureurl, durability, strength, Pickaxe, Axe, Shovel, Hoe, Bow, Sword, damage, fire, fireticks, poison, lightning, poisonticks);
        }
        ConfigurationSection section3 = Configuration.items.getConfigurationSection("Custom Food");
        Iterator keys3 = section3.getKeys(false).iterator();
        while (keys3.hasNext()) {
            String name = (String)keys3.next();
            String textureurl = Configuration.items.getString("Custom Food." + name + ".texture url");
            int restore = Configuration.items.getInt("Custom Food." + name + ".restore");
            addFood(plugin, name, textureurl, restore);
        }
        ConfigurationSection section4 = Configuration.items.getConfigurationSection("Custom Fish");
        Iterator keys4 = section4.getKeys(false).iterator();
        while (keys4.hasNext()) {
            String name = (String)keys4.next();
            String textureurl = Configuration.items.getString("Custom Fish." + name + ".texture url");
            int restore = Configuration.items.getInt("Custom Fish." + name + ".restore");
            int chance = Configuration.items.getInt("Custom Fish." + name + ".chance", 100);
            addFish(plugin, name, textureurl, restore, chance);
        }
    }
    private static void addblock(MoOres plugin, String name, int textureID, float hard, int light, float friction, int id , int metadata) {
        CustomBlocks block = new CustomBlocks(plugin, name, textureID, hard, light, friction, id ,metadata);
        customblocks.add(block);
        customblocksmap.put(name, block);
    }
    private static void addOre(MoOres plugin, String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, CustomBlock drop, int amount, int id , int metadata) {
        CustomOres ore = new CustomOres(plugin, name, textureID, freq, minY, maxY, drop, hard, light, friction, amount, id ,metadata);
        customores.add(ore);
        customoresmap.put(name, ore);
    }
    private static void addOre(MoOres plugin, String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, CustomItem drop, int amount, int id , int metadata) {
        CustomOres ore = new CustomOres(plugin, name, textureID, freq, minY, maxY, drop, hard, light, friction, amount, id ,metadata);
        customores.add(ore);
        customoresmap.put(name, ore);
    }
    private static void addOre(MoOres plugin, String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, int amount, int id , int metadata, int dropid, short dropmetaid) {
        CustomOres ore = new CustomOres(plugin, name, textureID, freq, minY, maxY, hard, light, friction, amount, id , metadata, dropid, dropmetaid);
        customores.add(ore);
        customoresmap.put(name, ore);
    }
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
        CustomBush bush = new CustomBush(plugin, name, textureids, freq);
        custombushes.add(bush);
        custombushesmap.put(name, bush);
    }
    public static void registerBlocks(MoOres plugin) {
        OriginalOres CoalOre = new OriginalOres(plugin, Material.COAL_ORE, Configuration.block.getInt("Original Ores.Coal Ore.frequency"), Configuration.block.getInt("Original Ores.Coal Ore.minheight"), Configuration.block.getInt("Original Ores.Coal Ore.maxheight"));
        OriginalOres IronOre = new OriginalOres(plugin, Material.IRON_ORE, Configuration.block.getInt("Original Ores.Iron Ore.frequency"), Configuration.block.getInt("Original Ores.Iron Ore.minheight"), Configuration.block.getInt("Original Ores.Iron Ore.maxheight"));
        OriginalOres LapisOre = new OriginalOres(plugin, Material.LAPIS_ORE, Configuration.block.getInt("Original Ores.Lapis Ore.frequency"), Configuration.block.getInt("Original Ores.Lapis Ore.minheight"), Configuration.block.getInt("Original Ores.Lapis Ore.maxheight"));
        OriginalOres GoldOre = new OriginalOres(plugin, Material.GOLD_ORE, Configuration.block.getInt("Original Ores.Gold Ore.frequency"), Configuration.block.getInt("Original Ores.Gold Ore.minheight"), Configuration.block.getInt("Original Ores.Gold Ore.maxheight"));
        OriginalOres RedstoneOre = new OriginalOres(plugin, Material.REDSTONE_ORE, Configuration.block.getInt("Original Ores.Redstone Ore.frequency"), Configuration.block.getInt("Original Ores.Redstone Ore.minheight"), Configuration.block.getInt("Original Ores.Redstone Ore.maxheight"));
        OriginalOres DiamondOre = new OriginalOres(plugin, Material.DIAMOND_ORE, Configuration.block.getInt("Original Ores.Diamond Ore.frequency"), Configuration.block.getInt("Original Ores.Diamond Ore.minheight"), Configuration.block.getInt("Original Ores.Diamond Ore.maxheight"));
        originalores.add(CoalOre);
        originalores.add(IronOre);
        originalores.add(LapisOre);
        originalores.add(GoldOre);
        originalores.add(RedstoneOre);
        originalores.add(DiamondOre);
        CustomBlock(plugin);
        CustomBushes(plugin);
        CustomItems(plugin);
        CustomOres(plugin);
    }
    public static void addvanillablocks() {
        
        List<Integer> list = Configuration.config.getIntegerList("tools.Pickaxe Breackable Blocks");
        for(int pos = 0; pos < list.size(); pos++){
            Pickaxebreackableblocks.add(Material.getMaterial(list.get(pos)));
        }
        list = Configuration.config.getIntegerList("tools.Axe Breackable Blocks");
        for(int pos = 0; pos < list.size(); pos++){
            Axebreackableblocks.add(Material.getMaterial(list.get(pos)));
        }
        list = Configuration.config.getIntegerList("tools.Shovel Breackable Blocks");
        for(int pos = 0; pos < list.size(); pos++){
            Shovelbreackableblocks.add(Material.getMaterial(list.get(pos)));
        }
        list = Configuration.config.getIntegerList("tools.Sword Breackable Blocks");
        for(int pos = 0; pos < list.size(); pos++){
            Swordbreackableblocks.add(Material.getMaterial(list.get(pos)));
        }
        List<String> block = Configuration.config.getStringList("tools.Pickaxe Breackable Block Ids");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                
            } else {
                Hashmaps.PickaxeSpeedIds.add(MaterialData.getBlock(Integer.parseInt(block.get(pos))));
            }
        }
        block = Configuration.config.getStringList("tools.Axe Breackable Block Ids");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                
            }
        }
        block = Configuration.config.getStringList("tools.Shovel Breackable Block Ids");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                
            }
        }
        block = Configuration.config.getStringList("tools.Sword Breackable Block Ids");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                
            }
        }
    }
}