package com.github.spencerio1.smm.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.github.spencerio1.smm.item.armor.SMMArmor;

public class SMMTabArmor extends CreativeTabs {

	public SMMTabArmor() {
		super("tabSMMArmor");
	}

	@Override
	public Item getTabIconItem() {
		return SMMArmor.rubyChestplate;
	}

}
