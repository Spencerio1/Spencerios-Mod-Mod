package com.spencerio.smm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.spencerio.smm.SpenceriosModMod;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;

public class BlockSMMSpawners extends Block
{
	protected BlockSMMSpawners()
	{
		super(Material.rock);
		this.setCreativeTab(SpenceriosModMod.tabSMMMisc);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
	{
		if(this == SMMBlocks.customSpawner)
			FMLNetworkHandler.openGui(entityPlayer, SpenceriosModMod.instance, 1, world, x, y, z);
		else if(this == SMMBlocks.bossSpawner)
			FMLNetworkHandler.openGui(entityPlayer, SpenceriosModMod.instance, 2, world, x, y, z);
		return true;
	}
}
