package com.github.Zarklord1.MoOres.Custom.Blocks;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CustomOres extends GenericCubeCustomBlock {
    
    private int minY = 2;
    private int maxY = 256;
    private int minVeinSize = 2;
    private int maxVeinSize = 256;
    private int freq = 0;
    private int maxPerChunk = 300;
    
    public CustomOres(String name, int blockId, int metaData, int textureId) {
        super(MoOres.plugin, name, blockId, metaData, new GenericCubeBlockDesign(MoOres.plugin, MoOres.ores, textureId));
        this.minY = Configuration.block.getInt("Custom Ores." + name + ".minheight");
        this.maxY = Configuration.block.getInt("Custom Ores." + name + ".maxheight");
        this.minVeinSize = Configuration.block.getInt("Custom Ores." + name + ".minVeinSize");
        this.maxVeinSize = Configuration.block.getInt("Custom Ores." + name + ".maxVeinSize");
        this.maxPerChunk = Configuration.block.getInt("Custom Ores." + name + ".maxPerChunk");
        this.freq = Configuration.block.getInt("Custom Ores." + name + ".frequency");
        setHardness(Configuration.block.getInt("Custom Ores." + name + ".hardness"));
        setLightLevel(Configuration.block.getInt("Custom Ores." + name + ".lightlevel"));
        setFriction(Configuration.block.getInt("Custom Ores." + name + ".friction"));
        int amount = 1;
        String drop = null;
        if (Configuration.block.contains("Custom Ores." + name + ".amount")) {
            amount = Configuration.block.getInt("Custom Ores." + name + ".amount");
        }
        if (Configuration.block.contains("Custom Ores." + name + ".drop")) {
            drop = Configuration.block.getString("Custom Ores." + name + ".drop");
            if (BlockLoader.customoresmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customoresmap.get(drop), amount);
            	this.setItemDrop(drops);
        	} else if (BlockLoader.customblocksmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customblocksmap.get(drop), amount);
            	this.setItemDrop(drops);
            } else if (BlockLoader.custombushesmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.custombushesmap.get(drop));
            	this.setItemDrop(drops);
            } else if (BlockLoader.customitemsmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customitemsmap.get(drop));
            	this.setItemDrop(drops);
            } else if (BlockLoader.customfishmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customfishmap.get(drop));
            	this.setItemDrop(drops);
            } else if (BlockLoader.customarrowsmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customarrowsmap.get(drop));
            	this.setItemDrop(drops);
            } else if (BlockLoader.customfoodmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customfoodmap.get(drop));
            	this.setItemDrop(drops);
            } else if (BlockLoader.customtoolsmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customtoolsmap.get(drop));
            	this.setItemDrop(drops);
            } else {
                if (drop.contains(":")) {
                    String[] ores = drop.split(":");
                    SpoutItemStack drops = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(ores[0]), Short.parseShort(ores[1])), amount);
                    this.setItemDrop(drops);
                } else {
                	SpoutItemStack drops = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(drop)), amount);
                    this.setItemDrop(drops);
                }
            }
        } else {
        	SpoutItemStack drops = new SpoutItemStack(this, amount);
            this.setItemDrop(drops);
        }
    }
    
    public int getFreq() {
        return this.freq;
    }
    
    public int getMinY() {
        return this.minY;
    }
    
    public int getMaxY() {
        return this.maxY;
    }
    
    public int getMinVeinSize() {
        return this.minVeinSize;
    }
    
    public int getMaxVeinSize() {
        return this.maxVeinSize;
    }
    
    public int getMaxPerChunk() {
        return this.maxPerChunk;
    }
    
    public int getId() {
        return 318;
    }
}
