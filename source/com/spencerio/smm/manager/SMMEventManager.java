package com.spencerio.smm.manager;

import java.util.Random;

import com.spencerio.smm.block.SMMBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class SMMEventManager implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
        {
        	case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
	}
	
	private void generateEnd(World world, Random random, int x, int z)
    {
		
    }
    private void generateSurface(World world, Random random, int x, int z)
    {
    	this.addOreSpawn(SMMBlocks.earthQuartzOre, world, random, x, z, 16, 16, 7, 13, 2, 63);
    	this.addOreSpawn(SMMBlocks.copperOre, world, random, x, z, 16, 16, 6, 5, 2, 63);
    	this.addOreSpawn(SMMBlocks.carbonOre, world, random, x, z, 16, 16, 5, 4, 2, 63);
    	this.addOreSpawn(SMMBlocks.silverOre, world, random, x, z, 16, 16, 4, 4, 2, 63);
    	this.addOreSpawn(SMMBlocks.cobaltOre, world, random, x, z, 16, 16, 6, 3, 2, 63);
    	this.addOreSpawn(SMMBlocks.rubyOre, world, random, x, z, 16, 16, 2, 2, 2, 45);
    	this.addOreSpawn(SMMBlocks.titaniumOre, world, random, x, z, 16, 16, 3, 3, 2, 63);
    }
    private void generateNether(World world, Random random, int x, int z)
    {
    	
    }

	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
	{
	    assert maxY > minY: "addOreSpawn: The maximum Y must be greater than the Minimum Y";
	    assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 17";
	    assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
	    assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
	    assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 17";
	      
	    int diffBtwnMinMaxY = maxY - minY;
	    for(int x = 0; x < chancesToSpawn; x++)
	    {
	    	int posX = blockXPos + random.nextInt(maxX);
	        int posY = minY + random.nextInt(diffBtwnMinMaxY);
	        int posZ = blockZPos + random.nextInt(maxZ);
	        (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
	    }
	}
}
