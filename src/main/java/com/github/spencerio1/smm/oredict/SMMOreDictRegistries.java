package com.github.spencerio1.smm.oredict;

import net.minecraftforge.oredict.OreDictionary;

import com.github.spencerio1.smm.init.SMMBlocks;
import com.github.spencerio1.smm.init.SMMItems;

public class SMMOreDictRegistries {

	public SMMOreDictRegistries() {
		registerBlocks();
		registerItems();
	}
	
	private static void registerBlocks() {
		OreDictionary.registerOre("oreEarthQuartz", SMMBlocks.earthQuartzOre);
		OreDictionary.registerOre("blockEarthQuartz", SMMBlocks.earthQuartzBlock);
		OreDictionary.registerOre("oreCopper", SMMBlocks.copperOre);
		OreDictionary.registerOre("blockCopper", SMMBlocks.copperBlock);
		OreDictionary.registerOre("oreCarbon", SMMBlocks.carbonOre);
		OreDictionary.registerOre("blockCarbon", SMMBlocks.carbonBlock);
		OreDictionary.registerOre("oreSilver", SMMBlocks.silverOre);
		OreDictionary.registerOre("blockSilver", SMMBlocks.silverBlock);
		OreDictionary.registerOre("oreCobalt", SMMBlocks.cobaltOre);
		OreDictionary.registerOre("blockCobalt", SMMBlocks.cobaltBlock);
		OreDictionary.registerOre("oreRuby", SMMBlocks.rubyOre);
		OreDictionary.registerOre("blockRuby", SMMBlocks.rubyBlock);
		OreDictionary.registerOre("oreTitanium", SMMBlocks.titaniumOre);
		OreDictionary.registerOre("blockTitanium", SMMBlocks.titaniumBlock);
		OreDictionary.registerOre("oreHellish", SMMBlocks.hellishOre);
		OreDictionary.registerOre("blockHellish", SMMBlocks.hellishBlock);
		OreDictionary.registerOre("oreLead", SMMBlocks.leadOre);
		OreDictionary.registerOre("blockLead", SMMBlocks.leadBlock);
		OreDictionary.registerOre("oreSapphire", SMMBlocks.sapphireOre);
		OreDictionary.registerOre("blockSapphire", SMMBlocks.sapphireBlock);
		OreDictionary.registerOre("oreTopaz", SMMBlocks.topazOre);
		OreDictionary.registerOre("blockTopaz", SMMBlocks.topazBlock);
		OreDictionary.registerOre("blockSalt", SMMBlocks.saltBlock);
		OreDictionary.registerOre("oreJade", SMMBlocks.jadeOre);
		OreDictionary.registerOre("blockJade", SMMBlocks.jadeBlock);
		OreDictionary.registerOre("flowerChysanthemum", SMMBlocks.chysanthemum);
		OreDictionary.registerOre("flowerCamellia", SMMBlocks.camellia);
		OreDictionary.registerOre("flowerHydrangea", SMMBlocks.hydrangea);
		OreDictionary.registerOre("blockHelp", SMMBlocks.help);
		OreDictionary.registerOre("blockLimestone", SMMBlocks.limestone);
		OreDictionary.registerOre("blockSteel", SMMBlocks.steelBlock);
		OreDictionary.registerOre("oreTanzanite", SMMBlocks.tanzaniteOre);
		OreDictionary.registerOre("blockTanzanite", SMMBlocks.tanzaniteBlock);
		OreDictionary.registerOre("spawnerCustomizable", SMMBlocks.customSpawner);
		OreDictionary.registerOre("spawnerBoss", SMMBlocks.bossSpawner);
		OreDictionary.registerOre("oreApatite", SMMBlocks.apatiteOre);
		OreDictionary.registerOre("blockApatite", SMMBlocks.apatiteBlock);
		OreDictionary.registerOre("oreAmethyst", SMMBlocks.amethystOre);
		OreDictionary.registerOre("blockAmethyst", SMMBlocks.amethystBlock);
	}
	
	private static void registerItems() {
		OreDictionary.registerOre("gemQuartzEarth", SMMItems.earthQuartz);
		OreDictionary.registerOre("ingotCopper", SMMItems.copperIngot);
		OreDictionary.registerOre("ingotCarbon", SMMItems.carbonIngot);
		OreDictionary.registerOre("ingotSilver", SMMItems.silverIngot);
		OreDictionary.registerOre("ingotCobalt", SMMItems.cobaltIngot);
		OreDictionary.registerOre("gemRuby", SMMItems.ruby);
		OreDictionary.registerOre("ingotTitanium", SMMItems.titaniumIngot);
		OreDictionary.registerOre("ingotHellish", SMMItems.hellishIngot);
		OreDictionary.registerOre("ingotLead", SMMItems.leadIngot);
		OreDictionary.registerOre("gemSapphire", SMMItems.sapphire);
		OreDictionary.registerOre("gemTopaz", SMMItems.topaz);
		OreDictionary.registerOre("salt", SMMItems.salt);
		OreDictionary.registerOre("film", SMMItems.film);
		OreDictionary.registerOre("gemJade", SMMItems.jade);
		OreDictionary.registerOre("dustLimestone", SMMItems.limestone);
		OreDictionary.registerOre("ingotMoltenIron", SMMItems.moltenIronIngot);
		OreDictionary.registerOre("ingotSteel", SMMItems.steelIngot);
		OreDictionary.registerOre("gemTanzanite", SMMItems.tanzanite);
		OreDictionary.registerOre("gemApatite", SMMItems.apatite);
		OreDictionary.registerOre("gemAmethyst", SMMItems.amethyst);
	}
}
