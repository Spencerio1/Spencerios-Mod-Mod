package com.spencerio.smm.manager;

import net.minecraft.init.Blocks;
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
		GameRegistry.addRecipe(new ItemStack(SMMTools.leadPickaxe), new Object[] {
			"lll",
			" / ",
			" / ",
			'l', SMMItems.leadIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.leadAxe), new Object[] {
			"ll",
			"l/",
			" /",
			'l', SMMItems.leadIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.leadAxe), new Object[] {
			"ll",
			"/l",
			"/ ",
			'l', SMMItems.leadIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.leadShovel), new Object[] {
			"l",
			"/",
			"/",
			'l', SMMItems.leadIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.leadHoe), new Object[] {
			"ll",
			" /",
			" /",
			'l', SMMItems.leadIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.leadHoe), new Object[] {
			"ll",
			"/ ",
			"/ ",
			'l', SMMItems.leadIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.leadSword), new Object[] {
			"l",
			"l",
			"/",
			'l', SMMItems.leadIngot, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.obsidianHelmet), new Object[] {
			"ooo",
			"o o",
			'o', Blocks.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.obsidianChestplate), new Object[] {
			"o o",
			"ooo",
			"ooo",
			'o', Blocks.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.obsidianLeggings), new Object[] {
			"ooo",
			"o o",
			"o o",
			'o', Blocks.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.obsidianBoots), new Object[] {
			"o o",
			"o o",
			'o', Blocks.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.obsidianPickaxe), new Object[] {
			"ooo",
			" / ",
			" / ",
			'o', Blocks.obsidian, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.obsidianAxe), new Object[] {
			"oo",
			"o/",
			" /",
			'o', Blocks.obsidian, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.obsidianAxe), new Object[] {
			"oo",
			"/o",
			"/ ",
			'o', Blocks.obsidian, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.obsidianShovel), new Object[] {
			"o",
			"/",
			"/",
			'o', Blocks.obsidian, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.obsidianHoe), new Object[] {
			"oo",
			" /",
			" /",
			'o', Blocks.obsidian, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.obsidianHoe), new Object[] {
			"oo",
			"/ ",
			"/ ",
			'o', Blocks.obsidian, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.obsidianSword), new Object[] {
			"o",
			"o",
			"/",
			'o', Blocks.obsidian, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.endStoneHelmet), new Object[] {
			"eee",
			"e e",
			'e', Blocks.end_stone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.endStoneChestplate), new Object[] {
			"e e",
			"eee",
			"eee",
			'e', Blocks.end_stone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.endStoneLeggings), new Object[] {
			"eee",
			"e e",
			"e e",
			'e', Blocks.end_stone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.endStoneBoots), new Object[] {
			"e e",
			"e e",
			'e', Blocks.end_stone
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.endStonePickaxe), new Object[] {
			"eee",
			" / ",
			" / ",
			'e', Blocks.end_stone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.endStoneAxe), new Object[] {
			"ee",
			"e/",
			" /",
			'e', Blocks.end_stone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.endStoneAxe), new Object[] {
			"ee",
			"/e",
			"/ ",
			'e', Blocks.end_stone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.endStoneShovel), new Object[] {
			"e",
			"/",
			"/",
			'e', Blocks.end_stone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.endStoneHoe), new Object[] {
			"ee",
			" /",
			" /",
			'e', Blocks.end_stone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.endStoneHoe), new Object[] {
			"ee",
			"/ ",
			"/ ",
			'e', Blocks.end_stone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.endStoneSword), new Object[] {
			"e",
			"e",
			"/",
			'e', Blocks.end_stone, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobblestoneHelmet), new Object[] {
			"ccc",
			"c c",
			'c', Blocks.cobblestone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobblestoneChestplate), new Object[] {
			"c c",
			"ccc",
			"ccc",
			'c', Blocks.cobblestone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobblestoneLeggings), new Object[] {
			"ccc",
			"c c",
			"c c",
			'c', Blocks.cobblestone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.cobblestoneBoots), new Object[] {
			"c c",
			"c c",
			'c', Blocks.cobblestone
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.woodHelmet), new Object[] {
			"www",
			"w w",
			'w', Blocks.planks
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.woodChestplate), new Object[] {
			"w w",
			"www",
			"www",
			'w', Blocks.planks
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.woodLeggings), new Object[] {
			"www",
			"w w",
			"w w",
			'w', Blocks.planks
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.woodBoots), new Object[] {
			"w w",
			"w w",
			'w', Blocks.planks
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.sapphireBlock), new Object[] {
			"sss",
			"sss",
			"sss",
			's', SMMItems.sapphire
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.sapphireHelmet), new Object[] {
			"sss",
			"s s",
			's', SMMItems.sapphire
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.sapphireChestplate), new Object[] {
			"s s",
			"sss",
			"sss",
			's', SMMItems.sapphire
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.sapphireLeggings), new Object[] {
			"sss",
			"s s",
			"s s",
			's', SMMItems.sapphire
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.sapphireBoots), new Object[] {
			"s s",
			"s s",
			's', SMMItems.sapphire
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.sapphirePickaxe), new Object[] {
			"sss",
			" / ",
			" / ",
			's', SMMItems.sapphire, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.sapphireAxe), new Object[] {
			"ss",
			"s/",
			" /",
			's', SMMItems.sapphire, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.sapphireAxe), new Object[] {
			"ss",
			"/s",
			"/ ",
			's', SMMItems.sapphire, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.sapphireShovel), new Object[] {
			"s",
			"/",
			"/",
			's', SMMItems.sapphire, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.sapphireHoe), new Object[] {
			"ss",
			" /",
			" /",
			's', SMMItems.sapphire, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.sapphireHoe), new Object[] {
			"ss",
			"/ ",
			"/ ",
			's', SMMItems.sapphire, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.sapphireSword), new Object[] {
			"s",
			"s",
			"/",
			's', SMMItems.sapphire, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.topazBlock), new Object[] {
			"ttt",
			"ttt",
			"ttt",
			't', SMMItems.topaz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.topazHelmet), new Object[] {
			"ttt",
			"t t",
			't', SMMItems.topaz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.topazChestplate), new Object[] {
			"t t",
			"ttt",
			"ttt",
			't', SMMItems.topaz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.topazLeggings), new Object[] {
			"ttt",
			"t t",
			"t t",
			't', SMMItems.topaz
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.topazBoots), new Object[] {
			"t t",
			"t t",
			't', SMMItems.topaz
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.topazPickaxe), new Object[] {
			"ttt",
			" / ",
			" / ",
			't', SMMItems.topaz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.topazAxe), new Object[] {
			"tt",
			"t/",
			" /",
			't', SMMItems.topaz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.topazAxe), new Object[] {
			"tt",
			"/t",
			"/ ",
			't', SMMItems.topaz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.topazShovel), new Object[] {
			"t",
			"/",
			"/",
			't', SMMItems.topaz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.topazHoe), new Object[] {
			"tt",
			" /",
			" /",
			't', SMMItems.topaz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.topazHoe), new Object[] {
			"tt",
			"/ ",
			"/ ",
			't', SMMItems.topaz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.topazSword), new Object[] {
			"t",
			"t",
			"/",
			't', SMMItems.topaz, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 50), new Object[] {
			"ggg",
			"gEg",
			"ggg",
			'g', Items.gunpowder, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 51), new Object[] {
			"bbb",
			"bEb",
			"bbb",
			'b', Items.bone, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 52), new Object[] {
			"eee",
			"eEe",
			"eee",
			'e', Items.spider_eye, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 54), new Object[] {
			"rrr",
			"rEr",
			"rrr",
			'r', Items.rotten_flesh, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 55), new Object[] {
			"sss",
			"sEs",
			"sss",
			's', Items.slime_ball, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 56), new Object[] {
			"ttt",
			"tEt",
			"ttt",
			't', Items.ghast_tear, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 57), new Object[] {
			"ggg",
			"gEg",
			"ggg",
			'g', Items.gold_nugget, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 58), new Object[] {
			"eee",
			"eEe",
			"eee",
			'e', Items.ender_pearl, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 59), new Object[] {
			"epe",
			"eEe",
			"eee",
			'e', Items.spider_eye, 'p', new ItemStack(Items.potionitem, 1, 16388), 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 60), new Object[] {
			"fbf",
			"bEb",
			"fbf",
			'f', Blocks.iron_bars, 'b', Blocks.stonebrick, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 61), new Object[] {
			"rrr",
			"rEr",
			"rrr",
			'r', Items.blaze_rod, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 65), new Object[] {
			"ccc",
			"cEc",
			"ccc",
			'c', Blocks.cobblestone, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 66), new Object[] {
			"sps",
			"pEp",
			"sps",
			's', Items.stick, 'p', new ItemStack(Items.potionitem, 1, 8197), 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 90), new Object[] {
			"ppp",
			"pEp",
			"ppp",
			'p', Items.porkchop, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 91), new Object[] {
			"www",
			"wEw",
			"www",
			'w', Blocks.wool, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 92), new Object[] {
			"bbb",
			"bEb",
			"bbb",
			'b', Items.beef, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 93), new Object[] {
			"fff",
			"fEf",
			"fff",
			'f', Items.feather, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 94), new Object[] {
			"sss",
			"sEs",
			"sss",
			's', new ItemStack(Items.dye, 1, 0), 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 95), new Object[] {
			"bbb",
			"bEb",
			"bnb",
			'b', Items.bone, 'n', Items.name_tag, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 96), new Object[] {
			"brb",
			"bEb",
			"bBb",
			'b', Items.beef, 'r', Blocks.red_mushroom, 'B', Blocks.brown_mushroom, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 98), new Object[] {
			"fff",
			"fEf",
			"fnf",
			'f', Items.cooked_fished, 'n', Items.name_tag, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 100), new Object[] {
			"lll",
			"lEl",
			"lLl",
			'l', Items.leather, 'L', Items.lead, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 120), new Object[] {
			"cec",
			"cEc",
			"cpc",
			'c', Items.carrot, 'p', Items.potato, 'E', Items.egg
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.saltBlock), new Object[] {
			"ss",
			"ss",
			's', SMMItems.salt
		});
		GameRegistry.addRecipe(new ItemStack(SMMItems.diamondGoldStaff), new Object[] {
			"DDD",
			"DDD",
			"GGG",
			'D', Blocks.diamond_block, 'G', Blocks.gold_block
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_13), new Object[] {
			"fff",
			"fDf",
			"fff",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 11)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_cat), new Object[] {
			"fff",
			"fDf",
			"fdf",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 2), 'd', new ItemStack(Items.dye, 1, 10)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_blocks), new Object[] {
			"fff",
			"fDf",
			"fff",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 14)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_chirp), new Object[] {
			"fff",
			"fDf",
			"fff",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 1)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_far), new Object[] {
			"fff",
			"fDf",
			"fdf",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 10), 'd', new ItemStack(Items.dye, 1, 11)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_mall), new Object[] {
			"fff",
			"fDf",
			"fff",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_mellohi), new Object[] {
			"fff",
			"fDf",
			"fdf",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 5), 'd', new ItemStack(Items.dye, 1, 15)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_stal), new Object[] {
			"fff",
			"fDf",
			"fff",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 0)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_strad), new Object[] {
			"fff",
			"fDf",
			"fff",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 15)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_ward), new Object[] {
			"fff",
			"fDf",
			"fdf",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 6), 'd', new ItemStack(Items.dye, 1, 2)
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_11), new Object[] {
			"fff",
			"fCf",
			"fff",
			'f', SMMItems.film, 'C', Items.coal
		});
		GameRegistry.addRecipe(new ItemStack(Items.record_wait), new Object[] {
			"fff",
			"fDf",
			"fdf",
			'f', SMMItems.film, 'D', new ItemStack(Items.dye, 1, 12), 'd', new ItemStack(Items.dye, 1, 4)
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.jadeBlock), new Object[] {
			"jjj",
			"jjj",
			"jjj",
			'j', SMMItems.jade
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.jadeHelmet), new Object[] {
			"jjj",
			"j j",
			'j', SMMItems.jade
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.jadeChestplate), new Object[] {
			"j j",
			"jjj",
			"jjj",
			'j', SMMItems.jade
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.jadeLeggings), new Object[] {
			"jjj",
			"j j",
			"j j",
			'j', SMMItems.jade
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.jadeBoots), new Object[] {
			"j j",
			"j j",
			'j', SMMItems.jade
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.jadePickaxe), new Object[] {
			"jjj",
			" / ",
			" / ",
			'j', SMMItems.jade, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.jadeAxe), new Object[] {
			"jj",
			"j/",
			" /",
			'j', SMMItems.jade, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.jadeAxe), new Object[] {
			"jj",
			"/j",
			"/ ",
			'j', SMMItems.jade, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.jadeShovel), new Object[] {
			"j",
			"/",
			"/",
			'j', SMMItems.jade, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.jadeHoe), new Object[] {
			"jj",
			" /",
			" /",
			'j', SMMItems.jade, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.jadeHoe), new Object[] {
			"jj",
			"/ ",
			"/ ",
			'j', SMMItems.jade, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMTools.jadeSword), new Object[] {
			"j",
			"j",
			"/",
			'j', SMMItems.jade, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.help), new Object[] {
			"ddd",
			"did",
			"ddd",
			'd', Blocks.dirt, 'i', new ItemStack(Items.dye, 1, 0)
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.limestone), new Object[] {
			"ll",
			"ll",
			'l', SMMItems.limestone
		});
		GameRegistry.addRecipe(new ItemStack(SMMItems.steelIngot), new Object[] {
			"mmm",
			"lll",
			"sss",
			'm', SMMItems.moltenIron, 'l', SMMItems.limestone, 's', Blocks.stone
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.steelBlock), new Object[] {
			"sss",
			"sss",
			"sss",
			's', SMMItems.steelIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.steelHelmet), new Object[] {
			"sss",
			"s s",
			's', SMMItems.steelIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.steelChestplate), new Object[] {
			"s s",
			"sss",
			"sss",
			's', SMMItems.steelIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.steelLeggings), new Object[] {
			"sss",
			"s s",
			"s s",
			's', SMMItems.steelIngot
		});
		GameRegistry.addRecipe(new ItemStack(SMMArmor.steelBoots), new Object[] {
			"s s",
			"s s",
			's', SMMItems.steelIngot
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
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.sapphire, 9), new Object[] {
			new ItemStack(SMMBlocks.sapphireBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.topaz, 9), new Object[] {
			new ItemStack(SMMBlocks.topazBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.salt, 4), new Object[] {
			new ItemStack(SMMBlocks.saltBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.film), new Object[] {
			new ItemStack(Items.dye, 1, 0), new ItemStack(Items.paper)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.jade, 9), new Object[] {
			new ItemStack(SMMBlocks.jadeBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 14), new Object[] {
			new ItemStack(SMMBlocks.chysanthemum)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 2), new Object[] {
			new ItemStack(SMMBlocks.camellia)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new Object[] {
			new ItemStack(SMMBlocks.hydrangea)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.limestone, 4), new Object[] {
			new ItemStack(SMMBlocks.limestone)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.steelIngot, 9), new Object[] {
			new ItemStack(SMMBlocks.steelBlock)
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
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.sapphireOre, new ItemStack(SMMItems.sapphire), 0.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.topazOre, new ItemStack(SMMItems.topaz), 0.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.jadeOre, new ItemStack(SMMItems.jade), 0.0F);
		FurnaceRecipes.smelting().func_151396_a(Items.iron_ingot, new ItemStack(SMMItems.moltenIron), 1.0F);
	}
}
