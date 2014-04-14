package com.github.Zarklord1.MoOres.Events;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.gui.GenericItemWidget;
import org.getspout.spoutapi.gui.GenericWidget;
import org.getspout.spoutapi.gui.GenericTexture;
import org.getspout.spoutapi.gui.RenderPriority;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.Zarklord1.MoOres.MoOres;

public class MoOresBowArrowListener implements Listener {
	public static HashMap<SpoutPlayer, List<GenericWidget>> spoutPlayerWidgetList = new LinkedHashMap<SpoutPlayer, List<GenericWidget>>();
	
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLogon(PlayerLoginEvent event) {
        //X=0 Y=150 puts it in proper position
   		int baseY = 150;
    	int baseX = 0;
       	GenericTexture modernArrowSwitch = new GenericTexture();
       	modernArrowSwitch.setUrl("https://dl.dropboxusercontent.com/u/77733573/Plugins/MoOres1.6/GUI/ArrowSwitcherModernHighRes.png");
       	modernArrowSwitch.setX(baseX).setY(baseY).setWidth(20).setHeight(48).setPriority(RenderPriority.Highest);
       	//create the 3 arrows to be displayed
       	GenericItemWidget arrowTop = new GenericItemWidget(new ItemStack(Material.ARROW, 1));
       	arrowTop.setX(baseX + 5).setY(baseY + 3).setWidth(6).setHeight(6);
       	GenericItemWidget arrowMiddle = new GenericItemWidget(new ItemStack(Material.ARROW, 1));
       	arrowMiddle.setX(baseX + 3).setY(baseY + 17).setWidth(8).setHeight(8);
       	GenericItemWidget arrowBottom = new GenericItemWidget(new ItemStack(Material.ARROW, 1));
       	arrowBottom.setX(baseX + 5).setY(baseY + 35).setWidth(6).setHeight(6);
       	if (event.getPlayer() instanceof SpoutPlayer) {
       		//don't attach it if their not a spout player
       		SpoutPlayer splayer = (SpoutPlayer) event.getPlayer();
       		splayer.getMainScreen().attachWidget(MoOres.plugin, modernArrowSwitch);
       		splayer.getMainScreen().attachWidget(MoOres.plugin, arrowTop);
     		splayer.getMainScreen().attachWidget(MoOres.plugin, arrowMiddle);
       		splayer.getMainScreen().attachWidget(MoOres.plugin, arrowBottom);
       		//save the widgets for later use per player
       		List<GenericWidget> widgetList = new LinkedList<GenericWidget>();
       		widgetList.add(modernArrowSwitch);
       		widgetList.add(arrowTop);
       		widgetList.add(arrowMiddle);
       		widgetList.add(arrowBottom);
       		spoutPlayerWidgetList.put(splayer, widgetList);
       	}	
   	}
}
