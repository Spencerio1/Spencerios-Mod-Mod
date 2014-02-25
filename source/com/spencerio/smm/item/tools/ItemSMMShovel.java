package com.spencerio.smm.item.tools;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.item.ItemSpade;

public class ItemSMMShovel extends ItemSpade
{
	public ItemSMMShovel(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMM);
	}
}
