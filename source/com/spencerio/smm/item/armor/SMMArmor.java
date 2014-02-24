package com.spencerio.smm.item.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class SMMArmor
{
	public static final ArmorMaterial COAL = EnumHelper.addArmorMaterial("COAL", 30, new int[] {4, 7, 6, 5}, 64);
	
	public static final Item coalHelmet = new ItemSMMArmor(COAL, 0, 0, "coal").setUnlocalizedName("coalHelmet").setTextureName(Reference.MODID + ":" + "coalHelmet");
	public static final Item coalChestplate = new ItemSMMArmor(COAL, 0, 1, "coal").setUnlocalizedName("coalChestplate").setTextureName(Reference.MODID + ":" + "coalChestplate");
	public static final Item coalLeggings = new ItemSMMArmor(COAL, 0, 2, "coal").setUnlocalizedName("coalLeggings").setTextureName(Reference.MODID + ":" + "coalLeggings");
	public static final Item coalBoots = new ItemSMMArmor(COAL, 0, 3, "coal").setUnlocalizedName("coalBoots").setTextureName(Reference.MODID + ":" + "coalBoots");
	
	public static void initArmor()
	{
		GameRegistry.registerItem(coalHelmet, Reference.MODID + "." + coalHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalChestplate, Reference.MODID + "." + coalChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalLeggings, Reference.MODID + "." + coalLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalBoots, Reference.MODID + "." + coalBoots.getUnlocalizedName().substring(5));
	}
}
