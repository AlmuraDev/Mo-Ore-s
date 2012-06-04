package com.github.Zarklord1.MoOres;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Events.*;
import com.github.Zarklord1.MoOres.Generator.Generator;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import com.github.Zarklord1.MoOres.Util.Recipes;
import java.io.File;
import java.util.logging.Logger;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.Texture;

public class MoOres extends JavaPlugin{
	
	public static MoOres plugin;
	public static final Logger log = Logger.getLogger("Minecraft");
	public Texture ores;
	public Texture blocks;
	public Texture plants;
	File bo2file;

    @Override
	public void onEnable(){
		log.info("[Mo Ores] Is Enabling...");

		log.info("[Mo Ores] Loading Configs...");
		Configuration.start();
		log.info("[Mo Ores] Loaded Configs!");
		loadTextures();
		log.info("[Mo Ores] Registering Block And Items...");
                Hashmaps.addvanillablocks(this);
		Hashmaps.registerBlocks(this);
		log.info("[Mo Ores] Registered all Custom Blocks And Items!");
		reg();
		log.info("[Mo Ores] Registering Recipes...");
                Recipes.addAllRecipes(plugin); 
		log.info("[Mo Ores] Registered all Recipes!");
		
		log.info("[Mo Ores] Is Enabled!");
	}
	 


    @Override
	public void onDisable(){ 
		Hashmaps.custombushes.clear();
		Hashmaps.customitems.clear();
		Hashmaps.customores.clear();
		Hashmaps.customtools.clear();
		Hashmaps.originalores.clear();
		Hashmaps.plants.clear();
                Hashmaps.Axebreackableblocks.clear();
                Hashmaps.Pickaxebreackableblocks.clear();
                Hashmaps.Shovelbreackableblocks.clear();
                Hashmaps.Swordbreackableblocks.clear();
		log.info("[Mo Ores] Is Disabled!");
	}
	
	  private void loadTextures()
	  {
            int j = Configuration.texture.getInt("Ores Block Texture Size");
            int d = Configuration.texture.getInt("Blocks Block Texture Size");
            int k = Configuration.texture.getInt("Plants Block Texture Size");
	    this.ores = new Texture(this, Configuration.texture.getString("Ores Texture"), j * j, j * j, j);
	    this.blocks = new Texture(this, Configuration.texture.getString("Blocks Texture"), d * d, d * d, d);
	    this.plants = new Texture(this, Configuration.texture.getString("Plants Texture"), k * k, k * k, k);
	  }
	  
    @Override
	  public ChunkGenerator getDefaultWorldGenerator(String worldname, String uid) {
		    return new Generator(this);
		  }
    
          private void reg() {
              PluginManager pm = this.getServer().getPluginManager();
              pm.registerEvents(new MoOresEntityListener(this), this);
              pm.registerEvents(new MoOresBlockListener(this), this);
              pm.registerEvents(new MoOresPlayerListener(this), this);
          }
          private void SetDrops() {
              
          }	  
}
