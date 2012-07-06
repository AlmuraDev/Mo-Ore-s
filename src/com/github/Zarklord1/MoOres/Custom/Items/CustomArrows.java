package com.github.Zarklord1.MoOres.Custom.Items;

import org.getspout.spoutapi.material.item.GenericCustomItem;

import com.github.Zarklord1.MoOres.MoOres;

public class CustomArrows extends GenericCustomItem {
    int damage;
    boolean fireArrow;
    boolean lighntingArrow;
    boolean poisonArrow;
    boolean explosivearrow;
    int fireticks;
    int poisonticks;
    int NumofBoltStrikes;
    float Power;
    float speedmodifier;
    public CustomArrows(String name, String texture, int damage, boolean firearrow, boolean lighntingarrow, boolean Poisonarrow, boolean ExplosionArrow, int poisonticks, int fireticks, int LightningStrikes, float ExplosionPower, float speedmodifier) {
        super(MoOres.plugin, name, texture);
        this.damage = damage;
        this.fireArrow = firearrow;
        this.lighntingArrow = lighntingarrow;
        this.poisonArrow = Poisonarrow;
            this.explosivearrow = ExplosionArrow;
            this.fireticks = fireticks;
            this.poisonticks = poisonticks;
            this.NumofBoltStrikes = LightningStrikes;
            this.Power = ExplosionPower;
            this.speedmodifier = speedmodifier;
	}
	public int getId() {
            return 318;
	}
	public int getArrowDamage() {
            return damage;
	}
	public boolean isFireArrow() {
            return this.fireArrow;
	}
	public boolean isLighntingArrow() { 
		return this.lighntingArrow;
	}
	public boolean isPoisonArrow() {
		return this.poisonArrow;
	}
	public boolean isExplosiveArrow() {
		return this.explosivearrow;
	}
	public int getFireTicks() {
		return fireticks;
	}
	public int getPoisonTicks() {
		return poisonticks;
	}
	public int getNumOfBolts() {
		return this.NumofBoltStrikes;
	}
	public float getExplosionPower() {
            return this.Power;
        }
	public float getSpeedModifier() {
		return speedmodifier;
	}
}
