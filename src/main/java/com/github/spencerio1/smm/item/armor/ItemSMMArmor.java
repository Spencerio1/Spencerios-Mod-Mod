package com.github.spencerio1.smm.item.armor;

import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.helper.HashMapHelper;
import com.github.spencerio1.smm.lib.ModInfo;

/**
 * The file for all of the Armor in Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.ItemArmor
 */
public class ItemSMMArmor extends ItemArmor
{
	private int index;
	
	public ItemSMMArmor(ArmorMaterial armorMaterial, int addArmorProxyCall, int type)
	{
		super(armorMaterial, addArmorProxyCall, type);
		this.index = addArmorProxyCall;
		this.setCreativeTab(SpenceriosModMod.tabSMMArmor);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.toString().contains("leggings") || stack.toString().contains("Leggings")) {
			return ModInfo.MODID + ":textures/models/armor/" + RenderBiped.bipedArmorFilenamePrefix[index] + "_layer_2.png";
		} else {
			return ModInfo.MODID + ":textures/models/armor/" + RenderBiped.bipedArmorFilenamePrefix[index] + "_layer_1.png";
		}
	}

	public ItemSMMArmor setUnlocalizedName(String par1Str) {
		return (ItemSMMArmor)super.setUnlocalizedName(par1Str);
	}

	public ItemSMMArmor setTextureName(String par1Str) {
		return (ItemSMMArmor)super.setTextureName(par1Str);
	}

	public ItemSMMArmor add() {
		HashMapHelper.addToArmorHashMap(getUnlocalizedName().substring(5), this);
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
