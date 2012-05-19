package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFishes;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import java.util.Random;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.inventory.SpoutItemStack;

public class MoOresPlayerListener implements Listener {
    public static MoOres plugin;
        
        
    public MoOresPlayerListener(MoOres instance) {
        plugin = instance; 
    }
    
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerFish(PlayerFishEvent event) {
        Player player = event.getPlayer();
        State state = event.getState();
        if (state == state.FISHING) {
            for (CustomFishes Fish : Hashmaps.customfish) {
                Location droplocation = player.getLocation();
                Random rand = new Random();
                int chance = rand.nextInt(100);
                if (chance < Fish.getchance()) {
                    ItemStack fish = new SpoutItemStack(Fish);
                    droplocation.getWorld().dropItemNaturally(droplocation, fish);
                }
            }
        }
    }
}
