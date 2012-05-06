/*    */ package com.github.Zarklord1.MoOres.Config;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.util.logging.Level;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.configuration.InvalidConfigurationException;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
import org.yaml.snakeyaml.error.YAMLException;
/*    */ 
/*    */ public class MyConfiguration extends YamlConfiguration
/*    */ {
/*    */   private File file;
/*    */ 
/*    */   public String getFilename()
/*    */   {
/* 18 */     if (this.file == null)
/* 19 */       throw new UnsupportedOperationException("You didn't use a File to create this object.");
/* 20 */     String[] f = this.file.getAbsolutePath().split("/");
/* 21 */     return f[(f.length - 1)];
/*    */   }
/*    */ 
/*    */   public void load(String file) throws FileNotFoundException, IOException, InvalidConfigurationException {
/* 25 */     load(new File(file));
/*    */   }
/*    */ 
/*    */   public void load(File file) throws FileNotFoundException, IOException, InvalidConfigurationException {
/* 29 */     super.load(file);
/* 30 */     this.file = file;
/*    */   }
/*    */ 
/*    */   public void reload() throws FileNotFoundException, IOException, InvalidConfigurationException {
/* 34 */     load(this.file);
/*    */   }
/*    */ 
/*    */   public static MyConfiguration loadConfiguration(String file) {
/* 38 */     return loadConfiguration(new File(file));
/*    */   }
/*    */ 
/*    */   public static MyConfiguration loadConfiguration(File file) {
/* 42 */     if (file == null) {
/* 43 */       throw new IllegalArgumentException("File cannot be null");
/*    */     }
/*    */ 
/* 46 */     MyConfiguration config = new MyConfiguration();
/*    */     try
/*    */     {
/* 49 */       config.load(file);
/*    */     } catch (FileNotFoundException localFileNotFoundException) {
/*    */     } catch (IOException ex) {
/* 52 */       Bukkit.getLogger().log(Level.SEVERE, "Cannot load " + file, ex);
/*    */     } catch (InvalidConfigurationException ex) {
/* 54 */       if ((ex.getCause() instanceof YAMLException))
/* 55 */         Bukkit.getLogger().severe("Config file " + file + " isn't valid! " + ex.getCause());
/* 56 */       else if ((ex.getCause() == null) || ((ex.getCause() instanceof ClassCastException)))
/* 57 */         Bukkit.getLogger().severe("Config file " + file + " isn't valid!");
/*    */       else {
/* 59 */         Bukkit.getLogger().log(Level.SEVERE, "Cannot load " + file + ": " + ex.getCause().getClass(), ex);
/*    */       }
/*    */     }
/* 62 */     config.file = file;
/*    */ 
/* 64 */     return config;
/*    */   }
/*    */ 
/*    */   public void save() throws IOException {
/* 68 */     if (this.file == null)
/* 69 */       throw new UnsupportedOperationException("You didn't use a File to create this object.");
/* 70 */     super.save(this.file);
/*    */   }
/*    */}

/* Location:           C:\Users\zachary\Documents\Desktop\RpgEssentials\
 * Qualified Name:     me.duckdoom5.RpgEssentials.config.MyConfiguration
 * JD-Core Version:    0.6.0
 */