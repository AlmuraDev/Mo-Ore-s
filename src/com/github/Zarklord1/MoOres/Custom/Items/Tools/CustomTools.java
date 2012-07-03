package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import com.github.Zarklord1.MoOres.Custom.Items.Arrows.CustomArrows;
import com.github.Zarklord1.MoOres.Custom.Items.Arrows.MoArrow;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.BlockLoader;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Arrow;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutPlayerInventory;
import org.getspout.spoutapi.material.Block;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.player.SpoutPlayer;

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
    public CustomTools(Plugin plugin, String name, String textureurl, short durability, float strength, boolean Pickaxe, boolean Axe, boolean Shovel, boolean Hoe, boolean Bow, boolean Sword, int damage, boolean fire, int fireticks, boolean poison, boolean lightning, int poisonticks, float speed) {
	super(MoOres.plugin, name, textureurl);
	this.setDurability(durability);
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
        
		if (this.isPickaxe()) {
			for (Block block:BlockLoader.PickaxeSpeedIds) {
				this.setStrengthModifier(block, strength);
            }
		}
                
        if (Axe) {
        	for (Block block:BlockLoader.AxeSpeedIds) {
        		this.setStrengthModifier(block, strength);
        	}
		}
                
        if (Shovel) {
        	for (Block block:BlockLoader.ShovelSpeedIds) {
        		this.setStrengthModifier(block, strength);
        	}
        }
                
        if (Sword) {
        	for (Block block:BlockLoader.SwordSpeedIds) {
        		this.setStrengthModifier(block, strength);
        	}
		}
                
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
        if (this.isHoe()) {
          if (block.equals(MaterialData.dirt) || block.equals(MaterialData.grass)) {
              block.setType(Material.SOIL);
          }
        }
        return true;
    }
}