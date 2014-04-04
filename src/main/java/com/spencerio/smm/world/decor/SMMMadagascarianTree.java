package com.spencerio.smm.world.decor;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class SMMMadagascarianTree extends WorldGenAbstractTree
{
	/** The minimum height of a generated tree. */
    private final int minTreeHeight;

    /** True if this tree should grow Vines. */
    private final boolean vinesGrow;

    /** The metadata value of the wood to use in tree generation. */
    private final int metaWood;

    /** The metadata value of the leaves to use in tree generation. */
    private final int metaLeaves;

    public SMMMadagascarianTree()
    {
        super(false);
        this.minTreeHeight = 60;
        this.metaWood = 0;
        this.metaLeaves = 0;
        this.vinesGrow = true;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        int var6 = par2Random.nextInt(3) + this.minTreeHeight;
        boolean var7 = true;

        if (par4 >= 1 && par4 + var6 + 1 <= 256)
        {
            int var8;
            byte var9;
            int var11;
            int var12;
            Block block1;
            Block block2;

            for (var8 = par4; var8 <= par4 + 1 + var6; ++var8)
            {
                var9 = 1;

                if (var8 == par4)
                {
                    var9 = 0;
                }

                if (var8 >= par4 + 1 + var6 - 2)
                {
                    var9 = 2;
                }

                for (int var10 = par3 - var9; var10 <= par3 + var9 && var7; ++var10)
                {
                    for (var11 = par5 - var9; var11 <= par5 + var9 && var7; ++var11)
                    {
                        if (var8 >= 0 && var8 < 256)
                        {
                        	block1 = par1World.getBlock(var10, var8, var11);
                            var12 = Block.getIdFromBlock(block1);

                            if (var12 != 0 && var12 != Block.getIdFromBlock(Blocks.vine) && var12 != Block.getIdFromBlock(Blocks.grass) && var12 != Block.getIdFromBlock(Blocks.dirt) && var12 != Block.getIdFromBlock(Blocks.log))
                            {
                                var7 = false;
                            }
                        }
                        else
                        {
                            var7 = false;
                        }
                    }
                }
            }

            if (!var7)
            {
                return false;
            }
            else
            {
            	block2 = par1World.getBlock(par3, par4 - 1, par5);
                var8 = Block.getIdFromBlock(block2);

                if ((var8 == Block.getIdFromBlock(Blocks.grass) || var8 == Block.getIdFromBlock(Blocks.dirt)) && par4 < 256 - var6 - 1)
                {
                    this.setBlockAndNotifyAdequately(par1World, par3, par4 - 1, par5, Blocks.dirt, 0);
                    var9 = 3;
                    byte var18 = 0;
                    int var13;
                    int var14;
                    int var15;

                    for (var11 = par4 - var9 + var6; var11 <= par4 + var6; ++var11)
                    {
                        var12 = var11 - (par4 + var6);
                        var13 = var18 + 1 - var12 / 2;

                        for (var14 = par3 - var13; var14 <= par3 + var13; ++var14)
                        {
                            var15 = var14 - par3;

                            for (int var16 = par5 - var13; var16 <= par5 + var13; ++var16)
                            {
                                int var17 = var16 - par5;

                                if ((Math.abs(var15) != var13 || Math.abs(var17) != var13 || par2Random.nextInt(2) != 0 && var12 != 0) && !par1World.getBlock(var14, var11, var16).isOpaqueCube())
                                {
                                    this.setBlockAndNotifyAdequately(par1World, var14, var11, var16, Blocks.leaves, this.metaLeaves);
                                }
                            }
                        }
                    }

                    for (var11 = 0; var11 < var6; ++var11)
                    {
                    	block1 = par1World.getBlock(par3, par4 + var11, par5);
                        var12 = Block.getIdFromBlock(block1);

                        if (var12 == 0 || var12 == Block.getIdFromBlock(Blocks.leaves))
                        {
                            this.setBlockAndNotifyAdequately(par1World, par3, par4 + var11, par5, Blocks.log, this.metaWood);

                            if (this.vinesGrow && var11 > 0)
                            {
                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 - 1, par4 + var11, par5))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3 - 1, par4 + var11, par5, Blocks.vine, 8);
                                }

                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 + 1, par4 + var11, par5))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3 + 1, par4 + var11, par5, Blocks.vine, 2);
                                }

                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + var11, par5 - 1))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3, par4 + var11, par5 - 1, Blocks.vine, 1);
                                }

                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + var11, par5 + 1))
                                {
                                    this.setBlockAndNotifyAdequately(par1World, par3, par4 + var11, par5 + 1, Blocks.vine, 4);
                                }
                            }
                        }
                    }

                    if (this.vinesGrow)
                    {
                        for (var11 = par4 - 3 + var6; var11 <= par4 + var6; ++var11)
                        {
                            var12 = var11 - (par4 + var6);
                            var13 = 2 - var12 / 2;

                            for (var14 = par3 - var13; var14 <= par3 + var13; ++var14)
                            {
                                for (var15 = par5 - var13; var15 <= par5 + var13; ++var15)
                                {
                                    if (par1World.getBlock(var14, var11, var15) == Blocks.leaves)
                                    {
                                        if (par2Random.nextInt(4) == 0 && par1World.isAirBlock(var14 - 1, var11, var15))
                                        {
                                            this.growVines(par1World, var14 - 1, var11, var15, 8);
                                        }

                                        if (par2Random.nextInt(4) == 0 && par1World.isAirBlock(var14 + 1, var11, var15))
                                        {
                                            this.growVines(par1World, var14 + 1, var11, var15, 2);
                                        }

                                        if (par2Random.nextInt(4) == 0 && par1World.isAirBlock(var14, var11, var15 - 1))
                                        {
                                            this.growVines(par1World, var14, var11, var15 - 1, 1);
                                        }

                                        if (par2Random.nextInt(4) == 0 && par1World.isAirBlock(var14, var11, var15 + 1))
                                        {
                                            this.growVines(par1World, var14, var11, var15 + 1, 4);
                                        }
                                    }
                                }
                            }
                        }

                        if (par2Random.nextInt(5) == 0 && var6 > 5)
                        {
                            for (var11 = 0; var11 < 2; ++var11)
                            {
                                for (var12 = 0; var12 < 4; ++var12)
                                {
                                    if (par2Random.nextInt(4 - var11) == 0)
                                    {
                                        var13 = par2Random.nextInt(3);
                                        this.setBlockAndNotifyAdequately(par1World, par3 + Direction.offsetX[Direction.rotateOpposite[var12]], par4 + var6 - 5 + var11, par5 + Direction.offsetZ[Direction.rotateOpposite[var12]], Blocks.sapling, var13 << 2 | var12);
                                    }
                                }
                            }
                        }
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * Grows vines downward from the given block for a given length. Args: World, x, starty, z, vine-length
     */
    private void growVines(World par1World, int par2, int par3, int par4, int par5)
    {
        this.setBlockAndNotifyAdequately(par1World, par2, par3, par4, Blocks.vine, par5);
        int var6 = 4;

        while (true)
        {
            --par3;

            if (par1World.getBlock(par2, par3, par4) != Blocks.air || var6 <= 0)
            {
                return;
            }

            this.setBlockAndNotifyAdequately(par1World, par2, par3, par4, Blocks.vine, par5);
            --var6;
        }
    }
}