package com.spencerio.smm.item.tools;

import net.minecraft.item.ItemHoe;

import com.spencerio.smm.SpenceriosModMod;

public class ItemSMMHoe extends ItemHoe
{
	public ItemSMMHoe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMMTools);
	}
}
