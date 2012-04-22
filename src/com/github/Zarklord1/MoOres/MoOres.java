package com.github.Zarklord1.MoOres;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.material.CustomBlock;
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
	
	public void onEnable(){ 
		log.info("[Mo Ore's] Is Enabling!");
		Flariteore = new Flariteore(this);
		Silverore = new Silverore(this);
		Rubyore = new Rubyore(this);
		Thermiteore = new Thermiteore(this);
		Crystaliteore = new Crsytaliteore(this);
	}
	 
	public void onDisable(){ 
		log.info("[Mo Ore's] Is Disabled!");
	}
}
