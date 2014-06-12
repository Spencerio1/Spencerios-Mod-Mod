package com.github.spencerio1.smm.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class SMMHelpBlockContainer extends Container
{
	public SMMHelpBlockContainer()
	{
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityPlayer)
	{
		return true;
	}
}
