package com.github.Zarklord1.MoOres.Crystalite;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.Plugin;
import org.getspout.commons.block.BlockFace;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Crsytaliteore extends GenericCubeCustomBlock {
	public Crsytaliteore(Plugin plugin) {
        super(plugin, "Flarite Ore", "http://cdn.spout.org/img/icon/spout_16x16.png", 16);
        SpoutManager.getFileManager().addToPreLoginCache(plugin,  "http://cdn.spout.org/img/icon/spout_16x16.png");
	}
	 
    public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) { }
 
    public void onBlockPlace(World world, int x, int y, int z) { }
 
    public void onBlockPlace(World world, int x, int y, int z, LivingEntity living) { }
 
    public void onBlockDestroyed(World world, int x, int y, int z) { }
 
    public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
        return true;
    }
 
    public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) { }
 
    public void onBlockClicked(World world, int x, int y, int z, SpoutPlayer player) { }
 
    public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
 
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
}
