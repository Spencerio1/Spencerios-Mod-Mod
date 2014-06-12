package com.github.spencerio1.smm.item.tools;

import com.github.spencerio1.smm.SpenceriosModMod;

import net.minecraft.item.ItemPickaxe;

/**
 * The file for all of the Pickaxes for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.ItemPickaxe
 */
public class ItemSMMPickaxe extends ItemPickaxe
{
	public ItemSMMPickaxe(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(SpenceriosModMod.tabSMMTools);
	}
}
