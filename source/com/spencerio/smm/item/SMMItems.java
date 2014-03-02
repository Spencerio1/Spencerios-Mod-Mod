package com.spencerio.smm.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class SMMItems
{
	public static final Item earthQuartz = new ItemSMMOreDrops().setUnlocalizedName("earthQuartz").setTextureName("minecraft:quartz");
	public static final Item copperIngot = new ItemSMMOreDrops().setUnlocalizedName("copperIngot").setTextureName(Reference.MODID + ":" + "copperIngot");
	public static final Item carbonIngot = new ItemSMMOreDrops().setUnlocalizedName("carbonIngot").setTextureName(Reference.MODID + ":" + "carbonIngot");
	public static final Item silverIngot = new ItemSMMOreDrops().setUnlocalizedName("silverIngot").setTextureName(Reference.MODID + ":" + "silverIngot");
	public static final Item cobaltIngot = new ItemSMMOreDrops().setUnlocalizedName("cobaltIngot").setTextureName(Reference.MODID + ":" + "cobaltIngot");
	public static final Item ruby = new ItemSMMOreDrops().setUnlocalizedName("ruby").setTextureName(Reference.MODID + ":" + "ruby");
	public static final Item titaniumIngot = new ItemSMMOreDrops().setUnlocalizedName("titaniumIngot").setTextureName(Reference.MODID + ":" + "titaniumIngot");
	
	public static void initItems()
	{
		registerItems();
		generateItemsInChests();
	}
	
	private static void registerItems()
	{
		GameRegistry.registerItem(earthQuartz, earthQuartz.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonIngot, carbonIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverIngot, silverIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltIngot, cobaltIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby, ruby.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumIngot, titaniumIngot.getUnlocalizedName().substring(5));
	}
	private static void generateItemsInChests()
	{
		new ChestGenHooks("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ruby), 1, 1, 10));
	}
}
