/*    */ package com.github.Zarklord1.MoOres.Custom.Blocks.Ores;
/*    */ 
/*    */ import com.github.Zarklord1.MoOres.MoOres;
/*    */ import org.bukkit.Material;
/*    */ 
/*    */ public class OriginalOres
/*    */ {
/*  8 */   private int minY = 2; private int maxY = 128; private int freq = 0;
/*    */   Material material;
/*    */ 
/*    */   public OriginalOres(MoOres plugin, Material material, int freq, int minY, int maxY)
/*    */   {
/* 12 */     this.minY = minY;
/* 13 */     this.maxY = maxY;
/* 14 */     this.freq = freq;
/* 15 */     this.material = material;
/*    */   }
/*    */   public int getfreq() {
/* 18 */     return this.freq;
/*    */   }
/*    */   public Material getmaterial() {
/* 21 */     return this.material;
/*    */   }
/*    */   public int getminY() {
/* 24 */     return this.minY;
/*    */   }
/*    */   public int getmaxY() {
/* 27 */     return this.maxY;
/*    */   }
/*    */ }

/* Location:           C:\Users\zachary\Documents\Desktop\RpgEssentials\
 * Qualified Name:     me.duckdoom5.RpgEssentials.blocks.ores.OriginalOres
 * JD-Core Version:    0.6.0
 */