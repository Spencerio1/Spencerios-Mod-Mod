package com.spencerio.smm.block;

import net.minecraft.block.Block;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class SMMBlocks
{
	public static final Block earthQuartzOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzOre").setBlockTextureName(Reference.MODID + ":" + "earthQuartzOre");
	public static final Block earthQuartzBlock = new BlockSMMCompressed().setHardness(0.8F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzBlock").setBlockTextureName(Reference.MODID + ":" + "earthQuartzBlock");
	public static final Block copperOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("copperOre").setBlockTextureName(Reference.MODID + ":" + "copperOre");
	public static final Block copperBlock = new BlockSMMCompressed().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("copperBlock").setBlockTextureName(Reference.MODID + ":" + "copperBlock");
	public static final Block carbonOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("carbonOre").setBlockTextureName(Reference.MODID + ":" + "carbonOre");
	public static final Block carbonBlock = new BlockSMMCompressed().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("carbonBlock").setBlockTextureName(Reference.MODID + ":" + "carbonBlock");
	
	public static void initBlocks()
	{
		registerBlocks();
		setHarvestLevels();
	}
	
	private static void registerBlocks()
	{
		GameRegistry.registerBlock(earthQuartzOre, earthQuartzOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(earthQuartzBlock, earthQuartzBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(carbonOre, carbonOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(carbonBlock, carbonBlock.getUnlocalizedName().substring(5));
	}
	private static void setHarvestLevels()
	{
		earthQuartzOre.setHarvestLevel("pickaxe", 0);
		earthQuartzBlock.setHarvestLevel("pickaxe", 0);
		copperOre.setHarvestLevel("pickaxe", 0);
		copperBlock.setHarvestLevel("pickaxe", 0);
		carbonOre.setHarvestLevel("pickaxe", 0);
		carbonBlock.setHarvestLevel("pickaxe", 0);
	}
}
