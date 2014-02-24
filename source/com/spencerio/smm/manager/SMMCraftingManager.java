package com.spencerio.smm.manager;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.spencerio.smm.item.armor.SMMArmor;
import com.spencerio.smm.item.tools.SMMTools;

import cpw.mods.fml.common.registry.GameRegistry;

public class SMMCraftingManager
{
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(SMMArmor.coalHelmet), new Object[] {
			"ccc",
			"c c",
			'c', Items.coal
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.coalChestplate), new Object[] {
			"c c",
			"ccc",
			"ccc",
			'c', Items.coal
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.coalLeggings), new Object[] {
			"ccc",
			"c c",
			"c c",
			'c', Items.coal
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.coalBoots), new Object[] {
			"c c",
			"c c",
			'c', Items.coal
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.coalPickaxe), new Object[] {
			"ccc",
			" / ",
			" / ",
			'c', Items.coal, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.coalAxe), new Object[] {
			"cc",
			"c/",
			" /",
			'c', Items.coal, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.coalAxe), new Object[] {
			"cc",
			"/c",
			"/ ",
			'c', Items.coal, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.coalShovel), new Object[] {
			"c",
			"/",
			"/",
			'c', Items.coal, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.coalHoe), new Object[] {
			"cc",
			" /",
			" /",
			'c', Items.coal, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.coalHoe), new Object[] {
			"cc",
			"/ ",
			"/ ",
			'c', Items.coal, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.coalSword), new Object[] {
			"c",
			"c",
			"/",
			'c', Items.coal, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.emeraldHelmet), new Object[] {
			"eee",
			"e e",
			'e', Items.emerald
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.emeraldChestplate), new Object[] {
			"e e",
			"eee",
			"eee",
			'e', Items.emerald
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.emeraldLeggings), new Object[] {
			"eee",
			"e e",
			"e e",
			'e', Items.emerald
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.emeraldBoots), new Object[] {
			"e e",
			"e e",
			'e', Items.emerald
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.emeraldPickaxe), new Object[] {
			"eee",
			" / ",
			" / ",
			'e', Items.emerald, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.emeraldAxe), new Object[] {
			"ee",
			"e/",
			" /",
			'e', Items.emerald, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.emeraldAxe), new Object[] {
			"ee",
			"/e",
			"/ ",
			'e', Items.emerald, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.emeraldShovel), new Object[] {
			"e",
			"/",
			"/",
			'e', Items.emerald, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.emeraldHoe), new Object[] {
			"ee",
			" /",
			" /",
			'e', Items.emerald, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.emeraldHoe), new Object[] {
			"ee",
			"/ ",
			"/ ",
			'e', Items.emerald, '/', Items.stick
		});
	}
}
