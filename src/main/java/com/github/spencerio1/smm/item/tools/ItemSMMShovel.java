package com.github.spencerio1.smm.item.tools;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.HashMapHelper;

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
	
	public ItemSMMShovel setUnlocalizedName(String par1Str) {
		return (ItemSMMShovel)super.setUnlocalizedName(par1Str);
	}
	
	public ItemSMMShovel setTextureName(String par1Str) {
		return (ItemSMMShovel)super.setTextureName(par1Str);
	}
	
	public ItemSMMShovel add() {
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
