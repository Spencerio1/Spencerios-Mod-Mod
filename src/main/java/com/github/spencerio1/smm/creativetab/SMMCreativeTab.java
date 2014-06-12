package com.github.spencerio1.smm.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SMMCreativeTab extends CreativeTabs {

	private Item icon;
	
	public SMMCreativeTab(String name, Item icon) {
		super(name);
		this.icon = icon;
	}
	
	public SMMCreativeTab(String name, Block icon) {
		super(name);
		this.icon = Item.getItemFromBlock(icon);
	}
	
	@Override
	public Item getTabIconItem() {
		return icon;
	}
}
