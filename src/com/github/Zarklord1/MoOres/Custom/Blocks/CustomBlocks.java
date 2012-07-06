package com.github.Zarklord1.MoOres.Custom.Blocks;

import com.github.Zarklord1.MoOres.MoOres;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CustomBlocks extends GenericCubeCustomBlock
{
  private int light = 1;
  float hard = 1.0F;
  float friction = 0.0F;

  public CustomBlocks(String name, int textureID, float hard, int light, float friction, int blockId, int metadata) {
    super(MoOres.plugin, name, blockId, metadata, new GenericCubeBlockDesign(MoOres.plugin, MoOres.blocks, textureID));
    this.setLightLevel(this.light);
    this.setHardness(hard);
    this.setFriction(friction);
  }
  
  public int getId() {
      return 318;
  }
}