package com.github.Zarklord1.MoOres;

import java.util.logging.Logger;


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
	public static CustomBlock FlariteBlock;
	public static CustomBlock SilverBlock;
	public static CustomBlock RubyBlock;
	public static CustomBlock ThermiteBomb;
	public static CustomBlock CrystaliteBlock;
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
		FlariteBlock = new Flariteblock(this);
		SilverBlock = new Silverblock(this);
		RubyBlock = new Rubyblock(this);
		ThermiteBomb = new Thermitebomb(this);
		CrystaliteBlock = new Crystaliteblock(this);
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
		SpoutShapelessRecipe Flaritefurningot1 = new SpoutShapelessRecipe( new SpoutItemStack(Flariteingot, 1));
		Flaritefurningot1.addIngredient(Flariteore);
		Flaritefurningot1.addIngredient(1, MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Flaritefurningot1);
		
		SpoutShapelessRecipe Flaritefurningot8 = new SpoutShapelessRecipe( new SpoutItemStack(Flariteingot, 8));
		Flaritefurningot8.addIngredient(8, Flariteore);
		Flaritefurningot8.addIngredient(MaterialData.coal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Flaritefurningot8);
		
		SpoutShapelessRecipe Silverfurningot1 = new SpoutShapelessRecipe( new SpoutItemStack(Silveringot, 1));
		Silverfurningot1.addIngredient(Silverore);
		Silverfurningot1.addIngredient(2, MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Silverfurningot1);
		
		SpoutShapelessRecipe Silverfurningot8 = new SpoutShapelessRecipe( new SpoutItemStack(Silveringot, 8));
		Silverfurningot8.addIngredient(8, Silverore);
		Silverfurningot8.addIngredient(MaterialData.coal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Silverfurningot8);
		
		SpoutShapedRecipe Crystaliteblock = new SpoutShapedRecipe(new SpoutItemStack(CrystaliteBlock, 1));
		Crystaliteblock.shape("ccc", "ccc", "ccc");
		Crystaliteblock.setIngredient('c', Crystalite);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Crystaliteblock);
		
		SpoutShapedRecipe Flariteblock = new SpoutShapedRecipe(new SpoutItemStack(FlariteBlock, 1));
		Flariteblock.shape("ccc", "ccc", "ccc");
		Flariteblock.setIngredient('c', Flariteingot);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Flariteblock);
		
		SpoutShapedRecipe Silverblock = new SpoutShapedRecipe(new SpoutItemStack(SilverBlock, 1));
		Silverblock.shape("ccc", "ccc", "ccc");
		Silverblock.setIngredient('c', Silveringot);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Silverblock);
		
		SpoutShapedRecipe Rubyblock = new SpoutShapedRecipe(new SpoutItemStack(RubyBlock, 1));
		Rubyblock.shape("ccc", "ccc", "ccc");
		Rubyblock.setIngredient('c', Ruby);
		SpoutManager.getMaterialManager().registerSpoutRecipe(Rubyblock);
		log.info("[Mo Ores] Registered all Recipes!");
		log.info("[Mo Ores] Is Enabled!");
	}
	 
	public void onDisable(){ 
		log.info("[Mo Ores] Is Disabled!");
	}
}
