package com.github.spencerio1.smm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.init.SMMBlocks;
import com.github.spencerio1.smm.lib.GuiIds;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;

public class BlockSMMSpawners extends Block
{
	public BlockSMMSpawners()
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
			FMLNetworkHandler.openGui(entityPlayer, SpenceriosModMod.instance, GuiIds.CUSTOM_SPAWNER, world, x, y, z);
		else if(this == SMMBlocks.bossSpawner)
			FMLNetworkHandler.openGui(entityPlayer, SpenceriosModMod.instance, GuiIds.BOSS_SPAWNER, world, x, y, z);
		return true;
	}
	
	@Override
	public String getUnlocalizedName() {
		return "tile.smm." + super.getUnlocalizedName().substring(5);
	}
}
