package com.github.Zarklord1.MoOres.Custom.Items.Arrows;

import org.bukkit.entity.Arrow;

public interface MoArrow extends Arrow {
	
	public void setDamage(int damage);
	public int getDamage();
	public void setIsFireArrow(boolean firearrow);
	public void setIsLightningArrow(boolean lightningarrow);
	public void setIsPoisonArrow(boolean poisonarrow);
	public void setIsExplosiveArrow(boolean explosivearrow);
	public boolean IsFireArrow();
	public boolean IsLightningArrow();
	public boolean IsPoisonArrow();
	public boolean IsExplosiveArrow();
	public void setArrowFireTicks(int FireTicks);
	public void setPoisonTicks(int PoisonTicks);
	public void setNumberOfLightningBolts(int NumOfBolts);
	public void setExplosionRadius(float Radius);
	public int getArrowFireTicks();
	public int getPoisonTicks();
	public int getNumberOfLightningBolts();
	public float getExplosionRadius();
}