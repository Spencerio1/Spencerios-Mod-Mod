package com.github.spencerio1.smm.block;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.init.SMMBlocks;
import com.github.spencerio1.smm.init.SMMItems;

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
		return this == SMMBlocks.earthQuartzOre ? SMMItems.earthQuartz : this == SMMBlocks.rubyOre ? SMMItems.ruby : this == SMMBlocks.sapphireOre ? SMMItems.sapphire : this == SMMBlocks.topazOre ? SMMItems.topaz : this == SMMBlocks.saltBlock ? SMMItems.salt : this == SMMBlocks.jadeOre ? SMMItems.jade : this == SMMBlocks.limestone ? SMMItems.limestone : this == SMMBlocks.tanzaniteOre ? SMMItems.tanzanite : this == SMMBlocks.apatiteOre ? SMMItems.apatite : this == SMMBlocks.amethystOre ? SMMItems.amethyst : Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random par1Random)
	{
		return this == SMMBlocks.saltBlock ? 4 : this == SMMBlocks.limestone ? 4 : 1;
	}
}
