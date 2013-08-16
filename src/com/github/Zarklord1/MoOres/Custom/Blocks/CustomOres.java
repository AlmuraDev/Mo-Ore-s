package com.github.Zarklord1.MoOres.Custom.Blocks;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

import com.github.Zarklord1.MoOres.MoOres;

public final class CustomOres extends GenericCubeCustomBlock {
    
    private int minY = 0;
    private int maxY = 0;
    private int minVeinSize = 0;
    private int maxVeinSize = 0;
    private int minVeinsPerChunk = 0;
    private int maxVeinsPerChunk = 0;
    
    public CustomOres(String name, int textureID, int blockId, int metaData, int hardness, int lightlevel, int friction, ItemStack drops, int minY, int maxY, int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk) {
        super(MoOres.plugin, name, metaData, blockId, new GenericCubeBlockDesign(MoOres.plugin, MoOres.ores, textureID));
        this.setMinY(minY);
        this.setMaxY(maxY);
        this.setMinVeinSize(minVeinSize);
        this.setMaxVeinSize(maxVeinSize);
        this.setMinVeinsPerChunk(minVeinsPerChunk);
        this.setMaxVeinsPerChunk(maxVeinsPerChunk);
        setFriction(friction);
        if (drops != null) {
        	this.setItemDrop(drops);
        }
    }
    
    public void setMinY(int minY) {
    	this.minY = minY;
    }
    
    public void setMaxY(int maxY) {
    	this.maxY = maxY;
    }
    
    public void setMinVeinSize(int minVeinSize) {
    	this.minVeinSize = minVeinSize;
    }
    
    public void setMaxVeinSize(int maxVeinSize) {
    	this.maxVeinSize = maxVeinSize;
    }
    
    public void setMinVeinsPerChunk(int minVeinsPerChunk) {
    	this.minVeinsPerChunk = minVeinsPerChunk;
    }
    
    public void setMaxVeinsPerChunk(int maxVeinsPerChunk) {
    	this.maxVeinsPerChunk = maxVeinsPerChunk;
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
    
    public int getMinVeinsPerChunk() {
        return this.minVeinsPerChunk;
    }
    
    public int getMaxVeinsPerChunk() {
        return this.maxVeinsPerChunk;
    }
    
    public int getId() {
        return 318;
    }
}
