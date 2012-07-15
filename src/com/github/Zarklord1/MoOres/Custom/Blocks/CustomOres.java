package com.github.Zarklord1.MoOres.Custom.Blocks;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

import com.github.Zarklord1.MoOres.MoOres;

public class CustomOres extends GenericCubeCustomBlock {
    
    private int minY = 2;
    private int maxY = 256;
    private int minVeinSize = 2;
    private int maxVeinSize = 256;
    private int veinsPerChunk = 300;
    
    public CustomOres(String name, int blockId, int metaData, int textureId, int hardness, int lightlevel, int friction, ItemStack drops, int amount, int minY, int maxY, int minVeinSize, int maxVeinSize, int veinsPerChunk) {
        super(MoOres.plugin, name, metaData, blockId, new GenericCubeBlockDesign(MoOres.plugin, MoOres.ores, textureId));
        this.minY = minY;
        this.maxY = maxY;
        this.minVeinSize = minVeinSize;
        this.maxVeinSize = maxVeinSize;
        this.veinsPerChunk = veinsPerChunk;
        setHardness(hardness);
        setLightLevel(lightlevel);
        setFriction(friction);
        if (drops == null) {
        	this.setItemDrop(new SpoutItemStack(this, amount));
        } else {
        	this.setItemDrop(drops);
        }
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
    
    public int getVeinsPerChunk() {
        return this.veinsPerChunk;
    }
    
    public int getId() {
        return 318;
    }
}
