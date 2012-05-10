package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Config.Configuration;
import com.github.Zarklord1.MoOres.MoOres;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.getspout.commons.entity.Player;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.material.item.GenericCustomTool;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.Util.Hashmaps;

public class MoOresEntityListener implements Listener  {
    	public static MoOres plugin;
    
    public MoOresEntityListener(MoOres instance) {
        plugin = instance; 
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDamage ( EntityDamageByEntityEvent event )
    {
	if( event.getCause() == DamageCause.ENTITY_ATTACK ) {
            Entity entityhit = event.getEntity();
            Entity entityhitting = event.getDamager();
            if (entityhitting instanceof Player){
                Player player = (Player) entityhitting;
                if (player instanceof SpoutPlayer) {
                    SpoutPlayer splayer = (SpoutPlayer) player;
                    for (GenericCustomTool tool:Hashmaps.customtools){
                        if (Configuration.items.getBoolean("Custom Tools." + tool.getName() + ".tooltype.Sword")) {
                            if (splayer.getItemInHand().equals(tool)) {
                                int damage = Configuration.items.getInt("Custom Tools." + tool.getName() + ".damage");
                                event.setDamage(damage);
                            }
                        }
                    }
                }                
            }
        }
	/*@SuppressWarnings("deprecation")
	@Override
	public void fire(Gun g) {
		if(!player.hasPermission("gunsplus.fire.all")) {
			if(!player.hasPermission("gunsplus.fire." + g.getName().toLowerCase().replace(" ", "_"))) 
				return;
		}
		Inventory inv = getPlayer().getInventory();
		if(!GunUtils.isShootable(g)&&!GunUtils.isMountable(g)){
			PlayerUtils.sendNotification(getPlayer(), "This gun is ready for", "the scrap heap!", new ItemStack(Material.IRON_INGOT), 2000);
			return;
		}else if(GunUtils.isShootable(g)&&!GunUtils.isMountable(g)&&Util.enteredTripod(getPlayer())){
			PlayerUtils.sendNotification(getPlayer(), "Use this gun ", "only outside a tripod!", new SpoutItemStack(GunsPlus.tripod), 2000);
			return;
		}else if(!GunUtils.isShootable(g)&&GunUtils.isMountable(g)&&!Util.enteredTripod(getPlayer())){
			PlayerUtils.sendNotification(getPlayer(), "Enter a tripod to", "use this heavy gun!", new SpoutItemStack(g), 2000);
			return;
		}
		if(Util.enteredTripod(getPlayer()))
			inv = Util.getTripodDataOfEntered(getPlayer()).getInventory();
		if (!GunUtils.checkInvForAmmo(inv, g.getAmmo()))
			return;
		if (isReloading())
			return;
		else if (isDelaying())
			return;
		else if (isOutOfAmmo(g))
			return;
		else {
			Ammo usedAmmo = GunUtils.getFirstCustomAmmo(inv, g.getAmmo());
			HashMap<LivingEntity, Integer> targets_damage = new HashMap<LivingEntity, Integer>(
					GunUtils.getTargets(player.getEyeLocation(), g, isZooming()));
			if(targets_damage.isEmpty()){
				Location from = Util.getBlockInSight(getPlayer().getEyeLocation(), 2, 5).getLocation();
				GunUtils.shootProjectile(from, getPlayer().getEyeLocation().getDirection().toLocation(getLocation().getWorld()),
						(Projectile) g.getObject("PROJECTILE"));
			}
			for (LivingEntity tar : targets_damage.keySet()) {
				if (tar.equals(getPlayer())) {
					continue;
				}
				int damage = targets_damage.get(tar);
				Location from = Util.getBlockInSight(getPlayer().getEyeLocation(), 2, 5).getLocation();
				GunUtils.shootProjectile(from, tar.getEyeLocation(),(Projectile) g.getObject("PROJECTILE"));
				if (damage < 0)
					PlayerUtils.sendNotification(getPlayer(), "Headshot!",
							"with a " + GunUtils.getRawGunName(g),
							new ItemStack(Material.ARROW), 2000);
				targets_damage.put(tar, Math.abs(damage));
				damage = targets_damage.get(tar);
				if (Util.getRandomInteger(0, 100) <= g.getValue("CRITICAL")) {
					PlayerUtils.sendNotification(getPlayer(), "Critical!",
							"with a " + GunUtils.getRawGunName(g),
							new ItemStack(Material.DIAMOND_SWORD), 2000);
					damage = tar.getHealth() + 1000;
				}
				if (usedAmmo != null) {
					damage += usedAmmo.getDamage();
				}
				tar.damage(damage, getPlayer());
			}

			GunUtils.performEffects(new HashSet<LivingEntity>(targets_damage.keySet()),player, g);

			GunUtils.removeAmmo(inv, g.getAmmo());
			Bukkit.getServer().getPluginManager().callEvent(new GunFireEvent(this.getPlayer(),g));
			getPlayer().updateInventory();
			setFireCounter(g, getFireCounter(g) + 1);

			if (!(g.getResource("SHOTSOUND") == null)) {
				if (g.getValue("SHOTDELAY") < 5
						&& Util.getRandomInteger(0, 100) < 35) {
					Util.playCustomSound(GunsPlus.plugin, getLocation(),
							g.getResource("SHOTSOUND"),
							(int) g.getValue("SHOTSOUNDVOLUME"));
				} else {
					Util.playCustomSound(GunsPlus.plugin, getLocation(),
							g.getResource("SHOTSOUND"),
							(int) g.getValue("SHOTSOUNDVOLUME"));
				}

			}

			recoil(g);

			if (GunsPlus.autoreload
					&& getFireCounter(g) >= g.getValue("SHOTSBETWEENRELOAD"))
				reload(g);
			if ((int) g.getValue("SHOTDELAY") > 0)
				delay(g);
		}
	}*/
    }
}
