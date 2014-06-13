package com.github.spencerio1.smm.block;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;

import com.github.spencerio1.smm.SpenceriosModMod;

public class BlockSMMFlowers extends BlockBush
{
	public BlockSMMFlowers() {
		super(Material.plants);
		this.setCreativeTab(SpenceriosModMod.tabSMMMisc);
	}
	
	@Override
	public String getUnlocalizedName() {
		return "tile.smm." + super.getUnlocalizedName().substring(5);
	}
}
