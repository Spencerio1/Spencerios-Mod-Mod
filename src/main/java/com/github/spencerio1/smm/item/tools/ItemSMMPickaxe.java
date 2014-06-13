package com.github.spencerio1.smm.item.tools;

import net.minecraft.item.ItemPickaxe;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.SMMHashMapHelper;

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
	
	public ItemSMMPickaxe setUnlocalizedName(String par1Str) {
		return (ItemSMMPickaxe)super.setUnlocalizedName(par1Str);
	}
	
	public ItemSMMPickaxe setTextureName(String par1Str) {
		return (ItemSMMPickaxe)super.setTextureName(par1Str);
	}
	
	public ItemSMMPickaxe add() {
		SMMHashMapHelper.addToToolsHashMap(getUnlocalizedName().substring(5), this);
		return this;
	}
}
