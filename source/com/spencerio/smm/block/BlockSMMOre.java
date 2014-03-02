package com.spencerio.smm.block;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import com.spencerio.smm.SpenceriosModMod;
import com.spencerio.smm.item.SMMItems;

public class BlockSMMOre extends BlockOre
{
	public BlockSMMOre()
	{
		super();
		this.setCreativeTab(SpenceriosModMod.tabSMMBlocks);
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return this == SMMBlocks.earthQuartzOre ? SMMItems.earthQuartz : this == SMMBlocks.rubyOre ? SMMItems.ruby : Item.getItemFromBlock(this);
	}
}
