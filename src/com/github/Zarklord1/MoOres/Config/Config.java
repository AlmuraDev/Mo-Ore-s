package com.github.Zarklord1.MoOres.Config;

import java.util.Arrays;

 public class Config
 {
   public static void set() {
	 if (!Configuration.config.contains("tools.Pickaxebreackableblockids")) {
             Configuration.config.set("tools.Pickaxebreackableblockids", Arrays.asList("1","67","71","24","70"));
         }
         if (!Configuration.config.contains("tools.Axebreackableblockids")) {
             Configuration.config.set("tools.Axebreackableblockids", Arrays.asList("5","53","54"));
         }
         if (!Configuration.config.contains("tools.Shovelbreackableblockids")) {
             Configuration.config.set("tools.Shovelbreackableblockids", Arrays.asList("2","3","60"));
         }
         if (!Configuration.config.contains("tools.Swordbreackableblockids")) {
             Configuration.config.set("tools.Swordbreackableblockids", Arrays.asList("26","30","92"));
         }
   }
}