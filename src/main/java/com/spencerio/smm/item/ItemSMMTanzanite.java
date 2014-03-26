package com.spencerio.smm.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSMMTanzanite extends ItemSMMGeneral
{
	public ItemSMMTanzanite()
	{
		super();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean is)
	{
		list.add("Sounds Like Tarzan!");
	}
}
