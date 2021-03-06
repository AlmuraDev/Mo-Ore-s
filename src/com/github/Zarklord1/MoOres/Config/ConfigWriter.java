package com.github.Zarklord1.MoOres.Config;

import java.util.Arrays;

public class ConfigWriter {
    private static String name;
    
    public static void setRecipes(MoOresConfiguration cfg, String shaped, String shapeless, String furn) {
        name = ".Flarite Block";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aaa", "aaa", "aaa"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Flarite Ingot");
        }
        name = ".Flarite Ingot";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aa", "aa"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Flarite Nugget");
        }
        name = ".Flarite Sword(Ruby)";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Flarite Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", "Ruby Shaft");
        }
        name = ".Flarite Sword";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Flarite Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Silver Block";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aaa", "aaa", "aaa"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Silver Ingot");
        }
        name = ".Silver Sword(Ruby)";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Silver Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", "Ruby Shaft");
        }
        name = ".Silver Sword";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Silver Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Silver Pickaxe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aaa", "-b-", "-b-"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Silver Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Silver Axe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aa", "ab", "-b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Silver Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Silver Shovel";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "b", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Silver Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Silver Hoe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aa", "-b", "-b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Silver Ingot");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Thermite Bomb";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aba", "bab", "aba"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Thermite Dust");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(12));
        }
        name = ".Crystalite Block";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aaa", "aaa", "aaa"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Crystalite");
        }
        name = ".Crystalite Sword(Ruby)";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Crystalite");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", "Ruby Shaft");
        }
        name = ".Crystalite Sword";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Crystalite");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Crystalite Pickaxe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aaa", "-b-", "-b-"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Crystalite");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Crystalite Axe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aa", "ab", "-b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Crystalite");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Crystalite Shovel";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "b", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Crystalite");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Crystalite Hoe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aa", "-b", "-b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Crystalite");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        
        name = ".Ruby Block";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aaa", "aaa", "aaa"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        name = ".Ruby Sword(Ruby)";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", "Ruby Shaft");
        }
        name = ".Ruby Sword";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "a", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Ruby Pickaxe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aaa", "-b-", "-b-"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Ruby Axe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aa", "ab", "-b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Ruby Shovel";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"a", "b", "b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        name = ".Ruby Hoe";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"aa", "-b", "-b"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(280));
        }
        
        name = ".Ruby Shaft";
        if (!cfg.contains(shaped + name + ".Recipe1.amount")) {
            cfg.set(shaped + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.Shape")) {
            cfg.set(shaped + name + ".Recipe1.Shape", Arrays.asList(new String[] {"bab", "-c-"}));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.a")) {
            cfg.set(shaped + name + ".Recipe1.a", "Ruby");
        }
        if (!cfg.contains(shaped + name + ".Recipe1.b")) {
            cfg.set(shaped + name + ".Recipe1.b", Integer.valueOf(266));
        }
        if (!cfg.contains(shaped + name + ".Recipe1.c")) {
            cfg.set(shaped + name + ".Recipe1.c", Integer.valueOf(265));
        }
        name = ".Flarite Ingot";
        if (!cfg.contains(shapeless + name + ".Recipe1.amount")) {
            cfg.set(shapeless + name + ".Recipe1.amount", Integer.valueOf(9));
        }
        if (!cfg.contains(shapeless + name + ".Recipe1.ingredient1")) {
            cfg.set(shapeless + name + ".Recipe1.ingredient1", "Flarite Block");
        }
        name = ".Flarite Nugget";
        if (!cfg.contains(shapeless + name + ".Recipe1.amount")) {
            cfg.set(shapeless + name + ".Recipe1.amount", Integer.valueOf(4));
        }
        if (!cfg.contains(shapeless + name + ".Recipe1.ingredient1")) {
            cfg.set(shapeless + name + ".Recipe1.ingredient1", "Flarite Ingot");
        }
        name = ".Silver Ingot";
        if (!cfg.contains(shapeless + name + ".Recipe1.amount")) {
            cfg.set(shapeless + name + ".Recipe1.amount", Integer.valueOf(4));
        }
        if (!cfg.contains(shapeless + name + ".Recipe1.ingredient1")) {
            cfg.set(shapeless + name + ".Recipe1.ingredient1", "Silver Block");
        }
        name = ".Crystalite";
        if (!cfg.contains(shapeless + name + ".Recipe1.amount")) {
            cfg.set(shapeless + name + ".Recipe1.amount", Integer.valueOf(4));
        }
        if (!cfg.contains(shapeless + name + ".Recipe1.ingredient1")) {
            cfg.set(shapeless + name + ".Recipe1.ingredient1", "Crystalite Block");
        }
        name = ".Ruby";
        if (!cfg.contains(shapeless + name + ".Recipe1.amount")) {
            cfg.set(shapeless + name + ".Recipe1.amount", Integer.valueOf(4));
        }
        if (!cfg.contains(shapeless + name + ".Recipe1.ingredient1")) {
            cfg.set(shapeless + name + ".Recipe1.ingredient1", "Ruby Block");
        }
        name = ".Flarite Ingot";
        if (!cfg.contains(furn + name + ".Recipe1.amount")) {
            cfg.set(furn + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(furn + name + ".Recipe1.ingredient")) {
            cfg.set(furn + name + ".Recipe1.ingredient", "Flarite Ore");
        }
        name = ".Silver Ingot";
        if (!cfg.contains(furn + name + ".Recipe1.amount")) {
            cfg.set(furn + name + ".Recipe1.amount", Integer.valueOf(1));
        }
        if (!cfg.contains(furn + name + ".Recipe1.ingredient")) {
            cfg.set(furn + name + ".Recipe1.ingredient", "Silver Ore");
        }
        
    }

    public static void setBlocks(MoOresConfiguration cfg, String type) {
    	name = ".Flarite Ore";
        if (!cfg.contains(type +  name + ".textureID")) {
            cfg.set(type +  name + ".textureID", Integer.valueOf(25));
        }
        if (!cfg.contains(type +  name + ".hardness")) {
            cfg.set(type +  name + ".hardness", Integer.valueOf(10));
        }
        if (!cfg.contains(type +  name + ".lightlevel")) {
            cfg.set(type +  name + ".lightlevel", Integer.valueOf(2));
        }
        if (!cfg.contains(type +  name + ".friction")) {
            cfg.set(type +  name + ".friction", Integer.valueOf(5));
        }
        if (!cfg.contains(type +  name + ".block id")) {
            cfg.set(type +  name + ".block id", Integer.valueOf(14));
        }
        
        name = ".Silver Ore";
        if (!cfg.contains(type +  name + ".textureID")) {
            cfg.set(type +  name + ".textureID", Integer.valueOf(26));
        }
        if (!cfg.contains(type +  name + ".hardness")) {
            cfg.set(type +  name + ".hardness", Integer.valueOf(2));
        }
        if (!cfg.contains(type +  name + ".lightlevel")) {
            cfg.set(type +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type +  name + ".friction")) {
            cfg.set(type +  name + ".friction", Integer.valueOf(6));
        }
        if (!cfg.contains(type +  name + ".block id")) {
            cfg.set(type +  name + ".block id", Integer.valueOf(15));
        }
        
        name = ".Thermite Ore";
        if (!cfg.contains(type +  name + ".textureID")) {
            cfg.set(type +  name + ".textureID", Integer.valueOf(27));
        }
        if (!cfg.contains(type +  name + ".hardness")) {
            cfg.set(type +  name + ".hardness", Integer.valueOf(7));
        }
        if (!cfg.contains(type +  name + ".lightlevel")) {
            cfg.set(type +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type +  name + ".friction")) {
            cfg.set(type +  name + ".friction", Integer.valueOf(3));
        }
        if (!cfg.contains(type +  name + ".block id")) {
            cfg.set(type +  name + ".block id", Integer.valueOf(16));
        }
        if (!cfg.contains(type +  name + ".drop")) {
            cfg.set(type +  name + ".drop", "Thermite Dust");
        }
        if (!cfg.contains(type +  name + ".amount")) {
            cfg.set(type +  name + ".amount", Integer.valueOf(4));
        }
        
        name = ".Crystalite Ore";
        if (!cfg.contains(type +  name + ".textureID")) {
            cfg.set(type +  name + ".textureID", Integer.valueOf(34));
        }
        if (!cfg.contains(type +  name + ".hardness")) {
            cfg.set(type +  name + ".hardness", Integer.valueOf(73));
        }
        if (!cfg.contains(type +  name + ".lightlevel")) {
            cfg.set(type +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type +  name + ".friction")) {
            cfg.set(type +  name + ".friction", Integer.valueOf(9));
        }
        if (!cfg.contains(type +  name + ".block id")) {
            cfg.set(type +  name + ".block id", Integer.valueOf(21));
        }
        if (!cfg.contains(type +  name + ".drop")) {
            cfg.set(type +  name + ".drop", "Crystalite");
        }
        if (!cfg.contains(type +  name + ".amount")) {
            cfg.set(type +  name + ".amount", Integer.valueOf(2));
        }
        
        name = ".Ruby Ore";
        if (!cfg.contains(type +  name + ".textureID")) {
            cfg.set(type +  name + ".textureID", Integer.valueOf(24));
        }
        if (!cfg.contains(type +  name + ".hardness")) {
            cfg.set(type +  name + ".hardness", Integer.valueOf(8));
        }
        if (!cfg.contains(type +  name + ".lightlevel")) {
            cfg.set(type +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type +  name + ".friction")) {
            cfg.set(type +  name + ".friction", Integer.valueOf(7));
        }
        if (!cfg.contains(type +  name + ".block id")) {
            cfg.set(type +  name + ".block id", Integer.valueOf(56));
        }
        if (!cfg.contains(type +  name + ".drop")) {
            cfg.set(type +  name + ".drop", "Ruby");
        }
        
        name = ".Moon Stone";
        if (!cfg.contains(type +  name + ".textureID")) {
            cfg.set(type +  name + ".textureID", Integer.valueOf(28));
        }
        if (!cfg.contains(type +  name + ".hardness")) {
            cfg.set(type +  name + ".hardness", Integer.valueOf(10));
        }
        if (!cfg.contains(type +  name + ".lightlevel")) {
            cfg.set(type +  name + ".lightlevel", Integer.valueOf(25));
        }
        if (!cfg.contains(type +  name + ".friction")) {
            cfg.set(type +  name + ".friction", Integer.valueOf(5));
        }
        if (!cfg.contains(type +  name + ".block id")) {
            cfg.set(type +  name + ".block id", Integer.valueOf(14));
        }
        
        name = ".Flarite Block";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(13));
        }
        if (!cfg.contains(type + name + ".hardness")) {
            cfg.set(type + name + ".hardness", Integer.valueOf(2));
        }
        if (!cfg.contains(type + name + ".lightlevel")) {
            cfg.set(type + name + ".lightlevel", Integer.valueOf(4));
        }
        if (!cfg.contains(type + name + ".friction")) {
            cfg.set(type + name + ".friction", Integer.valueOf(19));
        }
        if (!cfg.contains(type + name + ".block id")) {
            cfg.set(type + name + ".block id", Integer.valueOf(41));
        }
	
        name = ".Silver Block";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(14));
        }
        if (!cfg.contains(type + name + ".hardness")) {
            cfg.set(type + name + ".hardness", Integer.valueOf(3));
        }
        if (!cfg.contains(type + name + ".lightlevel")) {
            cfg.set(type + name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type + name + ".friction")) {
            cfg.set(type + name + ".friction", Integer.valueOf(12));
        }
        if (!cfg.contains(type + name + ".block id")) {
            cfg.set(type + name + ".block id", Integer.valueOf(42));
        }
		
        name = ".Thermite Bomb";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(1));
        }
        if (!cfg.contains(type + name + ".hardness")) {
            cfg.set(type + name + ".hardness", Integer.valueOf(0));
        }
        if (!cfg.contains(type + name + ".lightlevel")) {
            cfg.set(type + name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type + name + ".friction")) {
            cfg.set(type + name + ".friction", Integer.valueOf(0));
        }
        if (!cfg.contains(type + name + ".block id")) {
            cfg.set(type + name + ".block id", Integer.valueOf(46));
        }
		
        name = ".Crystalite Block";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(16));
        }
        if (!cfg.contains(type + name + ".hardness")) {
            cfg.set(type + name + ".hardness", Integer.valueOf(5));
        }
        if (!cfg.contains(type + name + ".lightlevel")) {
            cfg.set(type + name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type + name + ".friction")) {
            cfg.set(type + name + ".friction", Integer.valueOf(15));
        }
        if (!cfg.contains(type + name + ".block id")) {
            cfg.set(type + name + ".block id", Integer.valueOf(22));
        }
        
        name = ".Ruby Block";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(15));
        }
        if (!cfg.contains(type + name + ".hardness")) {
            cfg.set(type + name + ".hardness", Integer.valueOf(4));
        }
        if (!cfg.contains(type + name + ".lightlevel")) {
            cfg.set(type + name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(type + name + ".friction")) {
            cfg.set(type + name + ".friction", Integer.valueOf(8));
        }
        if (!cfg.contains(type + name + ".block id")) {
            cfg.set(type + name + ".block id", Integer.valueOf(57));
        }
    }
    
    public static void setBushes(MoOresConfiguration cfg, String type) {
        name = ".Orange Bush";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(1));
        }
        
        name = ".Dark Green Bush";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(3));
        }
         
        name = ".Green Bush";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(4));
        }
         
        name = ".Light Green Bush";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(5));
        }
           
        name = ".Green Bush1";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(6));
        }
          
        name = ".Dark Green Bush1";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(7));
        }
         
        name = ".Dark Green Bush2";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(8));
        }
            
        name = ".Light Green Bush1";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(9));
        }
                        
        name = ".Green Bush2";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(10));
        }

        name = ".Pink Bush";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(11));
        }
                        
        name = ".White Bush";
        if (!cfg.contains(type + name + ".textureID")) {
            cfg.set(type + name + ".textureID", Integer.valueOf(12));
        }                  
    }
    
    public static void setTools(MoOresConfiguration cfg, String type) {
        
        name = ".Flarite Sword";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Flarite/flariteSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(700));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(5.2F));
        }
        if (!cfg.contains(type + name + ".tooltype.Sword")) {
            cfg.set(type + name + ".tooltype.Sword", Boolean.valueOf(true));
        }
        if (!cfg.contains(type + name + ".Sword.damage")) {
            cfg.set(type + name + ".Sword.damage", Integer.valueOf(10));
        }
        if (!cfg.contains(type + name + ".Sword.Set Fire")) {
            cfg.set(type + name + ".Sword.Set Fire", Boolean.valueOf(true));
        }
        if (!cfg.contains(type + name + ".Sword.Fire Ticks")) {
            cfg.set(type + name + ".Sword.Fire Ticks", Integer.valueOf(80));
        }
        
        name = ".Flarite Sword(Ruby)";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Flarite/ShaftedFlariteSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(800));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(5.2F));
        }
        if (!cfg.contains(type + name + ".tooltype.Sword")) {
            cfg.set(type + name + ".tooltype.Sword", Boolean.valueOf(true));
        }
        if (!cfg.contains(type + name + ".Sword.damage")) {
            cfg.set(type + name + ".Sword.damage", Integer.valueOf(10));
        }
        if (!cfg.contains(type + name + ".Sword.Set Fire")) {
            cfg.set(type + name + ".Sword.Set Fire", Boolean.valueOf(true));
        }
        if (!cfg.contains(type + name + ".Sword.Fire Ticks")) {
            cfg.set(type + name + ".Sword.Fire Ticks", Integer.valueOf(80));
        }
        
        name = ".Silver Sword";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(650));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(3.5F));
        }
        if (!cfg.contains(type + name + ".tooltype.Sword")) {
            cfg.set(type + name + ".tooltype.Sword", Boolean.valueOf(true));
        }
        if (!cfg.contains(type + name + ".Sword.damage")) {
            cfg.set(type + name + ".Sword.damage", Integer.valueOf(7));
        }
        
        name = ".Silver Sword(Ruby)";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/ShaftedSilverSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(750));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(3.5F));
        }
        if (!cfg.contains(type + name + ".tooltype.Sword")) {
            cfg.set(type + name + ".tooltype.Sword", Boolean.valueOf(true));
        }
        if (!cfg.contains(type + name + ".Sword.damage")) {
            cfg.set(type + name + ".Sword.damage", Integer.valueOf(7));
        }
        
        name = ".Silver Shovel";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverShovel.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(650));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(3.5F));
        }
        if (!cfg.contains(type + name + ".tooltype.Shovel")) {
            cfg.set(type + name + ".tooltype.Shovel", Boolean.valueOf(true));
        }
        
        name = ".Silver Axe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverAxe.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(650));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(3.5F));
        }
        if (!cfg.contains(type + name + ".tooltype.Axe")) {
            cfg.set(type + name + ".tooltype.Axe", Boolean.valueOf(true));
        }
        
        name = ".Silver Pickaxe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverPick.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(650));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(3.5F));
        }
        if (!cfg.contains(type + name + ".tooltype.Pickaxe")) {
            cfg.set(type + name + ".tooltype.Pickaxe", Boolean.valueOf(true));
        }
        
        name = ".Silver Hoe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/Silverhoe.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(650));
        }
        if (!cfg.contains(type + name + ".Tool Strength")) {
            cfg.set(type + name + ".Tool Strength", Float.valueOf(3.5F));
        }
        if (!cfg.contains(type + name + ".tooltype.Hoe")) {
            cfg.set(type + name + ".tooltype.Hoe", Boolean.valueOf(true));
        }
        
        name = ".Crystalite Sword";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1000));
        }
        if (!cfg.contains(type + name + ".damage")) {
            cfg.set(type + name + ".damage", Integer.valueOf(11));
        }
        
        name = ".Crystalite Sword(Ruby)";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/ShaftedCrystaliteSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1100));
        }
        if (!cfg.contains(type + name + ".damage")) {
            cfg.set(type + name + ".damage", Integer.valueOf(11));
        }
        
        name = ".Crystalite Shovel";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteShovel.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1000));
        }
        
        name = ".Crystalite Axe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteAxe.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1000));
        }
        
        name = ".Crystalite Pickaxe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystalitePick.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1000));
        }
        
        name = ".Crystalite Hoe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/Cyrstalitehoe.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1000));
        }
        
        name = ".Ruby Sword";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubySword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1500));
        }
        if (!cfg.contains(type + name + ".damage")) {
            cfg.set(type + name + ".damage", Integer.valueOf(12));
        }
        
        name = ".Ruby Sword(Ruby)";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/ShaftedRubysword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1600));
        }
        if (!cfg.contains(type + name + ".damage")) {
            cfg.set(type + name + ".damage", Integer.valueOf(10));
        }
        
        name = ".Ruby Shovel";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyShovel.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1500));
        }
        name = ".Ruby Axe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyAxe.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1500));
        }
        
        name = ".Ruby Pickaxe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyPick.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1500));
        }
        
        name = ".Ruby Hoe";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyHoe.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1500));
        }
        
        name = ".Iron Sword(Ruby)";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Other/ShaftedIronSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(351));
        }
        if (!cfg.contains(type + name + ".damage")) {
            cfg.set(type + name + ".damage", Integer.valueOf(6));
        }
        
        name = ".Gold Sword(Ruby)";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Other/ShaftedGoldSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(133));
        }
        if (!cfg.contains(type + name + ".damage")) {
            cfg.set(type + name + ".damage", Integer.valueOf(4));
        }
        
        name = ".Diamond Sword(Ruby)";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Other/ShaftedDiamondSword.png");
        }
        if (!cfg.contains(type + name + ".durability")) {
            cfg.set(type + name + ".durability", Integer.valueOf(1651));
        }
        if (!cfg.contains(type + name + ".damage")) {
            cfg.set(type + name + ".damage", Integer.valueOf(7));
        }
    }
    
    public static void setFood(MoOresConfiguration cfg, String type) {
    	if (!cfg.contains(type)) {
    		cfg.createSection(type);
        }
    }
    
    public static void setFish(MoOresConfiguration cfg, String type) {
    	if (!cfg.contains(type)) {
            cfg.createSection(type);
        }
    }
    
    public static void setItems(MoOresConfiguration cfg, String type) {
        name = ".Flarite Ingot";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Flarite/Flartieingot.png");
        }
        
        name = ".Flarite Nugget";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "https://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Flarite/FlariteNugget.png");
        }
        
        name = ".Silver Ingot";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/Silveringot.png");
        }
        
        name = ".Spike";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "https://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/Spike.png");
        }
        
        name = ".Ruby";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyDiamond.png");
        }
        
        name = ".Thermite Dust";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Thermite/ThermiteDust.png");
        }
        
        name = ".Crystalite";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/Crystalite.png");
        }
        
        name = ".Ruby Shaft";
        if (!cfg.contains(type + name + ".texture url")) {
            cfg.set(type + name + ".texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/Shaft.png");
        }
    }
    
    public static void setTextures(MoOresConfiguration cfg) {
        if (!cfg.contains("Ores Block Texture Size")) {
            cfg.set("Ores Block Texture Size", Integer.valueOf(16));
        }
        if (!cfg.contains("Ores Texture Size")) {
            cfg.set("Ores Texture Size", Integer.valueOf(256));
        }
        if (!cfg.contains("Ores Texture")) {
            cfg.set("Ores Texture", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/ores.png");
        }
        if (!cfg.contains("Blocks Block Texture Size")) {
            cfg.set("Blocks Block Texture Size", Integer.valueOf(16));
        }
        if (!cfg.contains("Blocks Texture Size")) {
            cfg.set("Blocks Texture Size", Integer.valueOf(256));
        }
        if (!cfg.contains("Blocks Texture")) {
            cfg.set("Blocks Texture", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/blocks.png");
        }
        if (!cfg.contains("Plants Block Texture Size")) {
            cfg.set("Plants Block Texture Size", Integer.valueOf(16));
        }
        if (!cfg.contains("Plants Texture Size")) {
            cfg.set("Plants Texture Size", Integer.valueOf(256));
        }
        if (!cfg.contains("Plants Texture")) {
            cfg.set("Plants Texture", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/plants.png");
        }
    }
    
    public static void setConfig(MoOresConfiguration cfg) {
        if (!cfg.contains("tools.Pickaxe Breackable Block Ids")) {
            cfg.set("tools.Pickaxe Breackable Block Ids", Arrays.asList(new Integer[] {1, 67, 71, 24, 70}));
        }
        if (!cfg.contains("tools.Pickaxe Block Break Speed")) {
            cfg.set("tools.Pickaxe Block Break Speed", Arrays.asList(new String[] {"1", "67", "71", "24", "70"}));
        }
        if (!cfg.contains("tools.Axe Block Break Speed")) {
            cfg.set("tools.Axe Block Break Speed", Arrays.asList(new String[] {"5", "53", "54"}));
        }
        if (!cfg.contains("tools.Shovel Block Break Speed")) {
            cfg.set("tools.Shovel Block Break Speed", Arrays.asList(new String[] {"2", "3", "60"}));
        }
        if (!cfg.contains("tools.Sword Block Break Speed")) {
            cfg.set("tools.Sword Block Break Speed", Arrays.asList(new String[] {"26", "30", "92"}));
        }
    }
    
    public static void setWGen(MoOresConfiguration cfg) {
    	name = ".Flarite Ore";
    	if (!cfg.contains("wGen.Ores" + name + ".Min Height")) {
        	cfg.set("wGen.Ores" + name + ".Min Height", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Height")) {
        	cfg.set("wGen.Ores" + name + ".Max Height", Integer.valueOf(46));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Min Vein Size", Integer.valueOf(3));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Max Vein Size", Integer.valueOf(8));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Min Veins Per Chunk", Integer.valueOf(10));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Max Veins Per Chunk", Integer.valueOf(25));
        }
    	name = ".Silver Ore";
    	if (!cfg.contains("wGen.Ores" + name + ".Min Height")) {
        	cfg.set("wGen.Ores" + name + ".Min Height", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Height")) {
        	cfg.set("wGen.Ores" + name + ".Max Height", Integer.valueOf(33));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Min Vein Size", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Max Vein Size", Integer.valueOf(6));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Min Veins Per Chunk", Integer.valueOf(7));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Max Veins Per Chunk", Integer.valueOf(13));
        }
    	name = ".Thermite Ore";
    	if (!cfg.contains("wGen.Ores" + name + ".Min Height")) {
        	cfg.set("wGen.Ores" + name + ".Min Height", Integer.valueOf(18));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Height")) {
        	cfg.set("wGen.Ores" + name + ".Max Height", Integer.valueOf(42));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Min Vein Size", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Max Vein Size", Integer.valueOf(8));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Min Veins Per Chunk", Integer.valueOf(8));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Max Veins Per Chunk", Integer.valueOf(16));
        }
    	name = ".Crystalite Ore";
    	if (!cfg.contains("wGen.Ores" + name + ".Min Height")) {
        	cfg.set("wGen.Ores" + name + ".Min Height", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Height")) {
        	cfg.set("wGen.Ores" + name + ".Max Height", Integer.valueOf(32));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Min Vein Size", Integer.valueOf(3));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Max Vein Size", Integer.valueOf(6));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Min Veins Per Chunk", Integer.valueOf(12));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Max Veins Per Chunk", Integer.valueOf(18));
        }
    	name = ".Ruby Ore";
    	if (!cfg.contains("wGen.Ores" + name + ".Min Height")) {
        	cfg.set("wGen.Ores" + name + ".Min Height", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Height")) {
        	cfg.set("wGen.Ores" + name + ".Max Height", Integer.valueOf(14));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Min Vein Size", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Max Vein Size", Integer.valueOf(4));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Min Veins Per Chunk", Integer.valueOf(4));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Max Veins Per Chunk", Integer.valueOf(7));
        }
    	name = ".Moon Stone";
    	if (!cfg.contains("wGen.Ores" + name + ".Min Height")) {
        	cfg.set("wGen.Ores" + name + ".Min Height", Integer.valueOf(215));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Height")) {
        	cfg.set("wGen.Ores" + name + ".Max Height", Integer.valueOf(256));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Min Vein Size", Integer.valueOf(1));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Vein Size")) {
        	cfg.set("wGen.Ores" + name + ".Max Vein Size", Integer.valueOf(3));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Min Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Min Veins Per Chunk", Integer.valueOf(2));
        }
    	if (!cfg.contains("wGen.Ores" + name + ".Max Veins Per Chunk")) {
        	cfg.set("wGen.Ores" + name + ".Max Veins Per Chunk", Integer.valueOf(4));
        }
        if (!cfg.contains("wGen.Generate Custom Ores")) {
        	cfg.set("wGen.Generate Custom Ores", Boolean.valueOf(true));
        }
        if (!cfg.contains("wGen.Generate In Old Chunks")) {
        	cfg.set("wGen.Generate In Old Chunks", Boolean.valueOf(false));
        }
        if (!cfg.contains("wGen.Overworld Name")) {
        	cfg.set("wGen.Overworld Name", Arrays.asList(new String[] {"Put your overworld world name here"}));
        }
    }
}