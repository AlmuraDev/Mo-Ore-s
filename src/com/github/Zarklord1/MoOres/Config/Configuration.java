/*     */ package com.github.Zarklord1.MoOres.Config;
/*     */ 
import com.github.Zarklord1.MoOres.MoOres;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;

public class Configuration {
    
    public static MoOresConfiguration config = new MoOresConfiguration();
    public static MoOresConfiguration block = new MoOresConfiguration();
    public static MoOresConfiguration generator = new MoOresConfiguration();
    public static MoOresConfiguration items = new MoOresConfiguration();
    public static MoOresConfiguration texture = new MoOresConfiguration();
    public static MoOresConfiguration recipe = new MoOresConfiguration();
    
    private static void complainFileCreation(String filename) {
        MoOres.log.log(Level.SEVERE, "[Mo Ores] On file: " + filename);
        MoOres.log.severe("[Mo Ores] Could NOT create default files! Did you restrict permissions?");
    }
    
    private static boolean load(MoOresConfiguration y, String name) {
        try {
            y.load("plugins/MoOres/" + name);
        } catch (FileNotFoundException e) {
            return true;
        } catch (Exception e) {
            complain(name);
        }
        return false;
    }

    private static void complain(String filename) {
        MoOres.log.log(Level.SEVERE, "[Mo Ores] On file: " + filename);
        MoOres.log.severe("[Mo Ores] Invalid configuration! Did you use tabs or restrict permissions?");
    }
    
    private static void save(MoOresConfiguration y) {
        try {
            y.save();
            try {
                y.load("plugins/MoOres/" + y.getFilename());
            } catch (Exception localException) {}
            exclaim(y.getFilename());
        } catch (IOException e) {
            complainFileCreation(y.getFilename());
        }
    }
    
    private static void exclaim(String filename) {
        MoOres.log.log(Level.INFO, "[Mo Ores] Saved file " + filename + "!");
    }

    public static void start() {
        if (load(Configuration.config, "Config.yml")) {
            Configuration.config = MoOresConfiguration.loadConfiguration("plugins/MoOres/Config.yml");
            ConfigWriter.setConfig(Configuration.config);
            save(Configuration.config);
        }
        if (load(Configuration.recipe, "Recipes.yml")) {
            Configuration.recipe = MoOresConfiguration.loadConfiguration("plugins/MoOres/Recipes.yml");
            ConfigWriter.setRecipes(Configuration.recipe, "Shaped Recipes", "Shapeless Recipes", "Furnace Recipes");
            save(Configuration.recipe);
        }
        if (load(Configuration.block, "Blocks.yml")) {
            Configuration.block = MoOresConfiguration.loadConfiguration("plugins/MoOres/Blocks.yml");
            ConfigWriter.setBlocks(Configuration.block, "Custom Blocks");
            ConfigWriter.setBushes(Configuration.block, "Custom Bushes");
            ConfigWriter.setOres(Configuration.block, "Custom Ores", "Original Ores");
            save(Configuration.block);
        }
        if (load(Configuration.generator, "WorldGenerator.yml")) {
            Configuration.generator = MoOresConfiguration.loadConfiguration("plugins/MoOres/WorldGenerator.yml");
            ConfigWriter.setGenerator(Configuration.generator, "Generator");
            save(Configuration.generator);
        }
        if (load(Configuration.items, "Items.yml")) {
            Configuration.items = MoOresConfiguration.loadConfiguration("plugins/MoOres/Items.yml");
            ConfigWriter.setItems(Configuration.items, "Custom Items");
            ConfigWriter.setFish(Configuration.items, "Custom Fish");
            ConfigWriter.setFood(Configuration.items, "Custom Food");
            ConfigWriter.setTools(Configuration.items, "Custom Tools");
            save(Configuration.items);
        }
        if (load(Configuration.texture, "Textures.yml")) {
            Configuration.texture = MoOresConfiguration.loadConfiguration("plugins/MoOres/Textures.yml");
            ConfigWriter.setTextures(Configuration.texture);
            save(Configuration.texture);
        }
    }
}