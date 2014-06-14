package com.github.spencerio1.smm.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

import com.github.spencerio1.smm.item.ItemSMMGeneral;
import com.github.spencerio1.smm.item.tools.ItemSMMDGStaff;
import com.github.spencerio1.smm.lib.ModInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * The file where all of the non-tool and armor Items are initialized for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.Item
 * @see net.minecraft.init.Items
 */
@ObjectHolder(ModInfo.MODID)
public class SMMItems
{
	public static final Item earthQuartz = new ItemSMMGeneral().setUnlocalizedName("earthQuartz").setTextureName("minecraft:quartz");
	public static final Item copperIngot = new ItemSMMGeneral().setUnlocalizedName("copperIngot").setTextureName(ModInfo.MODID + ":" + "copperIngot");
	public static final Item carbonIngot = new ItemSMMGeneral().setUnlocalizedName("carbonIngot").setTextureName(ModInfo.MODID + ":" + "carbonIngot");
	public static final Item silverIngot = new ItemSMMGeneral().setUnlocalizedName("silverIngot").setTextureName(ModInfo.MODID + ":" + "silverIngot");
	public static final Item cobaltIngot = new ItemSMMGeneral().setUnlocalizedName("cobaltIngot").setTextureName(ModInfo.MODID + ":" + "cobaltIngot");
	public static final Item ruby = new ItemSMMGeneral().setUnlocalizedName("ruby").setTextureName(ModInfo.MODID + ":" + "ruby");
	public static final Item titaniumIngot = new ItemSMMGeneral().setUnlocalizedName("titaniumIngot").setTextureName(ModInfo.MODID + ":" + "titaniumIngot");
	public static final Item hellishIngot = new ItemSMMGeneral().setUnlocalizedName("hellishIngot").setTextureName(ModInfo.MODID + ":" + "hellishIngot");
	public static final Item leadIngot = new ItemSMMGeneral().setUnlocalizedName("leadIngot").setTextureName(ModInfo.MODID + ":" + "leadIngot");
	public static final Item sapphire = new ItemSMMGeneral().setUnlocalizedName("sapphire").setTextureName(ModInfo.MODID + ":" + "sapphire");
	public static final Item topaz = new ItemSMMGeneral().setUnlocalizedName("topaz").setTextureName(ModInfo.MODID + ":" + "topaz");
	public static final Item salt = new ItemSMMGeneral().setUnlocalizedName("salt").setTextureName(ModInfo.MODID + ":" + "salt");
	public static final Item diamondGoldStaff = new ItemSMMDGStaff().setUnlocalizedName("diamondGoldStaff").setTextureName(ModInfo.MODID + ":" + "diamondGoldStaff");
	public static final Item film = new ItemSMMGeneral().setUnlocalizedName("film").setTextureName(ModInfo.MODID + ":" + "film");
	public static final Item jade = new ItemSMMGeneral().setUnlocalizedName("jade").setTextureName(ModInfo.MODID + ":" + "jade");
	public static final Item limestone = new ItemSMMGeneral().setUnlocalizedName("limestoneDust").setTextureName(ModInfo.MODID + ":" + "limestone");
	public static final Item moltenIronIngot = new ItemSMMGeneral().setUnlocalizedName("moltenIronIngot").setTextureName(ModInfo.MODID + ":" + "moltenIronIngot");
	public static final Item steelIngot = new ItemSMMGeneral().setUnlocalizedName("steelIngot").setTextureName(ModInfo.MODID + ":" + "steelIngot");
	public static final Item tanzanite = new ItemSMMGeneral().setUnlocalizedName("tanzanite").setTextureName(ModInfo.MODID + ":" + "tanzanite");
	public static final Item apatite = new ItemSMMGeneral().setUnlocalizedName("apatite").setTextureName(ModInfo.MODID + ":" + "apatite");
	public static final Item amethyst = new ItemSMMGeneral().setUnlocalizedName("amethyst").setTextureName(ModInfo.MODID + ":" + "amethyst");
	
	public static void initItems()
	{
		registerItems();
		generateItemsInChests();
	}
	
	private static void registerItems()
	{
		GameRegistry.registerItem(earthQuartz, earthQuartz.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(carbonIngot, carbonIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(silverIngot, silverIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(cobaltIngot, cobaltIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(ruby, ruby.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(titaniumIngot, titaniumIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(hellishIngot, hellishIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(leadIngot, leadIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(sapphire, sapphire.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(topaz, topaz.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(salt, salt.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(diamondGoldStaff, diamondGoldStaff.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(film, film.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(jade, jade.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(limestone, limestone.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(moltenIronIngot, moltenIronIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(tanzanite , tanzanite.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(apatite, apatite.getUnlocalizedName().substring(9));
		GameRegistry.registerItem(amethyst, amethyst.getUnlocalizedName().substring(9));
	}
	private static void generateItemsInChests()
	{
		new ChestGenHooks("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ruby), 1, 1, 10));
		new ChestGenHooks("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(sapphire), 1, 3, 2));
		new ChestGenHooks("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(topaz), 1, 3, 3));
		new ChestGenHooks("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 3));
		new ChestGenHooks("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(tanzanite), 1, 4, 2));
		new ChestGenHooks("bonusChest").addItem(new WeightedRandomChestContent(new ItemStack(apatite), 1, 4, 6));
	}
}
