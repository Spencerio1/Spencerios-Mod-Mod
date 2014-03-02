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
	public static final Block silverOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("silverOre").setBlockTextureName(Reference.MODID + ":" + "silverOre");
	public static final Block silverBlock = new BlockSMMCompressed().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("silverBlock").setBlockTextureName(Reference.MODID + ":" + "silverBlock");
	public static final Block cobaltOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("cobaltOre").setBlockTextureName(Reference.MODID + ":" + "cobaltOre");
	public static final Block cobaltBlock = new BlockSMMCompressed().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("cobaltBlock").setBlockTextureName(Reference.MODID + ":" + "cobaltBlock");
	public static final Block rubyOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("rubyOre").setBlockTextureName(Reference.MODID + ":" + "rubyOre");
	public static final Block rubyBlock = new BlockSMMCompressed().setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("rubyBlock").setBlockTextureName(Reference.MODID + ":" + "rubyBlock");
	
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
		GameRegistry.registerBlock(silverOre, silverOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(silverBlock, silverBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cobaltOre, cobaltOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cobaltBlock, cobaltBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(rubyOre, rubyOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(rubyBlock, rubyBlock.getUnlocalizedName().substring(5));
	}
	private static void setHarvestLevels()
	{
		earthQuartzOre.setHarvestLevel("pickaxe", 0);
		earthQuartzBlock.setHarvestLevel("pickaxe", 0);
		copperOre.setHarvestLevel("pickaxe", 0);
		copperBlock.setHarvestLevel("pickaxe", 0);
		carbonOre.setHarvestLevel("pickaxe", 0);
		carbonBlock.setHarvestLevel("pickaxe", 0);
		silverOre.setHarvestLevel("pickaxe", 0);
		silverBlock.setHarvestLevel("pickaxe", 0);
		cobaltOre.setHarvestLevel("pickaxe", 0);
		cobaltBlock.setHarvestLevel("pickaxe", 0);
		rubyOre.setHarvestLevel("pickaxe", 2);
		rubyBlock.setHarvestLevel("pickaxe", 0);
	}
}
