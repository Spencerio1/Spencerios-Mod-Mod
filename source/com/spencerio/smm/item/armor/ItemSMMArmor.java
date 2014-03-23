package com.spencerio.smm.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.spencerio.smm.SpenceriosModMod;

/**
 * The file for all of the Armor in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.ItemArmor
 */
public class ItemSMMArmor extends ItemArmor
{
	public ItemSMMArmor(ArmorMaterial armorMaterial, int par0, int type, String armorPrefix)
	{
		super(armorMaterial, par0, type);
		armorName = armorPrefix;
		this.setCreativeTab(SpenceriosModMod.tabSMMArmor);
	}
	public String armorName;
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.toString().contains("leggings") || stack.toString().contains("Leggings"))
			return "spencerio_smm:textures/models/armor/" + armorName + "_layer_2.png";
		else
			return "spencerio_smm:textures/models/armor/" + armorName + "_layer_1.png";
	}
}
