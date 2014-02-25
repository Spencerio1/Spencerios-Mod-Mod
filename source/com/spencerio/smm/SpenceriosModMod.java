package com.spencerio.smm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.spencerio.smm.block.SMMBlocks;
import com.spencerio.smm.item.armor.SMMArmor;
import com.spencerio.smm.item.tools.SMMTools;
import com.spencerio.smm.lib.Reference;
import com.spencerio.smm.manager.SMMCraftingManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.SMM_VERSION, dependencies = Reference.DEPENDENCIES)
public class SpenceriosModMod
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SMMArmor.initArmor();
		SMMTools.initTools();
		SMMCraftingManager.registerRecipes();
		SMMBlocks.initBlocks();
	}
	
	public static CreativeTabs tabSMMArmor = new CreativeTabs("tabSMMArmor") {
		public Item getTabIconItem() {
			return SMMArmor.redstoneChestplate;
		}
	};
	
	public static CreativeTabs tabSMMTools = new CreativeTabs("tabSMMTools") {
		public Item getTabIconItem() {
			return SMMTools.redstoneSword;
		}
	};
	
	public static CreativeTabs tabSMMOres = new CreativeTabs("tabSMMOres") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(SMMBlocks.earthQuartzOre);
		}
	};
}
