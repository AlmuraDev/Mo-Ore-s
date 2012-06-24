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
              if (load(Configuration.config, "Config.yml")) {
/*  48 */       Configuration.config = MyConfiguration.loadConfiguration("plugins/MoOres/Config.yml");
/*  49 */       Config.set();
/*  50 */       save(Configuration.config);
/*     */    }
              
              if (load(Configuration.recipe, "Recipes.yml")) {
/*  48 */       Configuration.recipe = MyConfiguration.loadConfiguration("plugins/MoOres/Recipes.yml");
/*  49 */       ConfigWriter.setRecipes(Configuration.recipe, "Furnace Recipes", "Shapeless Recipes", "Shaped Recipes");
/*  50 */       save(Configuration.recipe);
/*     */     }
/*     */ 
/*  62 */
/*     */     if (load(Configuration.block, "Blocks.yml")) {
/*  60 */       Configuration.block = MyConfiguration.loadConfiguration("plugins/MoOres/Blocks.yml");
/*  61 */       BlockConfig.set();
                ConfigWriter.setOres(Configuration.block, "Custom Ores", "Original Ores");
/*  62 */       save(Configuration.block);
/*     */     }

/*  64 */     
/*     */     if (load(Configuration.generator, "Worldgenerator.yml")) {
/*  84 */       Configuration.generator = MyConfiguration.loadConfiguration("plugins/MoOres/Worldgenerator.yml");
/*  85 */       GeneratorConfig.set();
/*  86 */       save(Configuration.generator);
/*     */     }
/*  88 */     
/*     */ 
/*  95 */     if (load(Configuration.items, "Items.yml")) {
/*  96 */       Configuration.items = MyConfiguration.loadConfiguration("plugins/MoOres/Items.yml");
/*  97 */       ItemConfig.set();
/*  98 */       save(Configuration.items);
/*     */     }
/*     */ 
              if (load(Configuration.texture, "Textures.yml")) {
/* 168 */       Configuration.texture = MyConfiguration.loadConfiguration("plugins/MoOres/Textures.yml");
/* 169 */       TextureConfig.set();
/* 170 */       save(Configuration.texture);
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