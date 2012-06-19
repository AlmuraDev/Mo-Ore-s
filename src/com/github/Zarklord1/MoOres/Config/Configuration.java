/*     */ package com.github.Zarklord1.MoOres.Config;
/*     */ 
import com.github.Zarklord1.MoOres.MoOres;
import java.io.FileNotFoundException;
import java.io.IOException;

/*     */ public class Configuration
/*     */ {
/*  30 */   public static MyConfiguration config = new MyConfiguration();
/*  31 */   public static MyConfiguration block = new MyConfiguration();
/*  33 */   public static MyConfiguration generator = new MyConfiguration();
/*  34 */   public static MyConfiguration items = new MyConfiguration();
/*  41 */   public static MyConfiguration texture = new MyConfiguration();
            public static MyConfiguration recipe = new MyConfiguration();
/*     */ 
/*  47 */   static { 
              if (load(config, "Config.yml")) {
/*  48 */       config = MyConfiguration.loadConfiguration("plugins/MoOres/Config.yml");
/*  49 */       Config.set();
/*  50 */       save(config);
/*     */    }
              
/*  52 */     Config.set();
/*     */     try {
/*  54 */       config.save();
/*     */     } catch (Exception e) {
/*  56 */       e.printStackTrace();
/*     */     }
              if (load(recipe, "Recipes.yml")) {
/*  48 */       recipe = MyConfiguration.loadConfiguration("plugins/MoOres/Recipes.yml");
/*  49 */       RecipeConfig.set();
/*  50 */       save(recipe);
/*     */     }
/*     */ 
/*  62 */
/*     */     if (load(block, "Blocks.yml")) {
/*  60 */       block = MyConfiguration.loadConfiguration("plugins/MoOres/Blocks.yml");
/*  61 */       BlockConfig.set();
                ConfigWriter.setOres(block, "Custom Ores", "Original Ores");
/*  62 */       save(block);
/*     */     }

/*  64 */     BlockConfig.set();
/*     */     try {
/*  66 */      	block.save();
/*     */     } catch (Exception e) {
/*  68 */       e.printStackTrace();
/*     */     }

/*     */     if (load(generator, "Worldgenerator.yml")) {
/*  84 */       generator = MyConfiguration.loadConfiguration("plugins/MoOres/Worldgenerator.yml");
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
/*  95 */     if (load(items, "Items.yml")) {
/*  96 */       items = MyConfiguration.loadConfiguration("plugins/MoOres/Items.yml");
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
              if (load(texture, "Textures.yml")) {
/* 168 */       texture = MyConfiguration.loadConfiguration("plugins/MoOres/Textures.yml");
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