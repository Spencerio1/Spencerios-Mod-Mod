package com.spencerio.smm.item;

import com.spencerio.smm.lib.Reference;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class SMMItems
{
	public static final Item earthQuartz = new ItemSMMOreDrops().setUnlocalizedName("earthQuartz").setTextureName("minecraft:quartz");
	public static final Item copperIngot = new ItemSMMOreDrops().setUnlocalizedName("copperIngot").setTextureName(Reference.MODID + ":" + "copperIngot");
	
	public static void initItems()
	{
		GameRegistry.registerItem(earthQuartz, earthQuartz.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(5));
	}
}
