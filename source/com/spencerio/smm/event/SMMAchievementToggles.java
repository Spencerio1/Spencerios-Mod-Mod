package com.spencerio.smm.event;

import com.spencerio.smm.item.ItemSMMDGStaff;
import com.spencerio.smm.manager.SMMAchievementManager;

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
