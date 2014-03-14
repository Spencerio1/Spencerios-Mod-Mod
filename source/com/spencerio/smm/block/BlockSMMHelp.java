package com.spencerio.smm.block;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSMMHelp extends Block
{
	protected BlockSMMHelp() {
		super(Material.ground);
		this.setCreativeTab(SpenceriosModMod.tabSMMBlocks);
	}
}
