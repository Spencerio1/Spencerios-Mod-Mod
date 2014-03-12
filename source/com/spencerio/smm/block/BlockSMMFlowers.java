package com.spencerio.smm.block;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;

import com.spencerio.smm.SpenceriosModMod;

public class BlockSMMFlowers extends BlockBush
{
	protected BlockSMMFlowers() {
		super(Material.plants);
		this.setCreativeTab(SpenceriosModMod.tabSMMMisc);
	}
}
