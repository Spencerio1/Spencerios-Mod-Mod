package com.github.spencerio1.smm.item.tools;

import net.minecraft.item.ItemHoe;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.HashMapHelper;

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
	
	public ItemSMMHoe setUnlocalizedName(String par1Str) {
		return (ItemSMMHoe)super.setUnlocalizedName(par1Str);
	}
	
	public ItemSMMHoe setTextureName(String par1Str) {
		return (ItemSMMHoe)super.setTextureName(par1Str);
	}
	
	public ItemSMMHoe add() {
		HashMapHelper.addToToolsHashMap(getUnlocalizedName().substring(5), this);
		return this;
	}
}
