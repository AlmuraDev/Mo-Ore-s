package com.github.Zarklord1.MoOres;

import java.util.logging.Logger;


import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.CustomItem;
import org.getspout.spoutapi.material.MaterialData;

import com.github.Zarklord1.MoOres.Crystalite.*;
import com.github.Zarklord1.MoOres.Flarite.*;
import com.github.Zarklord1.MoOres.Ruby.*;
import com.github.Zarklord1.MoOres.Silver.*;
import com.github.Zarklord1.MoOres.Thermite.*;

public class MoOres extends JavaPlugin{
	
	Logger log = Logger.getLogger("Minecraft");
	public static CustomBlock Flariteore;
	public static CustomBlock Silverore;
	public static CustomBlock Rubyore;
	public static CustomBlock Thermiteore;
	public static CustomBlock Crystaliteore;
	public static CustomItem Flariteingot;
	public static CustomItem Crystalite;
	public static CustomItem Ruby;
	public static CustomItem Thermitedust;
	public static CustomItem Silveringot;
	
	public void onEnable(){ 
		log.info("[Mo Ores] Is Enabling...");
		
		log.info("[Mo Ores] Registering Block And Items...");
		Flariteore = new Flariteore(this);
		Silverore = new Silverore(this);
		Rubyore = new Rubyore(this);
		Thermiteore = new Thermiteore(this);
		Crystaliteore = new Crsytaliteore(this);
		Flariteingot = new Flariteingot(this);
		Crystalite = new Crystalite(this);
		Ruby = new Ruby(this);
		Thermitedust = new Thermitedust(this);
		Silveringot = new Silveringot(this);
		log.info("[Mo Ores] Registered all Custom Blocks And Items!");
		
		log.info("[Mo Ores] Registering Custom Drops...!");
		SpoutItemStack Crystalite2 = new SpoutItemStack(Crystalite, 2);
		Crystaliteore.setItemDrop(Crystalite2);
		SpoutItemStack Ruby1 = new SpoutItemStack(Ruby, 1);
		Rubyore.setItemDrop(Ruby1);
		SpoutItemStack Thermitedust4 = new SpoutItemStack(Thermitedust, 4);
		Thermiteore.setItemDrop(Thermitedust4);
		log.info("[Mo Ores] Registered Custom Drops!");
		
		log.info("[Mo Ores] Registering Recipes...");

		log.info("[Mo Ores] Registered all Recipes!");
		
		log.info("[Mo Ores] Is Enabled!");
	}
	 
	public void onDisable(){ 
		log.info("[Mo Ores] Is Disabled!");
	}
}
