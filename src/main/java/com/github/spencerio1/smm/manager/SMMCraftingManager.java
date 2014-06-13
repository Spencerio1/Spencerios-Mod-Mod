package com.github.spencerio1.smm.manager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.spencerio1.smm.helper.RecipeHelper;
import com.github.spencerio1.smm.init.SMMBlocks;
import com.github.spencerio1.smm.init.SMMItems;

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
		RecipeHelper.addBlockRecipes(SMMItems.earthQuartz, SMMBlocks.earthQuartzBlock);
		RecipeHelper.addBlockRecipes(SMMItems.copperIngot, SMMBlocks.copperBlock);
		RecipeHelper.addBlockRecipes(SMMItems.carbonIngot, SMMBlocks.carbonBlock);
		RecipeHelper.addBlockRecipes(SMMItems.silverIngot, SMMBlocks.silverBlock);
		RecipeHelper.addBlockRecipes(SMMItems.cobaltIngot, SMMBlocks.cobaltBlock);
		RecipeHelper.addBlockRecipes(SMMItems.ruby, SMMBlocks.rubyBlock);
		RecipeHelper.addBlockRecipes(SMMItems.titaniumIngot, SMMBlocks.titaniumBlock);
		RecipeHelper.addBlockRecipes(SMMItems.hellishIngot, SMMBlocks.hellishBlock);
		RecipeHelper.addBlockRecipes(SMMItems.leadIngot, SMMBlocks.leadBlock);
		RecipeHelper.addBlockRecipes(SMMItems.sapphire, SMMBlocks.sapphireBlock);
		RecipeHelper.addBlockRecipes(SMMItems.topaz, SMMBlocks.topazBlock);
		RecipeHelper.addBlockRecipes(SMMItems.jade, SMMBlocks.jadeBlock);
		RecipeHelper.addBlockRecipes(SMMItems.steelIngot, SMMBlocks.steelBlock);
		RecipeHelper.addBlockRecipes(SMMItems.tanzanite, SMMBlocks.tanzaniteBlock);
		RecipeHelper.addBlockRecipes(SMMItems.apatite, SMMBlocks.apatiteBlock);
		RecipeHelper.addBlockRecipes(SMMItems.amethyst, SMMBlocks.amethystBlock);
		
		RecipeHelper.addArmorRecipes("coal", Items.coal);
		RecipeHelper.addArmorRecipes("emerald", Items.emerald);
		RecipeHelper.addArmorRecipes("redstone", Items.redstone);
		RecipeHelper.addArmorRecipes("lapisLazuli", new ItemStack(Items.dye, 1, 4));
		RecipeHelper.addArmorRecipes("earthQuartz", SMMItems.earthQuartz);
		RecipeHelper.addArmorRecipes("copper", SMMItems.copperIngot);
		RecipeHelper.addArmorRecipes("carbon", SMMItems.carbonIngot);
		RecipeHelper.addArmorRecipes("silver", SMMItems.silverIngot);
		RecipeHelper.addArmorRecipes("cobalt", SMMItems.cobaltIngot);
		RecipeHelper.addArmorRecipes("ruby", SMMItems.ruby);
		RecipeHelper.addArmorRecipes("titanium", SMMItems.titaniumIngot);
		RecipeHelper.addArmorRecipes("hellish", SMMItems.hellishIngot);
		RecipeHelper.addArmorRecipes("lead", SMMItems.leadIngot);
		RecipeHelper.addArmorRecipes("obsidian", Blocks.obsidian);
		RecipeHelper.addArmorRecipes("endStone", Blocks.end_stone);
		RecipeHelper.addArmorRecipes("cobblestone", Blocks.cobblestone);
		RecipeHelper.addArmorRecipes("wood", Blocks.planks);
		RecipeHelper.addArmorRecipes("sapphire", SMMItems.sapphire);
		RecipeHelper.addArmorRecipes("topaz", SMMItems.topaz);
		RecipeHelper.addArmorRecipes("jade", SMMItems.jade);
		RecipeHelper.addArmorRecipes("steel", SMMItems.steelIngot);
		RecipeHelper.addArmorRecipes("tanzanite", SMMItems.tanzanite);
		RecipeHelper.addArmorRecipes("apatite", SMMItems.apatite);
		RecipeHelper.addArmorRecipes("netherQuartz", Items.quartz);
		RecipeHelper.addArmorRecipes("amethyst", SMMItems.amethyst);
		
		RecipeHelper.addToolRecipes("coal", Items.coal);
		RecipeHelper.addToolRecipes("emerald", Items.emerald);
		RecipeHelper.addToolRecipes("redstone", Items.redstone);
		RecipeHelper.addToolRecipes("lapisLazuli", new ItemStack(Items.dye, 1, 4));
		RecipeHelper.addToolRecipes("earthQuartz", SMMItems.earthQuartz);
		RecipeHelper.addToolRecipes("copper", SMMItems.copperIngot);
		RecipeHelper.addToolRecipes("carbon", SMMItems.carbonIngot);
		RecipeHelper.addToolRecipes("silver", SMMItems.silverIngot);
		RecipeHelper.addToolRecipes("cobalt", SMMItems.cobaltIngot);
		RecipeHelper.addToolRecipes("ruby", SMMItems.ruby);
		RecipeHelper.addToolRecipes("titanium", SMMItems.titaniumIngot);
		RecipeHelper.addToolRecipes("hellish", SMMItems.hellishIngot);
		RecipeHelper.addToolRecipes("lead", SMMItems.leadIngot);
		RecipeHelper.addToolRecipes("obsidian", Blocks.obsidian);
		RecipeHelper.addToolRecipes("endStone", Blocks.end_stone);
		RecipeHelper.addToolRecipes("sapphire", SMMItems.sapphire);
		RecipeHelper.addToolRecipes("topaz", SMMItems.topaz);
		RecipeHelper.addToolRecipes("jade", SMMItems.jade);
		RecipeHelper.addToolRecipes("steel", SMMItems.steelIngot);
		RecipeHelper.addToolRecipes("tanzanite", SMMItems.tanzanite);
		RecipeHelper.addToolRecipes("apatite", SMMItems.apatite);
		RecipeHelper.addToolRecipes("netherQuartz", Items.quartz);
		RecipeHelper.addToolRecipes("amethyst", SMMItems.amethyst);
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
			'm', SMMItems.moltenIronIngot, 'l', SMMItems.limestone, 's', Blocks.stone
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.customSpawner), new Object[] {
			"beb",
			"bhb",
			"bdb",
			'b', Blocks.iron_bars, 'e', Items.egg, 'h', new ItemStack(Items.skull, 1, 1), 'd', Blocks.dragon_egg
		});
		GameRegistry.addRecipe(new ItemStack(SMMBlocks.bossSpawner), new Object[] {
			"EhE",
			"bdb",
			"iei",
			'E', Items.emerald, 'h', new ItemStack(Items.skull, 1, 1), 'b', Blocks.bedrock, 'd', Blocks.dragon_egg, 'i', Blocks.iron_bars, 'e', Items.egg
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
		GameRegistry.addSmelting(SMMBlocks.earthQuartzOre, new ItemStack(SMMItems.earthQuartz), 0.0F);
		GameRegistry.addSmelting(SMMBlocks.copperOre, new ItemStack(SMMItems.copperIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.carbonOre, new ItemStack(SMMItems.carbonIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.silverOre, new ItemStack(SMMItems.silverIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.cobaltOre, new ItemStack(SMMItems.cobaltIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.rubyOre, new ItemStack(SMMItems.ruby), 0.0F);
		GameRegistry.addSmelting(SMMBlocks.titaniumOre, new ItemStack(SMMItems.titaniumIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.hellishOre, new ItemStack(SMMItems.hellishIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.leadOre, new ItemStack(SMMItems.leadIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.sapphireOre, new ItemStack(SMMItems.sapphire), 0.0F);
		GameRegistry.addSmelting(SMMBlocks.topazOre, new ItemStack(SMMItems.topaz), 0.0F);
		GameRegistry.addSmelting(SMMBlocks.jadeOre, new ItemStack(SMMItems.jade), 0.0F);
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SMMItems.moltenIronIngot), 1.0F);
		GameRegistry.addSmelting(SMMBlocks.tanzaniteOre, new ItemStack(SMMItems.tanzanite), 0.0F);
		GameRegistry.addSmelting(SMMBlocks.apatiteOre, new ItemStack(SMMItems.apatite), 0.0F);
		GameRegistry.addSmelting(SMMBlocks.amethystOre, new ItemStack(SMMItems.amethyst), 0.0F);
		GameRegistry.addSmelting(Blocks.soul_sand, new ItemStack(Blocks.glass), 0.0F);
	}
}
