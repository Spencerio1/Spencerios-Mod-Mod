package com.spencerio.smm.manager;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.spencerio.smm.block.SMMBlocks;
import com.spencerio.smm.item.SMMItems;
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
		GameRegistry.addRecipe(new ItemStack(SMMTools.emeraldSword), new Object[] {
			"e",
			"e",
			"/",
			'e', Items.emerald, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.redstoneHelmet), new Object[] {
			"rrr",
			"r r",
			'r', Items.redstone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.redstoneChestplate), new Object[] {
			"r r",
			"rrr",
			"rrr",
			'r', Items.redstone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.redstoneLeggings), new Object[] {
			"rrr",
			"r r",
			"r r",
			'r', Items.redstone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.redstoneBoots), new Object[] {
			"r r",
			"r r",
			'r', Items.redstone
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.redstonePickaxe), new Object[] {
			"rrr",
			" / ",
			" / ",
			'r', Items.redstone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.redstoneAxe), new Object[] {
			"rr",
			"r/",
			" /",
			'r', Items.redstone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.redstoneAxe), new Object[] {
			"rr",
			"/r",
			"/ ",
			'r', Items.redstone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.redstoneShovel), new Object[] {
			"r",
			"/",
			"/",
			'r', Items.redstone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.redstoneHoe), new Object[] {
			"rr",
			" /",
			" /",
			'r', Items.redstone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.redstoneHoe), new Object[] {
			"rr",
			"/ ",
			"/ ",
			'r', Items.redstone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.redstoneSword), new Object[] {
			"r",
			"r",
			"/",
			'r', Items.redstone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.lapisLazuliHelmet), new Object[] {
			"lll",
			"l l",
			'l', new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.lapisLazuliChestplate), new Object[] {
			"l l",
			"lll",
			"lll",
			'l', new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.lapisLazuliLeggings), new Object[] {
			"lll",
			"l l",
			"l l",
			'l', new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.lapisLazuliBoots), new Object[] {
			"l l",
			"l l",
			'l', new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.lapisLazuliPickaxe), new Object[] {
			"lll",
			" / ",
			" / ",
			'l', new ItemStack(Items.dye, 1, 4), '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.lapisLazuliAxe), new Object[] {
			"ll",
			"l/",
			" /",
			'l', new ItemStack(Items.dye, 1, 4), '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.lapisLazuliAxe), new Object[] {
			"ll",
			"/l",
			"/ ",
			'l', new ItemStack(Items.dye, 1, 4), '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.lapisLazuliShovel), new Object[] {
			"l",
			"/",
			"/",
			'l', new ItemStack(Items.dye, 1, 4), '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.lapisLazuliHoe), new Object[] {
			"ll",
			" /",
			" /",
			'l', new ItemStack(Items.dye, 1, 4), '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.lapisLazuliHoe), new Object[] {
			"ll",
			"/ ",
			"/ ",
			'l', new ItemStack(Items.dye, 1, 4), '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.lapisLazuliSword), new Object[] {
			"l",
			"l",
			"/",
			'l', new ItemStack(Items.dye, 1, 4), '/', Items.stick
		});
		
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.earthQuartzOre, new ItemStack(SMMItems.earthQuartz), 0.0F);
	}
}
