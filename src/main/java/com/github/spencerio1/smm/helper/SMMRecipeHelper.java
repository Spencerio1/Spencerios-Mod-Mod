package com.github.spencerio1.smm.helper;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.github.spencerio1.smm.lib.HashMaps;

import cpw.mods.fml.common.registry.GameRegistry;

public abstract class SMMRecipeHelper
{
	public static void addBlockRecipes(Item item, Block block)
	{
		GameRegistry.addRecipe(new ItemStack(block), new Object[] {
			"xxx",
			"xxx",
			"xxx",
			'x', item
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(item, 9), new Object[] {
			new ItemStack(block)
		});
	}
	
	public static void addArmorRecipes(String armorPrefix, Block blockMadeFrom)
	{
		addArmorRecipes(armorPrefix, new ItemStack(blockMadeFrom));
	}
	public static void addArmorRecipes(String armorPrefix, Item itemMadeFrom)
	{
		addArmorRecipes(armorPrefix, new ItemStack(itemMadeFrom));
	}
	public static void addArmorRecipes(String armorPrefix, ItemStack itemMadeFrom)
	{
		GameRegistry.addRecipe(new ItemStack(HashMaps.armor.get(armorPrefix + "Helmet")), new Object[] {
			"xxx",
			"x x",
			'x', itemMadeFrom
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.armor.get(armorPrefix + "Chestplate")), new Object[] {
			"x x",
			"xxx",
			"xxx",
			'x', itemMadeFrom
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.armor.get(armorPrefix + "Leggings")), new Object[] {
			"xxx",
			"x x",
			"x x",
			'x', itemMadeFrom
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.armor.get(armorPrefix + "Boots")), new Object[] {
			"x x",
			"x x",
			'x', itemMadeFrom
		});
	}
	
	public static void addToolRecipes(String toolPrefix, Block blockMadeFrom)
	{
		addToolRecipes(toolPrefix, new ItemStack(blockMadeFrom));
	}
	public static void addToolRecipes(String toolPrefix, Item itemMadeFrom)
	{
		addToolRecipes(toolPrefix, new ItemStack(itemMadeFrom));
	}
	public static void addToolRecipes(String toolPrefix, ItemStack itemMadeFrom)
	{
		GameRegistry.addRecipe(new ItemStack(HashMaps.tools.get(toolPrefix + "Pickaxe")), new Object[] {
			"xxx",
			" / ",
			" / ",
			'x', itemMadeFrom, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.tools.get(toolPrefix + "Axe")), new Object[] {
			"xx",
			"x/",
			" /",
			'x', itemMadeFrom, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.tools.get(toolPrefix + "Axe")), new Object[] {
			"xx",
			"/x",
			"/ ",
			'x', itemMadeFrom, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.tools.get(toolPrefix + "Shovel")), new Object[] {
			"x",
			"/",
			"/",
			'x', itemMadeFrom, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.tools.get(toolPrefix + "Hoe")), new Object[] {
			"xx",
			" /",
			" /",
			'x', itemMadeFrom, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.tools.get(toolPrefix + "Hoe")), new Object[] {
			"xx",
			"/ ",
			"/ ",
			'x', itemMadeFrom, '/', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(HashMaps.tools.get(toolPrefix + "Sword")), new Object[] {
			"x",
			"x",
			"/",
			'x', itemMadeFrom, '/', Items.stick
		});
	}
}
