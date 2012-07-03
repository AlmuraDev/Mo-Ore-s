package com.github.Zarklord1.MoOres.Custom.Items.Arrows;

import java.util.HashMap;
import java.util.LinkedHashMap;
import org.bukkit.entity.Arrow;

public class MoArrow{
	
	private static HashMap<Arrow, Boolean> FireArrow = new LinkedHashMap<Arrow, Boolean>();
	private static HashMap<Arrow, Boolean> PoisonArrow = new LinkedHashMap<Arrow, Boolean>();
        private static HashMap<Arrow, Boolean> LightningArrow = new LinkedHashMap<Arrow, Boolean>();
        private static HashMap<Arrow, Boolean> ExplosiveArrow = new LinkedHashMap<Arrow, Boolean>();
	private static HashMap<Arrow, Integer> FireTicks = new LinkedHashMap<Arrow, Integer>();
        private static HashMap<Arrow, Integer> PoisonTicks = new LinkedHashMap<Arrow, Integer>();
        private static HashMap<Arrow, Integer> NumOfBolts = new LinkedHashMap<Arrow, Integer>();
        private static HashMap<Arrow, Float> ExplosionRadius = new LinkedHashMap<Arrow, Float>();
	private static HashMap<Arrow, Integer> Damage = new LinkedHashMap<Arrow, Integer>();
        

	public static void setDamage(Arrow arrow, int damage) {
            MoArrow.Damage.put(arrow, damage);
	}
	

	public static int getDamage(Arrow arrow) {
            if (MoArrow.Damage.containsKey(arrow)) {
                return MoArrow.Damage.get(arrow);
            }
            return 0;
	}


	public static void setIsFireArrow(Arrow arrow, boolean firearrow) {
            MoArrow.FireArrow.put(arrow, firearrow);
	}


	public static void setIsLightningArrow(Arrow arrow, boolean lightningarrow) {
            MoArrow.PoisonArrow.put(arrow, lightningarrow);
	}


	public static void setIsPoisonArrow(Arrow arrow, boolean poisonarrow) {
            MoArrow.LightningArrow.put(arrow, poisonarrow);
	}


	public static void setIsExplosiveArrow(Arrow arrow, boolean explosivearrow) {
            MoArrow.ExplosiveArrow.put(arrow, explosivearrow);
	}


	public static boolean IsFireArrow(Arrow arrow) {
            if (MoArrow.FireArrow.containsKey(arrow)) {
                return MoArrow.FireArrow.get(arrow);
            }
            return false;
	}

        
	public static boolean IsLightningArrow(Arrow arrow) {
            if (MoArrow.LightningArrow.containsKey(arrow)) {
                return MoArrow.LightningArrow.get(arrow);
            }
            return false;
	}


	public static boolean IsPoisonArrow(Arrow arrow) {
            if (MoArrow.PoisonArrow.containsKey(arrow)) {
                return MoArrow.PoisonArrow.get(arrow);
            }
            return false;
	}


	public static boolean IsExplosiveArrow(Arrow arrow) {
            if (MoArrow.ExplosiveArrow.containsKey(arrow)) {
                return MoArrow.ExplosiveArrow.get(arrow);
            }
            return false;
	}
	

	public static void setFireTicks(Arrow arrow, int FireTicks) {
            MoArrow.FireTicks.put(arrow, FireTicks);
	}


	public static void setPoisonTicks(Arrow arrow, int PoisonTicks) {
            MoArrow.PoisonTicks.put(arrow, PoisonTicks);
	}


	public static void setNumberOfLightningBolts(Arrow arrow, int NumOfBolts) {
            MoArrow.NumOfBolts.put(arrow, NumOfBolts);
	}


	public static void setExplosionRadius(Arrow arrow, float Radius) {
            MoArrow.ExplosionRadius.put(arrow, Radius);
	}
	

	public static int getFireTicks(Arrow arrow) {
            if (MoArrow.FireTicks.containsKey(arrow)) {
                return MoArrow.FireTicks.get(arrow);
            }
            return 0;
	}


	public static int getPoisonTicks(Arrow arrow) {
            if (MoArrow.PoisonTicks.containsKey(arrow)) {
                return MoArrow.PoisonTicks.get(arrow);
            }
            return 0;
	}


	public static int getNumberOfLightningBolts(Arrow arrow) {
            if (MoArrow.NumOfBolts.containsKey(arrow)) {
                return MoArrow.NumOfBolts.get(arrow);
            }
            return 1;
	}

	public static float getExplosionRadius(Arrow arrow) {
            if (MoArrow.ExplosionRadius.containsKey(arrow)) {
                return MoArrow.ExplosionRadius.get(arrow);
            }
            return 3.5F;
	}
}