package com.github.Zarklord1.MoOres.Util;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Custom.Blocks.*;
import com.github.Zarklord1.MoOres.Custom.Items.*;
import java.util.*;

import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.getspout.spoutapi.material.*;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;


public class BlockLoader {
	

    
    public static HashSet<Material> Pickaxebreackableblocks = new LinkedHashSet<Material>();
    public static Set<Block> PickaxeSpeedIds = new LinkedHashSet<Block>();
    public static Set<Block> SwordSpeedIds = new LinkedHashSet<Block>();
    public static Set<Block> AxeSpeedIds = new LinkedHashSet<Block>();
    public static Set<Block> ShovelSpeedIds = new LinkedHashSet<Block>();
    
    public static Set<CustomOres> customores = new LinkedHashSet<CustomOres>();
    public static HashMap<String, CustomOres> customoresmap = new LinkedHashMap<String, CustomOres>();
    
    public static Set<CustomBlocks> customblocks = new LinkedHashSet<CustomBlocks>();
    public static HashMap<String, CustomBlocks> customblocksmap = new LinkedHashMap<String, CustomBlocks>();
    
    public static Set<CustomItems> customitems = new LinkedHashSet<CustomItems>();
    public static HashMap<String, CustomItems> customitemsmap = new LinkedHashMap<String, CustomItems>();
    
    public static Set<CustomTools> customtools = new LinkedHashSet<CustomTools>();
    public static HashMap<String, CustomTools> customtoolsmap = new LinkedHashMap<String, CustomTools>();
    
    public static Set<CustomFood> customfood = new LinkedHashSet<CustomFood>();
    public static HashMap<String, CustomFood> customfoodmap = new LinkedHashMap<String, CustomFood>();
    
    public static Set<CustomArrows> customarrows = new LinkedHashSet<CustomArrows>();
    public static HashMap<String, CustomArrows> customarrowsmap = new LinkedHashMap<String, CustomArrows>();
    
    public static Set<CustomFishes> customfish = new LinkedHashSet<CustomFishes>();
    public static HashMap<String, CustomFishes> customfishmap = new LinkedHashMap<String, CustomFishes>();
    
    public static Set<CustomBush> custombushes = new LinkedHashSet<CustomBush>();
    public static HashMap<String, CustomBush> custombushesmap = new LinkedHashMap<String, CustomBush>();
    
    public static Set<OriginalOres> originalores = new LinkedHashSet<OriginalOres>();
    public static Set<GenericCubeCustomBlock> plants = new LinkedHashSet<GenericCubeCustomBlock>();
    
