/*    */ package com.github.Zarklord1.MoOres.Config;
/*    */ 
/*    */ public class TextureConfig
/*    */ {
/*    */   public static void set()
/*    */   {
/*  6 */     if (!Configuration.texture.contains("Ores Texture")) {
/*  7 */       Configuration.texture.set("Ores Texture", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/ores.png");
/*    */     }
/*  6 */     if (!Configuration.texture.contains("Ores Block Texture Size")) {
/*  7 */       Configuration.texture.set("Ores Block Texture Size", Integer.valueOf(16));
/*    */     }
             if (!Configuration.texture.contains("Ores Texture Size")) {
/*  7 */       Configuration.texture.set("Ores Texture Size", Integer.valueOf(256));
/*    */     }
/*  9 */     if (!Configuration.texture.contains("Blocks Texture")) {
/* 10 */       Configuration.texture.set("Blocks Texture", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/blocks.png");
             }
             if (!Configuration.texture.contains("Blocks Block Texture Size")) {
/*  7 */       Configuration.texture.set("Blocks Block Texture Size", Integer.valueOf(16));
/*    */     }
/*  6 */     if (!Configuration.texture.contains("Blocks Texture Size")) {
/*  7 */       Configuration.texture.set("Blocks Texture Size", Integer.valueOf(256));
/*    */     }
/* 15 */     if (!Configuration.texture.contains("Plants Texture")) {
/* 16 */       Configuration.texture.set("Plants Texture", "http://dl.lynxdragon.com/rpgessentials/textures/plants.png");
/*    */     }
             if (!Configuration.texture.contains("Plants Block Texture Size")) {
/*  7 */       Configuration.texture.set("Plants Block Texture Size", Integer.valueOf(16));
/*    */     }
/*  6 */     if (!Configuration.texture.contains("Plants Texture Size")) {
/*  7 */       Configuration.texture.set("Plants Texture Size", Integer.valueOf(256));
/*    */     }
	}
}