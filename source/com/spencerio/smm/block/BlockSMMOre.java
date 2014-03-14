package com.spencerio.smm.block;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import com.spencerio.smm.SpenceriosModMod;
import com.spencerio.smm.item.SMMItems;

/**
 * The class for all of the Ores for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.block.BlockOre
 */
public class BlockSMMOre extends BlockOre
{
	public BlockSMMOre()
	{
		super();
		this.setCreativeTab(SpenceriosModMod.tabSMMBlocks);
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return this == SMMBlocks.earthQuartzOre ? SMMItems.earthQuartz : this == SMMBlocks.rubyOre ? SMMItems.ruby : this == SMMBlocks.sapphireOre ? SMMItems.sapphire : this == SMMBlocks.topazOre ? SMMItems.topaz : this == SMMBlocks.saltBlock ? SMMItems.salt : this == SMMBlocks.jadeOre ? SMMItems.jade : this == SMMBlocks.limestone ? SMMItems.limestone : Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random par1Random)
	{
		return this == SMMBlocks.saltBlock ? 4 : this == SMMBlocks.limestone ? 4 : 1;
	}
}
