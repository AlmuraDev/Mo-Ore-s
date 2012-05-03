/*     */ package com.github.Zarklord1.MoOres.Config;
/*     */ 
/*     */ import java.io.FileNotFoundException;
import java.io.IOException;

import com.github.Zarklord1.MoOres.MoOres;

/*     */ public class Configuration
/*     */ {
/*  30 */   public static MyConfiguration config = new MyConfiguration();
/*  31 */   public static MyConfiguration Ores = new MyConfiguration();
/*  31 */   public static MyConfiguration Blocks = new MyConfiguration();
/*  33 */   public static MyConfiguration generator = new MyConfiguration();
/*  34 */   public static MyConfiguration items = new MyConfiguration();
/*  41 */   public static MyConfiguration texture = new MyConfiguration();
/*     */ 
/*  47 */   static { if (load(config, "config.yml")) {
/*  48 */       config = MyConfiguration.loadConfiguration("plugins/Mo Ores/config.yml");
/*  49 */       Config.set();
/*  50 */       save(config);
/*     */     }
/*  52 */     Config.set();
/*     */     try {
/*  54 */       config.save();
/*     */     } catch (Exception e) {
/*  56 */       e.printStackTrace();
/*     */     }
/*     */ 
/*  59 */     if (load(Ores, "Ores.yml")) {
/*  60 */       Ores = MyConfiguration.loadConfiguration("plugins/Mo Ores/Ores.yml");
/*  61 */       OresConfig.set();
/*  62 */       save(Ores);
/*     */     }
/*  62 */
/*     */     if (load(Blocks, "blocks.yml")) {
/*  60 */       Blocks = MyConfiguration.loadConfiguration("plugins/Mo Ores/blocks.yml");
/*  61 */       BlockConfig.set();
/*  62 */       save(Blocks);
/*     */     }

/*  64 */     BlockConfig.set();
/*     */     try {
/*  66 */      	Blocks.save();
/*     */     } catch (Exception e) {
/*  68 */       e.printStackTrace();
/*     */     }

/*     */     if (load(generator, "worldgenerator.yml")) {
/*  84 */       generator = MyConfiguration.loadConfiguration("plugins/Mo Ores/worldgenerator.yml");
/*  85 */       GeneratorConfig.set();
/*  86 */       save(generator);
/*     */     }
/*  88 */     GeneratorConfig.set();
/*     */     try {
/*  90 */       generator.save();
/*     */     } catch (Exception e) {
/*  92 */       e.printStackTrace();
/*     */     }
/*     */ 
/*  95 */     if (load(items, "items.yml")) {
/*  96 */       items = MyConfiguration.loadConfiguration("plugins/Mo Ores/items.yml");
/*  97 */       ItemConfig.set();
/*  98 */       save(items);
/*     */     }
/* 100 */     ItemConfig.set();
/*     */     try {
/* 102 */       items.save();
/*     */     } catch (Exception e) {
/* 104 */       e.printStackTrace();
/*     */     }
/*     */ 
			  if (load(texture, "textures.yml")) {
/* 168 */       texture = MyConfiguration.loadConfiguration("plugins/Mo Ores/textures.yml");
/* 169 */       TextureConfig.set();
/* 170 */       save(texture);
/*     */     }
/* 172 */     TextureConfig.set();
/*     */     try {
/* 174 */       texture.save();
/*     */     } catch (Exception e) {
/* 176 */       e.printStackTrace();
/*     */     }

 }
private static void complainFileCreation(String filename) {
		 MoOres.log.severe("[Mo Ores] On file " + filename + ":");
	     MoOres.log.severe("[Mo Ores] Could NOT create default files! Did you restrict permissions?");
	
}
private static boolean load(MyConfiguration y, String name) {
	try {
		       y.load("plugins/MoOres/" + name);
		     } catch (FileNotFoundException e) {
		       return true;
		     } catch (Exception e) {
		       complain(name);
		     }
		     return false;
}
private static void complain(String filename) {
	MoOres.log.severe("[Mo Ores] On file " + filename + ":");
	MoOres.log.severe("[Mo Ores] Invalid configuration! Did you use tabs or restrict permissions?");
	
}
private static void save(MyConfiguration y) {
	try {
		       y.save();
		       try {
		         y.load("plugins/MoOres/" + y.getFilename());
		      } catch (Exception localException) {
		      }
		       exclaim(y.getFilename());
		     } catch (IOException e) {
		       complainFileCreation(y.getFilename());
		     }
	}
private static void exclaim(String filename) {
	 MoOres.log.info("[Mo Ores] Saved file " + filename + "!");
	
}

public static void start()
   {
     MoOres.log.info("[Mo Ores] Static Configuration loading...");
   }
}