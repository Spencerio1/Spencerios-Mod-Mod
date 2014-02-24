package com.spencerio.smm;

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
	}
}
