package com.spencerio.smm.manager;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.spencerio.smm.block.SMMBlocks;
import com.spencerio.smm.item.SMMItems;
import com.spencerio.smm.item.armor.SMMArmor;
import com.spencerio.smm.item.tools.SMMTools;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * The file where all of the recipes are kept for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.crafting.CraftingManager
 * @see net.minecraft.item.crafting.FurnaceRecipes
 */
public class SMMCraftingManager
{
	public static void registerRecipes()
	{
		initShapedRecipes();
		initShapelessRecipes();
		initFurnaceRecipes();
	}
	
	private static void initShapedRecipes()
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
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.cobaltBlock), new Object[] {
			"ccc",
			"ccc",
			"ccc",
			'c', SMMItems.cobaltIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobaltHelmet), new Object[] {
			"ccc",
			"c c",
			'c', SMMItems.cobaltIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobaltChestplate), new Object[] {
			"c c",
			"ccc",
			"ccc",
			'c', SMMItems.cobaltIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobaltLeggings), new Object[] {
			"ccc",
			"c c",
			"c c",
			'c', SMMItems.cobaltIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobaltBoots), new Object[] {
			"c c",
			"c c",
			'c', SMMItems.cobaltIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.cobaltPickaxe), new Object[] {
			"ccc",
			" / ",
			" / ",
			'c', SMMItems.cobaltIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.cobaltAxe), new Object[] {
			"cc",
			"c/",
			" /",
			'c', SMMItems.cobaltIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.cobaltAxe), new Object[] {
			"cc",
			"/c",
			"/ ",
			'c', SMMItems.cobaltIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.cobaltShovel), new Object[] {
			"c",
			"/",
			"/",
			'c', SMMItems.cobaltIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.cobaltHoe), new Object[] {
			"cc",
			" /",
			" /",
			'c', SMMItems.cobaltIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.cobaltHoe), new Object[] {
			"cc",
			"/ ",
			"/ ",
			'c', SMMItems.cobaltIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.cobaltSword), new Object[] {
			"c",
			"c",
			"/",
			'c', SMMItems.cobaltIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.rubyBlock), new Object[] {
			"rrr",
			"rrr",
			"rrr",
			'r', SMMItems.ruby
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.rubyHelmet), new Object[] {
			"rrr",
			"r r",
			'r', SMMItems.ruby
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.rubyChestplate), new Object[] {
			"r r",
			"rrr",
			"rrr",
			'r', SMMItems.ruby
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.rubyLeggings), new Object[] {
			"rrr",
			"r r",
			"r r",
			'r', SMMItems.ruby
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.rubyBoots), new Object[] {
			"r r",
			"r r",
			'r', SMMItems.ruby
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.rubyPickaxe), new Object[] {
			"rrr",
			" / ",
			" / ",
			'r', SMMItems.ruby, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.rubyAxe), new Object[] {
			"rr",
			"r/",
			" /",
			'r', SMMItems.ruby, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.rubyAxe), new Object[] {
			"rr",
			"/r",
			"/ ",
			'r', SMMItems.ruby, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.rubyShovel), new Object[] {
			"r",
			"/",
			"/",
			'r', SMMItems.ruby, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.rubyHoe), new Object[] {
			"rr",
			" /",
			" /",
			'r', SMMItems.ruby, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.rubyHoe), new Object[] {
			"rr",
			"/ ",
			"/ ",
			'r', SMMItems.ruby, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.rubySword), new Object[] {
			"r",
			"r",
			"/",
			'r', SMMItems.ruby, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.titaniumBlock), new Object[] {
			"ttt",
			"ttt",
			"ttt",
			't', SMMItems.titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.titaniumHelmet), new Object[] {
			"ttt",
			"t t",
			't', SMMItems.titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.titaniumChestplate), new Object[] {
			"t t",
			"ttt",
			"ttt",
			't', SMMItems.titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.titaniumLeggings), new Object[] {
			"ttt",
			"t t",
			"t t",
			't', SMMItems.titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.titaniumBoots), new Object[] {
			"t t",
			"t t",
			't', SMMItems.titaniumIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.titaniumPickaxe), new Object[] {
			"ttt",
			" / ",
			" / ",
			't', SMMItems.titaniumIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.titaniumAxe), new Object[] {
			"tt",
			"t/",
			" /",
			't', SMMItems.titaniumIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.titaniumAxe), new Object[] {
			"tt",
			"/t",
			"/ ",
			't', SMMItems.titaniumIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.titaniumShovel), new Object[] {
			"t",
			"/",
			"/",
			't', SMMItems.titaniumIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.titaniumHoe), new Object[] {
			"tt",
			" /",
			" /",
			't', SMMItems.titaniumIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.titaniumHoe), new Object[] {
			"tt",
			"/ ",
			"/ ",
			't', SMMItems.titaniumIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.titaniumSword), new Object[] {
			"t",
			"t",
			"/",
			't', SMMItems.titaniumIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.hellishBlock), new Object[] {
			"hhh",
			"hhh",
			"hhh",
			'h', SMMItems.hellishIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.hellishHelmet), new Object[] {
			"hhh",
			"h h",
			'h', SMMItems.hellishIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.hellishChestplate), new Object[] {
			"h h",
			"hhh",
			"hhh",
			'h', SMMItems.hellishIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.hellishLeggings), new Object[] {
			"hhh",
			"h h",
			"h h",
			'h', SMMItems.hellishIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.hellishBoots), new Object[] {
			"h h",
			"h h",
			'h', SMMItems.hellishIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.hellishPickaxe), new Object[] {
			"hhh",
			" / ",
			" / ",
			'h', SMMItems.hellishIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.hellishAxe), new Object[] {
			"hh",
			"h/",
			" /",
			'h', SMMItems.hellishIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.hellishAxe), new Object[] {
			"hh",
			"/h",
			"/ ",
			'h', SMMItems.hellishIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.hellishShovel), new Object[] {
			"h",
			"/",
			"/",
			'h', SMMItems.hellishIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.hellishHoe), new Object[] {
			"hh",
			" /",
			" /",
			'h', SMMItems.hellishIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.hellishHoe), new Object[] {
			"hh",
			"/ ",
			"/ ",
			'h', SMMItems.hellishIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.hellishSword), new Object[] {
			"h",
			"h",
			"/",
			'h', SMMItems.hellishIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.leadBlock), new Object[] {
			"lll",
			"lll",
			"lll",
			'l', SMMItems.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.leadHelmet), new Object[] {
			"lll",
			"l l",
			'l', SMMItems.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.leadChestplate), new Object[] {
			"l l",
			"lll",
			"lll",
			'l', SMMItems.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.leadLeggings), new Object[] {
			"lll",
			"l l",
			"l l",
			'l', SMMItems.leadIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.leadBoots), new Object[] {
			"l l",
			"l l",
			'l', SMMItems.leadIngot
		});
	}
	private static void initShapelessRecipes()
	{
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
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.cobaltIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.cobaltBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.ruby, 9), new Object[] {
			new ItemStack(SMMBlocks.rubyBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.titaniumIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.titaniumBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.hellishIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.hellishBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.leadIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.leadBlock)
		});
	}
	private static void initFurnaceRecipes()
	{
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.earthQuartzOre, new ItemStack(SMMItems.earthQuartz), 0.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.copperOre, new ItemStack(SMMItems.copperIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.carbonOre, new ItemStack(SMMItems.carbonIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.silverOre, new ItemStack(SMMItems.silverIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.cobaltOre, new ItemStack(SMMItems.cobaltIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.rubyOre, new ItemStack(SMMItems.ruby), 0.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.titaniumOre, new ItemStack(SMMItems.titaniumIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.hellishOre, new ItemStack(SMMItems.hellishIngot), 1.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.leadOre, new ItemStack(SMMItems.leadIngot), 1.0F);
	}
}
