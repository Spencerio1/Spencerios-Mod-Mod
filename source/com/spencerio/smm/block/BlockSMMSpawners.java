package com.spencerio.smm.block;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

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
}
