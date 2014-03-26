package com.spencerio.smm.item.tools;

import net.minecraft.item.ItemHoe;

import com.spencerio.smm.SpenceriosModMod;

/**
 * The file for all of the Hoes in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.ItemHoe
 */
public class ItemSMMHoe extends ItemHoe
{
	public ItemSMMHoe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMMTools);
	}
}
