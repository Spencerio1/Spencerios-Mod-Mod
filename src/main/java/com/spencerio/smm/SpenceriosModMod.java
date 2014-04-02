package com.spencerio.smm;

import java.io.File;
import java.util.EnumMap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.spencerio.smm.block.SMMBlocks;
import com.spencerio.smm.event.SMMAchievementToggles;
import com.spencerio.smm.item.SMMItems;
import com.spencerio.smm.item.armor.SMMArmor;
import com.spencerio.smm.item.tools.SMMTools;
import com.spencerio.smm.lib.Reference;
import com.spencerio.smm.manager.SMMAchievementManager;
import com.spencerio.smm.manager.SMMChannelManager;
import com.spencerio.smm.manager.SMMConfigManager;
import com.spencerio.smm.manager.SMMCraftingManager;
import com.spencerio.smm.manager.SMMGenerationManager;
import com.spencerio.smm.manager.SMMGuiManager;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

/**
 * Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 */
@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.SMM_VERSION, dependencies = Reference.DEPENDENCIES)
public class SpenceriosModMod
{
	@Instance(Reference.MODID)
	public static SpenceriosModMod instance;
	
	SMMGenerationManager eventManager = new SMMGenerationManager();
	EnumMap<Side, FMLEmbeddedChannel> channels = NetworkRegistry.INSTANCE.newChannel(Reference.MODID, new SMMChannelManager());
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SMMConfigManager.init(new File(event.getModConfigurationDirectory(), "/SMM.cfg"));
		GameRegistry.registerWorldGenerator(eventManager, 0);
		SMMBlocks.initBlocks();
		SMMItems.initItems();
		SMMArmor.initArmor();
		SMMTools.initTools();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		SMMAchievementManager.registerAchievements();
		FMLCommonHandler.instance().bus().register(new SMMAchievementToggles());
		SMMCraftingManager.registerRecipes();
		new SMMGuiManager();
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
	
	public static CreativeTabs tabSMMBlocks = new CreativeTabs("tabSMMBlocks") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(SMMBlocks.earthQuartzOre);
		}
	};
	
	public static CreativeTabs tabSMMItems = new CreativeTabs("tabSMMItems") {
		public Item getTabIconItem() {
			return SMMItems.earthQuartz;
		}
	};
	
	public static CreativeTabs tabSMMMisc = new CreativeTabs("tabSMMMisc") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(SMMBlocks.chysanthemum);
		}
	};
}
