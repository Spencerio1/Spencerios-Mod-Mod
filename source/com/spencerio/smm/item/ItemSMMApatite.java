package com.spencerio.smm.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.spencerio.smm.SpenceriosModMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSMMApatite extends Item
{
	public ItemSMMApatite()
	{
		super();
		this.setCreativeTab(SpenceriosModMod.tabSMMItems);
	}

	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
	{
		list.add("Sounds like appetite!");
	}
}
