package com.spencerio.smm.block;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import com.spencerio.smm.SpenceriosModMod;

public class BlockSMMOre extends BlockOre
{
	public BlockSMMOre()
	{
		super();
		this.setCreativeTab(SpenceriosModMod.tabSMMOres);
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return Item.getItemFromBlock(this);
	}
}
