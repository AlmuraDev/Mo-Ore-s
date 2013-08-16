package com.github.Zarklord1.MoOres.Custom.Blocks;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Util.BlockLoader;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CustomBlocks extends GenericCubeCustomBlock {
	
	public CustomBlocks(String name, int textureID, int blockId, int metadata) {
		super(MoOres.plugin, name, blockId, metadata, new GenericCubeBlockDesign(MoOres.plugin, MoOres.blocks, textureID));
		this.setLightLevel(Configuration.block.getInt("Custom Blocks." + name + ".lightlevel"));
		this.setHardness(Configuration.block.getInt("Custom Blocks." + name + ".hardness"));
		this.setFriction(Configuration.block.getInt("Custom Blocks." + name + ".friction"));
        String drop = null;
        if (Configuration.block.contains("Custom Ores." + name + ".drop")) {
    		int amount = 1;
            drop = Configuration.block.getString("Custom Ores." + name + ".drop");
            if (Configuration.block.contains("Custom Ores." + name + ".amount")) {
                amount = Configuration.block.getInt("Custom Ores." + name + ".amount");
            }
            if (BlockLoader.customblocksmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customblocksmap.get(drop), amount);
            	this.setItemDrop(drops);
            } else if (BlockLoader.custombushesmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.custombushesmap.get(drop), amount);
            	this.setItemDrop(drops);
            } else if (BlockLoader.customitemsmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customitemsmap.get(drop), amount);
            	this.setItemDrop(drops);
            } else if (BlockLoader.customfishmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customfishmap.get(drop), amount);
            	this.setItemDrop(drops);
            } else if (BlockLoader.customarrowsmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customarrowsmap.get(drop), amount);
            	this.setItemDrop(drops);
            } else if (BlockLoader.customfoodmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customfoodmap.get(drop), amount);
            	this.setItemDrop(drops);
            } else if (BlockLoader.customtoolsmap.containsKey(drop)) {
            	SpoutItemStack drops = new SpoutItemStack(BlockLoader.customtoolsmap.get(drop), amount);
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
        }
	}
	
	public int getId() {
		return 318;
	}
}