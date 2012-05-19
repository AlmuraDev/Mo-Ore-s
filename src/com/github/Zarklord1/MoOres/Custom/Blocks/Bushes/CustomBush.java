package com.github.Zarklord1.MoOres.Custom.Blocks.Bushes;

import com.github.Zarklord1.MoOres.MoOres;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CustomBush extends GenericCubeCustomBlock
{
  @SuppressWarnings("unused")
private MoOres plugin;

  public CustomBush(MoOres plugin, String name, int[] textureids, int freq)
  {
    super(plugin, name, false, new GenericCubeBlockDesign(plugin, plugin.plants, textureids));
    setBlockDesign(new CustomBushDesign(plugin, textureids, freq));
    this.plugin = plugin;
  }

}
