package com.spencerio.smm.block;

import net.minecraft.block.Block;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class SMMBlocks
{
	public static final Block earthQuartzOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzOre").setBlockTextureName(Reference.MODID + ":" + "earthQuartzOre");
	public static final Block earthQuartzBlock = new BlockSMMCompressed().setHardness(0.8F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzBlock").setBlockTextureName(Reference.MODID + ":" + "earthQuartzBlock");
	
	public static void initBlocks()
	{
		registerBlocks();
		setHarvestLevels();
	}
	
	private static void registerBlocks()
	{
		GameRegistry.registerBlock(earthQuartzOre, earthQuartzOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(earthQuartzBlock, earthQuartzBlock.getUnlocalizedName().substring(5));
	}
	private static void setHarvestLevels()
	{
		earthQuartzOre.setHarvestLevel("pickaxe", 0);
		earthQuartzBlock.setHarvestLevel("pickaxe", 0);
	}
}
