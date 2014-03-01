package com.spencerio.smm.item;

import com.spencerio.smm.lib.Reference;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class SMMItems
{
	public static final Item earthQuartz = new ItemSMMOreDrops().setUnlocalizedName("earthQuartz").setTextureName("minecraft:quartz");
	public static final Item copperIngot = new ItemSMMOreDrops().setUnlocalizedName("copperIngot").setTextureName(Reference.MODID + ":" + "copperIngot");
	public static final Item carbonIngot = new ItemSMMOreDrops().setUnlocalizedName("carbonIngot").setTextureName(Reference.MODID + ":" + "carbonIngot");
	public static final Item silverIngot = new ItemSMMOreDrops().setUnlocalizedName("silverIngot").setTextureName(Reference.MODID + ":" + "silverIngot");
	
	public static void initItems()
	{
		GameRegistry.registerItem(earthQuartz, earthQuartz.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonIngot, carbonIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverIngot, silverIngot.getUnlocalizedName().substring(5));
	}
}