    public static void CustomOres() {
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
                    addOre(name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
                } else if (custombushesmap.containsKey(drop)) {
                    bdrop = custombushesmap.get(drop);
                    addOre(name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
                } else if (customitemsmap.containsKey(drop)) {
                    idrop = customitemsmap.get(drop);
                    addOre(name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customfishmap.containsKey(drop)) {
                    idrop = customfishmap.get(drop);
                    addOre(name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customarrowsmap.containsKey(drop)) {
                    idrop = customarrowsmap.get(drop);
                    addOre(name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customfoodmap.containsKey(drop)) {
                    idrop = customfoodmap.get(drop);
                    addOre(name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else if (customtoolsmap.containsKey(drop)) {
                    idrop = customtoolsmap.get(drop);
                    addOre(name, textureID, freq, minY, maxY, hard, light, friction, idrop, amount, id, metadata);
                } else {
                    if (drop.contains(":")) {
                        String[] ores = drop.split(":");
                        addOre(name, textureID, freq, minY, maxY, hard, light, friction, amount, id, metadata, Integer.parseInt(ores[0]), Short.parseShort(ores[1]));
                    } else {
                        addOre(name, textureID, freq, minY, maxY, hard, light, friction, amount, id, metadata, Integer.parseInt(drop), Short.parseShort("o"));
                    }
                }
            } else {
                addOre(name, textureID, freq, minY, maxY, hard, light, friction, bdrop, amount, id, metadata);
            }
        }
    }
    public static void CustomBushes() {
        ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Bushes");
        Iterator<String> keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = (String)keys.next();
            int textureID = Configuration.block.getInt("Custom Bushes." + name + ".textureID");
            int freq = Configuration.block.getInt("Custom Bushes." + name + ".frequency");
            addbushes(name, new int[] {textureID, textureID, textureID, textureID, textureID, textureID}, freq);
        }
    }
    public static void CustomBlock() {
        ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Blocks");
        Iterator<String> keys = section.getKeys(false).iterator();
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
            addblock(name, textureID, hard, light, friction, id, metadata);
        }
    }
    public static void CustomItems() {
        ConfigurationSection section = Configuration.items.getConfigurationSection("Custom Items");
        Iterator<String> keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = (String)keys.next();
            String textureurl = Configuration.items.getString("Custom Items." + name + ".texture url");
            addItem(name, textureurl);
        }
        ConfigurationSection section2 = Configuration.items.getConfigurationSection("Custom Tools");
        Iterator<String> keys2 = section2.getKeys(false).iterator();
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
            float speed = Configuration.items.getFloat("Custom Tools." + name + "Bow.Speed");
            addTool(name, textureurl, durability, strength, Pickaxe, Axe, Shovel, Hoe, Bow, Sword, damage, fire, fireticks, poison, lightning, poisonticks, speed);
        }
        ConfigurationSection section3 = Configuration.items.getConfigurationSection("Custom Food");
        Iterator<String> keys3 = section3.getKeys(false).iterator();
        while (keys3.hasNext()) {
            String name = (String)keys3.next();
            String textureurl = Configuration.items.getString("Custom Food." + name + ".texture url");
            int restore = Configuration.items.getInt("Custom Food." + name + ".restore");
            addFood(name, textureurl, restore);
        }
        ConfigurationSection section4 = Configuration.items.getConfigurationSection("Custom Fish");
        Iterator<String> keys4 = section4.getKeys(false).iterator();
        while (keys4.hasNext()) {
            String name = (String)keys4.next();
            String textureurl = Configuration.items.getString("Custom Fish." + name + ".texture url");
            int restore = Configuration.items.getInt("Custom Fish." + name + ".restore");
            int chance = Configuration.items.getInt("Custom Fish." + name + ".chance", 100);
            addFish(name, textureurl, restore, chance);
        }
    }
    private static void addblock(String name, int textureID, float hard, int light, float friction, int id , int metadata) {
        CustomBlocks block = new CustomBlocks(name, textureID, hard, light, friction, id ,metadata);
        customblocks.add(block);
        customblocksmap.put(name, block);
    }
    private static void addOre(String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, CustomBlock drop, int amount, int id , int metadata) {
        CustomOres ore = new CustomOres(name, textureID, freq, minY, maxY, drop, hard, light, friction, amount, id ,metadata);
        customores.add(ore);
        customoresmap.put(name, ore);
    }
    private static void addOre(String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, CustomItem drop, int amount, int id , int metadata) {
        CustomOres ore = new CustomOres(name, textureID, freq, minY, maxY, drop, hard, light, friction, amount, id ,metadata);
        customores.add(ore);
        customoresmap.put(name, ore);
    }
    private static void addOre(String name, int textureID, int freq, int minY, int maxY, float hard, int light, float friction, int amount, int id , int metadata, int dropid, short dropmetaid) {
        CustomOres ore = new CustomOres(name, textureID, freq, minY, maxY, hard, light, friction, amount, id , metadata, dropid, dropmetaid);
        customores.add(ore);
        customoresmap.put(name, ore);
    }
    private static void addItem(String name, String textureurl) {
        CustomItems item = new CustomItems(name, textureurl);
        customitems.add(item);
        customitemsmap.put(name, item);
    }
    private static void addArrow(String name, String textureurl, int damage, boolean firearrow, boolean poisonarrow, boolean lightningarrow, boolean explosivearrow, int fireticks, int poisonticks, int Numberofbolts, float explosionradius, float speedmodifier) {
        CustomArrows arrow = new CustomArrows(name, textureurl, damage, firearrow, poisonarrow, lightningarrow, explosivearrow, fireticks, poisonticks, Numberofbolts, explosionradius, speedmodifier);
        customarrows.add(arrow);
        customarrowsmap.put(name, arrow);
    }
    private static void addFood(String name, String textureurl, int restore) {
        CustomFood food = new CustomFood(name, textureurl, restore);
        customfood.add(food);
        customfoodmap.put(name, food);
    }
    private static void addFish(String name, String textureurl, int restore, int chance) {
        CustomFishes fish = new CustomFishes(name, textureurl, restore, chance);
        customfish.add(fish);
        customfishmap.put(name, fish);
    }
    private static void addTool(String name, String textureurl, short durability, float strength, boolean Pickaxe, boolean Axe, boolean Shovel, boolean Hoe, boolean Bow, boolean Sword, int damage, boolean fire, int ticks, boolean lightning, boolean poison, int poisonticks, float speed) {
        CustomTools tool = new CustomTools(name, textureurl, durability, strength, Pickaxe, Axe, Shovel, Hoe, Bow, Sword, damage, fire, ticks, lightning, poison, poisonticks, speed);
        customtools.add(tool);
        customtoolsmap.put(name, tool);
    }
    private static void addbushes(String name, int[] textureids, int freq) {
        CustomBush bush = new CustomBush(name, textureids, freq);
        custombushes.add(bush);
        custombushesmap.put(name, bush);
    }
    public static void registerBlocks() {
        OriginalOres CoalOre = new OriginalOres(Material.COAL_ORE, Configuration.block.getInt("Original Ores.Coal Ore.frequency"), Configuration.block.getInt("Original Ores.Coal Ore.minheight"), Configuration.block.getInt("Original Ores.Coal Ore.maxheight"));
        OriginalOres IronOre = new OriginalOres(Material.IRON_ORE, Configuration.block.getInt("Original Ores.Iron Ore.frequency"), Configuration.block.getInt("Original Ores.Iron Ore.minheight"), Configuration.block.getInt("Original Ores.Iron Ore.maxheight"));
        OriginalOres LapisOre = new OriginalOres(Material.LAPIS_ORE, Configuration.block.getInt("Original Ores.Lapis Ore.frequency"), Configuration.block.getInt("Original Ores.Lapis Ore.minheight"), Configuration.block.getInt("Original Ores.Lapis Ore.maxheight"));
        OriginalOres GoldOre = new OriginalOres(Material.GOLD_ORE, Configuration.block.getInt("Original Ores.Gold Ore.frequency"), Configuration.block.getInt("Original Ores.Gold Ore.minheight"), Configuration.block.getInt("Original Ores.Gold Ore.maxheight"));
        OriginalOres RedstoneOre = new OriginalOres(Material.REDSTONE_ORE, Configuration.block.getInt("Original Ores.Redstone Ore.frequency"), Configuration.block.getInt("Original Ores.Redstone Ore.minheight"), Configuration.block.getInt("Original Ores.Redstone Ore.maxheight"));
        OriginalOres DiamondOre = new OriginalOres(Material.DIAMOND_ORE, Configuration.block.getInt("Original Ores.Diamond Ore.frequency"), Configuration.block.getInt("Original Ores.Diamond Ore.minheight"), Configuration.block.getInt("Original Ores.Diamond Ore.maxheight"));
        originalores.add(CoalOre);
        originalores.add(IronOre);
        originalores.add(LapisOre);
        originalores.add(GoldOre);
        originalores.add(RedstoneOre);
        originalores.add(DiamondOre);
        CustomBlock();
        CustomBushes();
        CustomItems();
        CustomOres();
        addArrow("Test Arrow", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteArrow.png", 7, true, false, false, false, 100, 0, 0, 0.0F, 3.5F);
    }
    public static void addvanillablocks() {
        
        List<Integer> list = Configuration.config.getIntegerList("Tools.Pickaxe Breackable Block Ids");
        for(int pos = 0; pos < list.size(); pos++){
            Pickaxebreackableblocks.add(Material.getMaterial(list.get(pos)));
        }
        
        List<String> block = Configuration.config.getStringList("Tools.Pickaxe Block Break Speed");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                String[] split = block.get(pos).split(":");
                PickaxeSpeedIds.add(MaterialData.getBlock(Integer.parseInt(split[0]), Short.parseShort(split[1])));
            } else {
                PickaxeSpeedIds.add(MaterialData.getBlock(Integer.parseInt(block.get(pos))));
            }
        }
        block = Configuration.config.getStringList("Tools.Axe Block Break Speed");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                String[] split = block.get(pos).split(":");
                AxeSpeedIds.add(MaterialData.getBlock(Integer.parseInt(split[0]), Short.parseShort(split[1])));
            } else {
                AxeSpeedIds.add(MaterialData.getBlock(Integer.parseInt(block.get(pos))));
            }
        }
        block = Configuration.config.getStringList("Tools.Shovel Block Break Speed");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                String[] split = block.get(pos).split(":");
                ShovelSpeedIds.add(MaterialData.getBlock(Integer.parseInt(split[0]), Short.parseShort(split[1]))); 
            } else {
                ShovelSpeedIds.add(MaterialData.getBlock(Integer.parseInt(block.get(pos))));
            }
        }
        block = Configuration.config.getStringList("Tools.Sword Block Break Speed");
        for(int pos = 0; pos < list.size(); pos++){
            if (block.get(pos).contains(":")) {
                String[] split = block.get(pos).split(":");
                SwordSpeedIds.add(MaterialData.getBlock(Integer.parseInt(split[0]), Short.parseShort(split[1])));
            } else {
                SwordSpeedIds.add(MaterialData.getBlock(Integer.parseInt(block.get(pos))));
            }
        }
    }
}