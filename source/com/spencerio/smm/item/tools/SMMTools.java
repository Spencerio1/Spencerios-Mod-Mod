package com.spencerio.smm.item.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


public class SMMTools
{
	public static final ToolMaterial COAL = EnumHelper.addToolMaterial("COAL", 1, 128, 30F, 2, 64);
	public static final ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 5, 2048, 10F, 3, 10);
	public static final ToolMaterial REDSTONE = EnumHelper.addToolMaterial("REDSTONE", 2, 1048, 16F, 3, 60);
	public static final ToolMaterial LAPISLAZULI = EnumHelper.addToolMaterial("LAPISLAZULI", 1, 512, 20F, 2, 50);
	public static final ToolMaterial EARTHQUARTZ = EnumHelper.addToolMaterial("EARTHQUARTZ", 2, 1500, 24F, 3, 20);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 500, 10F, 4, 25);
	public static final ToolMaterial CARBON = EnumHelper.addToolMaterial("CARBON", 3, 3150, 18F, 6, 15);
	
	public static final Item coalPickaxe = new ItemSMMPickaxe(COAL).setUnlocalizedName("coalPickaxe").setTextureName(Reference.MODID + ":" + "coalPickaxe");
	public static final Item coalAxe = new ItemSMMAxe(COAL).setUnlocalizedName("coalAxe").setTextureName(Reference.MODID + ":" + "coalAxe");
	public static final Item coalShovel = new ItemSMMShovel(COAL).setUnlocalizedName("coalShovel").setTextureName(Reference.MODID + ":" + "coalShovel");
	public static final Item coalHoe = new ItemSMMHoe(COAL).setUnlocalizedName("coalHoe").setTextureName(Reference.MODID + ":" + "coalHoe");
	public static final Item coalSword = new ItemSMMSword(COAL).setUnlocalizedName("coalSword").setTextureName(Reference.MODID + ":" + "coalSword");
	public static final Item emeraldPickaxe = new ItemSMMPickaxe(EMERALD).setUnlocalizedName("emeraldPickaxe").setTextureName(Reference.MODID + ":" + "emeraldPickaxe");
	public static final Item emeraldAxe = new ItemSMMAxe(EMERALD).setUnlocalizedName("emeraldAxe").setTextureName(Reference.MODID + ":" + "emeraldAxe");
	public static final Item emeraldShovel = new ItemSMMShovel(EMERALD).setUnlocalizedName("emeraldShovel").setTextureName(Reference.MODID + ":" + "emeraldShovel");
	public static final Item emeraldHoe = new ItemSMMHoe(EMERALD).setUnlocalizedName("emeraldHoe").setTextureName(Reference.MODID + ":" + "emeraldHoe");
	public static final Item emeraldSword = new ItemSMMSword(EMERALD).setUnlocalizedName("emeraldSword").setTextureName(Reference.MODID + ":" + "emeraldSword");
	public static final Item redstonePickaxe = new ItemSMMPickaxe(REDSTONE).setUnlocalizedName("redstonePickaxe").setTextureName(Reference.MODID + ":" + "redstonePickaxe");
	public static final Item redstoneAxe = new ItemSMMAxe(REDSTONE).setUnlocalizedName("redstoneAxe").setTextureName(Reference.MODID + ":" + "redstoneAxe");
	public static final Item redstoneShovel = new ItemSMMShovel(REDSTONE).setUnlocalizedName("redstoneShovel").setTextureName(Reference.MODID + ":" + "redstoneShovel");
	public static final Item redstoneHoe = new ItemSMMHoe(REDSTONE).setUnlocalizedName("redstoneHoe").setTextureName(Reference.MODID + ":" + "redstoneHoe");
	public static final Item redstoneSword = new ItemSMMSword(REDSTONE).setUnlocalizedName("redstoneSword").setTextureName(Reference.MODID + ":" + "redstoneSword");
	public static final Item lapisLazuliPickaxe = new ItemSMMPickaxe(LAPISLAZULI).setUnlocalizedName("lapisLazuliPickaxe").setTextureName(Reference.MODID + ":" + "lapisLazuliPickaxe");
	public static final Item lapisLazuliAxe = new ItemSMMAxe(LAPISLAZULI).setUnlocalizedName("lapisLazuliAxe").setTextureName(Reference.MODID + ":" + "lapisLazuliAxe");
	public static final Item lapisLazuliShovel = new ItemSMMShovel(LAPISLAZULI).setUnlocalizedName("lapisLazuliShovel").setTextureName(Reference.MODID + ":" + "lapisLazuliShovel");
	public static final Item lapisLazuliHoe = new ItemSMMHoe(LAPISLAZULI).setUnlocalizedName("lapisLazuliHoe").setTextureName(Reference.MODID + ":" + "lapisLazuliHoe");
	public static final Item lapisLazuliSword = new ItemSMMSword(LAPISLAZULI).setUnlocalizedName("lapisLazuliSword").setTextureName(Reference.MODID + ":" + "lapisLazuliSword");
	public static final Item earthQuartzPickaxe = new ItemSMMPickaxe(EARTHQUARTZ).setUnlocalizedName("earthQuartzPickaxe").setTextureName(Reference.MODID + ":" + "earthQuartzPickaxe");
	public static final Item earthQuartzAxe = new ItemSMMAxe(EARTHQUARTZ).setUnlocalizedName("earthQuartzAxe").setTextureName(Reference.MODID + ":" + "earthQuartzAxe");
	public static final Item earthQuartzShovel = new ItemSMMShovel(EARTHQUARTZ).setUnlocalizedName("earthQuartzShovel").setTextureName(Reference.MODID + ":" + "earthQuartzShovel");
	public static final Item earthQuartzHoe = new ItemSMMHoe(EARTHQUARTZ).setUnlocalizedName("earthQuartzHoe").setTextureName(Reference.MODID + ":" + "earthQuartzHoe");
	public static final Item earthQuartzSword = new ItemSMMSword(EARTHQUARTZ).setUnlocalizedName("earthQuartzSword").setTextureName(Reference.MODID + ":" + "earthQuartzSword");
	public static final Item copperPickaxe = new ItemSMMPickaxe(COPPER).setUnlocalizedName("copperPickaxe").setTextureName(Reference.MODID + ":" + "copperPickaxe");
	public static final Item copperAxe = new ItemSMMAxe(COPPER).setUnlocalizedName("copperAxe").setTextureName(Reference.MODID + ":" + "copperAxe");
	public static final Item copperShovel = new ItemSMMShovel(COPPER).setUnlocalizedName("copperShovel").setTextureName(Reference.MODID + ":" + "copperShovel");
	public static final Item copperHoe = new ItemSMMHoe(COPPER).setUnlocalizedName("copperHoe").setTextureName(Reference.MODID + ":" + "copperHoe");
	public static final Item copperSword = new ItemSMMSword(COPPER).setUnlocalizedName("copperSword").setTextureName(Reference.MODID + ":" + "copperSword");
	public static final Item carbonPickaxe = new ItemSMMPickaxe(CARBON).setUnlocalizedName("carbonPickaxe").setTextureName(Reference.MODID + ":" + "carbonPickaxe");
	public static final Item carbonAxe = new ItemSMMAxe(CARBON).setUnlocalizedName("carbonAxe").setTextureName(Reference.MODID + ":" + "carbonAxe");
	public static final Item carbonShovel = new ItemSMMShovel(CARBON).setUnlocalizedName("carbonShovel").setTextureName(Reference.MODID + ":" + "carbonShovel");
	public static final Item carbonHoe = new ItemSMMHoe(CARBON).setUnlocalizedName("carbonHoe").setTextureName(Reference.MODID + ":" + "carbonHoe");
	public static final Item carbonSword = new ItemSMMSword(CARBON).setUnlocalizedName("carbonSword").setTextureName(Reference.MODID + ":" + "carbonSword");
	
	public static void initTools()
	{
		GameRegistry.registerItem(coalPickaxe, coalPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalAxe, coalAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalShovel, coalShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalHoe, coalHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalSword, coalSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldPickaxe, emeraldPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldAxe, emeraldAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldShovel, emeraldShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHoe, emeraldHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldSword, emeraldSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstonePickaxe, redstonePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneAxe, redstoneAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneShovel, redstoneShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneHoe, redstoneHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneSword, redstoneSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliPickaxe, lapisLazuliPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliAxe, lapisLazuliAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliShovel, lapisLazuliShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliHoe, lapisLazuliHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliSword, lapisLazuliSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzPickaxe, earthQuartzPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzAxe, earthQuartzAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzShovel, earthQuartzShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzHoe, earthQuartzHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzSword, earthQuartzSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperPickaxe, copperPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperAxe, copperAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperShovel, copperShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperHoe, copperHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperSword, copperSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonPickaxe, carbonPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonAxe, carbonAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonShovel, carbonShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonHoe, carbonHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonSword, carbonSword.getUnlocalizedName().substring(5));
	}
}
