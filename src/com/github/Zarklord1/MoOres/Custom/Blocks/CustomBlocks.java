package com.github.Zarklord1.MoOres.Custom.Blocks;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Util.BlockLoader;
import com.github.Zarklord1.MoOres.Util.BlockShapeLoader;


public class CustomBlocks extends GenericCubeCustomBlock {
	
	//private boolean done = true;
	private String blockName;
	
	public CustomBlocks(String name, int textureID, int blockId, int metadata) {
		super(MoOres.plugin, name, blockId, metadata, new GenericCubeBlockDesign(MoOres.plugin, MoOres.blocks, textureID));
    	MoOres.log.fine("kitten7");
		this.setLightLevel(Configuration.block.getInt("Custom Blocks." + name + ".lightlevel"));
		this.setHardness(Configuration.block.getInt("Custom Blocks." + name + ".hardness"));
		this.setFriction(Configuration.block.getInt("Custom Blocks." + name + ".friction"));
		this.setBlockName(name);
		boolean haveBlockDesign = false;
		int numOfVertexes = 0;
    	MoOres.log.fine("kitten7");
		
		if (Configuration.block.contains("Custom Blocks." + name + ".Has Block Design")) {
	    	MoOres.log.fine("kitten4");
			haveBlockDesign = Configuration.block.getBoolean("Custom Blocks." + name + ".Has Block Design");
		}
		if (haveBlockDesign) {
			numOfVertexes = Configuration.block.getInt("Custom Blocks." + name + ".Number Of Vertexes");
			MoOres.log.fine(String.valueOf(numOfVertexes));
        }
		if (haveBlockDesign == true) {
	    	MoOres.log.fine("kitten6");
			setblockDesign(name, numOfVertexes, textureID);
		}
		
        if (Configuration.block.contains("Custom BLocks." + name + ".drop")) {
        	String drop = Configuration.block.getString("Custom BLocks." + name + ".drop");
            int amount = 1;
            if (Configuration.block.contains("Custom BLocks." + name + ".amount")) {
                amount = Configuration.block.getInt("Custom BLocks." + name + ".amount");
            }
            this.setBlockDrops(drop, amount);
        } else {
        	this.setItemDrop(new SpoutItemStack(this ,1)); 
        }
	}
	
	private void setblockDesign(String name, int numOfVertexes, int textureID) {
		if (Configuration.loadBlockDesign(Configuration.blockDesign, name + ".yml")) {
	    	MoOres.log.fine("kitten3");
			this.setBlockDesign(new BlockShapeLoader(Configuration.blockDesign, numOfVertexes, textureID));
		}
	}

	public int getId() {
		return 318;
	}
	
	public void setBlockDrops(String drop, int amount) {
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
        } else if (drop.contains(":")) {
            String[] ores = drop.split(":");
            SpoutItemStack drops = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(ores[0]), Short.parseShort(ores[1])), amount);
            this.setItemDrop(drops);
        } else {
            SpoutItemStack drops = new SpoutItemStack(MaterialData.getMaterial(Integer.parseInt(drop)), amount);
            this.setItemDrop(drops);
        }
		return;
	}
	
	public String getBlockName() {
		return blockName;
	}
	
	public void setBlockName(String name) {
		 blockName = name;
	}
}