package com.github.spencerio1.smm;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

import com.github.spencerio1.smm.block.SMMBlocks;
import com.github.spencerio1.smm.creativetab.SMMTabArmor;
import com.github.spencerio1.smm.creativetab.SMMTabBlocks;
import com.github.spencerio1.smm.creativetab.SMMTabItems;
import com.github.spencerio1.smm.creativetab.SMMTabMisc;
import com.github.spencerio1.smm.creativetab.SMMTabTools;
import com.github.spencerio1.smm.event.SMMAchievementToggles;
import com.github.spencerio1.smm.item.SMMItems;
import com.github.spencerio1.smm.item.armor.SMMArmor;
import com.github.spencerio1.smm.item.tools.SMMTools;
import com.github.spencerio1.smm.lib.Reference;
import com.github.spencerio1.smm.manager.SMMAchievementManager;
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
import cpw.mods.fml.common.registry.GameRegistry;

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
	public static final BiomeGenBase mgForest = new SMMBiomeGenMadagascarianForest().setBiomeName("Madagascarian Forest");
	
	public static CreativeTabs tabSMMArmor = new SMMTabArmor();
	public static CreativeTabs tabSMMTools = new SMMTabTools();
	public static CreativeTabs tabSMMBlocks = new SMMTabBlocks();
	public static CreativeTabs tabSMMItems = new SMMTabItems();
	public static CreativeTabs tabSMMMisc = new SMMTabMisc();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SMMConfigManager.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + "SMM.cfg"));
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
}
