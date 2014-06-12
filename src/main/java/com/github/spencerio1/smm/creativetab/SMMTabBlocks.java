package com.github.spencerio1.smm.creativetab;

import com.github.spencerio1.smm.init.SMMBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SMMTabBlocks extends CreativeTabs {
	
	public SMMTabBlocks() {
		super("tabSMMBlocks");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(SMMBlocks.rubyBlock);
	}

}
