package com.github.spencerio1.smm.creativetab;

import com.github.spencerio1.smm.init.SMMItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SMMTabItems extends CreativeTabs {

	public SMMTabItems() {
		super("tabSMMItems");
	}
	
	@Override
	public Item getTabIconItem() {
		return SMMItems.ruby;
	}

}
