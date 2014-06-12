package com.github.spencerio1.smm.manager;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.block.BlockSMMHelp;
import com.github.spencerio1.smm.block.BlockSMMSpawners;
import com.github.spencerio1.smm.client.gui.SMMBossSpawnerContainer;
import com.github.spencerio1.smm.client.gui.SMMBossSpawnerGUI;
import com.github.spencerio1.smm.client.gui.SMMCustomSpawnerContainer;
import com.github.spencerio1.smm.client.gui.SMMCustomSpawnerGUI;
import com.github.spencerio1.smm.client.gui.SMMHelpBlockContainer;
import com.github.spencerio1.smm.client.gui.SMMHelpBlockGUI;

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
			case 1:
				Block block1 = world.getBlock(x, y, z);
				if(block1 != null && block1 instanceof BlockSMMSpawners)
					return new SMMCustomSpawnerContainer();
				break;
			case 2:
				Block block2 = world.getBlock(x, y, z);
				if(block2 != null && block2 instanceof BlockSMMSpawners)
					return new SMMBossSpawnerContainer();
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
			case 1:
				Block block1 = world.getBlock(x, y, z);
				if(block1 != null && block1 instanceof BlockSMMSpawners)
					return new SMMCustomSpawnerGUI();
				break;
			case 2:
				Block block2 = world.getBlock(x, y, z);
				if(block2 != null && block2 instanceof BlockSMMSpawners)
					return new SMMBossSpawnerGUI();
				break;
		}
		return null;
	}
}
