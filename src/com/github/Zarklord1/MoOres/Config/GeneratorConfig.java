/*    */ package com.github.Zarklord1.MoOres.Config;
/*    */ 
/*    */ public class GeneratorConfig
/*    */ {
/*    */   public static void set()
/*    */   {
			 if (!Configuration.generator.contains("# For more info on world Generation go here:")) {
				 Configuration.generator.set("# For more info on world Generation go here:", null);
			 }
/*  8 */     if (!Configuration.generator.contains("Generator.Biomes.Desert")) {
/*  9 */       Configuration.generator.set("Generator.Biomes.Desert", Boolean.valueOf(true));
/*    */     }
/* 11 */     if (!Configuration.generator.contains("Generator.Biomes.Beach")) {
/* 12 */       Configuration.generator.set("Generator.Biomes.Beach", Boolean.valueOf(true));
/*    */     }
/* 14 */     if (!Configuration.generator.contains("Generator.Biomes.Sea")) {
/* 15 */       Configuration.generator.set("Generator.Biomes.Sea", Boolean.valueOf(true));
/*    */     }
/* 17 */     if (!Configuration.generator.contains("Generator.Biomes.Mushroom Island")) {
/* 18 */       Configuration.generator.set("Generator.Biomes.Mushroom Island", Boolean.valueOf(true));
/*    */     }
/* 20 */     if (!Configuration.generator.contains("Generator.Structures.caves")) {
/* 21 */       Configuration.generator.set("Generator.Structures.caves", Boolean.valueOf(true));
/*    */     }
/*    */ 
/* 25 */     if (!Configuration.generator.contains("Generator.Ores.Custom")) {
/* 26 */       Configuration.generator.set("Generator.Ores.Custom", Boolean.valueOf(true));
/*    */     }
/* 28 */     if (!Configuration.generator.contains("Generator.Ores.Original")) {
/* 29 */       Configuration.generator.set("Generator.Ores.Original", Boolean.valueOf(true));
/*    */     }
/*    */ 
/* 32 */     if (!Configuration.generator.contains("Generator.Plants.Grass")) {
/* 33 */       Configuration.generator.set("Generator.Plants.Grass", Boolean.valueOf(true));
/*    */     }
/* 35 */     if (!Configuration.generator.contains("Generator.Plants.Flowers")) {
/* 36 */       Configuration.generator.set("Generator.Plants.Flowers", Boolean.valueOf(true));
/*    */     }
/* 38 */     if (!Configuration.generator.contains("Generator.Plants.Cacti")) {
/* 39 */       Configuration.generator.set("Generator.Plants.Cacti", Boolean.valueOf(true));
/*    */     }
/* 41 */     if (!Configuration.generator.contains("Generator.Plants.Pumpkins and Melons")) {
/* 42 */       Configuration.generator.set("Generator.Plants.Pumpkins and Melons", Boolean.valueOf(true));
/*    */     }
/* 44 */     if (!Configuration.generator.contains("Generator.Plants.Sugar Cane")) {
/* 45 */       Configuration.generator.set("Generator.Plants.Sugar Cane", Boolean.valueOf(true));
/*    */     }
/* 47 */     if (!Configuration.generator.contains("Generator.Plants.Trees")) {
/* 48 */       Configuration.generator.set("Generator.Plants.Trees", Boolean.valueOf(true));
/*    */     }
/* 50 */     if (!Configuration.generator.contains("Generator.Plants.Mushrooms")) {
/* 51 */       Configuration.generator.set("Generator.Plants.Mushrooms", Boolean.valueOf(true));
/*    */   	 }
	}
}