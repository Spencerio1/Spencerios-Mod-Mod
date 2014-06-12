package com.github.spencerio1.smm.item.tools;

import com.github.spencerio1.smm.SpenceriosModMod;

import net.minecraft.item.ItemAxe;

/**
 * The file for all of the Axes in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.ItemAxe
 */
public class ItemSMMAxe extends ItemAxe
{
	public ItemSMMAxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMMTools);
	}
}
