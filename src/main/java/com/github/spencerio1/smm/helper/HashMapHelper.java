package com.github.spencerio1.smm.helper;

import net.minecraft.item.Item;

import com.github.spencerio1.smm.lib.HashMaps;

public abstract class HashMapHelper
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
