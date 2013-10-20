package com.github.Zarklord1.MoOres.Custom.Items.Tools;

import org.bukkit.entity.Entity;
import org.getspout.spoutapi.material.item.GenericCustomItem;

import com.github.Zarklord1.MoOres.MoOres;

public class CustomArrows extends GenericCustomItem {
    float speedModifier;
    boolean remove;
    int damage;
    boolean fireArrow;
    int fireTicks;
    boolean poisonArrow;
    int poisonTicks;
    boolean lighntingArrow;
    int numofBolts;
    boolean explosiveArrow;
    float explosionPower;
    boolean entityArrow;
    Entity entityToSpawn;
    
    public CustomArrows(String name, String texture, float speedModifier, boolean remove, int damage, boolean fireArrow, int fireTicks, boolean poisonArrow, int poisonTicks, boolean lightningArrow, int numOfBolts, boolean explosiveArrow, float explosionPower, boolean entityArrow, Entity entityToSpawn) {
        super(MoOres.plugin, name, texture);
        this.speedModifier = speedModifier;
        this.remove = remove;
        this.damage = damage;
        this.fireArrow = fireArrow;
        this.fireTicks = fireTicks;
        this.poisonArrow = poisonArrow;
        this.poisonTicks = poisonTicks;
        this.lighntingArrow = lightningArrow;
        this.numofBolts = numOfBolts;
        this.explosiveArrow = explosiveArrow;
        this.explosionPower = explosionPower;
        this.entityArrow = entityArrow;
        this.entityToSpawn = entityToSpawn;
	}
    
	public int getId() {
		return 318;
	}
	public float getSpeedModifier() {
		return speedModifier;
	}
	public boolean getRemove() {
		return remove;
	}
	public int getDamage() {
		return damage;
	}
	public boolean isFireArrow() { 
		return fireArrow;
	}
	public int getFireTicks() {
		return fireTicks;
	}
	public boolean isPoisonArrow() {
		return poisonArrow;
	}
	public int getPoisonTicks() {
		return poisonTicks;
	}
	public boolean isLightningArrow() {
		return lighntingArrow;
	}
	public int getNumOfBolts() {
		return numofBolts;
	}
	public boolean isExplosiveArrow() {
        return explosiveArrow;
	}
	public float getExplosionPower() {
        return explosionPower;
    }
	public boolean isEntityArrow() {
        return entityArrow;
	}
	public Entity getEntityToSpawn() { 
		return entityToSpawn;
	}
}
