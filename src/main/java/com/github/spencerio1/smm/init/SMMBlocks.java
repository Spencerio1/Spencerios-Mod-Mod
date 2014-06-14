package com.github.spencerio1.smm.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.github.spencerio1.smm.block.BlockSMMCompressed;
import com.github.spencerio1.smm.block.BlockSMMFlowers;
import com.github.spencerio1.smm.block.BlockSMMHelp;
import com.github.spencerio1.smm.block.BlockSMMOre;
import com.github.spencerio1.smm.block.BlockSMMSpawners;
import com.github.spencerio1.smm.lib.ModInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * The Initialization of all Blocks in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.block.Block
 * @see net.minecraft.init.Blocks
 */
@ObjectHolder(ModInfo.MODID)
public class SMMBlocks
{
	public static final Block earthQuartzOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzOre").setBlockTextureName(ModInfo.MODID + ":" + "earthQuartzOre");
	public static final Block earthQuartzBlock = new BlockSMMCompressed(Material.rock).setHardness(0.8F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzBlock").setBlockTextureName(ModInfo.MODID + ":" + "earthQuartzBlock");
	public static final Block copperOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("copperOre").setBlockTextureName(ModInfo.MODID + ":" + "copperOre");
	public static final Block copperBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("copperBlock").setBlockTextureName(ModInfo.MODID + ":" + "copperBlock");
	public static final Block carbonOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("carbonOre").setBlockTextureName(ModInfo.MODID + ":" + "carbonOre");
	public static final Block carbonBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("carbonBlock").setBlockTextureName(ModInfo.MODID + ":" + "carbonBlock");
	public static final Block silverOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("silverOre").setBlockTextureName(ModInfo.MODID + ":" + "silverOre");
	public static final Block silverBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("silverBlock").setBlockTextureName(ModInfo.MODID + ":" + "silverBlock");
	public static final Block cobaltOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("cobaltOre").setBlockTextureName(ModInfo.MODID + ":" + "cobaltOre");
	public static final Block cobaltBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("cobaltBlock").setBlockTextureName(ModInfo.MODID + ":" + "cobaltBlock");
	public static final Block rubyOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("rubyOre").setBlockTextureName(ModInfo.MODID + ":" + "rubyOre");
	public static final Block rubyBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("rubyBlock").setBlockTextureName(ModInfo.MODID + ":" + "rubyBlock");
	public static final Block titaniumOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("titaniumOre").setBlockTextureName(ModInfo.MODID + ":" + "titaniumOre");
	public static final Block titaniumBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("titaniumBlock").setBlockTextureName(ModInfo.MODID + ":" + "titaniumBlock");
	public static final Block hellishOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("hellishOre").setBlockTextureName(ModInfo.MODID + ":" + "hellishOre");
	public static final Block hellishBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("hellishBlock").setBlockTextureName(ModInfo.MODID + ":" + "hellishBlock");
	public static final Block leadOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("leadOre").setBlockTextureName(ModInfo.MODID + ":" + "leadOre");
	public static final Block leadBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("leadBlock").setBlockTextureName(ModInfo.MODID + ":" + "leadBlock");
	public static final Block sapphireOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("sapphireOre").setBlockTextureName(ModInfo.MODID + ":" + "sapphireOre");
	public static final Block sapphireBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("sapphireBlock").setBlockTextureName(ModInfo.MODID + ":" + "sapphireBlock");
	public static final Block topazOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("topazOre").setBlockTextureName(ModInfo.MODID + ":" + "topazOre");
	public static final Block topazBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("topazBlock").setBlockTextureName(ModInfo.MODID + ":" + "topazBlock");
	public static final Block saltBlock = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("saltBlock").setBlockTextureName(ModInfo.MODID + ":" + "saltBlock");
	public static final Block jadeOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("jadeOre").setBlockTextureName(ModInfo.MODID + ":" + "jadeOre");
	public static final Block jadeBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("jadeBlock").setBlockTextureName(ModInfo.MODID + ":" + "jadeBlock");
	public static final Block chysanthemum = new BlockSMMFlowers().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("chysanthemum").setBlockTextureName(ModInfo.MODID + ":" + "chysanthemum");
	public static final Block camellia = new BlockSMMFlowers().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("camellia").setBlockTextureName(ModInfo.MODID + ":" + "camellia");
	public static final Block hydrangea = new BlockSMMFlowers().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("hydrangea").setBlockTextureName(ModInfo.MODID + ":" + "hydrangea");
	public static final Block help = new BlockSMMHelp().setHardness(0.6F).setResistance(1.0F).setStepSound(Block.soundTypeGravel).setBlockName("help");
	public static final Block limestone = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("limestone").setBlockTextureName(ModInfo.MODID + ":" + "limestone");
	public static final Block steelBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("steelBlock").setBlockTextureName(ModInfo.MODID + ":" + "steelBlock");
	public static final Block tanzaniteOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("tanzaniteOre").setBlockTextureName(ModInfo.MODID + ":" + "tanzaniteOre");
	public static final Block tanzaniteBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("tanzaniteBlock").setBlockTextureName(ModInfo.MODID + ":" + "tanzaniteBlock");
	public static final Block customSpawner = new BlockSMMSpawners().setHardness(5.0F).setStepSound(Block.soundTypeMetal).setBlockName("customSpawner").setBlockTextureName("minecraft:mob_spawner");
	public static final Block bossSpawner = new BlockSMMSpawners().setHardness(5.0F).setStepSound(Block.soundTypeMetal).setBlockName("bossSpawner").setBlockTextureName("minecraft:mob_spawner");
	public static final Block apatiteOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("apatiteOre").setBlockTextureName(ModInfo.MODID + ":" + "apatiteOre");
	public static final Block apatiteBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("apatiteBlock").setBlockTextureName(ModInfo.MODID + ":" + "apatiteBlock");
	public static final Block amethystOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("amethystOre").setBlockTextureName(ModInfo.MODID + ":" + "amethystOre");
	public static final Block amethystBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("amethystBlock").setBlockTextureName(ModInfo.MODID + ":" + "amethystBlock");
	
	public static void initBlocks()
	{
		registerBlocks();
		setHarvestLevels();
	}
	
	private static void registerBlocks()
	{
		GameRegistry.registerBlock(earthQuartzOre, earthQuartzOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(earthQuartzBlock, earthQuartzBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(copperOre, copperOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(copperBlock, copperBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(carbonOre, carbonOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(carbonBlock, carbonBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(silverOre, silverOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(silverBlock, silverBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(cobaltOre, cobaltOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(cobaltBlock, cobaltBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(rubyOre, rubyOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(rubyBlock, rubyBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(titaniumOre, titaniumOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(titaniumBlock, titaniumBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(hellishOre, hellishOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(hellishBlock, hellishBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(leadOre, leadOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(leadBlock, leadBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(sapphireOre, sapphireOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(sapphireBlock, sapphireBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(topazOre, topazOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(topazBlock, topazBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(saltBlock, saltBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(jadeOre, jadeOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(jadeBlock, jadeBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(chysanthemum, chysanthemum.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(camellia, camellia.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(hydrangea, hydrangea.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(help, help.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(limestone, limestone.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(tanzaniteOre, tanzaniteOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(tanzaniteBlock, tanzaniteBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(customSpawner, customSpawner.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(bossSpawner, bossSpawner.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(apatiteOre, apatiteOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(apatiteBlock, apatiteBlock.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(amethystOre, amethystOre.getUnlocalizedName().substring(9));
		GameRegistry.registerBlock(amethystBlock, amethystBlock.getUnlocalizedName().substring(9));
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
		titaniumOre.setHarvestLevel("pickaxe", 0);
		titaniumBlock.setHarvestLevel("pickaxe", 0);
		hellishOre.setHarvestLevel("pickaxe", 0);
		hellishBlock.setHarvestLevel("pickaxe", 0);
		leadOre.setHarvestLevel("pickaxe", 0);
		leadBlock.setHarvestLevel("pickaxe", 0);
		sapphireOre.setHarvestLevel("pickaxe", 0);
		sapphireBlock.setHarvestLevel("pickaxe", 0);
		topazOre.setHarvestLevel("pickaxe", 0);
		topazBlock.setHarvestLevel("pickaxe", 0);
		saltBlock.setHarvestLevel("pickaxe", 0);
		jadeOre.setHarvestLevel("pickaxe", 2);
		jadeBlock.setHarvestLevel("pickaxe", 2);
		help.setHarvestLevel("shovel", 0);
		limestone.setHarvestLevel("pickaxe", 0);
		steelBlock.setHarvestLevel("pickaxe", 2);
		tanzaniteOre.setHarvestLevel("pickaxe", 2);
		tanzaniteBlock.setHarvestLevel("pickaxe", 1);
		customSpawner.setHarvestLevel("pickaxe", 0);
		bossSpawner.setHarvestLevel("pickaxe", 0);
		apatiteOre.setHarvestLevel("pickaxe", 1);
		apatiteBlock.setHarvestLevel("pickaxe", 0);
		amethystOre.setHarvestLevel("pickaxe", 1);
		amethystBlock.setHarvestLevel("pickaxe", 1);
	}
}
