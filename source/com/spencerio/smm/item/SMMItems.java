package com.spencerio.smm.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class SMMItems
{
	public static final Item earthQuartz = new ItemSMMOreDrops().setUnlocalizedName("earthQuartz").setTextureName("minecraft:quartz");
	
	public static void initItems()
	{
		GameRegistry.registerItem(earthQuartz, earthQuartz.getUnlocalizedName().substring(5));
	}
}
