package com.github.Zarklord1.MoOres.Custom.Items.Arrows;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class CustomArrows extends GenericCustomItem  {
    int damage;
    boolean firearrow;
    boolean lighntingarrow;
    int fireticks;
	public CustomArrows(Plugin plugin, String name, String texture, int damage, boolean firearrow, boolean lighntingarrow, int fireticks) {
		super(plugin, name, texture);
                this.damage = damage;
                this.firearrow = firearrow;
                this.lighntingarrow = lighntingarrow;
                this.fireticks = fireticks;
	}
        public int getId() {
            return 318;
        }
        public int getArrowDamage() {
            return damage;
        }
        public boolean isFireArrow() {
            return this.firearrow;
        }
        public boolean isLighntingArrow() {
            return this.lighntingarrow;
        }
        public int getFireTicks() {
            return fireticks;
        }
}
