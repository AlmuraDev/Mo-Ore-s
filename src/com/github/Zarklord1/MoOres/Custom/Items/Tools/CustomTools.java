package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import org.getspout.spoutapi.material.item.GenericCustomTool;

import com.github.Zarklord1.MoOres.MoOres;

public class CustomTools extends GenericCustomTool {
    
    boolean fire;
    boolean poison;
    boolean lightning;
    int fireticks;
    int poisonticks;
    int damage;
    float speed;
    public CustomTools(String name, String textureurl, short durability, float strength, boolean Pickaxe, boolean Axe, boolean Shovel, boolean Hoe, boolean Bow, boolean Sword, int damage, boolean fire, int fireticks, boolean poison, boolean lightning, int poisonticks, float speed) {
    	super(MoOres.plugin, name, textureurl);
    	this.setMaxDurability(durability);
    	this.damage = damage;
    	this.fire = fire;
    	this.fireticks = fireticks;
    	this.poisonticks = poisonticks;
    	this.poison = poison;
    	this.lightning = lightning;
    	this.speed = speed;
    	//TODO implement block breack speeds and what blocks can be broken per tool
    }
    public int getdamage() {
        return damage;
    }
    public boolean isFireSword() {
        return fire;
    }
    public boolean isLightningSword() {
        return this.lightning;
    }
    public boolean isPoisonSword() {
        return this.poison;
    }
    public int getPoisonTicks() {
        return poisonticks;
    }
    public int getFireTicks() {
        return fireticks;
    }
    public int getId() {
      return 318;
    }
    public float getSpeed() {
        return speed;
    }
}