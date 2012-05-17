package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.Block;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomTool;

public class CustomTools extends GenericCustomTool
{
    
    boolean Pickaxe;
    boolean Axe;
    boolean Shovel;
    boolean Hoe;
    boolean Bow;
    boolean Sword;
    boolean fire;
    int firetime;
    int damage;
	public CustomTools(Plugin plugin, String name, String textureurl, short durability, float strength, boolean Pickaxe, boolean Axe, boolean Shovel, boolean Hoe, boolean Bow, boolean Sword, int damage, boolean fire, int firetime) {
		super(plugin, name, textureurl);
		this.setDurability(durability);
                this.damage = damage;
                this.Axe = Axe;
                this.Shovel = Shovel;
                this.Hoe = Hoe;
                this.Bow = Bow;
                this.Sword = Sword;
                this.fire = fire;
                this.firetime = firetime;
                this.Pickaxe = Pickaxe;

		if (Pickaxe) {
                    for (CustomBlocks Blocks:Hashmaps.customblocks) {
                    	this.setStrengthModifier(Blocks, strength);
                    }
                    for (CustomOres Ores:Hashmaps.customores) {
			this.setStrengthModifier(Ores, strength);
                    }
                    for (Block block:Hashmaps.Pickaxebreackableblocks) {
			this.setStrengthModifier(block, strength);
                    }
		}
                
                if (Axe) {
                    for (Block block:Hashmaps.Axebreackableblocks) {
			this.setStrengthModifier(block, strength);
                    }
                    for (CustomBlocks Blocks:Hashmaps.customblocks) {
			this.setStrengthModifier(Blocks, strength);
                    }
		}
                
                if (Shovel) {
                    for (Block block:Hashmaps.Shovelbreackableblocks) {
			this.setStrengthModifier(block, strength);
                    }
                    for (CustomBlocks Blocks:Hashmaps.customblocks) {
                        this.setStrengthModifier(Blocks, strength);
                    }
                }
                
                if (Sword) {
                    for (Block block:Hashmaps.Swordbreackableblocks) {
                       this.setStrengthModifier(block, strength);
                    }
                    for (CustomBlocks Blocks:Hashmaps.customblocks) {
                    	this.setStrengthModifier(Blocks, strength);
                    }
		}
                
                if (Hoe) {
                    this.setStrengthModifier(MaterialData.farmland, strength);
                }
                
                if (Bow) {
                    this.setStrengthModifier(MaterialData.dirt, strength);
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
        public int getfireticks() {
            return firetime;
        }
}