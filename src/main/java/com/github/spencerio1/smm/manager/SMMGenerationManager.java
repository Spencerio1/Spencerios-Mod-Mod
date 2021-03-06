package com.github.spencerio1.smm.manager;

import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.DUNGEON;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.terraingen.TerrainGen;

import com.github.spencerio1.smm.init.SMMBlocks;
import com.github.spencerio1.smm.world.decor.SMMObsidianDungeon;

import cpw.mods.fml.common.IWorldGenerator;

/**
 * The file that handles all of the World Generation for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see cpw.mods.fml.common.IWorldGenerator
 */
public class SMMGenerationManager implements IWorldGenerator
{
	public static int chyCTS;
	public static int camCTS;
	public static int hydCTS;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
        {
        	case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16, chunkGenerator);
            case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
	}
	
	private void generateEnd(World world, Random random, int x, int z)
    {
		
    }
    private void generateSurface(World world, Random random, int x, int z, IChunkProvider chunkGenerator)
    {
    	this.addOreSpawn(SMMBlocks.earthQuartzOre, world, random, x, z, 16, 16, 7, 13, 0, 63);
    	this.addOreSpawn(SMMBlocks.copperOre, world, random, x, z, 16, 16, 6, 5, 0, 63);
    	this.addOreSpawn(SMMBlocks.carbonOre, world, random, x, z, 16, 16, 5, 4, 0, 63);
    	this.addOreSpawn(SMMBlocks.silverOre, world, random, x, z, 16, 16, 4, 4, 0, 63);
    	this.addOreSpawn(SMMBlocks.cobaltOre, world, random, x, z, 16, 16, 6, 3, 0, 63);
    	this.addOreSpawn(SMMBlocks.rubyOre, world, random, x, z, 16, 16, 2, 2, 0, 45);
    	this.addOreSpawn(SMMBlocks.titaniumOre, world, random, x, z, 16, 16, 3, 3, 0, 63);
    	this.addOreSpawn(SMMBlocks.leadOre, world, random, x, z, 16, 16, 4, 7, 0, 63);
    	this.addOreSpawn(SMMBlocks.sapphireOre, world, random, x, z, 16, 16, 5, 5, 0, 63);
    	this.addOreSpawn(SMMBlocks.topazOre, world, random, x, z, 16, 16, 8, 7, 0, 63);
    	this.addOreSpawn(SMMBlocks.saltBlock, world, random, x, z, 16, 16, 5, 9, 0, 63);
    	this.addOreSpawn(SMMBlocks.jadeOre, world, random, x, z, 16, 16, 7, 6, 0, 63);
    	this.addOreSpawn(SMMBlocks.limestone, world, random, x, z, 16, 16, 9, 8, 0, 63);
    	this.addOreSpawn(SMMBlocks.tanzaniteOre, world, random, x, z, 16, 16, 5, 7, 0, 63);
    	this.addOreSpawn(SMMBlocks.apatiteOre, world, random, x, z, 16, 16, 16, 10, 0, 63);
    	this.addOreSpawn(SMMBlocks.amethystOre, world, random, x, z, 16, 16, 6, 6, 0, 63);
    	
    	this.addFlowerSpawn(SMMBlocks.chysanthemum, world, random, x, z, 16, 16, chyCTS, 256);
    	this.addFlowerSpawn(SMMBlocks.camellia, world, random, x, z, 16, 16, camCTS, 256);
    	this.addFlowerSpawn(SMMBlocks.hydrangea, world, random, x, z, 16, 16, hydCTS, 256);
    	
    	this.addDungeonSpawn(chunkGenerator, world, random, x, z);
    }
    private void generateNether(World world, Random random, int x, int z)
    {
    	this.addOreSpawn(SMMBlocks.hellishOre, world, random, x, z, 16, 16, 4, 9, 0, 128, Blocks.netherrack);
    }

	public void addOreSpawn(Block ore, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
	    this.addOreSpawn(ore, world, random, blockXPos, blockZPos, maxX, maxZ, maxVeinSize, chancesToSpawn, minY, maxY, Blocks.stone);
	}
	public void addOreSpawn(Block ore, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY, Block blockToReplace)
	{
	    assert maxY > minY: "addOreSpawn: The maximum Y must be greater than the Minimum Y";
	    assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 17";
	    assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
	    assert maxY < 257 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 257 but greater than 0";
	    assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 17";
	      
	    int diffBtwnMinMaxY = maxY - minY;
	    for(int x = 0; x < chancesToSpawn; x++)
	    {
	    	int posX = blockXPos + random.nextInt(maxX);
	        int posY = minY + random.nextInt(diffBtwnMinMaxY);
	        int posZ = blockZPos + random.nextInt(maxZ);
	        (new WorldGenMinable(ore, maxVeinSize, blockToReplace)).generate(world, random, posX, posY, posZ);
	    }
	}
	
	public void addFlowerSpawn(Block flower, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int chancesToSpawn, int maxY)
	{
	    assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 17";
	    assert maxY < 257 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 257 but greater than 0";
	    assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 17";
	      
	    for(int x = 0; x < chancesToSpawn; x++)
	    {
	    	int posX = blockXPos + random.nextInt(maxX) + 8;
	        int posY = random.nextInt(maxY);
	        int posZ = blockZPos + random.nextInt(maxZ) + 8;
	        (new WorldGenFlowers(flower)).generate(world, random, posX, posY, posZ);
	    }
	}
	
	public void addDungeonSpawn(IChunkProvider chunkGenerator, World world, Random random, int blockXPos, int blockZPos)
	{
		int chunkX = blockXPos / 16;
		int chunkZ = blockZPos / 16;
	   	boolean doGen = TerrainGen.populate(chunkGenerator, world, random, chunkX, chunkZ, false, DUNGEON);
		for (int x = 0; doGen && x < 8; ++x)
        {
            int posX = blockXPos + random.nextInt(16) + 8;
            int posY = random.nextInt(256);
            int posZ = blockZPos + random.nextInt(16) + 8;
            (new SMMObsidianDungeon()).generate(world, random, posX, posY, posZ);
        }
	}
}
