package com.github.Zarklord1.MoOres;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.Texture;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Events.*;
import com.github.Zarklord1.MoOres.Generator.Generator;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import com.github.Zarklord1.MoOres.Util.Recipes;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.plugin.PluginManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;

public class MoOres extends JavaPlugin{
	
	public static MoOres plugin;
	public static final Logger log = Logger.getLogger("Minecraft");
	public Texture ores;
	public Texture blocks;
	public Texture plants;
	File bo2file;

    @Override
	public void onEnable(){ 
		String path = this.getDataFolder() + "/BO2Objects/";
		new File(path).mkdirs();
		/*
		String[] names = { "palm", "prettypine", "caketree", "Paradise Tree", "Weeping Willow"};
		for(int a = 0; a < names.length; ++a){
			bo2file = new File(path, names[a] + ".bo2");
			copy(getResource("resources/" + names[a] + ".bo2"), bo2file);
		}
		try {
			BO2ObjectManager.ReadBO2Files(this.getDataFolder() + "/BO2Objects/");
		} catch (FileNotFoundException e) {
		}*/
		
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
		//Recipes.addBlockShapedRecipe(plugin);
		//Recipes.addFoodShapedRecipe(plugin);
		//Recipes.addItemShapedRecipe(plugin);
		//Recipes.addToolShapedRecipe(plugin);
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
	
	  public void loadTextures()
	  {
            int j = Configuration.texture.getInt("Ores Texture Size");
            int d = Configuration.texture.getInt("Blocks Texture Size");
            int k = Configuration.texture.getInt("Plants Texture Size");
	    this.ores = new Texture(this, Configuration.texture.getString("Ores Texture"), j * j, j * j, j);
	    this.blocks = new Texture(this, Configuration.texture.getString("Blocks Texture"), d * d, d * d, d);
	    this.plants = new Texture(this, Configuration.texture.getString("Plants Texture"), k * k, k * k, k);
	  }
	  
		public void copy (InputStream in, File file){
	        try {
	            OutputStream out = new FileOutputStream(file);
	            byte[] buf = new byte[1024];
	            int len;
	            while((len=in.read(buf))>0){
	                out.write(buf,0,len);
	            }
	            out.close();
	            in.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	  
    @Override
	  public ChunkGenerator getDefaultWorldGenerator(String worldname, String uid) {
		    return new Generator(this);
		  }
          public void reg() {
              PluginManager pm = this.getServer().getPluginManager();
              pm.registerEvents(new MoOresEntityListener(this), this);
              pm.registerEvents(new MoOresBlockListener(this), this);
              pm.registerEvents(new MoOresFurnaceListener(this), this);
              pm.registerEvents(new MoOresPlayerListener(this), this);
          }
          public void SetDrops() {
              
          }
	  
}
