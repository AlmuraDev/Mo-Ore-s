package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import com.github.Zarklord1.MoOres.Custom.Blocks.CustomBlocks;
import com.github.Zarklord1.MoOres.Custom.Blocks.Ores.CustomOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.block.Block;

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
                        for (MaterialData materialdata:Hashmaps.Pickaxebreackableblocks) {
				this.setStrengthModifier(materialdata, strength);
			}
                        this.setStrengthModifier(null, strength)

                        this.setStrengthModifier(MaterialData.diamondOre, strength);
			this.setStrengthModifier(MaterialData.coalOre, strength);
			this.setStrengthModifier(MaterialData.goldOre, strength);
			this.setStrengthModifier(MaterialData.lapisOre, strength);
			this.setStrengthModifier(MaterialData.redstoneOre, strength);
			this.setStrengthModifier(MaterialData.ironOre, strength);
			this.setStrengthModifier(MaterialData.brick, strength);
			this.setStrengthModifier(MaterialData.brickDoubleSlabs, strength);
			this.setStrengthModifier(MaterialData.brickSlab, strength);
			this.setStrengthModifier(MaterialData.brickStairs, strength);
			this.setStrengthModifier(MaterialData.burningfurnace, strength);
			this.setStrengthModifier(MaterialData.circleStoneBricks, strength);
			this.setStrengthModifier(MaterialData.cobblestone, strength);
			this.setStrengthModifier(MaterialData.cobblestoneDoubleSlabs, strength);
			this.setStrengthModifier(MaterialData.cobblestoneStairs, strength);
			this.setStrengthModifier(MaterialData.crackedStoneBricks, strength);
			this.setStrengthModifier(MaterialData.detectorRail, strength);
			this.setStrengthModifier(MaterialData.diamondBlock, strength);
			this.setStrengthModifier(MaterialData.dispenser, strength);
			this.setStrengthModifier(MaterialData.endStone, strength);
			this.setStrengthModifier(MaterialData.furnace, strength);
			this.setStrengthModifier(MaterialData.glowingRedstoneOre, strength);
			this.setStrengthModifier(MaterialData.glowstoneBlock, strength);
			this.setStrengthModifier(MaterialData.goldBlock, strength);
			this.setStrengthModifier(MaterialData.ironBars, strength);
			this.setStrengthModifier(MaterialData.ironBlock, strength);
			this.setStrengthModifier(MaterialData.ironDoorBlock, strength);
			this.setStrengthModifier(MaterialData.jukebox, strength);
			this.setStrengthModifier(MaterialData.monsterSpawner, strength);
			this.setStrengthModifier(MaterialData.mossStone, strength);
			this.setStrengthModifier(MaterialData.mossyStoneBricks, strength);
			this.setStrengthModifier(MaterialData.netherBrick, strength);
			this.setStrengthModifier(MaterialData.netherBrickFence, strength);
			this.setStrengthModifier(MaterialData.netherBrickStairs, strength);
			this.setStrengthModifier(MaterialData.netherrack, strength);
			this.setStrengthModifier(MaterialData.noteblock, strength);
			this.setStrengthModifier(MaterialData.obsidian, strength);
			this.setStrengthModifier(MaterialData.pistonBase, strength);
			this.setStrengthModifier(MaterialData.pistonStickyBase, strength);
			this.setStrengthModifier(MaterialData.poweredRail, strength);
			this.setStrengthModifier(MaterialData.sandstone, strength);
			this.setStrengthModifier(MaterialData.sandstoneDoubleSlabs, strength);
			this.setStrengthModifier(MaterialData.sandstoneSlab, strength);
			this.setStrengthModifier(MaterialData.silverfishStone, strength);
			this.setStrengthModifier(MaterialData.stone, strength);
			this.setStrengthModifier(MaterialData.stoneBrickDoubleSlabs, strength);
			this.setStrengthModifier(MaterialData.stoneBricks, strength);
			this.setStrengthModifier(MaterialData.stoneBrickSlab, strength);
			this.setStrengthModifier(MaterialData.stoneBrickStairs, strength);
			this.setStrengthModifier(MaterialData.stoneButton, strength);
			this.setStrengthModifier(MaterialData.stoneDoubleSlabs, strength);
			this.setStrengthModifier(MaterialData.stonePressurePlate, strength);
			this.setStrengthModifier(MaterialData.stoneSlab, strength);
		}
                if (Axe) {
			this.setStrengthModifier(MaterialData.trapdoor, strength);
		}
                if (Shovel) {
			this.setStrengthModifier(MaterialData.trapdoor, strength);
		}
                if (Sword) {
			this.setStrengthModifier(MaterialData.trapdoor, strength);
		}
                if (Hoe) {
                        this.setStrengthModifier(MaterialData.trapdoor, strength);
                }
                if (Bow) {
                        this.setStrengthModifier(MaterialData.trapdoor, strength);
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
        public boolean isFireTool() {
            return fire;
        }
        public int getfiretime() {
            return firetime;
        }
}