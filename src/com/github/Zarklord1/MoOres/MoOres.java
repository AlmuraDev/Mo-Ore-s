package com.github.Zarklord1.MoOres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.Texture;
import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Generator.Generator;
import com.github.Zarklord1.MoOres.Util.BO2ObjectManager;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import com.github.Zarklord1.MoOres.Util.Recipes;

public class MoOres extends JavaPlugin{
	
	public static MoOres plugin;
	public static Logger log = Logger.getLogger("Minecraft");
	public Texture ores;
	public Texture blocks;
	public Texture plants;
	File bo2file;

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
		Hashmaps.registerBlocks(this);
		log.info("[Mo Ores] Registered all Custom Blocks And Items!");
		
		log.info("[Mo Ores] Registering Recipes...");
		Recipes.addBlockShapedRecipe(plugin);
		Recipes.addFoodShapedRecipe(plugin);
		Recipes.addItemShapedRecipe(plugin);
		Recipes.addToolShapedRecipe(plugin);
		log.info("[Mo Ores] Registered all Recipes!");
		
		log.info("[Mo Ores] Is Enabled!");
	}
	 


	public void onDisable(){ 
		Hashmaps.bushes.clear();
		Hashmaps.customitems.clear();
		Hashmaps.customores.clear();
		Hashmaps.customtools.clear();
		Hashmaps.originalores.clear();
		Hashmaps.plants.clear();
		log.info("[Mo Ores] Is Disabled!");
	}
	
	  public void loadTextures()
	  {
	    this.ores = new Texture(this, Configuration.texture.getString("Ores Texture"), 256, 256, 16);
	    this.blocks = new Texture(this, Configuration.texture.getString("Blocks Texture"), 256, 256, 16);
	    this.plants = new Texture(this, Configuration.texture.getString("Plants Texture"), 256, 256, 16);
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

	  
	  public ChunkGenerator getDefaultWorldGenerator(String worldname, String uid) {
		    return new Generator(this);
		  }
	  
}
