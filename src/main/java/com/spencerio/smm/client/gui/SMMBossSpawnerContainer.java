package com.spencerio.smm.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class SMMBossSpawnerContainer extends Container
{
	public SMMBossSpawnerContainer()
	{
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer var1)
	{
		return true;
	}

}
