package com.github.spencerio1.smm.item.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.HashMapHelper;

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
		HashMapHelper.addToToolsHashMap(getUnlocalizedName().substring(5), this);
		return this;
	}
	
	@Override
	public String getUnlocalizedName() {
		return "item.smm." + super.getUnlocalizedName().substring(5);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		return "item.smm." + super.getUnlocalizedName().substring(5);
	}
}
