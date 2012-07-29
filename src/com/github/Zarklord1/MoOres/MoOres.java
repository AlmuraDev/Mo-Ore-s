package com.github.Zarklord1.MoOres;

import java.util.HashSet;
import java.util.logging.Logger;

import org.bukkit.Chunk;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.Texture;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Events.*;
import com.github.Zarklord1.MoOres.Util.BlockLoader;
import com.github.Zarklord1.MoOres.Util.RecipeLoader;
import com.github.Zarklord1.MoOres.Util.SaveAndLoad;

public class MoOres extends JavaPlugin{
    
    public static MoOres plugin;
    public static final Logger log = Logger.getLogger("Minecraft");
    public static Texture ores;
    public static Texture blocks;
    public static Texture plants;

    @Override
    public void onEnable() {
        MoOres.plugin = this;
        log.info("[Mo Ores] Is Enabling...");

        log.info("[Mo Ores] Loading Configs...");
        Configuration.load();
        log.info("[Mo Ores] Loaded Configs!");
        loadTextures();
        log.info("[Mo Ores] Registering Block And Items...");
        BlockLoader.addVanillaBlocks();
        BlockLoader.registerBlocks();
        log.info("[Mo Ores] Registered all Custom Blocks And Items!");
        load();
        reg();
        log.info("[Mo Ores] Registering Recipes...");
        RecipeLoader.addAllRecipes(); 
        log.info("[Mo Ores] Registered all Recipes!");
		        
        log.info("[Mo Ores] Is Enabled!");
    }
	 


    @Override
    public void onDisable(){ 
        BlockLoader.custombushes.clear();
        BlockLoader.customitems.clear();
        BlockLoader.customores.clear();
        BlockLoader.customtools.clear();
        BlockLoader.plants.clear();
        BlockLoader.Pickaxebreackableblocks.clear();
        BlockLoader.PickaxeSpeedIds.clear();
        BlockLoader.AxeSpeedIds.clear();
        BlockLoader.ShovelSpeedIds.clear();
        BlockLoader.SwordSpeedIds.clear();
        save();
        log.info("[Mo Ores] Is Disabled!");
    }
	
    private void loadTextures() {
        MoOres.ores = new Texture(this, Configuration.texture.getString("Ores Texture"), Configuration.texture.getInt("Ores Texture Size"), Configuration.texture.getInt("Ores Texture Size"), Configuration.texture.getInt("Ores Block Texture Size"));
        MoOres.blocks = new Texture(this, Configuration.texture.getString("Blocks Texture"), Configuration.texture.getInt("Blocks Texture Size"), Configuration.texture.getInt("Blocks Texture Size"), Configuration.texture.getInt("Blocks Block Texture Size"));
        MoOres.plants = new Texture(this, Configuration.texture.getString("Plants Texture"), Configuration.texture.getInt("Plants Texture Size"), Configuration.texture.getInt("Plants Texture Size"), Configuration.texture.getInt("Plants Block Texture Size"));
    }
    
    private void reg() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new MoOresEntityListener(), this);
        pm.registerEvents(new MoOresPlayerListener(), this);
        pm.registerEvents(new MoOresServerListener(), this);
        pm.registerEvents(new MoOresBlockListener(), this);
        pm.registerEvents(new MoOresChunkListener(), this);
        //BukkitScheduler sch = this.getServer().getScheduler();
    }
    
    private void load() {
        try {
			MoOresChunkListener.hasOres = (HashSet<Chunk>) SaveAndLoad.load("plugins/MoOres/Data/Chunks.dat");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private void save() {
    	try {
    		SaveAndLoad.save(MoOresChunkListener.hasOres, ("plugins/MoOres/Data/Chunks.dat"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
