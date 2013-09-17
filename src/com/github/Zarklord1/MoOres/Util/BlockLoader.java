package com.github.Zarklord1.MoOres.Util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Items.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.CustomFishes;
import com.github.Zarklord1.MoOres.Custom.Items.CustomFood;
import com.github.Zarklord1.MoOres.Custom.Items.CustomItems;
import com.github.Zarklord1.MoOres.Custom.Items.CustomTools;


public class BlockLoader {
    
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
    
    public static void CustomBlocks() {
        ConfigurationSection section = Configuration.block.getConfigurationSection("Custom Blocks");
        Iterator<String> keys = section.getKeys(false).iterator();
        while (keys.hasNext()) {
            String name = (String)keys.next();
        	MoOres.log.fine(name);
            int blockId = 1;
            int metaData = 0;
            int textureID = Configuration.block.getInt("Custom Blocks." + name + ".textureID");
            
            if (Configuration.block.contains("Custom Blocks." + name + ".block id")) {
                blockId = Configuration.block.getInt("Custom Blocks." + name + ".block id");
            }
            
            if (Configuration.block.contains("Custom Blocks." + name + ".metadata id")) {
                metaData = Configuration.block.getInt("Custom Blocks." + name + ".metadata id");
            }
            addblock(name, textureID, blockId, metaData);
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
            int chance = Configuration.items.getInt("Custom Fish." + name + ".chance");
            addFish(name, textureurl, restore, chance);
        }
    }
    private static void addblock(String name, int textureID, int blockId , int metaData) {
        CustomBlocks block = new CustomBlocks(name, textureID, blockId ,metaData);
        customblocks.add(block);
        customblocksmap.put(name, block);
    }
    private static void addItem(String name, String textureurl) {
        CustomItems item = new CustomItems(name, textureurl);
        customitems.add(item);
        customitemsmap.put(name, item);
    }
    private static void addArrow(String name, String texture, float speedModifier, boolean remove, int damage, boolean fireArrow, int fireTicks, boolean poisonArrow, int poisonTicks, boolean lightningArrow, int numOfBolts, boolean explosiveArrow, float explosionPower, boolean entityArrow, Entity entityToSpawn) {
        CustomArrows arrow = new CustomArrows(name, texture, speedModifier, remove, damage, fireArrow, fireTicks, poisonArrow, poisonTicks, lightningArrow, numOfBolts, explosiveArrow, explosionPower, entityArrow, entityToSpawn);
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
    public static void registerBlocks() {
        CustomItems();
        CustomBlocks();
        addArrow("Test Arrow", "https://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteArrow.png", 20.5F, false, 15, true, 100, false, 0, false, 3, true, 20.0F, false, null);
    }
}