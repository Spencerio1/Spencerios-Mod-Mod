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
	}
}
