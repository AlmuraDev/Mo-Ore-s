package com.github.Zarklord1.MoOres.Ruby;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class Ruby extends GenericCustomItem  {

	public Ruby(Plugin plugin) {
		super(plugin, "Ruby",  "http://cdn.spout.org/img/icon/spout_16x16.png");
		SpoutManager.getFileManager().addToPreLoginCache(plugin,  "http://cdn.spout.org/img/icon/spout_16x16.png");
	}
}