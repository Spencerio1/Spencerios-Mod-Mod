package com.spencerio.smm.item.tools;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.item.ItemPickaxe;

public class ItemSMMPickaxe extends ItemPickaxe
{
	protected ItemSMMPickaxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMM);
	}
}
