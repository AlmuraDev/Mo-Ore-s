package com.github.Zarklord1.MoOres.Flarite;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class Flariteingot extends GenericCustomItem  {

	public Flariteingot(Plugin plugin) {
		super(plugin, "Flarite Ingot",  "http://cdn.spout.org/img/icon/spout_16x16.png");
		SpoutManager.getFileManager().addToPreLoginCache(plugin,  "http://cdn.spout.org/img/icon/spout_16x16.png");
	}
}
