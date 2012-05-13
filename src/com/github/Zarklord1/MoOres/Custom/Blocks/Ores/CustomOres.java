package com.github.Zarklord1.MoOres.Custom.Blocks.Ores;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.CustomItem;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import com.github.Zarklord1.MoOres.MoOres;

public class CustomOres extends GenericCubeCustomBlock
 {
   private int minY = 2; private int maxY = 128; private int freq = 0; @SuppressWarnings("unused")
private int light = 1;
   float hard = 1.0F; float friction = 0.0F;
/*    */ 
/* 17 */   public CustomOres(MoOres plugin, String name, int textureid, int freq, int minY, int maxY, CustomItem drop, float hard, int light, float friction, int amount) { super(plugin, name, new GenericCubeBlockDesign(plugin, plugin.ores, textureid));
/* 18 */     this.minY = minY;
/* 19 */     this.maxY = maxY;
/* 20 */     this.freq = freq;
/* 21 */     this.hard = hard;
/* 22 */     this.light = light;
/* 23 */     this.friction = friction;
/* 24 */     setHardness(hard);
/* 25 */     setLightLevel(light);
/*    */ 
/* 27 */     if (drop != null)
/* 28 */       setItemDrop(new SpoutItemStack(drop, amount > 1 ? amount : 1));
/*    */   }
/*    */ 
/*    */   public CustomOres(MoOres plugin, String name, int textureid, int freq, int minY, int maxY, CustomBlock drop, float hard, int light, float friction, int amount)
/*    */   {
/* 34 */     super(plugin, name, new GenericCubeBlockDesign(plugin, plugin.ores, textureid));
/* 35 */     this.minY = minY;
/* 36 */     this.maxY = maxY;
/* 37 */     this.freq = freq;
/* 38 */     this.hard = hard;
/* 39 */     this.light = light;
/* 40 */     this.friction = friction;
/* 41 */     setHardness(hard);
/* 42 */     setLightLevel(light);
/*    */ 
/* 44 */     if (drop != null)
/* 45 */       setItemDrop(new SpoutItemStack(drop, amount > 1 ? amount : 1));
/*    */   }
/*    */ 
/*    */   public CustomOres(MoOres plugin, String name, int textureid, int freq, int minY, int maxY, Material drop, float hard, int light, float friction, int amount)
/*    */   {
/* 51 */     super(plugin, name, new GenericCubeBlockDesign(plugin, plugin.ores, textureid));
/* 52 */     this.minY = minY;
/* 53 */     this.maxY = maxY;
/* 54 */     this.freq = freq;
/* 55 */     this.hard = hard;
/* 56 */     this.light = light;
/* 57 */     this.friction = friction;
			setHardness(hard);
			setLightLevel(light);
			setFriction(friction);
			if (drop != null)
				setItemDrop(new ItemStack(drop, amount));
			}
   public int getFreq()
   {
	   return this.freq;
   }
   public int getMinY() {
	   return this.minY;
   }
   public int getMaxY() {
	   return this.maxY;
   }
   public float getHardness() {
	   return this.hard;
   }
}
