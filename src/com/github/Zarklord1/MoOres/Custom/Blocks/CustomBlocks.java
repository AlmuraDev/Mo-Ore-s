package com.github.Zarklord1.MoOres.Custom.Blocks;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import com.github.Zarklord1.MoOres.*;
import org.bukkit.Material;

public class CustomBlocks extends GenericCubeCustomBlock
{
  @SuppressWarnings("unused")
private int light = 1;
  float hard = 1.0F; float friction = 0.0F;
  int blockid;

  public CustomBlocks(MoOres plugin, String name, int textureID, float hard, int light, float friction, int blockId, int metadata) {
    super(plugin, name, blockId, metadata, new GenericCubeBlockDesign(plugin, plugin.blocks, textureID));
    this.setLightLevel(light);
    this.blockid = blockId;
  }

  public float gethardness() {
    return this.hard;
  }
  public Material getMaterial() {
      Material material = Material.getMaterial(blockid);
      return material;
  }
}