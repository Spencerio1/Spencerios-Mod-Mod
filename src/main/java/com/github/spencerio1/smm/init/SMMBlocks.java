package com.github.spencerio1.smm.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

import com.github.spencerio1.smm.block.BlockSMMCompressed;
import com.github.spencerio1.smm.block.BlockSMMFlowers;
import com.github.spencerio1.smm.block.BlockSMMHelp;
import com.github.spencerio1.smm.block.BlockSMMOre;
import com.github.spencerio1.smm.block.BlockSMMSpawners;
import com.github.spencerio1.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * The Initialization of all Blocks in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.block.Block
 * @see net.minecraft.init.Blocks
 */
public class SMMBlocks
{
	public static final Block earthQuartzOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzOre").setBlockTextureName(Reference.MODID + ":" + "earthQuartzOre");
	public static final Block earthQuartzBlock = new BlockSMMCompressed(Material.rock).setHardness(0.8F).setStepSound(Block.soundTypeStone).setBlockName("earthQuartzBlock").setBlockTextureName(Reference.MODID + ":" + "earthQuartzBlock");
	public static final Block copperOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("copperOre").setBlockTextureName(Reference.MODID + ":" + "copperOre");
	public static final Block copperBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("copperBlock").setBlockTextureName(Reference.MODID + ":" + "copperBlock");
	public static final Block carbonOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("carbonOre").setBlockTextureName(Reference.MODID + ":" + "carbonOre");
	public static final Block carbonBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("carbonBlock").setBlockTextureName(Reference.MODID + ":" + "carbonBlock");
	public static final Block silverOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("silverOre").setBlockTextureName(Reference.MODID + ":" + "silverOre");
	public static final Block silverBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("silverBlock").setBlockTextureName(Reference.MODID + ":" + "silverBlock");
	public static final Block cobaltOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("cobaltOre").setBlockTextureName(Reference.MODID + ":" + "cobaltOre");
	public static final Block cobaltBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("cobaltBlock").setBlockTextureName(Reference.MODID + ":" + "cobaltBlock");
	public static final Block rubyOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("rubyOre").setBlockTextureName(Reference.MODID + ":" + "rubyOre");
	public static final Block rubyBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("rubyBlock").setBlockTextureName(Reference.MODID + ":" + "rubyBlock");
	public static final Block titaniumOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("titaniumOre").setBlockTextureName(Reference.MODID + ":" + "titaniumOre");
	public static final Block titaniumBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("titaniumBlock").setBlockTextureName(Reference.MODID + ":" + "titaniumBlock");
	public static final Block hellishOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("hellishOre").setBlockTextureName(Reference.MODID + ":" + "hellishOre");
	public static final Block hellishBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("hellishBlock").setBlockTextureName(Reference.MODID + ":" + "hellishBlock");
	public static final Block leadOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("leadOre").setBlockTextureName(Reference.MODID + ":" + "leadOre");
	public static final Block leadBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("leadBlock").setBlockTextureName(Reference.MODID + ":" + "leadBlock");
	public static final Block sapphireOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("sapphireOre").setBlockTextureName(Reference.MODID + ":" + "sapphireOre");
	public static final Block sapphireBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("sapphireBlock").setBlockTextureName(Reference.MODID + ":" + "sapphireBlock");
	public static final Block topazOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("topazOre").setBlockTextureName(Reference.MODID + ":" + "topazOre");
	public static final Block topazBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("topazBlock").setBlockTextureName(Reference.MODID + ":" + "topazBlock");
	public static final Block saltBlock = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("saltBlock").setBlockTextureName(Reference.MODID + ":" + "saltBlock");
	public static final Block jadeOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("jadeOre").setBlockTextureName(Reference.MODID + ":" + "jadeOre");
	public static final Block jadeBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("jadeBlock").setBlockTextureName(Reference.MODID + ":" + "jadeBlock");
	public static final Block chysanthemum = new BlockSMMFlowers().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("chysanthemum").setBlockTextureName(Reference.MODID + ":" + "chysanthemum");
	public static final Block camellia = new BlockSMMFlowers().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("camellia").setBlockTextureName(Reference.MODID + ":" + "camellia");
	public static final Block hydrangea = new BlockSMMFlowers().setHardness(0.0F).setStepSound(Block.soundTypeGrass).setBlockName("hydrangea").setBlockTextureName(Reference.MODID + ":" + "hydrangea");
	public static final Block help = new BlockSMMHelp().setHardness(0.6F).setResistance(1.0F).setStepSound(Block.soundTypeGravel).setBlockName("help");
	public static final Block limestone = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("limestone").setBlockTextureName(Reference.MODID + ":" + "limestone");
	public static final Block steelBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("steelBlock").setBlockTextureName(Reference.MODID + ":" + "steelBlock");
	public static final Block tanzaniteOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("tanzaniteOre").setBlockTextureName(Reference.MODID + ":" + "tanzaniteOre");
	public static final Block tanzaniteBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("tanzaniteBlock").setBlockTextureName(Reference.MODID + ":" + "tanzaniteBlock");
	public static final Block customSpawner = new BlockSMMSpawners().setHardness(5.0F).setStepSound(Block.soundTypeMetal).setBlockName("customSpawner").setBlockTextureName("minecraft:mob_spawner");
	public static final Block bossSpawner = new BlockSMMSpawners().setHardness(5.0F).setStepSound(Block.soundTypeMetal).setBlockName("bossSpawner").setBlockTextureName("minecraft:mob_spawner");
	public static final Block apatiteOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("apatiteOre").setBlockTextureName(Reference.MODID + ":" + "apatiteOre");
	public static final Block apatiteBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("apatiteBlock").setBlockTextureName(Reference.MODID + ":" + "apatiteBlock");
	public static final Block amethystOre = new BlockSMMOre().setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone).setBlockName("amethystOre").setBlockTextureName(Reference.MODID + ":" + "amethystOre");
	public static final Block amethystBlock = new BlockSMMCompressed(Material.iron).setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal).setBlockName("amethystBlock").setBlockTextureName(Reference.MODID + ":" + "amethystBlock");
	
	public static void initBlocks()
	{
		registerBlocks();
		registerWithOreDictionary();
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
		GameRegistry.registerBlock(titaniumOre, titaniumOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(titaniumBlock, titaniumBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(hellishOre, hellishOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(hellishBlock, hellishBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(leadOre, leadOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(leadBlock, leadBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sapphireOre, sapphireOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sapphireBlock, sapphireBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(topazOre, topazOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(topazBlock, topazBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(saltBlock, saltBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(jadeOre, jadeOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(jadeBlock, jadeBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(chysanthemum, chysanthemum.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(camellia, camellia.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(hydrangea, hydrangea.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(help, help.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(limestone, limestone.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(steelBlock, steelBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tanzaniteOre, tanzaniteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tanzaniteBlock, tanzaniteBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(customSpawner, customSpawner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(bossSpawner, bossSpawner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(apatiteOre, apatiteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(apatiteBlock, apatiteBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(amethystOre, amethystOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(amethystBlock, amethystBlock.getUnlocalizedName().substring(5));
	}
	private static void registerWithOreDictionary()
	{
		OreDictionary.registerOre("oreEarthQuartz", earthQuartzOre);
		OreDictionary.registerOre("blockEarthQuartz", earthQuartzBlock);
		OreDictionary.registerOre("oreCopper", copperOre);
		OreDictionary.registerOre("blockCopper", copperBlock);
		OreDictionary.registerOre("oreCarbon", carbonOre);
		OreDictionary.registerOre("blockCarbon", carbonBlock);
		OreDictionary.registerOre("oreSilver", silverOre);
		OreDictionary.registerOre("blockSilver", silverBlock);
		OreDictionary.registerOre("oreCobalt", cobaltOre);
		OreDictionary.registerOre("blockCobalt", cobaltBlock);
		OreDictionary.registerOre("oreRuby", rubyOre);
		OreDictionary.registerOre("blockRuby", rubyBlock);
		OreDictionary.registerOre("oreTitanium", titaniumOre);
		OreDictionary.registerOre("blockTitanium", titaniumBlock);
		OreDictionary.registerOre("oreHellish", hellishOre);
		OreDictionary.registerOre("blockHellish", hellishBlock);
		OreDictionary.registerOre("oreLead", leadOre);
		OreDictionary.registerOre("blockLead", leadBlock);
		OreDictionary.registerOre("oreSapphire", sapphireOre);
		OreDictionary.registerOre("blockSapphire", sapphireBlock);
		OreDictionary.registerOre("oreTopaz", topazOre);
		OreDictionary.registerOre("blockTopaz", topazBlock);
		OreDictionary.registerOre("blockSalt", saltBlock);
		OreDictionary.registerOre("oreJade", jadeOre);
		OreDictionary.registerOre("blockJade", jadeBlock);
		OreDictionary.registerOre("flowerChysanthemum", chysanthemum);
		OreDictionary.registerOre("flowerCamellia", camellia);
		OreDictionary.registerOre("flowerHydrangea", hydrangea);
		OreDictionary.registerOre("blockHelp", help);
		OreDictionary.registerOre("blockLimestone", limestone);
		OreDictionary.registerOre("blockSteel", steelBlock);
		OreDictionary.registerOre("oreTanzanite", tanzaniteOre);
		OreDictionary.registerOre("blockTanzanite", tanzaniteBlock);
		OreDictionary.registerOre("spawnerCustomizable", customSpawner);
		OreDictionary.registerOre("spawnerBoss", bossSpawner);
		OreDictionary.registerOre("oreApatite", apatiteOre);
		OreDictionary.registerOre("blockApatite", apatiteBlock);
		OreDictionary.registerOre("oreAmethyst", amethystOre);
		OreDictionary.registerOre("blockAmethyst", amethystBlock);
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
