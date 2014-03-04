package com.spencerio.smm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.spencerio.smm.SpenceriosModMod;

public class BlockSMMCompressed extends Block
{
	public BlockSMMCompressed(Material par1Material) {
		super(par1Material);
		this.setCreativeTab(SpenceriosModMod.tabSMMBlocks);
	}
}
