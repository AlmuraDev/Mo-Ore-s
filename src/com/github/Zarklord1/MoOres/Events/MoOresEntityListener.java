package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Tools.CustomTools;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.SpoutPlayer;

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
            System.out.println("1");
            Entity entityhitting = event.getDamager();
            System.out.println("3");
            if (entityhitting instanceof Player){
                System.out.println("4");
                Player player = (Player) entityhitting;
                System.out.println("5");
                if (player instanceof SpoutPlayer) {
                    System.out.println("6");
                    SpoutPlayer splayer = SpoutManager.getPlayerManager().getPlayer(player);
                    System.out.println("7");
                    for (CustomTools tool:Hashmaps.customtools){
                        System.out.println(tool.getName());
                        //if (tool.isSword()) {
                            if (splayer.getItemInHand().getDurability() == tool.getDurability()) {
                                System.out.println(tool.getName() + "8");
                                MoOres.log.info("wind");
                                int damage = tool.getdamage();
                                event.setDamage(damage);
                                if (tool.isFireSword()) {
                                int firetime = tool.getfireticks();
                                entityhit.setFireTicks(firetime);
                                return;
                                } else {
                                    return;
                                }
                            }
                        //}
                    }
                }                
            }
        }
    }
}
