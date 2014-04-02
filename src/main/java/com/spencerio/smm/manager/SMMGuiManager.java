package com.spencerio.smm.manager;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.spencerio.smm.SpenceriosModMod;
import com.spencerio.smm.block.BlockSMMHelp;
import com.spencerio.smm.client.gui.SMMHelpBlockContainer;
import com.spencerio.smm.client.gui.SMMHelpBlockGUI;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class SMMGuiManager implements IGuiHandler
{
	public SMMGuiManager()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(SpenceriosModMod.instance, this);
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case 0:
				Block block = world.getBlock(x, y, z);
				if(block != null && block instanceof BlockSMMHelp)
					return new SMMHelpBlockContainer();
				break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case 0:
				Block block = world.getBlock(x, y, z);
				if(block != null && block instanceof BlockSMMHelp)
					return new SMMHelpBlockGUI();
				break;
		}
		return null;
	}
}
