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
	public static final ArmorMaterial LAPISLAZULI = EnumHelper.addArmorMaterial("LAPISLAZULI", 20, new int[] {2, 5, 4, 3}, 50);
	public static final ArmorMaterial EARTHQUARTZ = EnumHelper.addArmorMaterial("EARTHQUARTZ", 30, new int[] {2, 7, 5, 3}, 20);
	public static final ArmorMaterial COPPER = EnumHelper.addArmorMaterial("COPPER", 30, new int[] {3, 6, 5, 4}, 25);
	public static final ArmorMaterial CARBON = EnumHelper.addArmorMaterial("CARBON", 35, new int[] {4, 7, 6, 5}, 15);
	
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
	public static final Item lapisLazuliHelmet = new ItemSMMArmor(LAPISLAZULI, 0, 0, "lapisLazuli").setUnlocalizedName("lapisLazuliHelmet").setTextureName(Reference.MODID + ":" + "lapisLazuliHelmet");
	public static final Item lapisLazuliChestplate = new ItemSMMArmor(LAPISLAZULI, 0, 1, "lapisLazuli").setUnlocalizedName("lapisLazuliChestplate").setTextureName(Reference.MODID + ":" + "lapisLazuliChestplate");
	public static final Item lapisLazuliLeggings = new ItemSMMArmor(LAPISLAZULI, 0, 2, "lapisLazuli").setUnlocalizedName("lapisLazuliLeggings").setTextureName(Reference.MODID + ":" + "lapisLazuliLeggings");
	public static final Item lapisLazuliBoots = new ItemSMMArmor(LAPISLAZULI, 0, 3, "lapisLazuli").setUnlocalizedName("lapisLazuliBoots").setTextureName(Reference.MODID + ":" + "lapisLazuliBoots");
	public static final Item earthQuartzHelmet = new ItemSMMArmor(EARTHQUARTZ, 0, 0, "earthQuartz").setUnlocalizedName("earthQuartzHelmet").setTextureName(Reference.MODID + ":" + "earthQuartzHelmet");
	public static final Item earthQuartzChestplate = new ItemSMMArmor(EARTHQUARTZ, 0, 1, "earthQuartz").setUnlocalizedName("earthQuartzChestplate").setTextureName(Reference.MODID + ":" + "earthQuartzChestplate");
	public static final Item earthQuartzLeggings = new ItemSMMArmor(EARTHQUARTZ, 0, 2, "earthQuartz").setUnlocalizedName("earthQuartzLeggings").setTextureName(Reference.MODID + ":" + "earthQuartzLeggings");
	public static final Item earthQuartzBoots = new ItemSMMArmor(EARTHQUARTZ, 0, 3, "earthQuartz").setUnlocalizedName("earthQuartzBoots").setTextureName(Reference.MODID + ":" + "earthQuartzBoots");
	public static final Item copperHelmet = new ItemSMMArmor(COPPER, 0, 0, "copper").setUnlocalizedName("copperHelmet").setTextureName(Reference.MODID + ":" + "copperHelmet");
	public static final Item copperChestplate = new ItemSMMArmor(COPPER, 0, 1, "copper").setUnlocalizedName("copperChestplate").setTextureName(Reference.MODID + ":" + "copperChestplate");
	public static final Item copperLeggings = new ItemSMMArmor(COPPER, 0, 2, "copper").setUnlocalizedName("copperLeggings").setTextureName(Reference.MODID + ":" + "copperLeggings");
	public static final Item copperBoots = new ItemSMMArmor(COPPER, 0, 3, "copper").setUnlocalizedName("copperBoots").setTextureName(Reference.MODID + ":" + "copperBoots");
	public static final Item carbonHelmet = new ItemSMMArmor(CARBON, 0, 0, "carbon").setUnlocalizedName("carbonHelmet").setTextureName(Reference.MODID + ":" + "carbonHelmet");
	public static final Item carbonChestplate = new ItemSMMArmor(CARBON, 0, 1, "carbon").setUnlocalizedName("carbonChestplate").setTextureName(Reference.MODID + ":" + "carbonChestplate");
	public static final Item carbonLeggings = new ItemSMMArmor(CARBON, 0, 2, "carbon").setUnlocalizedName("carbonLeggings").setTextureName(Reference.MODID + ":" + "carbonLeggings");
	public static final Item carbonBoots = new ItemSMMArmor(CARBON, 0, 3, "carbon").setUnlocalizedName("carbonBoots").setTextureName(Reference.MODID + ":" + "carbonBoots");
	
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
		GameRegistry.registerItem(lapisLazuliHelmet, lapisLazuliHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliChestplate, lapisLazuliChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliLeggings, lapisLazuliLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliBoots, lapisLazuliBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzHelmet, earthQuartzHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzChestplate, earthQuartzChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzLeggings, earthQuartzLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzBoots, earthQuartzBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperHelmet, copperHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperChestplate, copperChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperLeggings, copperLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperBoots, copperBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonHelmet, carbonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonChestplate, carbonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonLeggings, carbonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonBoots, carbonBoots.getUnlocalizedName().substring(5));
	}
}
