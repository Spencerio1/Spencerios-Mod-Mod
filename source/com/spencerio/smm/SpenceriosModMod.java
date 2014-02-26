package com.spencerio.smm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.spencerio.smm.block.SMMBlocks;
import com.spencerio.smm.item.armor.SMMArmor;
import com.spencerio.smm.item.tools.SMMTools;
import com.spencerio.smm.lib.Reference;
import com.spencerio.smm.manager.SMMCraftingManager;
import com.spencerio.smm.manager.SMMEventManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.SMM_VERSION, dependencies = Reference.DEPENDENCIES)
public class SpenceriosModMod
{
	SMMEventManager eventManager = new SMMEventManager();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(eventManager, 0);
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
