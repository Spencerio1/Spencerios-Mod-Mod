package com.spencerio.smm.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.spencerio.smm.SpenceriosModMod;

/**
 * The file for (almost) all of the items in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 */
public class ItemSMMGeneral extends Item
{
	public ItemSMMGeneral()
	{
		super();
		this.setCreativeTab(SpenceriosModMod.tabSMMItems);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack stack, EntityPlayer entityPlayer, List list, boolean par4)
	{
		if(stack.getItem() == SMMItems.tanzanite)
			list.add("Sounds Like Tarzan!");
		else if(stack.getItem() == SMMItems.apatite)
			list.add("Sounds like appetite!");
	}
}
