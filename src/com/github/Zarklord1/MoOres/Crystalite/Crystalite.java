package com.github.Zarklord1.MoOres.Crystalite;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class Crystalite extends GenericCustomItem  {

	public Crystalite(Plugin plugin) {
		super(plugin, "Crystalite",  "http://cdn.spout.org/img/icon/spout_16x16.png");
		SpoutManager.getFileManager().addToPreLoginCache(plugin,  "http://cdn.spout.org/img/icon/spout_16x16.png");
	}
}
