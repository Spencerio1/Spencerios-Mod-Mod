package com.github.spencerio1.smm.common.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class SMMCustomSpawnerContainer extends Container
{
	public SMMCustomSpawnerContainer()
	{
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityPlayer)
	{
		return true;
	}
}
