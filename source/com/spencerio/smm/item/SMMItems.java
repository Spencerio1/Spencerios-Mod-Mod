package com.spencerio.smm.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * The file where all of the non-tool and armor Items are initialized for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.Item
 * @see net.minecraft.init.Items
 */
public class SMMItems
{
	public static final Item earthQuartz = new ItemSMMOreDrops().setUnlocalizedName("earthQuartz").setTextureName("minecraft:quartz");
	public static final Item copperIngot = new ItemSMMOreDrops().setUnlocalizedName("copperIngot").setTextureName(Reference.MODID + ":" + "copperIngot");
	public static final Item carbonIngot = new ItemSMMOreDrops().setUnlocalizedName("carbonIngot").setTextureName(Reference.MODID + ":" + "carbonIngot");
	public static final Item silverIngot = new ItemSMMOreDrops().setUnlocalizedName("silverIngot").setTextureName(Reference.MODID + ":" + "silverIngot");
	public static final Item cobaltIngot = new ItemSMMOreDrops().setUnlocalizedName("cobaltIngot").setTextureName(Reference.MODID + ":" + "cobaltIngot");
	public static final Item ruby = new ItemSMMOreDrops().setUnlocalizedName("ruby").setTextureName(Reference.MODID + ":" + "ruby");
	public static final Item titaniumIngot = new ItemSMMOreDrops().setUnlocalizedName("titaniumIngot").setTextureName(Reference.MODID + ":" + "titaniumIngot");
	public static final Item hellishIngot = new ItemSMMOreDrops().setUnlocalizedName("hellishIngot").setTextureName(Reference.MODID + ":" + "hellishIngot");
	public static final Item leadIngot = new ItemSMMOreDrops().setUnlocalizedName("leadIngot").setTextureName(Reference.MODID + ":" + "leadIngot");
	public static final Item sapphire = new ItemSMMOreDrops().setUnlocalizedName("sapphire").setTextureName(Reference.MODID + ":" + "sapphire");
	public static final Item topaz = new ItemSMMOreDrops().setUnlocalizedName("topaz").setTextureName(Reference.MODID + ":" + "topaz");
	public static final Item salt = new ItemSMMOreDrops().setUnlocalizedName("salt").setTextureName(Reference.MODID + ":" + "salt");
	public static final Item diamondGoldStaff = new ItemSMMDGStaff().setUnlocalizedName("diamondGoldStaff").setTextureName(Reference.MODID + ":" + "diamondGoldStaff");
	public static final Item film = new ItemSMMFilm().setUnlocalizedName("film").setTextureName(Reference.MODID + ":" + "film");
	public static final Item jade = new ItemSMMOreDrops().setUnlocalizedName("jade").setTextureName(Reference.MODID + ":" + "jade");
	
	public static void initItems()
	{
		registerItems();
		generateItemsInChests();
	}
	
	private static void registerItems()
	{
		GameRegistry.registerItem(earthQuartz, earthQuartz.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperIngot, copperIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonIngot, carbonIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverIngot, silverIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltIngot, cobaltIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby, ruby.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumIngot, titaniumIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishIngot, hellishIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadIngot, leadIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire, sapphire.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topaz, topaz.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(salt, salt.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(diamondGoldStaff, diamondGoldStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(film, film.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jade, jade.getUnlocalizedName().substring(5));
	}
	private static void generateItemsInChests()
	{
		new ChestGenHooks("dungeonChest").addItem(new WeightedRandomChestContent(new ItemStack(ruby), 1, 1, 10));
		new ChestGenHooks("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(sapphire), 1, 3, 2));
		new ChestGenHooks("mineshaftCorridor").addItem(new WeightedRandomChestContent(new ItemStack(topaz), 1, 3, 3));
	}
}
