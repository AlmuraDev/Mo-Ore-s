package com.github.Zarklord1.MoOres.Thermite;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class Thermitedust extends GenericCustomItem  {

	public Thermitedust(Plugin plugin) {
		super(plugin, "Thermite Dust",  "http://cdn.spout.org/img/icon/spout_16x16.png");
		SpoutManager.getFileManager().addToPreLoginCache(plugin,  "http://cdn.spout.org/img/icon/spout_16x16.png");
	}
}
