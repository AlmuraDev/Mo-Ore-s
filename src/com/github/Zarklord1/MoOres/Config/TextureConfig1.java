/*    */ package com.github.Zarklord1.MoOres.Config;
/*    */ 
/*    */ public class TextureConfig1
/*    */ {
/*    */   public static void set()
/*    */   {
/*  6 */     if (!Configuration.texture.contains("Ores Texture")) {
/*  7 */       Configuration.texture.set("Ores Texture", "http://dl.lynxdragon.com/rpgessentials/textures/ores.png");
/*    */     }
/*  6 */     if (!Configuration.texture.contains("Ores Texture Size")) {
/*  7 */       Configuration.texture.set("Ores Texture Size", Integer.valueOf(16));
/*    */     }
/*  9 */     if (!Configuration.texture.contains("Blocks Texture")) {
/* 10 */       Configuration.texture.set("Blocks Texture", "http://dl.lynxdragon.com/rpgessentials/textures/blocks.png");
/*    */     }
/*  6 */     if (!Configuration.texture.contains("Blocks Texture Size")) {
/*  7 */       Configuration.texture.set("Blocks Texture Size", Integer.valueOf(16));
/*    */     }
/* 15 */     if (!Configuration.texture.contains("Plants Texture")) {
/* 16 */       Configuration.texture.set("Plants Texture", "http://dl.lynxdragon.com/rpgessentials/textures/plants.png");
/*    */     }
/*  6 */     if (!Configuration.texture.contains("Plants Texture Size")) {
/*  7 */       Configuration.texture.set("Plants Texture Size", Integer.valueOf(16));
/*    */     }
	}
}