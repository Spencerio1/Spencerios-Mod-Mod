package com.spencerio.smm.item.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class SMMArmor
{
	public static final ArmorMaterial COAL = EnumHelper.addArmorMaterial("COAL", 30, new int[] {4, 7, 6, 5}, 64);
	public static final ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("EMERALD", 35, new int[] {5, 8, 7, 6}, 10);
	public static final ArmorMaterial REDSTONE = EnumHelper.addArmorMaterial("REDSTONE", 25, new int[] {3, 6, 5, 4}, 60);
	
	public static final Item coalHelmet = new ItemSMMArmor(COAL, 0, 0, "coal").setUnlocalizedName("coalHelmet").setTextureName(Reference.MODID + ":" + "coalHelmet");
	public static final Item coalChestplate = new ItemSMMArmor(COAL, 0, 1, "coal").setUnlocalizedName("coalChestplate").setTextureName(Reference.MODID + ":" + "coalChestplate");
	public static final Item coalLeggings = new ItemSMMArmor(COAL, 0, 2, "coal").setUnlocalizedName("coalLeggings").setTextureName(Reference.MODID + ":" + "coalLeggings");
	public static final Item coalBoots = new ItemSMMArmor(COAL, 0, 3, "coal").setUnlocalizedName("coalBoots").setTextureName(Reference.MODID + ":" + "coalBoots");
	public static final Item emeraldHelmet = new ItemSMMArmor(EMERALD, 0, 0, "emerald").setUnlocalizedName("emeraldHelmet").setTextureName(Reference.MODID + ":" + "emeraldHelmet");
	public static final Item emeraldChestplate = new ItemSMMArmor(EMERALD, 0, 1, "emerald").setUnlocalizedName("emeraldChestplate").setTextureName(Reference.MODID + ":" + "emeraldChestplate");
	public static final Item emeraldLeggings = new ItemSMMArmor(EMERALD, 0, 2, "emerald").setUnlocalizedName("emeraldLeggings").setTextureName(Reference.MODID + ":" + "emeraldLeggings");
	public static final Item emeraldBoots = new ItemSMMArmor(EMERALD, 0, 3, "emerald").setUnlocalizedName("emeraldBoots").setTextureName(Reference.MODID + ":" + "emeraldBoots");
	public static final Item redstoneHelmet = new ItemSMMArmor(REDSTONE, 0, 0, "redstone").setUnlocalizedName("redstoneHelmet").setTextureName(Reference.MODID + ":" + "redstoneHelmet");
	public static final Item redstoneChestplate = new ItemSMMArmor(REDSTONE, 0, 1, "redstone").setUnlocalizedName("redstoneChestplate").setTextureName(Reference.MODID + ":" + "redstoneChestplate");
	public static final Item redstoneLeggings = new ItemSMMArmor(REDSTONE, 0, 2, "redstone").setUnlocalizedName("redstoneLeggings").setTextureName(Reference.MODID + ":" + "redstoneLeggings");
	public static final Item redstoneBoots = new ItemSMMArmor(REDSTONE, 0, 3, "redstone").setUnlocalizedName("redstoneBoots").setTextureName(Reference.MODID + ":" + "redstoneBoots");
	
	public static void initArmor()
	{
		GameRegistry.registerItem(coalHelmet, coalHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalChestplate, coalChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalLeggings, coalLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalBoots, coalBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHelmet, emeraldHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldChestplate, emeraldChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldLeggings, emeraldLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldBoots, emeraldBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneHelmet, redstoneHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneChestplate, redstoneChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneLeggings, redstoneLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneBoots, redstoneBoots.getUnlocalizedName().substring(5));
	}
}
