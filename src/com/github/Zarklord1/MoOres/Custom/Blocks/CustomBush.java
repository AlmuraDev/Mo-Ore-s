package com.github.Zarklord1.MoOres.Custom.Blocks;

import com.github.Zarklord1.MoOres.MoOres;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CustomBush extends GenericCubeCustomBlock
{

  public CustomBush(String name, int[] textureids, int freq)
  {
    super(MoOres.plugin, name, false, new GenericCubeBlockDesign(MoOres.plugin, MoOres.plants, textureids));
    setBlockDesign(new CustomBushDesign(textureids, freq));
  }
  public int getId() {
      return 318;
  }

}
