package com.spencerio.smm.world.decor;

import static net.minecraftforge.common.ChestGenHooks.DUNGEON_CHEST;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.DungeonHooks;

public class SMMObsidianDungeon extends WorldGenerator
{
	public SMMObsidianDungeon()
	{
	}

	@Override
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
	{
		byte b0 = 3;
		int l = par2Random.nextInt(2) + 2;
		int i1 = par2Random.nextInt(2) + 2;
		int j1 = 0;
		int k1;
		int l1;
		int i2;

		for (k1 = par3 - l - 1; k1 <= par3 + l + 1; ++k1)
		{
			for (l1 = par4 - 1; l1 <= par4 + b0 + 1; ++l1)
			{
				for (i2 = par5 - i1 - 1; i2 <= par5 + i1 + 1; ++i2)
				{
					Material material = par1World.getBlock(k1, l1, i2).getMaterial();

					if (l1 == par4 - 1 && !material.isSolid())
					{
						return false;
					}

					if (l1 == par4 + b0 + 1 && !material.isSolid())
					{
						return false;
					}

					if ((k1 == par3 - l - 1 || k1 == par3 + l + 1 || i2 == par5 - i1 - 1 || i2 == par5 + i1 + 1) && l1 == par4 && par1World.isAirBlock(k1, l1, i2) && par1World.isAirBlock(k1, l1 + 1, i2))
					{
						++j1;
					}
				}
			}
		}

		if (j1 >= 1 && j1 <= 5)
		{
			for (k1 = par3 - l - 1; k1 <= par3 + l + 1; ++k1)
			{
				for (l1 = par4 + b0; l1 >= par4 - 1; --l1)
				{
					for (i2 = par5 - i1 - 1; i2 <= par5 + i1 + 1; ++i2)
					{
						if (k1 != par3 - l - 1 && l1 != par4 - 1 && i2 != par5 - i1 - 1 && k1 != par3 + l + 1 && l1 != par4 + b0 + 1 && i2 != par5 + i1 + 1)
						{
							par1World.setBlockToAir(k1, l1, i2);
						}
						else if (l1 >= 0 && !par1World.getBlock(k1, l1 - 1, i2).getMaterial().isSolid())
						{
							par1World.setBlockToAir(k1, l1, i2);
						}
						else if (par1World.getBlock(k1, l1, i2).getMaterial().isSolid())
						{
							par1World.setBlock(k1, l1, i2, Blocks.obsidian, 0, 2);
						}
					}
				}
			}

			k1 = 0;

			while (k1 < 2)
			{
				l1 = 0;

				while (true)
				{
					if (l1 < 3)
					{
						label101:
						{
						i2 = par3 + par2Random.nextInt(l * 2 + 1) - l;
						int j2 = par5 + par2Random.nextInt(i1 * 2 + 1) - i1;

						if (par1World.isAirBlock(i2, par4, j2))
						{
							int k2 = 0;

							if (par1World.getBlock(i2 - 1, par4, j2).getMaterial().isSolid())
							{
								++k2;
							}

							if (par1World.getBlock(i2 + 1, par4, j2).getMaterial().isSolid())
							{
								++k2;
							}

							if (par1World.getBlock(i2, par4, j2 - 1).getMaterial().isSolid())
							{
								++k2;
							}

							if (par1World.getBlock(i2, par4, j2 + 1).getMaterial().isSolid())
							{
								++k2;
							}

							if (k2 == 1)
							{
								par1World.setBlock(i2, par4, j2, Blocks.chest, 0, 2);
								TileEntityChest tileentitychest = (TileEntityChest)par1World.getTileEntity(i2, par4, j2);

								if (tileentitychest != null)
								{
									WeightedRandomChestContent.generateChestContents(par2Random, ChestGenHooks.getItems(DUNGEON_CHEST, par2Random), tileentitychest, ChestGenHooks.getCount(DUNGEON_CHEST, par2Random));
								}

								break label101;
							}
						}

						++l1;
						continue;
						}
					}

					++k1;
					break;
				}
			}

			par1World.setBlock(par3, par4, par5, Blocks.mob_spawner, 0, 2);
			par1World.setBlock(par3, par4 + 1, par5, Blocks.mob_spawner, 0, 2);
			TileEntityMobSpawner tileentitymobspawner1 = (TileEntityMobSpawner)par1World.getTileEntity(par3, par4, par5);
			TileEntityMobSpawner tileentitymobspawner2 = (TileEntityMobSpawner)par1World.getTileEntity(par3, par4 + 1, par5);

			if (tileentitymobspawner1 != null)
			{
				tileentitymobspawner1.func_145881_a().setEntityName(this.pickMobSpawner(par2Random));
			}
			else
			{
				System.err.println("Failed to fetch mob spawner entity at (" + par3 + ", " + par4 + ", " + par5 + ")");
			}
			
			if (tileentitymobspawner2 != null)
			{
				tileentitymobspawner2.func_145881_a().setEntityName(this.pickMobSpawner(par2Random));
			}
			else
			{
				System.err.println("Failed to fetch mob spawner entity at (" + par3 + ", " + (par4 + 1) + ", " + par5 + ")");
			}

			return true;
		}
		else
		{
			return false;
		}
	}

    /**
     * Randomly decides which spawner to use in a dungeon
     */
    private String pickMobSpawner(Random par1Random)
    {
        return DungeonHooks.getRandomDungeonMob(par1Random);
    }
}