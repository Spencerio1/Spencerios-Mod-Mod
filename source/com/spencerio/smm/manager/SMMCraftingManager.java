package com.spencerio.smm.manager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.spencerio.smm.block.SMMBlocks;
import com.spencerio.smm.helper.SMMRecipeHelper;
import com.spencerio.smm.item.SMMItems;

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
		useRecipeHelper();
		initShapedRecipes();
		initShapelessRecipes();
		initFurnaceRecipes();
	}
	
	private static void useRecipeHelper()
	{
		SMMRecipeHelper.addBlockRecipes(SMMItems.earthQuartz, SMMBlocks.earthQuartzBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.copperIngot, SMMBlocks.copperBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.carbonIngot, SMMBlocks.carbonBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.silverIngot, SMMBlocks.silverBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.cobaltIngot, SMMBlocks.cobaltBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.ruby, SMMBlocks.rubyBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.titaniumIngot, SMMBlocks.titaniumBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.hellishIngot, SMMBlocks.hellishBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.leadIngot, SMMBlocks.leadBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.sapphire, SMMBlocks.sapphireBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.topaz, SMMBlocks.topazBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.jade, SMMBlocks.jadeBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.steelIngot, SMMBlocks.steelBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.tanzanite, SMMBlocks.tanzaniteBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.apatite, SMMBlocks.apatiteBlock);
		SMMRecipeHelper.addBlockRecipes(SMMItems.amethyst, SMMBlocks.amethystBlock);
		
		SMMRecipeHelper.addArmorRecipes("coal", Items.coal);
		SMMRecipeHelper.addArmorRecipes("emerald", Items.emerald);
		SMMRecipeHelper.addArmorRecipes("redstone", Items.redstone);
		SMMRecipeHelper.addArmorRecipes("lapisLazuli", new ItemStack(Items.dye, 1, 4));
		SMMRecipeHelper.addArmorRecipes("earthQuartz", SMMItems.earthQuartz);
		SMMRecipeHelper.addArmorRecipes("copper", SMMItems.copperIngot);
		SMMRecipeHelper.addArmorRecipes("carbon", SMMItems.carbonIngot);
		SMMRecipeHelper.addArmorRecipes("silver", SMMItems.silverIngot);
		SMMRecipeHelper.addArmorRecipes("cobalt", SMMItems.cobaltIngot);
		SMMRecipeHelper.addArmorRecipes("ruby", SMMItems.ruby);
		SMMRecipeHelper.addArmorRecipes("titanium", SMMItems.titaniumIngot);
		SMMRecipeHelper.addArmorRecipes("hellish", SMMItems.hellishIngot);
		SMMRecipeHelper.addArmorRecipes("lead", SMMItems.leadIngot);
		SMMRecipeHelper.addArmorRecipes("obsidian", Blocks.obsidian);
		SMMRecipeHelper.addArmorRecipes("endStone", Blocks.end_stone);
		SMMRecipeHelper.addArmorRecipes("cobblestone", Blocks.cobblestone);
		SMMRecipeHelper.addArmorRecipes("wood", Blocks.planks);
		SMMRecipeHelper.addArmorRecipes("sapphire", SMMItems.sapphire);
		SMMRecipeHelper.addArmorRecipes("topaz", SMMItems.topaz);
		SMMRecipeHelper.addArmorRecipes("jade", SMMItems.jade);
		SMMRecipeHelper.addArmorRecipes("steel", SMMItems.steelIngot);
		SMMRecipeHelper.addArmorRecipes("tanzanite", SMMItems.tanzanite);
		SMMRecipeHelper.addArmorRecipes("apatite", SMMItems.apatite);
		SMMRecipeHelper.addArmorRecipes("netherQuartz", Items.quartz);
		
		SMMRecipeHelper.addToolRecipes("coal", Items.coal);
		SMMRecipeHelper.addToolRecipes("emerald", Items.emerald);
		SMMRecipeHelper.addToolRecipes("redstone", Items.redstone);
		SMMRecipeHelper.addToolRecipes("lapisLazuli", new ItemStack(Items.dye, 1, 4));
		SMMRecipeHelper.addToolRecipes("earthQuartz", SMMItems.earthQuartz);
		SMMRecipeHelper.addToolRecipes("copper", SMMItems.copperIngot);
		SMMRecipeHelper.addToolRecipes("carbon", SMMItems.carbonIngot);
		SMMRecipeHelper.addToolRecipes("silver", SMMItems.silverIngot);
		SMMRecipeHelper.addToolRecipes("cobalt", SMMItems.cobaltIngot);
		SMMRecipeHelper.addToolRecipes("ruby", SMMItems.ruby);
		SMMRecipeHelper.addToolRecipes("titanium", SMMItems.titaniumIngot);
		SMMRecipeHelper.addToolRecipes("hellish", SMMItems.hellishIngot);
		SMMRecipeHelper.addToolRecipes("lead", SMMItems.leadIngot);
		SMMRecipeHelper.addToolRecipes("obsidian", Blocks.obsidian);
		SMMRecipeHelper.addToolRecipes("endStone", Blocks.end_stone);
		SMMRecipeHelper.addToolRecipes("sapphire", SMMItems.sapphire);
		SMMRecipeHelper.addToolRecipes("topaz", SMMItems.topaz);
		SMMRecipeHelper.addToolRecipes("jade", SMMItems.jade);
		SMMRecipeHelper.addToolRecipes("steel", SMMItems.steelIngot);
		SMMRecipeHelper.addToolRecipes("tanzanite", SMMItems.tanzanite);
		SMMRecipeHelper.addToolRecipes("apatite", SMMItems.apatite);
		SMMRecipeHelper.addToolRecipes("netherQuartz", Items.quartz);
	}
	
	private static void initShapedRecipes()
	{
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
	}
	private static void initShapelessRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.salt, 4), new Object[] {
			new ItemStack(SMMBlocks.saltBlock)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(SMMItems.film), new Object[] {
			new ItemStack(Items.dye, 1, 0), new ItemStack(Items.paper)
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
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.tanzaniteOre, new ItemStack(SMMItems.tanzanite), 0.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.apatiteOre, new ItemStack(SMMItems.apatite), 0.0F);
		FurnaceRecipes.smelting().func_151393_a(SMMBlocks.amethystOre, new ItemStack(SMMItems.amethyst), 0.0F);
	}
}
