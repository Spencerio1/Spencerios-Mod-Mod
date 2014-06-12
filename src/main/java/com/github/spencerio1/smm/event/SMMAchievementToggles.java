package com.github.spencerio1.smm.event;

import com.github.spencerio1.smm.item.tools.ItemSMMDGStaff;
import com.github.spencerio1.smm.manager.SMMAchievementManager;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class SMMAchievementToggles
{
	@SubscribeEvent
	public void onThingCrafted(ItemCraftedEvent event)
	{
		if(event.crafting.getItem() instanceof ItemSMMDGStaff)
			event.player.triggerAchievement(SMMAchievementManager.dgstaff);
	}
}
