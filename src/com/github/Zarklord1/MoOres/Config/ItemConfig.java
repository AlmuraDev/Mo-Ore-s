/*     */ package com.github.Zarklord1.MoOres.Config;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ 
/*     */ public class ItemConfig
/*     */ {
/*     */   public static void set()
/*     */   {
/*  11 */     if (!Configuration.items.contains("Custom Food.Salad.texture url")) {
/*     */    	Configuration.items.set("Custom Food.Salad.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/food/salad.png");
/*     */     }
/*     */     if (!Configuration.items.contains("Custom Food.Salad.restore")) {
/*     */      	Configuration.items.set("Custom Food.Salad.restore", Integer.valueOf(2));
/*     */     } 
/*     */
/*  11 */     if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.texture url")) {
/*  11 */    	Configuration.items.set("Custom Fish.Raw Cave Trout.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/fish/cavetrout.png");
/*  11 */     }
/*  11 */     if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.restore")) {
/*  11 */     Configuration.items.set("Custom Fish.Raw Cave Trout.restore", Integer.valueOf(10));
/*  11 */     }
/*  11 */     if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.level")) {
/*  11 */      	Configuration.items.set("Custom Fish.Raw Cave Trout.level", Integer.valueOf(50));
/*  11 */     }
/*  11 */     if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.chance")) {
/*  11 */       Configuration.items.set("Custom Fish.Raw Cave Trout.chance", Integer.valueOf(50));
/*  11 */     }
/*     */
/*  65 */     if (!Configuration.items.contains("Custom Items.Flarite Ingot.texture url")) {
/*  66 */       Configuration.items.set("Custom Items.Flarite Ingot.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Flarite/Flartieingot.png");
/*     */     }
/*  68 */     if (!Configuration.items.contains("Custom Items.Flarite Ingot.furnace recipe1.amount")) {
/*  69 */       Configuration.items.set("Custom Items.Flarite Ingot.furnace recipe1.amount", Integer.valueOf(1));
/*     */     }
/*  71 */     if (!Configuration.items.contains("Custom Items.Flarite Ingot.furnace recipe1.ingredient")) {
/*  72 */       Configuration.items.set("Custom Items.Flarite Ingot.furnace recipe1.ingredient", "Flarite Ore");
/*     */     }
/*     */ 
/*  76 */     if (!Configuration.items.contains("Custom Items.Silver Ingot.texture url")) {
/*  77 */       Configuration.items.set("Custom Items.Silver Ingot.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/Silveringot.png");
/*     */     }
/*  79 */     if (!Configuration.items.contains("Custom Items.Silver Ingot.furnace recipe1.amount")) {
/*  80 */       Configuration.items.set("Custom Items.Silver Ingot.furnace recipe1.amount", Integer.valueOf(1));
/*     */     }
/*  82 */     if (!Configuration.items.contains("Custom Items.Silver Ingot.furnace recipe1.ingredient")) {
/*  83 */       Configuration.items.set("Custom Items.Silver Ingot.furnace recipe1.ingredient", "Silver Ore");
/*     */     }
/*     */ 
/*  87 */     if (!Configuration.items.contains("Custom Items.Ruby.texture url")) {
/*  88 */       Configuration.items.set("Custom Items.Ruby.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyDiamond.png");
/*     */     }
/*     */ 
/*  98 */     if (!Configuration.items.contains("Custom Items.Thermite Dust.texture url")) {
/*  99 */       Configuration.items.set("Custom Items.Thermite Dust.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Thermite/ThermiteDust.png");
/*     */     }
/*     */ 
/* 109 */     if (!Configuration.items.contains("Custom Items.Crystalite.texture url")) {
/* 110 */       Configuration.items.set("Custom Items.Crystalite.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/Crystalite.png");
/*     */     }
/*     */
/* 109 */     if (!Configuration.items.contains("Custom Items.Ruby Shaft.texture url")) {
/* 110 */       Configuration.items.set("Custom Items.Ruby Shaft.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/Shaft.png");
/*     */     }
/*     */     if (!Configuration.items.contains("Custom Items.Ruby Shaft.shaped recipe1.amount")) {
/* 313 */       Configuration.items.set("Custom Items.Ruby Shaft.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 315 */     if (!Configuration.items.contains("Custom Items.Ruby Shaft.shaped recipe1.ingredients")) {
/* 316 */       Configuration.items.set("Custom Items.Ruby Shaft.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,-,-", "266,Ruby,266", "-,265,-" }));
/*     */     }
/* 318 */     if (!Configuration.items.contains("Custom Items.Ruby Shaft.shaped recipe2.amount")) {
/* 319 */       Configuration.items.set("Custom Items.Ruby Shaft.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 321 */     if (!Configuration.items.contains("Custom Items.Ruby Shaft.shaped recipe2.ingredients")) {
/* 322 */       Configuration.items.set("Custom Items.Ruby Shaft.shaped recipe2.ingredients", Arrays.asList(new String[] { "266,Ruby,266", "-,265,-", "-,-,-" }));
/*     */     }
/*     */ 
/* 303 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.texture url")) {
/* 304 */       Configuration.items.set("Custom Tools.Silver Sword.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverSword.png");
/*     */     }
/* 306 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.durability")) {
/* 307 */       Configuration.items.set("Custom Tools.Silver Sword.durability", Integer.valueOf(650));
/*     */     }
/* 309 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.damage")) {
/* 310 */       Configuration.items.set("Custom Tools.Silver Sword.damage", Integer.valueOf(7));
/*     */     }
/* 312 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.shaped recipe1.amount")) {
/* 313 */       Configuration.items.set("Custom Tools.Silver Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 315 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.shaped recipe1.ingredients")) {
/* 316 */       Configuration.items.set("Custom Tools.Silver Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,-", "-,Silver Ingot,-", "-,280,-" }));
/*     */     }
/* 318 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.shaped recipe2.amount")) {
/* 319 */       Configuration.items.set("Custom Tools.Silver Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 321 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.shaped recipe2.ingredients")) {
/* 322 */       Configuration.items.set("Custom Tools.Silver Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Silver Ingot,-,-", "Silver Ingot,-,-", "280,-,-" }));
/*     */     }
/* 324 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.shaped recipe3.amount")) {
/* 325 */       Configuration.items.set("Custom Tools.Silver Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 327 */     if (!Configuration.items.contains("Custom Tools.Silver Sword.shaped recipe3.ingredients")) {
/* 328 */       Configuration.items.set("Custom Tools.Silver Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Silver Ingot", "-,-,Silver Ingot", "-,-,280" }));
/*     */     }
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/ShaftedSilverSword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).durability", Integer.valueOf(750));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).damage", Integer.valueOf(7));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,-", "-,Silver Ingot,-", "-,Ruby Shaft,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).shaped recipe2.ingredients", Arrays.asList(new String[] { "Silver Ingot,-,-", "Silver Ingot,-,-", "Ruby Shaft,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Silver Sword(Ruby).shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Silver Sword(Ruby).shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Silver Ingot", "-,-,Silver Ingot", "-,-,Ruby Shaft" }));
/*     */     }
/*     */ 
/*     */ 
/* 331 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.texture url")) {
/* 332 */       Configuration.items.set("Custom Tools.Silver Shovel.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverShovel.png");
/*     */     }
/* 334 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.durability")) {
/* 335 */       Configuration.items.set("Custom Tools.Silver Shovel.durability", Integer.valueOf(650));
/*     */     }
/* 337 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.shaped recipe1.amount")) {
/* 338 */       Configuration.items.set("Custom Tools.Silver Shovel.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 340 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.shaped recipe1.ingredients")) {
/* 341 */       Configuration.items.set("Custom Tools.Silver Shovel.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 343 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.shaped recipe2.amount")) {
/* 344 */       Configuration.items.set("Custom Tools.Silver Shovel.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 346 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.shaped recipe2.ingredients")) {
/* 347 */       Configuration.items.set("Custom Tools.Silver Shovel.shaped recipe2.ingredients", Arrays.asList(new String[] { "Silver Ingot,-,-", "280,-,-", "280,-,-" }));
/*     */     }
/* 349 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.shaped recipe3.amount")) {
/* 350 */       Configuration.items.set("Custom Tools.Silver Shovel.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 352 */     if (!Configuration.items.contains("Custom Tools.Silver Shovel.shaped recipe3.ingredients")) {
/* 353 */       Configuration.items.set("Custom Tools.Silver Shovel.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Silver Ingot", "-,-,280", "-,-,280" }));
/*     */     }
/*     */ 
/* 356 */     if (!Configuration.items.contains("Custom Tools.Silver Axe.texture url")) {
/* 357 */       Configuration.items.set("Custom Tools.Silver Axe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverAxe.png");
/*     */     }
/* 359 */     if (!Configuration.items.contains("Custom Tools.Silver Axe.durability")) {
/* 360 */       Configuration.items.set("Custom Tools.Silver Axe.durability", Integer.valueOf(650));
/*     */     }
/* 362 */     if (!Configuration.items.contains("Custom Tools.Silver Axe.shaped recipe1.amount")) {
/* 363 */       Configuration.items.set("Custom Tools.Silver Axe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 365 */     if (!Configuration.items.contains("Custom Tools.Silver Axe.shaped recipe1.ingredients")) {
/* 366 */       Configuration.items.set("Custom Tools.Silver Axe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Silver Ingot,Silver Ingot,-", "Silver Ingot,280,-", "-,-,-" }));
/*     */     }
/* 368 */     if (!Configuration.items.contains("Custom Tools.Silver Axe.shaped recipe2.amount")) {
/* 369 */       Configuration.items.set("Custom Tools.Silver Axe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 371 */     if (!Configuration.items.contains("Custom Tools.Silver Axe.shaped recipe2.ingredients")) {
/* 372 */       Configuration.items.set("Custom Tools.Silver Axe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,Silver Ingot", "-,280,Silver Ingot", "-,280,-" }));
/*     */     }
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Silver Pickaxe.texture url")) {
/* 586 */       Configuration.items.set("Custom Tools.Silver Pickaxe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/SilverPick.png");
/*     */     }
/* 588 */     if (!Configuration.items.contains("Custom Tools.Silver Pickaxe.durability")) {
/* 589 */       Configuration.items.set("Custom Tools.Silver Pickaxe.durability", Integer.valueOf(650));
/*     */     }
/* 591 */     if (!Configuration.items.contains("Custom Tools.Silver Pickaxe.shaped recipe1.amount")) {
/* 592 */       Configuration.items.set("Custom Tools.Silver Pickaxe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 594 */     if (!Configuration.items.contains("Custom Tools.Silver Pickaxe.shaped recipe1.ingredients")) {
/* 595 */       Configuration.items.set("Custom Tools.Silver Pickaxe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Silver,Silver,Silver", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/*     */ 
/* 388 */     if (!Configuration.items.contains("Custom Tools.Silver Hoe.texture url")) {
/* 389 */       Configuration.items.set("Custom Tools.Silver Hoe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Silver/Silverhoe.png");
/*     */     }
/* 391 */     if (!Configuration.items.contains("Custom Tools.Silver Hoe.durability")) {
/* 392 */       Configuration.items.set("Custom Tools.Silver Hoe.durability", Integer.valueOf(650));
/*     */     }
/* 394 */     if (!Configuration.items.contains("Custom Tools.Silver Hoe.shaped recipe1.amount")) {
/* 395 */       Configuration.items.set("Custom Tools.Silver Hoe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 397 */     if (!Configuration.items.contains("Custom Tools.Silver Hoe.shaped recipe1.ingredients")) {
/* 398 */       Configuration.items.set("Custom Tools.Silver Hoe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Silver Ingot,Silver Ingot,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 400 */     if (!Configuration.items.contains("Custom Tools.Silver Hoe.shaped recipe2.amount")) {
/* 401 */       Configuration.items.set("Custom Tools.Silver Hoe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 403 */     if (!Configuration.items.contains("Custom Tools.Silver Hoe.shaped recipe2.ingredients")) {
/* 404 */       Configuration.items.set("Custom Tools.Silver Hoe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,Silver Ingot", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 408 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Flarite Sword.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Flarite/flariteSword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Flarite Sword.durability", Integer.valueOf(700));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Flarite Sword.damage", Integer.valueOf(10));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Flarite Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Flarite Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Flarite Ingot,-", "-,Flarite Ingot,-", "-,280,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Flarite Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Flarite Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Flarite Ingot,-,-", "Flarite Ingot,-,-", "280,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Flarite Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword.shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Flarite Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Flarite Ingot", "-,-,Flarite Ingot", "-,-,280" }));
/*     */     }
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Flarite/ShaftedFlariteSword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).durability", Integer.valueOf(800));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).damage", Integer.valueOf(10));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Flarite Ingot,-", "-,Flarite Ingot,-", "-,Ruby Shaft,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).shaped recipe2.ingredients", Arrays.asList(new String[] { "Flarite Ingot,-,-", "Flarite Ingot,-,-", "Ruby Shaft,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Flarite Sword(Ruby).shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Flarite Sword(Ruby).shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Flarite Ingot", "-,-,Flarite Ingot", "-,-,Ruby Shaft" }));
/*     */     }
/*     */ 
/* 513 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.texture url")) {
/* 514 */       Configuration.items.set("Custom Tools.Ruby Sword.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubySword.png");
/*     */     }
/* 516 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.durability")) {
/* 517 */       Configuration.items.set("Custom Tools.Ruby Sword.durability", Integer.valueOf(1500));
/*     */     }
/* 519 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.damage")) {
/* 520 */       Configuration.items.set("Custom Tools.Ruby Sword.damage", Integer.valueOf(12));
/*     */     }
/* 522 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.shaped recipe1.amount")) {
/* 523 */       Configuration.items.set("Custom Tools.Ruby Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 525 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.shaped recipe1.ingredients")) {
/* 526 */       Configuration.items.set("Custom Tools.Ruby Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Ruby,-", "-,Ruby,-", "-,280,-" }));
/*     */     }
/* 528 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.shaped recipe2.amount")) {
/* 529 */       Configuration.items.set("Custom Tools.Ruby Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 531 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.shaped recipe2.ingredients")) {
/* 532 */       Configuration.items.set("Custom Tools.Ruby Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Ruby,-,-", "Ruby,-,-", "280,-,-" }));
/*     */     }
/* 534 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.shaped recipe3.amount")) {
/* 535 */       Configuration.items.set("Custom Tools.Ruby Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 537 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword.shaped recipe3.ingredients")) {
/* 538 */       Configuration.items.set("Custom Tools.Ruby Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Ruby", "-,-,Ruby", "-,-,280" }));
/*     */     }
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/ShaftedRubysword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).durability", Integer.valueOf(1600));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).damage", Integer.valueOf(10));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Ruby,-", "-,Ruby,-", "-,Ruby Shaft,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).shaped recipe2.ingredients", Arrays.asList(new String[] { "Ruby,-,-", "Ruby,-,-", "Ruby Shaft,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Ruby Sword(Ruby).shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Ruby Sword(Ruby).shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Ruby", "-,-,Ruby", "-,-,Ruby Shaft" }));
/*     */     }
/*     */ 

