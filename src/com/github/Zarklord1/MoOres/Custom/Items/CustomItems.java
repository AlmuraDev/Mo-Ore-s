package com.github.Zarklord1.MoOres.Custom.Items;

import org.getspout.spoutapi.material.item.GenericCustomItem;

import com.github.Zarklord1.MoOres.MoOres;

public class CustomItems extends GenericCustomItem {
	
	public CustomItems(String name, String texture){
		super(MoOres.plugin, name, texture);
	}
	
	public int getId() {
		return 318;
	}
}