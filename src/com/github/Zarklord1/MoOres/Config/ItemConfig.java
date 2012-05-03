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
/*     */  	  }
/*     */  	  if (!Configuration.items.contains("Custom Food.Salad.restore")) {
/*     */      	Configuration.items.set("Custom Food.Salad.restore", Integer.valueOf(2));
/*     */	  } 
/*     */
/*  11 */     if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.texture url")) {
/*  11 */    	Configuration.items.set("Custom Fish.Raw Cave Trout.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/fish/cavetrout.png");
/*  11 */  	  }
/*  11 */	  if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.restore")) {
/*  11 */ 		Configuration.items.set("Custom Fish.Raw Cave Trout.restore", Integer.valueOf(10));
/*  11 */     }
/*  11 */  	  if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.level")) {
/*  11 */		Configuration.items.set("Custom Fish.Raw Cave Trout.level", Integer.valueOf(50));
/*  11 */  	  }
/*  11 */  	  if (!Configuration.items.contains("Custom Fish.Raw Cave Trout.chance")) {
/*  11 */  		Configuration.items.set("Custom Fish.Raw Cave Trout.chance", Integer.valueOf(5));
/*  11 */ 	  }
/*     */
/*  65 */     if (!Configuration.items.contains("Custom Items.Flarite Ingot.texture url")) {
/*  66 */       Configuration.items.set("Custom Items.Flarite Ingot.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/ingots/Adamantineingot.png");
/*     */     }
/*  68 */     if (!Configuration.items.contains("Custom Items.Flarite Ingot.furnace recipe1.amount")) {
/*  69 */       Configuration.items.set("Custom Items.Flarite Ingot.furnace recipe1.amount", Integer.valueOf(1));
/*     */     }
/*  71 */     if (!Configuration.items.contains("Custom Items.Flarite Ingot.furnace recipe1.ingredient")) {
/*  72 */       Configuration.items.set("Custom Items.Flarite Ingot.furnace recipe1.ingredient", "Flarite Ore");
/*     */     }
/*     */ 
/*  76 */     if (!Configuration.items.contains("Custom Items.Silver Ingot.texture url")) {
/*  77 */       Configuration.items.set("Custom Items.Silver Ingot.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/ingots/Iridiumnugget.png");
/*     */     }
/*  79 */     if (!Configuration.items.contains("Custom Items.Silver Ingot.furnace recipe1.amount")) {
/*  80 */       Configuration.items.set("Custom Items.Silver Ingot.furnace recipe1.amount", Integer.valueOf(1));
/*     */     }
/*  82 */     if (!Configuration.items.contains("Custom Items.Silver Ingot.furnace recipe1.ingredient")) {
/*  83 */       Configuration.items.set("Custom Items.Silver Ingot.furnace recipe1.ingredient", "Silver Ore");
/*     */     }
/*     */ 
/*  87 */     if (!Configuration.items.contains("Custom Items.Ruby.texture url")) {
/*  88 */       Configuration.items.set("Custom Items.Ruby.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/ingots/Iridiumingot.png");
/*     */     }
/*     */ 
/*  98 */     if (!Configuration.items.contains("Custom Items.Thermite Dust.texture url")) {
/*  99 */       Configuration.items.set("Custom Items.Thermite Dust.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/ingots/Mithrilingot.png");
/*     */     }
/*     */ 
/* 109 */     if (!Configuration.items.contains("Custom Items.Crystalite.texture url")) {
/* 110 */       Configuration.items.set("Custom Items.Crystalite.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/ingots/Verditeingot.png");
/*     */     }
/*     */ 
/* 303 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.texture url")) {
/* 304 */       Configuration.items.set("Custom Tools.Adamantine Sword.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Adamantinesword.png");
/*     */     }
/* 306 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.durability")) {
/* 307 */       Configuration.items.set("Custom Tools.Adamantine Sword.durability", Integer.valueOf(20));
/*     */     }
/* 309 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.damage")) {
/* 310 */       Configuration.items.set("Custom Tools.Adamantine Sword.damage", Integer.valueOf(10));
/*     */     }
/* 312 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.shaped recipe1.amount")) {
/* 313 */       Configuration.items.set("Custom Tools.Adamantine Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 315 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.shaped recipe1.ingredients")) {
/* 316 */       Configuration.items.set("Custom Tools.Adamantine Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,-", "-,Silver Ingot,-", "-,280,-" }));
/*     */     }
/* 318 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.shaped recipe2.amount")) {
/* 319 */       Configuration.items.set("Custom Tools.Adamantine Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 321 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.shaped recipe2.ingredients")) {
/* 322 */       Configuration.items.set("Custom Tools.Adamantine Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Silver Ingot,-,-", "Silver Ingot,-,-", "280,-,-" }));
/*     */     }
/* 324 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.shaped recipe3.amount")) {
/* 325 */       Configuration.items.set("Custom Tools.Adamantine Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 327 */     if (!Configuration.items.contains("Custom Tools.Adamantine Sword.shaped recipe3.ingredients")) {
/* 328 */       Configuration.items.set("Custom Tools.Adamantine Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Silver Ingot", "-,-,Silver Ingot", "-,-,280" }));
/*     */     }
/*     */ 
/* 331 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.texture url")) {
/* 332 */       Configuration.items.set("Custom Tools.Adamantine Shovel.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Adamantineshovel.png");
/*     */     }
/* 334 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.durability")) {
/* 335 */       Configuration.items.set("Custom Tools.Adamantine Shovel.durability", Integer.valueOf(20));
/*     */     }
/* 337 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.shaped recipe1.amount")) {
/* 338 */       Configuration.items.set("Custom Tools.Adamantine Shovel.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 340 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.shaped recipe1.ingredients")) {
/* 341 */       Configuration.items.set("Custom Tools.Adamantine Shovel.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 343 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.shaped recipe2.amount")) {
/* 344 */       Configuration.items.set("Custom Tools.Adamantine Shovel.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 346 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.shaped recipe2.ingredients")) {
/* 347 */       Configuration.items.set("Custom Tools.Adamantine Shovel.shaped recipe2.ingredients", Arrays.asList(new String[] { "Silver Ingot,-,-", "280,-,-", "280,-,-" }));
/*     */     }
/* 349 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.shaped recipe3.amount")) {
/* 350 */       Configuration.items.set("Custom Tools.Adamantine Shovel.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 352 */     if (!Configuration.items.contains("Custom Tools.Adamantine Shovel.shaped recipe3.ingredients")) {
/* 353 */       Configuration.items.set("Custom Tools.Adamantine Shovel.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Silver Ingot", "-,-,280", "-,-,280" }));
/*     */     }
/*     */ 
/* 356 */     if (!Configuration.items.contains("Custom Tools.Adamantine Axe.texture url")) {
/* 357 */       Configuration.items.set("Custom Tools.Adamantine Axe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Adamantineaxe.png");
/*     */     }
/* 359 */     if (!Configuration.items.contains("Custom Tools.Adamantine Axe.durability")) {
/* 360 */       Configuration.items.set("Custom Tools.Adamantine Axe.durability", Integer.valueOf(20));
/*     */     }
/* 362 */     if (!Configuration.items.contains("Custom Tools.Adamantine Axe.shaped recipe1.amount")) {
/* 363 */       Configuration.items.set("Custom Tools.Adamantine Axe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 365 */     if (!Configuration.items.contains("Custom Tools.Adamantine Axe.shaped recipe1.ingredients")) {
/* 366 */       Configuration.items.set("Custom Tools.Adamantine Axe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Silver Ingot,Silver Ingot,-", "Silver Ingot,280,-", "-,-,-" }));
/*     */     }
/* 368 */     if (!Configuration.items.contains("Custom Tools.Adamantine Axe.shaped recipe2.amount")) {
/* 369 */       Configuration.items.set("Custom Tools.Adamantine Axe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 371 */     if (!Configuration.items.contains("Custom Tools.Adamantine Axe.shaped recipe2.ingredients")) {
/* 372 */       Configuration.items.set("Custom Tools.Adamantine Axe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,Silver Ingot", "-,280,Silver Ingot", "-,280,-" }));
/*     */     }
/*     */ 
/* 375 */     if (!Configuration.items.contains("Custom Tools.Adamantine Pickaxe.texture url")) {
/* 376 */       Configuration.items.set("Custom Tools.Adamantine Pickaxe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Adamantinepick.png");
/*     */     }
/* 378 */     if (!Configuration.items.contains("Custom Tools.Adamantine Pickaxe.durability")) {
/* 379 */       Configuration.items.set("Custom Tools.Adamantine Pickaxe.durability", Integer.valueOf(20));
/*     */     }
/* 381 */     if (!Configuration.items.contains("Custom Tools.Adamantine Pickaxe.shaped recipe1.amount")) {
/* 382 */       Configuration.items.set("Custom Tools.Adamantine Pickaxe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 384 */     if (!Configuration.items.contains("Custom Tools.Adamantine Pickaxe.shaped recipe1.ingredients")) {
/* 385 */       Configuration.items.set("Custom Tools.Adamantine Pickaxe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Silver Ingot,Silver Ingot,Silver Ingot", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 388 */     if (!Configuration.items.contains("Custom Tools.Adamantine Hoe.texture url")) {
/* 389 */       Configuration.items.set("Custom Tools.Adamantine Hoe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Adamantinehoe.png");
/*     */     }
/* 391 */     if (!Configuration.items.contains("Custom Tools.Adamantine Hoe.durability")) {
/* 392 */       Configuration.items.set("Custom Tools.Adamantine Hoe.durability", Integer.valueOf(20));
/*     */     }
/* 394 */     if (!Configuration.items.contains("Custom Tools.Adamantine Hoe.shaped recipe1.amount")) {
/* 395 */       Configuration.items.set("Custom Tools.Adamantine Hoe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 397 */     if (!Configuration.items.contains("Custom Tools.Adamantine Hoe.shaped recipe1.ingredients")) {
/* 398 */       Configuration.items.set("Custom Tools.Adamantine Hoe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Silver Ingot,Silver Ingot,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 400 */     if (!Configuration.items.contains("Custom Tools.Adamantine Hoe.shaped recipe2.amount")) {
/* 401 */       Configuration.items.set("Custom Tools.Adamantine Hoe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 403 */     if (!Configuration.items.contains("Custom Tools.Adamantine Hoe.shaped recipe2.ingredients")) {
/* 404 */       Configuration.items.set("Custom Tools.Adamantine Hoe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Silver Ingot,Silver Ingot", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 408 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.texture url")) {
/* 409 */       Configuration.items.set("Custom Tools.Iridium Sword.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Iridiumsword.png");
/*     */     }
/* 411 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.durability")) {
/* 412 */       Configuration.items.set("Custom Tools.Iridium Sword.durability", Integer.valueOf(20));
/*     */     }
/* 414 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.damage")) {
/* 415 */       Configuration.items.set("Custom Tools.Iridium Sword.damage", Integer.valueOf(8));
/*     */     }
/* 417 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.shaped recipe1.amount")) {
/* 418 */       Configuration.items.set("Custom Tools.Iridium Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 420 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.shaped recipe1.ingredients")) {
/* 421 */       Configuration.items.set("Custom Tools.Iridium Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Flarite Ingot,-", "-,Flarite Ingot,-", "-,280,-" }));
/*     */     }
/* 423 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.shaped recipe2.amount")) {
/* 424 */       Configuration.items.set("Custom Tools.Iridium Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 426 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.shaped recipe2.ingredients")) {
/* 427 */       Configuration.items.set("Custom Tools.Iridium Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Flarite Ingot,-,-", "Flarite Ingot,-,-", "280,-,-" }));
/*     */     }
/* 429 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.shaped recipe3.amount")) {
/* 430 */       Configuration.items.set("Custom Tools.Iridium Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 432 */     if (!Configuration.items.contains("Custom Tools.Iridium Sword.shaped recipe3.ingredients")) {
/* 433 */       Configuration.items.set("Custom Tools.Iridium Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Flarite Ingot", "-,-,Flarite Ingot", "-,-,280" }));
/*     */     }
/*     */ 
/* 436 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.texture url")) {
/* 437 */       Configuration.items.set("Custom Tools.Iridium Shovel.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Iridiumshovel.png");
/*     */     }
/* 439 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.durability")) {
/* 440 */       Configuration.items.set("Custom Tools.Iridium Shovel.durability", Integer.valueOf(20));
/*     */     }
/* 442 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.shaped recipe1.amount")) {
/* 443 */       Configuration.items.set("Custom Tools.Iridium Shovel.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 445 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.shaped recipe1.ingredients")) {
/* 446 */       Configuration.items.set("Custom Tools.Iridium Shovel.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Flarite Ingot,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 448 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.shaped recipe2.amount")) {
/* 449 */       Configuration.items.set("Custom Tools.Iridium Shovel.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 451 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.shaped recipe2.ingredients")) {
/* 452 */       Configuration.items.set("Custom Tools.Iridium Shovel.shaped recipe2.ingredients", Arrays.asList(new String[] { "Flarite Ingot,-,-", "280,-,-", "280,-,-" }));
/*     */     }
/* 454 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.shaped recipe3.amount")) {
/* 455 */       Configuration.items.set("Custom Tools.Iridium Shovel.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 457 */     if (!Configuration.items.contains("Custom Tools.Iridium Shovel.shaped recipe3.ingredients")) {
/* 458 */       Configuration.items.set("Custom Tools.Iridium Shovel.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Flarite Ingot", "-,-,280", "-,-,280" }));
/*     */     }
/*     */ 
/* 461 */     if (!Configuration.items.contains("Custom Tools.Iridium Axe.texture url")) {
/* 462 */       Configuration.items.set("Custom Tools.Iridium Axe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Iridiumaxe.png");
/*     */     }
/* 464 */     if (!Configuration.items.contains("Custom Tools.Iridium Axe.durability")) {
/* 465 */       Configuration.items.set("Custom Tools.Iridium Axe.durability", Integer.valueOf(20));
/*     */     }
/* 467 */     if (!Configuration.items.contains("Custom Tools.Iridium Axe.shaped recipe1.amount")) {
/* 468 */       Configuration.items.set("Custom Tools.Iridium Axe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 470 */     if (!Configuration.items.contains("Custom Tools.Iridium Axe.shaped recipe1.ingredients")) {
/* 471 */       Configuration.items.set("Custom Tools.Iridium Axe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Flarite Ingot,Flarite Ingot,-", "Flarite Ingot,280,-", "-,280,-" }));
/*     */     }
/* 473 */     if (!Configuration.items.contains("Custom Tools.Iridium Axe.shaped recipe2.amount")) {
/* 474 */       Configuration.items.set("Custom Tools.Iridium Axe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 476 */     if (!Configuration.items.contains("Custom Tools.Iridium Axe.shaped recipe2.ingredients")) {
/* 477 */       Configuration.items.set("Custom Tools.Iridium Axe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Flarite Ingot,Flarite Ingot", "-,280,Flarite Ingot", "-,280,-" }));
/*     */     }
/*     */ 
/* 480 */     if (!Configuration.items.contains("Custom Tools.Iridium Pickaxe.texture url")) {
/* 481 */       Configuration.items.set("Custom Tools.Iridium Pickaxe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Iridiumpick.png");
/*     */     }
/* 483 */     if (!Configuration.items.contains("Custom Tools.Iridium Pickaxe.durability")) {
/* 484 */       Configuration.items.set("Custom Tools.Iridium Pickaxe.durability", Integer.valueOf(20));
/*     */     }
/* 486 */     if (!Configuration.items.contains("Custom Tools.Iridium Pickaxe.shaped recipe1.amount")) {
/* 487 */       Configuration.items.set("Custom Tools.Iridium Pickaxe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 489 */     if (!Configuration.items.contains("Custom Tools.Iridium Pickaxe.shaped recipe1.ingredients")) {
/* 490 */       Configuration.items.set("Custom Tools.Iridium Pickaxe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Flarite Ingot,Flarite Ingot,Flarite Ingot", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 493 */     if (!Configuration.items.contains("Custom Tools.Iridium Hoe.texture url")) {
/* 494 */       Configuration.items.set("Custom Tools.Iridium Hoe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Iridiumhoe.png");
/*     */     }
/* 496 */     if (!Configuration.items.contains("Custom Tools.Iridium Hoe.durability")) {
/* 497 */       Configuration.items.set("Custom Tools.Iridium Hoe.durability", Integer.valueOf(20));
/*     */     }
/* 499 */     if (!Configuration.items.contains("Custom Tools.Iridium Hoe.shaped recipe1.amount")) {
/* 500 */       Configuration.items.set("Custom Tools.Iridium Hoe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 502 */     if (!Configuration.items.contains("Custom Tools.Iridium Hoe.shaped recipe1.ingredients")) {
/* 503 */       Configuration.items.set("Custom Tools.Iridium Hoe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Flarite Ingot,Flarite Ingot,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 505 */     if (!Configuration.items.contains("Custom Tools.Iridium Hoe.shaped recipe2.amount")) {
/* 506 */       Configuration.items.set("Custom Tools.Iridium Hoe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 508 */     if (!Configuration.items.contains("Custom Tools.Iridium Hoe.shaped recipe2.ingredients")) {
/* 509 */       Configuration.items.set("Custom Tools.Iridium Hoe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Flarite Ingot,Flarite Ingot", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 513 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.texture url")) {
/* 514 */       Configuration.items.set("Custom Tools.Mithril Sword.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Mithrilsword.png");
/*     */     }
/* 516 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.durability")) {
/* 517 */       Configuration.items.set("Custom Tools.Mithril Sword.durability", Integer.valueOf(20));
/*     */     }
/* 519 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.damage")) {
/* 520 */       Configuration.items.set("Custom Tools.Mithril Sword.damage", Integer.valueOf(6));
/*     */     }
/* 522 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.shaped recipe1.amount")) {
/* 523 */       Configuration.items.set("Custom Tools.Mithril Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 525 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.shaped recipe1.ingredients")) {
/* 526 */       Configuration.items.set("Custom Tools.Mithril Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Ruby,-", "-,Ruby,-", "-,280,-" }));
/*     */     }
/* 528 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.shaped recipe2.amount")) {
/* 529 */       Configuration.items.set("Custom Tools.Mithril Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 531 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.shaped recipe2.ingredients")) {
/* 532 */       Configuration.items.set("Custom Tools.Mithril Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Ruby,-,-", "Ruby,-,-", "280,-,-" }));
/*     */     }
/* 534 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.shaped recipe3.amount")) {
/* 535 */       Configuration.items.set("Custom Tools.Iridium Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 537 */     if (!Configuration.items.contains("Custom Tools.Mithril Sword.shaped recipe3.ingredients")) {
/* 538 */       Configuration.items.set("Custom Tools.Mithril Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Ruby", "-,-,Ruby", "-,-,280" }));
/*     */     }
/*     */ 
/* 541 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.texture url")) {
/* 542 */       Configuration.items.set("Custom Tools.Mithril Shovel.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Mithrilshovel.png");
/*     */     }
/* 544 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.durability")) {
/* 545 */       Configuration.items.set("Custom Tools.Mithril Shovel.durability", Integer.valueOf(20));
/*     */     }
/* 547 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.shaped recipe1.amount")) {
/* 548 */       Configuration.items.set("Custom Tools.Mithril Shovel.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 550 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.shaped recipe1.ingredients")) {
/* 551 */       Configuration.items.set("Custom Tools.Mithril Shovel.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Ruby,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 553 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.shaped recipe2.amount")) {
/* 554 */       Configuration.items.set("Custom Tools.Mithril Shovel.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 556 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.shaped recipe2.ingredients")) {
/* 557 */       Configuration.items.set("Custom Tools.Mithril Shovel.shaped recipe2.ingredients", Arrays.asList(new String[] { "Ruby,-,-", "280,-,-", "280,-,-" }));
/*     */     }
/* 559 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.shaped recipe3.amount")) {
/* 560 */       Configuration.items.set("Custom Tools.Mithril Shovel.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 562 */     if (!Configuration.items.contains("Custom Tools.Mithril Shovel.shaped recipe3.ingredients")) {
/* 563 */       Configuration.items.set("Custom Tools.Mithril Shovel.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Ruby", "-,-,280", "-,-,280" }));
/*     */     }
/*     */ 
/* 566 */     if (!Configuration.items.contains("Custom Tools.Mithril Axe.texture url")) {
/* 567 */       Configuration.items.set("Custom Tools.Mithril Axe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Mithrilaxe.png");
/*     */     }
/* 569 */     if (!Configuration.items.contains("Custom Tools.Mithril Axe.durability")) {
/* 570 */       Configuration.items.set("Custom Tools.Mithril Axe.durability", Integer.valueOf(20));
/*     */     }
/* 572 */     if (!Configuration.items.contains("Custom Tools.Mithril Axe.shaped recipe1.amount")) {
/* 573 */       Configuration.items.set("Custom Tools.Mithril Axe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 575 */     if (!Configuration.items.contains("Custom Tools.Mithril Axe.shaped recipe1.ingredients")) {
/* 576 */       Configuration.items.set("Custom Tools.Mithril Axe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Ruby,Ruby,-", "Ruby,280,-", "-,280,-" }));
/*     */     }
/* 578 */     if (!Configuration.items.contains("Custom Tools.Mithril Axe.shaped recipe2.amount")) {
/* 579 */       Configuration.items.set("Custom Tools.Mithril Axe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 581 */     if (!Configuration.items.contains("Custom Tools.Mithril Axe.shaped recipe2.ingredients")) {
/* 582 */       Configuration.items.set("Custom Tools.Mithril Axe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Ruby,Ruby", "-,280,Ruby", "-,280,-" }));
/*     */     }
/*     */ 
/* 585 */     if (!Configuration.items.contains("Custom Tools.Mithril Pickaxe.texture url")) {
/* 586 */       Configuration.items.set("Custom Tools.Mithril Pickaxe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Mithrilpick.png");
/*     */     }
/* 588 */     if (!Configuration.items.contains("Custom Tools.Mithril Pickaxe.durability")) {
/* 589 */       Configuration.items.set("Custom Tools.Mithril Pickaxe.durability", Integer.valueOf(20));
/*     */     }
/* 591 */     if (!Configuration.items.contains("Custom Tools.Mithril Pickaxe.shaped recipe1.amount")) {
/* 592 */       Configuration.items.set("Custom Tools.Mithril Pickaxe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 594 */     if (!Configuration.items.contains("Custom Tools.Mithril Pickaxe.shaped recipe1.ingredients")) {
/* 595 */       Configuration.items.set("Custom Tools.Mithril Pickaxe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Ruby,Ruby,Ruby", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 598 */     if (!Configuration.items.contains("Custom Tools.Mithril Hoe.texture url")) {
/* 599 */       Configuration.items.set("Custom Tools.Mithril Hoe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Mithrilhoe.png");
/*     */     }
/* 601 */     if (!Configuration.items.contains("Custom Tools.Mithril Hoe.durability")) {
/* 602 */       Configuration.items.set("Custom Tools.Mithril Hoe.durability", Integer.valueOf(20));
/*     */     }
/* 604 */     if (!Configuration.items.contains("Custom Tools.Mithril Hoe.shaped recipe1.amount")) {
/* 605 */       Configuration.items.set("Custom Tools.Mithril Hoe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 607 */     if (!Configuration.items.contains("Custom Tools.Mithril Hoe.shaped recipe1.ingredients")) {
/* 608 */       Configuration.items.set("Custom Tools.Mithril Hoe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Ruby,Ruby,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 610 */     if (!Configuration.items.contains("Custom Tools.Mithril Hoe.shaped recipe2.amount")) {
/* 611 */       Configuration.items.set("Custom Tools.Mithril Hoe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 613 */     if (!Configuration.items.contains("Custom Tools.Mithril Hoe.shaped recipe2.ingredients")) {
/* 614 */       Configuration.items.set("Custom Tools.Mithril Hoe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Ruby,Ruby", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 618 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.texture url")) {
/* 619 */       Configuration.items.set("Custom Tools.Verdite Sword.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Verditesword.png");
/*     */     }
/* 621 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.durability")) {
/* 622 */       Configuration.items.set("Custom Tools.Verdite Sword.durability", Integer.valueOf(20));
/*     */     }
/* 624 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.damage")) {
/* 625 */       Configuration.items.set("Custom Tools.Verdite Sword.damage", Integer.valueOf(4));
/*     */     }
/* 627 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.shaped recipe1.amount")) {
/* 628 */       Configuration.items.set("Custom Tools.Verdite Sword.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 630 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.shaped recipe1.ingredients")) {
/* 631 */       Configuration.items.set("Custom Tools.Verdite Sword.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Crystalite,-", "-,Crystalite,-", "-,280,-" }));
/*     */     }
/* 633 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.shaped recipe2.amount")) {
/* 634 */       Configuration.items.set("Custom Tools.Verdite Sword.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 636 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.shaped recipe2.ingredients")) {
/* 637 */       Configuration.items.set("Custom Tools.Verdite Sword.shaped recipe2.ingredients", Arrays.asList(new String[] { "Crystalite,-,-", "Crystalite,-,-", "280,-,-" }));
/*     */     }
/* 639 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.shaped recipe3.amount")) {
/* 640 */       Configuration.items.set("Custom Tools.Verdite Sword.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 642 */     if (!Configuration.items.contains("Custom Tools.Verdite Sword.shaped recipe3.ingredients")) {
/* 643 */       Configuration.items.set("Custom Tools.Verdite Sword.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Crystalite", "-,-,Crystalite", "-,-,280" }));
/*     */     }
/*     */ 
/* 646 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.texture url")) {
/* 647 */       Configuration.items.set("Custom Tools.Verdite Shovel.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Verditeshovel.png");
/*     */     }
/* 649 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.durability")) {
/* 650 */       Configuration.items.set("Custom Tools.Verdite Shovel.durability", Integer.valueOf(20));
/*     */     }
/* 652 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.shaped recipe1.amount")) {
/* 653 */       Configuration.items.set("Custom Tools.Verdite Shovel.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 655 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.shaped recipe1.ingredients")) {
/* 656 */       Configuration.items.set("Custom Tools.Verdite Shovel.shaped recipe1.ingredients", Arrays.asList(new String[] { "-,Crystalite,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 658 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.shaped recipe2.amount")) {
/* 659 */       Configuration.items.set("Custom Tools.Verdite Shovel.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 661 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.shaped recipe2.ingredients")) {
/* 662 */       Configuration.items.set("Custom Tools.Verdite Shovel.shaped recipe2.ingredients", Arrays.asList(new String[] { "Crystalite,-,-", "280,-,-", "280,-,-" }));
/*     */     }
/* 664 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.shaped recipe3.amount")) {
/* 665 */       Configuration.items.set("Custom Tools.Verdite Shovel.shaped recipe3.amount", Integer.valueOf(1));
/*     */     }
/* 667 */     if (!Configuration.items.contains("Custom Tools.Verdite Shovel.shaped recipe3.ingredients")) {
/* 668 */       Configuration.items.set("Custom Tools.Verdite Shovel.shaped recipe3.ingredients", Arrays.asList(new String[] { "-,-,Crystalite", "-,-,280", "-,-,280" }));
/*     */     }
/*     */ 
/* 671 */     if (!Configuration.items.contains("Custom Tools.Verdite Axe.texture url")) {
/* 672 */       Configuration.items.set("Custom Tools.Verdite Axe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Verditeaxe.png");
/*     */     }
/* 674 */     if (!Configuration.items.contains("Custom Tools.Verdite Axe.durability")) {
/* 675 */       Configuration.items.set("Custom Tools.Verdite Axe.durability", Integer.valueOf(20));
/*     */     }
/* 677 */     if (!Configuration.items.contains("Custom Tools.Verdite Axe.shaped recipe1.amount")) {
/* 678 */       Configuration.items.set("Custom Tools.Verdite Axe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 680 */     if (!Configuration.items.contains("Custom Tools.Verdite Axe.shaped recipe1.ingredients")) {
/* 681 */       Configuration.items.set("Custom Tools.Verdite Axe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Crystalite,Crystalite,-", "Crystalite,280,-", "-,280,-" }));
/*     */     }
/* 683 */     if (!Configuration.items.contains("Custom Tools.Verdite Axe.shaped recipe2.amount")) {
/* 684 */       Configuration.items.set("Custom Tools.Verdite Axe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 686 */     if (!Configuration.items.contains("Custom Tools.Verdite Axe.shaped recipe2.ingredients")) {
/* 687 */       Configuration.items.set("Custom Tools.Verdite Axe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-Crystalite,Crystalite", "-,280,Crystalite", "-,280,-" }));
/*     */     }
/*     */ 
/* 690 */     if (!Configuration.items.contains("Custom Tools.Verdite Pickaxe.texture url")) {
/* 691 */       Configuration.items.set("Custom Tools.Verdite Pickaxe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Verditepick.png");
/*     */     }
/* 693 */     if (!Configuration.items.contains("Custom Tools.Verdite Pickaxe.durability")) {
/* 694 */       Configuration.items.set("Custom Tools.Verdite Pickaxe.durability", Integer.valueOf(20));
/*     */     }
/* 696 */     if (!Configuration.items.contains("Custom Tools.Verdite Pickaxe.shaped recipe1.amount")) {
/* 697 */       Configuration.items.set("Custom Tools.Verdite Pickaxe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 699 */     if (!Configuration.items.contains("Custom Tools.Verdite Pickaxe.shaped recipe1.ingredients")) {
/* 700 */       Configuration.items.set("Custom Tools.Verdite Pickaxe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Crystalite,Crystalite,Crystalite", "-,280,-", "-,280,-" }));
/*     */     }
/*     */ 
/* 703 */     if (!Configuration.items.contains("Custom Tools.Verdite Hoe.texture url")) {
/* 704 */       Configuration.items.set("Custom Tools.Verdite Hoe.texture url", "http://dl.lynxdragon.com/rpgessentials/textures/tools/Verditehoe.png");
/*     */     }
/* 706 */     if (!Configuration.items.contains("Custom Tools.Verdite Hoe.durability")) {
/* 707 */       Configuration.items.set("Custom Tools.Verdite Hoe.durability", Integer.valueOf(20));
/*     */     }
/* 709 */     if (!Configuration.items.contains("Custom Tools.Verdite Hoe.shaped recipe1.amount")) {
/* 710 */       Configuration.items.set("Custom Tools.Verdite Hoe.shaped recipe1.amount", Integer.valueOf(1));
/*     */     }
/* 712 */     if (!Configuration.items.contains("Custom Tools.Verdite Hoe.shaped recipe1.ingredients")) {
/* 713 */       Configuration.items.set("Custom Tools.Verdite Hoe.shaped recipe1.ingredients", Arrays.asList(new String[] { "Crystalite,Crystalite,-", "-,280,-", "-,280,-" }));
/*     */     }
/* 715 */     if (!Configuration.items.contains("Custom Tools.Verdite Hoe.shaped recipe2.amount")) {
/* 716 */       Configuration.items.set("Custom Tools.Verdite Hoe.shaped recipe2.amount", Integer.valueOf(1));
/*     */     }
/* 718 */     if (!Configuration.items.contains("Custom Tools.Verdite Hoe.shaped recipe2.ingredients"))
/* 719 */       Configuration.items.set("Custom Tools.Verdite Hoe.shaped recipe2.ingredients", Arrays.asList(new String[] { "-,Crystalite,Crystalite", "-,280,-", "-,280,-" }));
/*     */   }
/*     */ }
