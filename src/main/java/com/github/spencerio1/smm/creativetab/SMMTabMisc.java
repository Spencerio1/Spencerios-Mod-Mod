package com.github.spencerio1.smm.creativetab;

import com.github.spencerio1.smm.block.SMMBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SMMTabMisc extends CreativeTabs {

	public SMMTabMisc() {
		super("tabSMMMisc");
	}
	
	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(SMMBlocks.chysanthemum);
	}

}