/*     */ 
/* 541 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.texture url")) {
/* 542 */       Configuration.items.set("Custom Tools.Ruby Shovel.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyShovel.png");
/*     */     }
/* 544 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.durability")) {
/* 545 */       Configuration.items.set("Custom Tools.Ruby Shovel.durability", Integer.valueOf(1500));
/*     */     }
/* 547 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.shaped recipe1.amount")) {
/* 548 */       Configuration.items.set("Custom Tools.Ruby Shovel.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 550 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.shaped recipe1.ingredients")) {
/* 551 */       Configuration.items.set("Custom Tools.Ruby Shovel.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Ruby,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 553 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.shaped recipe2.amount")) {
/* 554 */       Configuration.items.set("Custom Tools.Ruby Shovel.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 556 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.shaped recipe2.ingredients")) {
/* 557 */       Configuration.items.set("Custom Tools.Ruby Shovel.shaped recipe2.ingredients", Arrays.asList(new String[] { "Ruby,-,-", "280,-,-", "280,-,-" }));
/*     */     }
/* 559 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.shaped recipe3.amount")) {
/* 560 */       Configuration.items.set("Custom Tools.Ruby Shovel.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 562 */     if (!Configuration.items.contains("Custom Tools.Ruby Shovel.shaped recipe3.ingredients")) {
/* 563 */       Configuration.items.set("Custom Tools.Ruby Shovel.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Ruby", "-,-,280", "-,-,280" }));
/*     */     }
/*     */ 
/* 566 */     if (!Configuration.items.contains("Custom Tools.Ruby Axe.texture url")) {
/* 567 */       Configuration.items.set("Custom Tools.Ruby Axe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyAxe.png");
/*     */     }
/* 569 */     if (!Configuration.items.contains("Custom Tools.Ruby Axe.durability")) {
/* 570 */       Configuration.items.set("Custom Tools.Ruby Axe.durability", Integer.valueOf(1500));
/*     */     }
/* 572 */     if (!Configuration.items.contains("Custom Tools.Ruby Axe.shaped recipe1.amount")) {
/* 573 */       Configuration.items.set("Custom Tools.Ruby Axe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 575 */     if (!Configuration.items.contains("Custom Tools.Ruby Axe.shaped recipe1.ingredients")) {
/* 576 */       Configuration.items.set("Custom Tools.Ruby Axe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Ruby,Ruby,-", "Ruby,280,-", "-,280,-" }));
/*     */     }
/* 578 */     if (!Configuration.items.contains("Custom Tools.Ruby Axe.shaped recipe2.amount")) {
/* 579 */       Configuration.items.set("Custom Tools.Ruby Axe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 581 */     if (!Configuration.items.contains("Custom Tools.Ruby Axe.shaped recipe2.ingredients")) {
/* 582 */       Configuration.items.set("Custom Tools.Ruby Axe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Ruby,Ruby", "-,280,Ruby", "-,280,-" }));
/*     */     }
/*     */ 
/* 585 */     if (!Configuration.items.contains("Custom Tools.Ruby Pickaxe.texture url")) {
/* 586 */       Configuration.items.set("Custom Tools.Ruby Pickaxe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyPick.png");
/*     */     }
/* 588 */     if (!Configuration.items.contains("Custom Tools.Ruby Pickaxe.durability")) {
/* 589 */       Configuration.items.set("Custom Tools.Ruby Pickaxe.durability", Integer.valueOf(1500));
/*     */     }
/* 591 */     if (!Configuration.items.contains("Custom Tools.Ruby Pickaxe.shaped recipe1.amount")) {
/* 592 */       Configuration.items.set("Custom Tools.Ruby Pickaxe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 594 */     if (!Configuration.items.contains("Custom Tools.Ruby Pickaxe.shaped recipe1.ingredients")) {
/* 595 */       Configuration.items.set("Custom Tools.Ruby Pickaxe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Ruby,Ruby,Ruby", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 598 */     if (!Configuration.items.contains("Custom Tools.Ruby Hoe.texture url")) {
/* 599 */       Configuration.items.set("Custom Tools.Ruby Hoe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Ruby/RubyHoe.png");
/*     */     }
/* 601 */     if (!Configuration.items.contains("Custom Tools.Ruby Hoe.durability")) {
/* 602 */       Configuration.items.set("Custom Tools.Ruby Hoe.durability", Integer.valueOf(1500));
/*     */     }
/* 604 */     if (!Configuration.items.contains("Custom Tools.Ruby Hoe.shaped recipe1.amount")) {
/* 605 */       Configuration.items.set("Custom Tools.Ruby Hoe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 607 */     if (!Configuration.items.contains("Custom Tools.Ruby Hoe.shaped recipe1.ingredients")) {
/* 608 */       Configuration.items.set("Custom Tools.Ruby Hoe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Ruby,Ruby,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 610 */     if (!Configuration.items.contains("Custom Tools.Ruby Hoe.shaped recipe2.amount")) {
/* 611 */       Configuration.items.set("Custom Tools.Ruby Hoe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 613 */     if (!Configuration.items.contains("Custom Tools.Ruby Hoe.shaped recipe2.ingredients")) {
/* 614 */       Configuration.items.set("Custom Tools.Ruby Hoe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Ruby,Ruby", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 618 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.texture url")) {
/* 619 */       Configuration.items.set("Custom Tools.Crystalite Sword.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteSword.png");
/*     */     }
/* 621 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.durability")) {
/* 622 */       Configuration.items.set("Custom Tools.Crystalite Sword.durability", Integer.valueOf(1000));
/*     */     }
/* 624 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.damage")) {
/* 625 */       Configuration.items.set("Custom Tools.Crystalite Sword.damage", Integer.valueOf(11));
/*     */     }
/* 627 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.shaped recipe1.amount")) {
/* 628 */       Configuration.items.set("Custom Tools.Crystalite Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 630 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.shaped recipe1.ingredients")) {
/* 631 */       Configuration.items.set("Custom Tools.Crystalite Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Crystalite,-", "-,Crystalite,-", "-,280,-" }));
/*     */     }
/* 633 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.shaped recipe2.amount")) {
/* 634 */       Configuration.items.set("Custom Tools.Crystalite Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 636 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.shaped recipe2.ingredients")) {
/* 637 */       Configuration.items.set("Custom Tools.Crystalite Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Crystalite,-,-", "Crystalite,-,-", "280,-,-" }));
/*     */     }
/* 639 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.shaped recipe3.amount")) {
/* 640 */       Configuration.items.set("Custom Tools.Crystalite Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 642 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword.shaped recipe3.ingredients")) {
/* 643 */       Configuration.items.set("Custom Tools.Crystalite Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Crystalite", "-,-,Crystalite", "-,-,280" }));
/*     */     }
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/ShaftedCrystaliteSword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).durability", Integer.valueOf(1100));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).damage", Integer.valueOf(11));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Crystalite,-", "-,Crystalite,-", "-,Ruby Shaft,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).shaped recipe2.ingredients", Arrays.asList(new String[] { "Crystalite,-,-", "Crystalite,-,-", "Ruby Shaft,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Crystalite Sword(Ruby).shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Crystalite Sword(Ruby).shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Crystalite", "-,-,Crystalite", "-,-,Ruby Shaft" }));
/*     */     }
/*     */ 
/*     */ 
/* 646 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.texture url")) {
/* 647 */       Configuration.items.set("Custom Tools.Crystalite Shovel.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteShovel.png");
/*     */     }
/* 649 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.durability")) {
/* 650 */       Configuration.items.set("Custom Tools.Crystalite Shovel.durability", Integer.valueOf(1000));
/*     */     }
/* 652 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.shaped recipe1.amount")) {
/* 653 */       Configuration.items.set("Custom Tools.Crystalite Shovel.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 655 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.shaped recipe1.ingredients")) {
/* 656 */       Configuration.items.set("Custom Tools.Crystalite Shovel.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Crystalite,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 658 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.shaped recipe2.amount")) {
/* 659 */       Configuration.items.set("Custom Tools.Crystalite Shovel.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 661 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.shaped recipe2.ingredients")) {
/* 662 */       Configuration.items.set("Custom Tools.Crystalite Shovel.shaped recipe2.ingredients", Arrays.asList(new String[] { "Crystalite,-,-", "280,-,-", "280,-,-" }));
/*     */     }
/* 664 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.shaped recipe3.amount")) {
/* 665 */       Configuration.items.set("Custom Tools.Crystalite Shovel.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 667 */     if (!Configuration.items.contains("Custom Tools.Crystalite Shovel.shaped recipe3.ingredients")) {
/* 668 */       Configuration.items.set("Custom Tools.Crystalite Shovel.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Crystalite", "-,-,280", "-,-,280" }));
/*     */     }
/*     */ 
/* 671 */     if (!Configuration.items.contains("Custom Tools.Crystalite Axe.texture url")) {
/* 672 */       Configuration.items.set("Custom Tools.Crystalite Axe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystaliteAxe.png");
/*     */     }
/* 674 */     if (!Configuration.items.contains("Custom Tools.Crystalite Axe.durability")) {
/* 675 */       Configuration.items.set("Custom Tools.Crystalite Axe.durability", Integer.valueOf(1000));
/*     */     }
/* 677 */     if (!Configuration.items.contains("Custom Tools.Crystalite Axe.shaped recipe1.amount")) {
/* 678 */       Configuration.items.set("Custom Tools.Crystalite Axe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 680 */     if (!Configuration.items.contains("Custom Tools.Crystalite Axe.shaped recipe1.ingredients")) {
/* 681 */       Configuration.items.set("Custom Tools.Crystalite Axe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Crystalite,Crystalite,-", "Crystalite,280,-", "-,280,-" }));
/*     */     }
/* 683 */     if (!Configuration.items.contains("Custom Tools.Crystalite Axe.shaped recipe2.amount")) {
/* 684 */       Configuration.items.set("Custom Tools.Crystalite Axe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 686 */     if (!Configuration.items.contains("Custom Tools.Crystalite Axe.shaped recipe2.ingredients")) {
/* 687 */       Configuration.items.set("Custom Tools.Crystalite Axe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-Crystalite,Crystalite", "-,280,Crystalite", "-,280,-" }));
/*     */     }
/*     */ 
/* 690 */     if (!Configuration.items.contains("Custom Tools.Crystalite Pickaxe.texture url")) {
/* 691 */       Configuration.items.set("Custom Tools.Crystalite Pickaxe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/CrystalitePick.png");
/*     */     }
/* 693 */     if (!Configuration.items.contains("Custom Tools.Crystalite Pickaxe.durability")) {
/* 694 */       Configuration.items.set("Custom Tools.Crystalite Pickaxe.durability", Integer.valueOf(1000));
/*     */     }
/* 696 */     if (!Configuration.items.contains("Custom Tools.Crystalite Pickaxe.shaped recipe1.amount")) {
/* 697 */       Configuration.items.set("Custom Tools.Crystalite Pickaxe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 699 */     if (!Configuration.items.contains("Custom Tools.Crystalite Pickaxe.shaped recipe1.ingredients")) {
/* 700 */       Configuration.items.set("Custom Tools.Crystalite Pickaxe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Crystalite,Crystalite,Crystalite", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 703 */     if (!Configuration.items.contains("Custom Tools.Crystalite Hoe.texture url")) {
/* 704 */       Configuration.items.set("Custom Tools.Crystalite Hoe.texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Crystalite/Cyrstalitehoe.png");
/*     */     }
/* 706 */     if (!Configuration.items.contains("Custom Tools.Crystalite Hoe.durability")) {
/* 707 */       Configuration.items.set("Custom Tools.Crystalite Hoe.durability", Integer.valueOf(1000));
/*     */     }
/* 709 */     if (!Configuration.items.contains("Custom Tools.Crystalite Hoe.shaped recipe1.amount")) {
/* 710 */       Configuration.items.set("Custom Tools.Crystalite Hoe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 712 */     if (!Configuration.items.contains("Custom Tools.Crystalite Hoe.shaped recipe1.ingredients")) {
/* 713 */       Configuration.items.set("Custom Tools.Crystalite Hoe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Crystalite,Crystalite,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 715 */     if (!Configuration.items.contains("Custom Tools.Crystalite Hoe.shaped recipe2.amount")) {
/* 716 */       Configuration.items.set("Custom Tools.Crystalite Hoe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 718 */     if (!Configuration.items.contains("Custom Tools.Crystalite Hoe.shaped recipe2.ingredients")) {
/* 719 */       Configuration.items.set("Custom Tools.Crystalite Hoe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Crystalite,Crystalite", "-,280,-", "-,280,-" }));
/*     */     }
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Other/ShaftedIronSword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).durability", Integer.valueOf(351));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).damage", Integer.valueOf(6));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).shaped recipe1.ingredients", Arrays.asList(new String[] { "-,265,-", "-,265,-", "-,Ruby Shaft,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).shaped recipe2.ingredients", Arrays.asList(new String[] { "265,-,-", "265,-,-", "Ruby Shaft,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Iron Sword(Ruby).shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Iron Sword(Ruby).shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,265", "-,-,265", "-,-,Ruby Shaft" }));
/*     */     }
/*     */ 
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Other/ShaftedGoldSword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).durability", Integer.valueOf(133));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).damage", Integer.valueOf(4));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).shaped recipe1.ingredients", Arrays.asList(new String[] { "-,266,-", "-,266,-", "-,Ruby Shaft,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).shaped recipe2.ingredients", Arrays.asList(new String[] { "266,-,-", "266,-,-", "Ruby Shaft,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Gold Sword(Ruby).shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Gold Sword(Ruby).shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,266", "-,-,266", "-,-,Ruby Shaft" }));
/*     */     }
/*     */ 
/*     */
/*     */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).texture url", "http://dl.dropbox.com/u/77733573/Plugins/MoOres1.6/Other/ShaftedDiamondSword.png");
/* 411 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).durability", Integer.valueOf(1651));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).damage", Integer.valueOf(7));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).shaped recipe1.ingredients", Arrays.asList(new String[] { "-,264,-", "-,264,-", "-,Ruby Shaft,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).shaped recipe2.ingredients", Arrays.asList(new String[] { "264,-,-", "264,-,-", "Ruby Shaft,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Diamond Sword(Ruby).shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Diamond Sword(Ruby).shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,264", "-,-,264", "-,-,Ruby Shaft" }));
/*     */     }
/*     */ 
}
/*     */ }
}
