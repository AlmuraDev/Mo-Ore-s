package com.github.Zarklord1.MoOres;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Events.MoOresEntityListener;
import com.github.Zarklord1.MoOres.Events.MoOresPlayerListener;
import com.github.Zarklord1.MoOres.Generator.OresPopulator;
import com.github.Zarklord1.MoOres.Util.BlockLoader;
import com.github.Zarklord1.MoOres.Util.RecipeLoader;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.Texture;

public class MoOres extends JavaPlugin{
    
    public static MoOres plugin;
    public static final Logger log = Logger.getLogger("Minecraft");
    public static Texture ores;
    public static Texture blocks;
    public static Texture plants;

    @Override
    public void onEnable(){
        MoOres.plugin = this;
        log.info("[Mo Ores] Is Enabling...");

        log.info("[Mo Ores] Loading Configs...");
        Configuration.load();
        log.info("[Mo Ores] Loaded Configs!");
        loadTextures();
        log.info("[Mo Ores] Registering Block And Items...");
        BlockLoader.addvanillablocks();
        BlockLoader.registerBlocks();
        log.info("[Mo Ores] Registered all Custom Blocks And Items!");
        reg();
        log.info("[Mo Ores] Registering Recipes...");
        RecipeLoader.addAllRecipes(); 
        log.info("[Mo Ores] Registered all Recipes!");
		
        log.info("Loading Custom World Ore Generators...");
        for (String worldname:Configuration.config.getStringList("generator.Generate Custom Ores.List")) {
        	if (Bukkit.getServer().getWorld(worldname) != null) {
                Bukkit.getServer().getWorld(worldname).getPopulators().add(new OresPopulator());
        	} else {
        		log.severe(worldname + " Is Not A Valid World Name");
        	}
        }
        log.info("Loaded Custom World Ore Generators!");
        
        log.info("[Mo Ores] Is Enabled!");
    }
	 


    @Override
    public void onDisable(){ 
        BlockLoader.custombushes.clear();
        BlockLoader.customitems.clear();
        BlockLoader.customores.clear();
        BlockLoader.customtools.clear();
        BlockLoader.originalores.clear();
        BlockLoader.plants.clear();
        BlockLoader.Pickaxebreackableblocks.clear();
        BlockLoader.PickaxeSpeedIds.clear();
        BlockLoader.AxeSpeedIds.clear();
        BlockLoader.ShovelSpeedIds.clear();
        BlockLoader.SwordSpeedIds.clear();
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
        //BukkitScheduler sch = this.getServer().getScheduler();
    }	  
}
