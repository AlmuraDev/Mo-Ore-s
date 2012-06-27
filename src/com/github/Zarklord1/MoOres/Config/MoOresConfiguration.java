package com.github.Zarklord1.MoOres.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.yaml.snakeyaml.error.YAMLException;

public class MoOresConfiguration extends YamlConfiguration {
    private File file;
    public String getFilename() {
        if (this.file == null)
            throw new UnsupportedOperationException("You didn't use a File to create this object.");
        String[] f = this.file.getAbsolutePath().split("/");
        return f[(f.length - 1)];
    }

    @Override
    public void load(String file) throws FileNotFoundException, IOException, InvalidConfigurationException {
        load(new File(file));
    }
    
    @Override
    public void load(File file) throws FileNotFoundException, IOException, InvalidConfigurationException {
        super.load(file);
        this.file = file;
    }
    
    public void reload() throws FileNotFoundException, IOException, InvalidConfigurationException {
        load(this.file);
    }
    
    public static MoOresConfiguration loadConfiguration(String file) {
        return loadConfiguration(new File(file));
    }
    
    public static MoOresConfiguration loadConfiguration(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        MoOresConfiguration config = new MoOresConfiguration();
        try
        {
            config.load(file);
        } catch (FileNotFoundException localFileNotFoundException) {
        } catch (IOException ex) {
            Bukkit.getLogger().log(Level.SEVERE, "Cannot load " + file, ex);
        } catch (InvalidConfigurationException ex) {
            if ((ex.getCause() instanceof YAMLException))
                Bukkit.getLogger().log(Level.SEVERE, "Config file " + file + " isn''t valid! " + ex.getCause());
            else if ((ex.getCause() == null) || ((ex.getCause() instanceof ClassCastException)))
                Bukkit.getLogger().log(Level.SEVERE, "Config file " + file + " isn''t valid!");
            else {
                Bukkit.getLogger().log(Level.SEVERE, "Cannot load " + file + ": " + ex.getCause().getClass(), ex);
            }
        }
        config.file = file;
        return config;
    }
    
    public void save() throws IOException {
        if (this.file == null)
            throw new UnsupportedOperationException("You didn't use a File to create this object.");
        super.save(this.file);
    }
    public float getFloat(String path) {
        String string = this.getString(path);
        if (string != null) {
            return Float.parseFloat(string);
        }
        return 0.0F;
    }
    public short getShort(String path) {
        String string = this.getString(path);
        if (string != null) {
            return Short.parseShort(string);
        }
        return 0;
    }
}