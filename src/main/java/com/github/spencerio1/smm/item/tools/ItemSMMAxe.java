package com.github.spencerio1.smm.item.tools;

import net.minecraft.item.ItemAxe;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.SMMHashMapHelper;

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
	
	public ItemSMMAxe setUnlocalizedName(String par1Str) {
		return (ItemSMMAxe)super.setUnlocalizedName(par1Str);
	}
	
	public ItemSMMAxe setTextureName(String par1Str) {
		return (ItemSMMAxe)super.setTextureName(par1Str);
	}
	
	public ItemSMMAxe add() {
		SMMHashMapHelper.addToToolsHashMap(getUnlocalizedName().substring(5), this);
		return this;
	}
}
