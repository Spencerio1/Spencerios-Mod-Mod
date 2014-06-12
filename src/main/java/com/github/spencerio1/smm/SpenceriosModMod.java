package com.github.spencerio1.smm;

import java.io.File;
import java.util.EnumMap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

import com.github.spencerio1.smm.block.SMMBlocks;
import com.github.spencerio1.smm.event.SMMAchievementToggles;
import com.github.spencerio1.smm.item.SMMItems;
import com.github.spencerio1.smm.item.armor.SMMArmor;
import com.github.spencerio1.smm.item.tools.SMMTools;
import com.github.spencerio1.smm.lib.Reference;
import com.github.spencerio1.smm.manager.SMMAchievementManager;
import com.github.spencerio1.smm.manager.SMMChannelManager;
import com.github.spencerio1.smm.manager.SMMConfigManager;
import com.github.spencerio1.smm.manager.SMMCraftingManager;
import com.github.spencerio1.smm.manager.SMMGenerationManager;
import com.github.spencerio1.smm.manager.SMMGuiManager;
import com.github.spencerio1.smm.world.biome.SMMBiomeGenMadagascarianForest;

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
	public static final BiomeGenBase mgForest = new SMMBiomeGenMadagascarianForest().setBiomeName("Madagascarian Forest");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SMMConfigManager.init(new File(event.getModConfigurationDirectory(), "/SMM.cfg"));
		GameRegistry.registerWorldGenerator(eventManager, 0);
		BiomeDictionary.registerBiomeType(mgForest, Type.FOREST);
		BiomeManager.addSpawnBiome(mgForest);
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
			return SMMArmor.rubyChestplate;
		}
	};
	
	public static CreativeTabs tabSMMTools = new CreativeTabs("tabSMMTools") {
		public Item getTabIconItem() {
			return SMMItems.diamondGoldStaff;
		}
	};
	
	public static CreativeTabs tabSMMBlocks = new CreativeTabs("tabSMMBlocks") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(SMMBlocks.rubyOre);
		}
	};
	
	public static CreativeTabs tabSMMItems = new CreativeTabs("tabSMMItems") {
		public Item getTabIconItem() {
			return SMMItems.ruby;
		}
	};
	
	public static CreativeTabs tabSMMMisc = new CreativeTabs("tabSMMMisc") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(SMMBlocks.chysanthemum);
		}
	};
}
