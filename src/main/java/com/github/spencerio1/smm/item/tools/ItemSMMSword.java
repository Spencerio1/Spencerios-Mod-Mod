package com.github.spencerio1.smm.item.tools;

import com.github.spencerio1.smm.SpenceriosModMod;

import net.minecraft.item.ItemSword;

/**
 * The file for all of the Swords for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.ItemSword
 */
public class ItemSMMSword extends ItemSword
{
	public ItemSMMSword(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMMTools);
	}
}
