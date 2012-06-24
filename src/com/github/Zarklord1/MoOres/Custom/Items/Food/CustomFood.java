package com.github.Zarklord1.MoOres.Custom.Items.Food;

import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class CustomFood extends GenericCustomItem
{
  int restore;

  public CustomFood(Plugin plugin, String name, String texture, int restore)
  {
    super(plugin, name, texture);
    this.restore = restore;
  }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {
        if (player.getFoodLevel() != 20) {
            if (player.getFoodLevel() + restore < 20) {
                player.setFoodLevel(player.getFoodLevel() + restore);
            } else {
                player.setFoodLevel(20);
            }
            ItemStack is = player.getItemInHand();
            ItemStack AfterEat;
            int amount = is.getAmount();
            if (amount > 1) {
                is.setAmount(amount - 1);
                AfterEat = is;
                player.setItemInHand(AfterEat);
            } else {
                AfterEat = new SpoutItemStack(MaterialData.air, 0);
                player.setItemInHand(AfterEat);
            }
        }
        return true;
    }
    
    public int getId() {
      return 318;
   }
}