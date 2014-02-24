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
	}
}
