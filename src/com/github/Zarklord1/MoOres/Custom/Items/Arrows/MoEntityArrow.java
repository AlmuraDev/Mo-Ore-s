package com.github.Zarklord1.MoOres.Custom.Items.Arrows;

import java.util.List;
import java.util.UUID;

import net.minecraft.server.EntityArrow;

import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.entity.CraftArrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;



public class MoEntityArrow extends CraftArrow implements MoArrow {
	
	boolean SetFire = false;
	boolean SetPoison = false;
	boolean StrikeLighting = false;
	boolean Explode = false;
	int FireTicks = 0;
	int PoisonTicks = 0;
	int NumberOfBolts = 1;
	float ExplosionRadius = 5.0F;
	int Damage = 0;

	public MoEntityArrow(CraftServer server, EntityArrow entity) {
		super(server, entity);
	}
	
	@Override
	public void setDamage(int damage) {
		Damage = damage;
	}
	
	@Override
	public int getDamage() {
		return Damage;
	}

	@Override
	public void setIsFireArrow(boolean firearrow) {
		SetFire = firearrow;
		
	}

	@Override
	public void setIsLightningArrow(boolean lightningarrow) {
		StrikeLighting = lightningarrow;
	}

	@Override
	public void setIsPoisonArrow(boolean poisonarrow) {
		SetPoison = poisonarrow;
	}

	@Override
	public void setIsExplosiveArrow(boolean explosivearrow) {
		Explode = explosivearrow;
	}

	@Override
	public boolean IsFireArrow() {
		return SetFire;
	}

	@Override
	public boolean IsLightningArrow() {
		return StrikeLighting;
	}

	@Override
	public boolean IsPoisonArrow() {
		return SetPoison;
	}

	@Override
	public boolean IsExplosiveArrow() {
		return Explode;
	}
	
	@Override
	public void setArrowFireTicks(int FireTicks) {
		this.FireTicks = FireTicks;
	}

	@Override
	public void setPoisonTicks(int PoisonTicks) {
		this.PoisonTicks = PoisonTicks;
	}

	@Override
	public void setNumberOfLightningBolts(int NumOfBolts) {
		NumberOfBolts = NumOfBolts;
	}

	@Override
	public void setExplosionRadius(float Radius) {
		ExplosionRadius = Radius;
	}
	
	@Override
	public int getArrowFireTicks() {
		return FireTicks;
	}

	@Override
	public int getPoisonTicks() {
		return PoisonTicks;
	}

	@Override
	public int getNumberOfLightningBolts() {
		return NumberOfBolts;
	}

	@Override
	public float getExplosionRadius() {
		return ExplosionRadius;
	}

	@Override
	public boolean doesBounce() {
		return super.doesBounce();
	}

	@Override
	public LivingEntity getShooter() {
		return super.getShooter();
	}

	@Override
	public void setBounce(boolean arg0) {
		super.setBounce(arg0);
	}

	@Override
	public void setShooter(LivingEntity arg0) {
		super.setShooter(arg0);
	}

	@Override
	public boolean eject() {
		return super.eject();
	}

	@Override
	public int getEntityId() {
		return super.getEntityId();
	}

	@Override
	public float getFallDistance() {
		return super.getFallDistance();
	}

	@Override
	public int getFireTicks() {
		return super.getFireTicks();
	}

	@Override
	public EntityDamageEvent getLastDamageCause() {
		return super.getLastDamageCause();
	}

	@Override
	public Location getLocation() {
		return super.getLocation();
	}

	@Override
	public int getMaxFireTicks() {
		return super.getMaxFireTicks();
	}

	@Override
	public List<Entity> getNearbyEntities(double arg0, double arg1, double arg2) {
		return super.getNearbyEntities(arg0, arg1, arg2);
	}

	@Override
	public Entity getPassenger() {
		return super.getPassenger();
	}

	@Override
	public Server getServer() {
		return super.getServer();
	}

	@Override
	public int getTicksLived() {
		return super.getTicksLived();
	}

	@Override
	public EntityType getType() {
		return super.getType();
	}

	@Override
	public UUID getUniqueId() {
		return super.getUniqueId();
	}

	@Override
	public Entity getVehicle() {
		return super.getVehicle();
	}

	@Override
	public Vector getVelocity() {
		return super.getVelocity();
	}

	@Override
	public org.bukkit.World getWorld() {
		return super.getWorld();
	}

	@Override
	public boolean isDead() {
		return super.isDead();
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public boolean isInsideVehicle() {
		return super.isInsideVehicle();
	}

	@Override
	public boolean leaveVehicle() {
		return super.leaveVehicle();
	}

	@Override
	public void playEffect(EntityEffect arg0) {
		super.playEffect(arg0);
	}

	@Override
	public void remove() {
		super.remove();
	}

	@Override
	public void setFallDistance(float arg0) {
		super.setFallDistance(arg0);
	}

	@Override
	public void setFireTicks(int arg0) {
		super.setFireTicks(arg0);
	}

	@Override
	public void setLastDamageCause(EntityDamageEvent arg0) {
		super.setLastDamageCause(arg0);
	}

	@Override
	public boolean setPassenger(Entity arg0) {
		return super.setPassenger(arg0);
	}

	@Override
	public void setTicksLived(int arg0) {
		super.setTicksLived(arg0);
	}

	@Override
	public void setVelocity(Vector arg0) {
		super.setVelocity(arg0);
	}

	@Override
	public boolean teleport(Location arg0) {
		return super.teleport(arg0);
	}

	@Override
	public boolean teleport(Entity arg0) {
		return super.teleport(arg0);
	}

	@Override
	public boolean teleport(Location arg0, TeleportCause arg1) {
		return super.teleport(arg0, arg1);
	}

	@Override
	public boolean teleport(Entity arg0, TeleportCause arg1) {
		return super.teleport(arg0, arg1);
	}

	@Override
	public List<MetadataValue> getMetadata(String arg0) {
		return super.getMetadata(arg0);
	}

	@Override
	public boolean hasMetadata(String arg0) {
		return super.hasMetadata(arg0);
	}

	@Override
	public void removeMetadata(String arg0, Plugin arg1) {
		super.removeMetadata(arg0, arg1);
	}

	@Override
	public void setMetadata(String arg0, MetadataValue arg1) {
		super.setMetadata(arg0, arg1);
	}

}
