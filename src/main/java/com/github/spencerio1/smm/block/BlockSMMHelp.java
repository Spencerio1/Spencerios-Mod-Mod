package com.github.spencerio1.smm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.lib.Reference;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSMMHelp extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	
	protected BlockSMMHelp() {
		super(Material.ground);
		this.setCreativeTab(SpenceriosModMod.tabSMMBlocks);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		blockIcon = register.registerIcon(Reference.MODID + ":" + "helpBlock");
		topIcon = register.registerIcon(Reference.MODID + ":" + "helpBlockTop");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if(side == 1)
			return topIcon;
		else
			return blockIcon;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
	{
		FMLNetworkHandler.openGui(entityPlayer, SpenceriosModMod.instance, 0, world, x, y, z);
		return true;
	}
}
