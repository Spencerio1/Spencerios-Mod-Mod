package com.github.spencerio1.smm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.github.spencerio1.smm.SpenceriosModMod;

/**
 * The class for the Blocks comprised of 9 items of the same element for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.block.BlockCompressed
 */
public class BlockSMMCompressed extends Block
{
	public BlockSMMCompressed(Material par1Material) {
		super(par1Material);
		this.setCreativeTab(SpenceriosModMod.tabSMMBlocks);
	}
	
	@Override
	public String getUnlocalizedName() {
		return "tile.smm." + super.getUnlocalizedName().substring(5);
	}
}
