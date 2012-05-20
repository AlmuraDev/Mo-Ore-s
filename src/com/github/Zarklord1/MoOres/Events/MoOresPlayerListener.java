package com.github.Zarklord1.MoOres.Events;

import com.github.Zarklord1.MoOres.Custom.Items.Food.CustomFishes;
import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Util.Hashmaps;
import java.util.Random;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
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
    Boolean fishchanged = false;
        
        
    public MoOresPlayerListener(MoOres instance) {
        plugin = instance; 
    }
    
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerFish(PlayerFishEvent event) {
        Player player = event.getPlayer();
        State state = event.getState();
        Entity entity = event.getCaught();
        Random rand = new Random();
        if (state == state.CAUGHT_FISH) {
            if (entity instanceof Item) {
                Item item = (Item) entity;
                for (CustomFishes fish:Hashmaps.customfish)    {
                    int Chance = rand.nextInt(100);
                    if (!fishchanged) {
                        if (Chance <= fish.getchance()) {
                            ItemStack fishingfish = new SpoutItemStack(fish, 1);
                            item.setItemStack(fishingfish);
                            fishchanged = true;
                        }
                    }
                }         
            }
        }
    }
}