package com.github.spencerio1.smm.item.tools;

import net.minecraft.item.ItemSword;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.HashMapHelper;

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
	
	public ItemSMMSword setUnlocalizedName(String par1Str) {
		return (ItemSMMSword)super.setUnlocalizedName(par1Str);
	}
	
	public ItemSMMSword setTextureName(String par1Str) {
		return (ItemSMMSword)super.setTextureName(par1Str);
	}
	
	public ItemSMMSword add() {
		HashMapHelper.addToToolsHashMap(getUnlocalizedName().substring(5), this);
		return this;
	}
}
