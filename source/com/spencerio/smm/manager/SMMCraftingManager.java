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
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.earthQuartzBlock), new Object[] {
			"qqq",
			"qqq",
			"qqq",
			'q', SMMItems.earthQuartz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.earthQuartzHelmet), new Object[] {
			"eee",
			"e e",
			'e', SMMItems.earthQuartz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.earthQuartzChestplate), new Object[] {
			"e e",
			"eee",
			"eee",
			'e', SMMItems.earthQuartz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.earthQuartzLeggings), new Object[] {
			"eee",
			"e e",
			"e e",
			'e', SMMItems.earthQuartz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.earthQuartzBoots), new Object[] {
			"e e",
			"e e",
			'e', SMMItems.earthQuartz
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.earthQuartzPickaxe), new Object[] {
			"eee",
			" / ",
			" / ",
			'e', SMMItems.earthQuartz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.earthQuartzAxe), new Object[] {
			"ee",
			"e/",
			" /",
			'e', SMMItems.earthQuartz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.earthQuartzAxe), new Object[] {
			"ee",
			"/e",
			"/ ",
			'e', SMMItems.earthQuartz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.earthQuartzShovel), new Object[] {
			"e",
			"/",
			"/",
			'e', SMMItems.earthQuartz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.earthQuartzHoe), new Object[] {
			"ee",
			" /",
			" /",
			'e', SMMItems.earthQuartz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.earthQuartzHoe), new Object[] {
			"ee",
			"/ ",
			"/ ",
			'e', SMMItems.earthQuartz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.earthQuartzSword), new Object[] {
			"e",
			"e",
			"/",
			'e', SMMItems.earthQuartz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.copperBlock), new Object[] {
			"ccc",
			"ccc",
			"ccc",
			'c', SMMItems.copperIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.copperHelmet), new Object[] {
			"ccc",
			"c c",
			'c', SMMItems.copperIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.copperChestplate), new Object[] {
			"c c",
			"ccc",
			"ccc",
			'c', SMMItems.copperIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.copperLeggings), new Object[] {
			"ccc",
			"c c",
			"c c",
			'c', SMMItems.copperIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.copperBoots), new Object[] {
			"c c",
			"c c",
			'c', SMMItems.copperIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.copperPickaxe), new Object[] {
			"ccc",
			" / ",
			" / ",
			'c', SMMItems.copperIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.copperAxe), new Object[] {
			"cc",
			"c/",
			" /",
			'c', SMMItems.copperIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.copperAxe), new Object[] {
			"cc",
			"/c",
			"/ ",
			'c', SMMItems.copperIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.copperShovel), new Object[] {
			"c",
			"/",
			"/",
			'c', SMMItems.copperIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.copperHoe), new Object[] {
			"cc",
			" /",
			" /",
			'c', SMMItems.copperIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.copperHoe), new Object[] {
			"cc",
			"/ ",
			"/ ",
			'c', SMMItems.copperIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.copperSword), new Object[] {
			"c",
			"c",
			"/",
			'c', SMMItems.copperIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.carbonBlock), new Object[] {
			"ccc",
			"ccc",
			"ccc",
			'c', SMMItems.carbonIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.carbonHelmet), new Object[] {
			"ccc",
			"c c",
			'c', SMMItems.carbonIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.carbonChestplate), new Object[] {
			"c c",
			"ccc",
			"ccc",
			'c', SMMItems.carbonIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.carbonLeggings), new Object[] {
			"ccc",
			"c c",
			"c c",
			'c', SMMItems.carbonIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.carbonBoots), new Object[] {
			"c c",
			"c c",
			'c', SMMItems.carbonIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.carbonPickaxe), new Object[] {
			"ccc",
			" / ",
			" / ",
			'c', SMMItems.carbonIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.carbonAxe), new Object[] {
			"cc",
			"c/",
			" /",
			'c', SMMItems.carbonIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.carbonAxe), new Object[] {
			"cc",
			"/c",
			"/ ",
			'c', SMMItems.carbonIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.carbonShovel), new Object[] {
			"c",
			"/",
			"/",
			'c', SMMItems.carbonIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.carbonHoe), new Object[] {
			"cc",
			" /",
			" /",
			'c', SMMItems.carbonIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.carbonHoe), new Object[] {
			"cc",
			"/ ",
			"/ ",
			'c', SMMItems.carbonIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.carbonSword), new Object[] {
			"c",
			"c",
			"/",
			'c', SMMItems.carbonIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.silverBlock), new Object[] {
			"sss",
			"sss",
			"sss",
			's', SMMItems.silverIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.silverHelmet), new Object[] {
			"sss",
			"s s",
			's', SMMItems.silverIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.silverChestplate), new Object[] {
			"s s",
			"sss",
			"sss",
			's', SMMItems.silverIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.silverLeggings), new Object[] {
			"sss",
			"s s",
			"s s",
			's', SMMItems.silverIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.silverBoots), new Object[] {
			"s s",
			"s s",
			's', SMMItems.silverIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.silverPickaxe), new Object[] {
			"sss",
			" / ",
			" / ",
			's', SMMItems.silverIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.silverAxe), new Object[] {
			"ss",
			"s/",
			" /",
			's', SMMItems.silverIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.silverAxe), new Object[] {
			"ss",
			"/s",
			"/ ",
			's', SMMItems.silverIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.silverShovel), new Object[] {
			"s",
			"/",
			"/",
			's', SMMItems.silverIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.silverHoe), new Object[] {
			"ss",
			" /",
			" /",
			's', SMMItems.silverIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.silverHoe), new Object[] {
			"ss",
			"/ ",
			"/ ",
			's', SMMItems.silverIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.silverSword), new Object[] {
			"s",
			"s",
			"/",
			's', SMMItems.silverIngot, '/', Items.stick
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.earthQuartz, 9), new Object[] {
			new ItemStack(SMMBlocks.earthQuartzBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.copperIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.copperBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.carbonIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.carbonBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.silverIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.silverBlock)
		});
		
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.earthQuartzOre, new ItemStack(SMMItems.earthQuartz), 0.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.copperOre, new ItemStack(SMMItems.copperIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.carbonOre, new ItemStack(SMMItems.carbonIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.silverOre, new ItemStack(SMMItems.silverIngot), 1.0F);
	}
}
