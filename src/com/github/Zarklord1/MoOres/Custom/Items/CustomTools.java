package com.github.Zarklord1.MoOres.Custom.Items;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.MoOres;

public class CustomTools extends GenericCustomTool {
    
    boolean Pickaxe;
    boolean Axe;
    boolean Shovel;
    boolean Hoe;
    boolean Bow;
    boolean Sword;
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
    	this.Axe = Axe;
    	this.Shovel = Shovel;
    	this.Hoe = Hoe;
    	this.Bow = Bow;
    	this.Sword = Sword;
    	this.fire = fire;
    	this.fireticks = fireticks;
    	this.poisonticks = poisonticks;
    	this.Pickaxe = Pickaxe;
    	this.poison = poison;
    	this.lightning = lightning;
    	this.speed = speed;
    	//TODO implement block breack speeds and what blocks can be broken per tool
    }
    
    public boolean isPickaxe() {
        return Pickaxe;
    }
    public boolean isAxe() {
        return Axe;
    }
    public boolean isShovel() {
        return Shovel;
    }
    public boolean isBow() {
        return Bow;
    }
    public boolean isSword() {
        return Sword;
    }
    public boolean isHoe() {
        return Hoe;
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
    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
    	if (player.isSpoutCraftEnabled()) {
    		if (this.isHoe()) {
    			if (block.equals(MaterialData.dirt) || block.equals(MaterialData.grass)) {
    				block.setType(Material.SOIL);
    				CustomTools.setDurability(player.getItemInHand(), (short) (CustomTools.getDurability(player.getItemInHand()) + 1));
    			}
    		}
    	}
        return true;
    }
}