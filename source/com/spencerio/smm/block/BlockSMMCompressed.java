package com.spencerio.smm.block;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSMMCompressed extends Block
{
	public BlockSMMCompressed() {
		super(Material.rock);
		this.setCreativeTab(SpenceriosModMod.tabSMMBlocks);
	}
}
