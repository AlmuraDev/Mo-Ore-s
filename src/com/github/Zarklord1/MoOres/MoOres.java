package com.github.Zarklord1.MoOres;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.Chunk;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.block.design.Texture;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.Events.MoOresBlockListener;
import com.github.Zarklord1.MoOres.Events.MoOresEntityListener;
import com.github.Zarklord1.MoOres.Events.MoOresPlayerListener;
import com.github.Zarklord1.MoOres.Events.MoOresServerListener;
import com.github.Zarklord1.MoOres.Util.BlockLoader;
import com.github.Zarklord1.MoOres.Util.RecipeLoader;
import com.github.Zarklord1.MoOres.Util.SaveAndLoad;
import com.github.Zarklord1.MoOres.WGen.MoOresOrePopulator;
import com.github.Zarklord1.MoOres.WGen.OresPopulator;

public class MoOres extends JavaPlugin{
    
    public static MoOres plugin;
    public static final Logger log = Logger.getLogger("Minecraft");
    public static OresPopulator oresPop = new OresPopulator();
    public static Texture blocks;

    @Override
    public void onEnable() {
        MoOres.plugin = this;
        log.info("[Mo Ores] Is Enabling...");

        log.info("[Mo Ores] Loading Configs...");
        Configuration.load();
        log.info("[Mo Ores] Loaded Configs!");
        loadTextures();
        log.info("[Mo Ores] Registering Block And Items...");
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
    	BlockLoader.customarrows.clear();
    	BlockLoader.customblocks.clear();
    	BlockLoader.customfish.clear();
    	BlockLoader.customfood.clear();
        BlockLoader.customitems.clear();
        BlockLoader.customtools.clear();
        save();
        log.info("[Mo Ores] Is Disabled!");
    }
	
    private void loadTextures() {
        MoOres.blocks = new Texture(this, Configuration.texture.getString("Blocks Texture"), Configuration.texture.getInt("Blocks Texture Size"), Configuration.texture.getInt("Blocks Texture Size"), Configuration.texture.getInt("Blocks Block Texture Size"));
    }
    
    private void reg() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new MoOresEntityListener(), this);
        pm.registerEvents(new MoOresPlayerListener(), this);
        pm.registerEvents(new MoOresServerListener(), this);
        pm.registerEvents(new MoOresBlockListener(), this);
        pm.registerEvents(new MoOresOrePopulator(), this);
        //BukkitScheduler sch = this.getServer().getScheduler();
    }
    
    private void load() {
        try {
			MoOresOrePopulator.hasOres = SaveAndLoad.load("plugins/MoOres/Data/Chunks.dat");
		} catch (Exception e) {
			MoOresOrePopulator.hasOres = new ArrayList<Chunk>();
		}
    }
    
    private void save() {
    	try {
    		SaveAndLoad.save(MoOresOrePopulator.hasOres, ("plugins/MoOres/Data/Chunks.dat"));
		} catch (Exception e) {
			String path = this.getDataFolder() + "/Data/";
			new File(path).mkdirs();
			File file = new File(path, "Chunks.dat");
			try {
				file.createNewFile();
			} catch (IOException f) {
			}
			try {
				SaveAndLoad.save(MoOresOrePopulator.hasOres, ("plugins/MoOres/Data/Chunks.dat"));
			} catch (Exception g) {
			}
		}
    }
}
