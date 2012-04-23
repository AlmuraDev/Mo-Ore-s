package com.github.Zarklord1.MoOres.Silver;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class Silveringot extends GenericCustomItem  {

	public Silveringot(Plugin plugin) {
		super(plugin, "Silver Ingot",  "http://cdn.spout.org/img/icon/spout_16x16.png");
		SpoutManager.getFileManager().addToPreLoginCache(plugin,  "http://cdn.spout.org/img/icon/spout_16x16.png");
	}
}
