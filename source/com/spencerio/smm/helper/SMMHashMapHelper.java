package com.spencerio.smm.helper;

import net.minecraft.item.Item;

import com.spencerio.smm.lib.HashMaps;

public abstract class SMMHashMapHelper
{
	public static void addToArmorHashMap(String key, Item armor)
	{
		HashMaps.armor.put(key, armor);
	}
	
	public static void addToToolsHashMap(String key, Item tool)
	{
		HashMaps.tools.put(key, tool);
	}
}
