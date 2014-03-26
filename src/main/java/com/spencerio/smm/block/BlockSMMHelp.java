package com.spencerio.smm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.spencerio.smm.SpenceriosModMod;
import com.spencerio.smm.lib.Reference;

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
}
