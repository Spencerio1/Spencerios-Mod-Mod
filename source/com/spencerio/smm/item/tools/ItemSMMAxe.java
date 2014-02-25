package com.spencerio.smm.item.tools;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.item.ItemAxe;

public class ItemSMMAxe extends ItemAxe
{
	protected ItemSMMAxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMM);
	}
}
