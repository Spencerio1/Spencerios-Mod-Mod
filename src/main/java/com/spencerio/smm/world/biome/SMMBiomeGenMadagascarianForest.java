package com.spencerio.smm.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

import com.spencerio.smm.lib.ConfigFields;

public class SMMBiomeGenMadagascarianForest extends BiomeGenBase
{
	public SMMBiomeGenMadagascarianForest()
	{
		super(ConfigFields.madagascarianForestBiomeID);
		theBiomeDecorator.generateLakes = false;
		theBiomeDecorator.treesPerChunk = 3;
		theBiomeDecorator.flowersPerChunk = 10;
		theBiomeDecorator.grassPerChunk = 16;
		theBiomeDecorator.deadBushPerChunk = 0;
		theBiomeDecorator.mushroomsPerChunk = 8;
		theBiomeDecorator.reedsPerChunk = 8;
		theBiomeDecorator.cactiPerChunk = 8;
	   	theBiomeDecorator.sandPerChunk = 8;
	}
}