package com.spencerio.smm.item.tools;

import com.spencerio.smm.SpenceriosModMod;

import net.minecraft.item.ItemSpade;

/**
 * The file for all of the Shovels in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.ItemSpade
 */
public class ItemSMMShovel extends ItemSpade
{
	public ItemSMMShovel(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMMTools);
	}
}
