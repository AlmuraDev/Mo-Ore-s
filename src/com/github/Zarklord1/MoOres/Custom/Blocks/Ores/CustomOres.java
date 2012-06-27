package com.github.Zarklord1.MoOres.Custom.Blocks.Ores;

import com.github.Zarklord1.MoOres.MoOres;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.CustomItem;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CustomOres extends GenericCubeCustomBlock {
    
    private int minY = 2;
    private int maxY = 256;
    private int freq = 0;
    private int light = 1;
    float hard = 1.0F;
    float friction = 0.0F;
    int id;
    
    public CustomOres(MoOres plugin, String name, int textureid, int freq, int minY, int maxY, CustomItem drop, float hard, int light, float friction, int amount, int blockId, int metadata) {
        super(plugin, name, blockId, metadata, new GenericCubeBlockDesign(plugin, MoOres.ores, textureid));
        this.minY = minY;
        this.maxY = maxY;
        this.freq = freq;
        this.hard = hard;
        this.light = light;
        this.friction = friction;
        id = blockId;
        setFriction(friction);
        setHardness(hard);
        setLightLevel(light);
        SpoutItemStack drops = new SpoutItemStack(drop, amount);
        this.setItemDrop(drops);
    }
 
    public CustomOres(MoOres plugin, String name, int textureid, int freq, int minY, int maxY, CustomBlock drop, float hard, int light, float friction, int amount, int blockId, int metadata) {
        super(plugin, name, blockId, metadata, new GenericCubeBlockDesign(plugin, MoOres.ores, textureid));
        this.minY = minY;
        this.maxY = maxY;
        this.freq = freq;
        this.hard = hard;
        this.light = light;
        this.friction = friction;
        id = blockId;
        setFriction(friction);
        setHardness(hard);
        setLightLevel(light);
        if (drop != null) {
            SpoutItemStack drops = new SpoutItemStack(drop, amount);
            this.setItemDrop(drops);
        } else {
            SpoutItemStack drops = new SpoutItemStack(this, 1);
            this.setItemDrop(drops);
        }
    }

    public CustomOres(MoOres plugin, String name, int textureid, int freq, int minY, int maxY, float hard, int light, float friction, int amount, int blockId, int metadata, int dropid, short dropmetaid) {
        super(plugin, name, blockId, metadata, new GenericCubeBlockDesign(plugin, MoOres.ores, textureid));
        this.minY = minY;
        this.maxY = maxY;
        this.freq = freq;
        this.hard = hard;
        this.light = light;
        this.friction = friction;
        id = blockId; 
        setHardness(hard);
        setLightLevel(light);
        setFriction(friction);
        SpoutItemStack drops = new SpoutItemStack(MaterialData.getMaterial(dropid, dropmetaid), amount);
        this.setItemDrop(drops);
    }
    public int getFreq() {
        return this.freq;
    }
    public int getMinY() {
        return this.minY;
    }
    public int getMaxY() {
        return this.maxY;
    }
    @Override
    public float getHardness() {
        return this.hard;
    }
    public int getId() {
        return 318;
    }
    @Override
    public int getLightLevel() {
        return this.light;
    }
}
