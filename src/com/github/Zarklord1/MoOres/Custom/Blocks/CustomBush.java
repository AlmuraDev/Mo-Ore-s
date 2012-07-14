package com.github.Zarklord1.MoOres.Custom.Blocks;

import com.github.Zarklord1.MoOres.MoOres;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CustomBush extends GenericCubeCustomBlock {

	public CustomBush(String name, int[] textureids) {
		super(MoOres.plugin, name, false, (GenericCubeBlockDesign) new GenericCubeBlockDesign(MoOres.plugin, MoOres.plants, textureids));
		setBlockDesign(new CustomBushDesign(textureids));
	}
	
	public int getId() {
		return 318;
	}
}
