package com.github.Zarklord1.MoOres;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;

public class MoOres extends JavaPlugin{
	
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){ 
		log.info("[Mo Ore's] Is Enabled!"); 
		SpoutManager.getFileManager().addToPreLoginCache(plugin, url);
	}
	 
	public void onDisable(){ 
		log.info("[Mo Ore's] Is Disabled!");
	}
}
