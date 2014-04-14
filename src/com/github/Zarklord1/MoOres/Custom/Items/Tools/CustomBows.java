package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.item.GenericCustomTool;

import com.github.Zarklord1.MoOres.Config.Configuration;

public class CustomBows extends GenericCustomTool {
	public Set<CustomArrows> FirableArrows = new LinkedHashSet<CustomArrows>();
	int numOfSecondsChargingToFullPower;
	int numOfSecondsChargingToNotFireArrow;
	public  HashMap<Integer, HashMap<Integer, Float>> ArrowSpeedMap = new LinkedHashMap<Integer, HashMap<Integer, Float>>();
    int damageModifier;
    boolean fireBow;
    int fireTicks;
    boolean poisonBow;
    int poisonTicks;
    boolean lighntingBow;
    int numofBolts;
    boolean explosiveBow;
    float explosionPower;
    boolean entityBow;
    Entity entityToSpawn;
    int numOfEntitysToSpawn;


	public CustomBows(Plugin plugin, String name, String texture) {
		super(plugin, name, texture);
		String FilePath = "Custom Bows" + name;
		Configuration.items.get(FilePath);
	}}
