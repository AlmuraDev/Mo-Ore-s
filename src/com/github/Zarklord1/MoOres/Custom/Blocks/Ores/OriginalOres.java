package com.github.Zarklord1.MoOres.Custom.Blocks.Ores;

import com.github.Zarklord1.MoOres.MoOres;
import org.bukkit.Material;

public class OriginalOres {
    
    private int minY = 2;
    private int maxY = 128;
    private int freq = 0;
    Material material;
    
    public OriginalOres(MoOres plugin, Material material, int freq, int minY, int maxY) {
        this.minY = minY;
        this.maxY = maxY;
        this.freq = freq;
        this.material = material;
    }
    
    public int getfreq() {
        return this.freq;
    }
    
    public Material getmaterial() {
        return this.material;
    }
    
    public int getminY() {
        return this.minY;
    }
    
    public int getmaxY() {
        return this.maxY;
    }
}