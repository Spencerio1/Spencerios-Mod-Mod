package com.github.spencerio1.smm.world.biome;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import com.github.spencerio1.smm.lib.ConfigFields;
import com.github.spencerio1.smm.world.decor.SMMMadagascarianTree;

public class SMMBiomeGenMadagascarianForest extends BiomeGenBase
{
	private static final SMMMadagascarianTree tree = new SMMMadagascarianTree();
	
	public SMMBiomeGenMadagascarianForest()
	{
		super(ConfigFields.madagascarianForestBiomeID);
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.treesPerChunk = 3;
		this.theBiomeDecorator.flowersPerChunk = 40;
		this.theBiomeDecorator.grassPerChunk = 100;
		this.theBiomeDecorator.deadBushPerChunk = 0;
		this.theBiomeDecorator.mushroomsPerChunk = 10;
	}
	
	@Override
	public WorldGenAbstractTree func_150567_a(Random rand) {
		return (WorldGenAbstractTree)tree;
	}
}