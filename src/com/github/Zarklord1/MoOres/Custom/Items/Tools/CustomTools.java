package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Custom.Items.Arrows.CustomArrows;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutPlayerInventory;
import org.getspout.spoutapi.material.Block;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.player.SpoutPlayer;

public class CustomTools extends GenericCustomTool
{
    
    boolean Pickaxe;
    boolean Axe;
    boolean Shovel;
    boolean Hoe;
    boolean Bow;
    boolean Sword;
    boolean fire;
    boolean poison;
    boolean lightning;
    int ticks;
    int damage;
	public CustomTools(Plugin plugin, String name, String textureurl, short durability, float strength, boolean Pickaxe, boolean Axe, boolean Shovel, boolean Hoe, boolean Bow, boolean Sword, int damage, boolean fire, int ticks, boolean poison, boolean lightning) {
		super(plugin, name, textureurl);
		this.setDurability(durability);
                this.damage = damage;
                this.Axe = Axe;
                this.Shovel = Shovel;
                this.Hoe = Hoe;
                this.Bow = Bow;
                this.Sword = Sword;
                this.fire = fire;
                this.ticks = ticks;
                this.Pickaxe = Pickaxe;
                this.poison = poison;
                this.lightning = lightning;
		if (Pickaxe) {
                    for (Block block:Hashmaps.Pickaxebreackableblocks) {
			this.setStrengthModifier(block, strength);
                    }
		}
                
                if (Axe) {
                    for (Block block:Hashmaps.Axebreackableblocks) {
			this.setStrengthModifier(block, strength);
                    }
		}
                
                if (Shovel) {
                    for (Block block:Hashmaps.Shovelbreackableblocks) {
			this.setStrengthModifier(block, strength);
                    }
                }
                
                if (Sword) {
                    for (Block block:Hashmaps.Swordbreackableblocks) {
                       this.setStrengthModifier(block, strength);
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
        public boolean isLightningSword() {
            return this.lightning;
        }
        public boolean isPoisonSword() {
            return this.poison;
        }
        public int getFireOrPoisonTicks() {
            return ticks;
        }

    public int getId() {
      return 318;
    }
    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
        CustomArrows arrow = null;
        ItemStack arrowstack = null;
        boolean firethearrow = false;
        if (this.isBow()) {
            SpoutPlayerInventory inventory = (SpoutPlayerInventory) player.getInventory();
            getArrow(inventory, arrowstack, arrow, firethearrow);
            if (firethearrow) {
                arrowstack.setAmount(arrowstack.getAmount() - 1);
                
            }
        } else if (this.isHoe()) {
            
        }
        return true;
    }
    private void getArrow(SpoutPlayerInventory inventory, ItemStack arrowstack, CustomArrows arrow, boolean bool) {
        for (CustomArrows arrows:Hashmaps.customarrows) {
            arrowstack = new SpoutItemStack(arrow);
            if (inventory.contains(arrowstack)) {
                arrow = arrows;
                bool = true;
                return;
            }
        }
        
    }
}