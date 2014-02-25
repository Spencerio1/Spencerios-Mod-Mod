package com.spencerio.smm.item.tools;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.item.ItemSword;

public class ItemSMMSword extends ItemSword
{
	public ItemSMMSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMM);
	}
}
