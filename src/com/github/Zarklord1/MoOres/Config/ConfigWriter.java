package com.github.Zarklord1.MoOres.Config;

public class ConfigWriter {
    
    public static void setOres(MyConfiguration cfg, String custom, String orig) {
        String name = ".Coal Ore";
        if (!cfg.contains(orig + name + ".frequency")) {
            cfg.set(orig + name + ".frequency", Integer.valueOf(100));
        }  
        if (!cfg.contains(orig + name + "minheight")) {
            cfg.set(orig + name + ".minheight", Integer.valueOf(16));
        }  
        if (!cfg.contains(orig + name + "maxheight")) { 
            cfg.set(orig + name + ".maxheight", Integer.valueOf(76));
        }
        
        name = ".Iron Ore";
        if (!cfg.contains(orig + name + ".frequency")) {
            cfg.set(orig + name + ".frequency", Integer.valueOf(80));
        }   
        if (!cfg.contains(orig + name + "minheight")) {
            cfg.set(orig + name + ".minheight", Integer.valueOf(16));
        }   
        if (!cfg.contains(orig + name + "maxheight")) { 
            cfg.set(orig + name + ".maxheight", Integer.valueOf(64));
        }
        
        name = ".Lapis Ore";
        if (!cfg.contains(orig + name + ".frequency")) {
            cfg.set(orig + name + ".frequency", Integer.valueOf(4));
        }  
        if (!cfg.contains(orig + name + "minheight")) {
            cfg.set(orig + name + ".minheight", Integer.valueOf(2));
        }  
        if (!cfg.contains(orig + name + "maxheight")) { 
            cfg.set(orig + name + ".maxheight", Integer.valueOf(32));
        }
        
        name = ".Gold Ore";
        if (!cfg.contains(orig + name + ".frequency")) {
            cfg.set(orig + name + ".frequency", Integer.valueOf(20));
        }  
        if (!cfg.contains(orig + name + "minheight")) {
            cfg.set(orig + name + ".minheight", Integer.valueOf(5));
        }   
        if (!cfg.contains(orig + name + "maxheight")) { 
            cfg.set(orig + name + ".maxheight", Integer.valueOf(32));
        }
        
        name = ".Redstone Ore";
        if (!cfg.contains(orig + name + ".frequency")) {
            cfg.set(orig + name + ".frequency", Integer.valueOf(20));
        }   
        if (!cfg.contains(orig + name + "minheight")) {
            cfg.set(orig + name + ".minheight", Integer.valueOf(2));
        }  
        if (!cfg.contains(orig + name + "maxheight")) { 
            cfg.set(orig + name + ".maxheight", Integer.valueOf(16));
        }
        
        name = ".Diamond Ore";
        if (!cfg.contains(orig + name + ".frequency")) {
            cfg.set(orig + name + ".frequency", Integer.valueOf(5));
        }   
        if (!cfg.contains(orig + name + "minheight")) {
            cfg.set(orig + name + ".minheight", Integer.valueOf(2));
        }   
        if (!cfg.contains(orig + name + "maxheight")) { 
            cfg.set(orig + name + ".maxheight", Integer.valueOf(17));
        }
        
        name = ".Flarite Ore";
        if (!cfg.contains(custom +  name + ".textureID")) {
            cfg.set(custom +  name + ".textureID", Integer.valueOf(8));
        }
        if (!cfg.contains(custom +  name + ".frequency")) {
            cfg.set(custom +  name + ".frequency", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".minheight")) {
            cfg.set(custom +  name + ".minheight", Integer.valueOf(2));
        }
        if (!cfg.contains(custom +  name + ".maxheight")) {
            cfg.set(custom +  name + ".maxheight", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".hardness")) {
            cfg.set(custom +  name + ".hardness", Integer.valueOf(10));
        }
        if (!cfg.contains(custom +  name + ".block id")) {
            cfg.set(custom +  name + ".block id", Integer.valueOf(14));
        }
        if (!cfg.contains(custom +  name + ".lightlevel")) {
            cfg.set(custom +  name + ".lightlevel", Integer.valueOf(2));
        }
        if (!cfg.contains(custom +  name + ".friction")) {
            cfg.set(custom +  name + ".friction", Integer.valueOf(5));
        }
        
        name = ".Silver Ore";
        if (!cfg.contains(custom +  name + ".textureID")) {
            cfg.set(custom +  name + ".textureID", Integer.valueOf(9));
        }
        if (!cfg.contains(custom +  name + ".frequency")) {
            cfg.set(custom +  name + ".frequency", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".minheight")) {
            cfg.set(custom +  name + ".minheight", Integer.valueOf(2));
        }
        if (!cfg.contains(custom +  name + ".maxheight")) {
            cfg.set(custom +  name + ".maxheight", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".hardness")) {
            cfg.set(custom +  name + ".hardness", Integer.valueOf(2));
        }
        if (!cfg.contains(custom +  name + ".block id")) {
            cfg.set(custom +  name + ".block id", Integer.valueOf(15));
        }
        if (!cfg.contains(custom +  name + ".lightlevel")) {
            cfg.set(custom +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(custom +  name + ".friction")) {
            cfg.set(custom +  name + ".friction", Integer.valueOf(6));
        }
        
        name = ".Thermite Ore";
        if (!cfg.contains(custom +  name + ".textureID")) {
            cfg.set(custom +  name + ".textureID", Integer.valueOf(10));
        }
        if (!cfg.contains(custom +  name + ".frequency")) {
            cfg.set(custom +  name + ".frequency", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".minheight")) {
            cfg.set(custom +  name + ".minheight", Integer.valueOf(2));
        }
        if (!cfg.contains(custom +  name + ".maxheight")) {
            cfg.set(custom +  name + ".maxheight", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".hardness")) {
            cfg.set(custom +  name + ".hardness", Integer.valueOf(7));
        }
        if (!cfg.contains(custom +  name + ".block id")) {
            cfg.set(custom +  name + ".block id", Integer.valueOf(16));
        }
        if (!cfg.contains(custom +  name + ".lightlevel")) {
            cfg.set(custom +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(custom +  name + ".friction")) {
            cfg.set(custom +  name + ".friction", Integer.valueOf(3));
        }
        if (!cfg.contains(custom +  name + ".drop")) {
            cfg.set(custom +  name + ".drop", "Thermite Dust");
        }
        if (!cfg.contains(custom +  name + ".amount")) {
            cfg.set(custom +  name + ".amount", Integer.valueOf(4));
        }
        
        name = ".Crystalite Ore";
        if (!cfg.contains(custom +  name + ".textureID")) {
            cfg.set(custom +  name + ".textureID", Integer.valueOf(254));
        }
        if (!cfg.contains(custom +  name + ".frequency")) {
            cfg.set(custom +  name + ".frequency", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".minheight")) {
            cfg.set(custom +  name + ".minheight", Integer.valueOf(2));
        }
        if (!cfg.contains(custom +  name + ".maxheight")) {
            cfg.set(custom +  name + ".maxheight", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".hardness")) {
            cfg.set(custom +  name + ".hardness", Integer.valueOf(73));
        }
        if (!cfg.contains(custom +  name + ".block id")) {
            cfg.set(custom +  name + ".block id", Integer.valueOf(21));
        }
        if (!cfg.contains(custom +  name + ".lightlevel")) {
            cfg.set(custom +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(custom +  name + ".friction")) {
            cfg.set(custom +  name + ".friction", Integer.valueOf(9));
        }
        if (!cfg.contains(custom +  name + ".drop")) {
            cfg.set(custom +  name + ".drop", "Crystalite");
        }
        if (!cfg.contains(custom +  name + ".amount")) {
            cfg.set(custom +  name + ".amount", Integer.valueOf(2));
        }
        
        name = ".Ruby Ore";
        if (!cfg.contains(custom +  name + ".textureID")) {
            cfg.set(custom +  name + ".textureID", Integer.valueOf(7));
        }
        if (!cfg.contains(custom +  name + ".frequency")) {
            cfg.set(custom +  name + ".frequency", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".minheight")) {
            cfg.set(custom +  name + ".minheight", Integer.valueOf(2));
        }
        if (!cfg.contains(custom +  name + ".maxheight")) {
            cfg.set(custom +  name + ".maxheight", Integer.valueOf(100));
        }
        if (!cfg.contains(custom +  name + ".hardness")) {
            cfg.set(custom +  name + ".hardness", Integer.valueOf(8));
        }
        if (!cfg.contains(custom +  name + ".block id")) {
            cfg.set(custom +  name + ".block id", Integer.valueOf(56));
        }
        if (!cfg.contains(custom +  name + ".lightlevel")) {
            cfg.set(custom +  name + ".lightlevel", Integer.valueOf(0));
        }
        if (!cfg.contains(custom +  name + ".friction")) {
            cfg.set(custom +  name + ".friction", Integer.valueOf(7));
        }
        if (!cfg.contains(custom +  name + ".drop")) {
            cfg.set(custom +  name + ".drop", "Ruby");
        }
    }
}