package com.github.spencerio1.smm.item.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.HashMapHelper;

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
