package com.github.spencerio1.smm.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

import com.github.spencerio1.smm.item.ItemSMMGeneral;
import com.github.spencerio1.smm.item.tools.ItemSMMDGStaff;
import com.github.spencerio1.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * The file where all of the non-tool and armor Items are initialized for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.Item
 * @see net.minecraft.init.Items
 */
@ObjectHolder(Reference.MODID)
public class SMMItems
{
	public static final Item earthQuartz = new ItemSMMGeneral().setUnlocalizedName("earthQuartz").setTextureName("minecraft:quartz");
	public static final Item copperIngot = new ItemSMMGeneral().setUnlocalizedName("copperIngot").setTextureName(Reference.MODID + ":" + "copperIngot");
	public static final Item carbonIngot = new ItemSMMGeneral().setUnlocalizedName("carbonIngot").setTextureName(Reference.MODID + ":" + "carbonIngot");
	public static final Item silverIngot = new ItemSMMGeneral().setUnlocalizedName("silverIngot").setTextureName(Reference.MODID + ":" + "silverIngot");
	public static final Item cobaltIngot = new ItemSMMGeneral().setUnlocalizedName("cobaltIngot").setTextureName(Reference.MODID + ":" + "cobaltIngot");
	public static final Item ruby = new ItemSMMGeneral().setUnlocalizedName("ruby").setTextureName(Reference.MODID + ":" + "ruby");
	public static final Item titaniumIngot = new ItemSMMGeneral().setUnlocalizedName("titaniumIngot").setTextureName(Reference.MODID + ":" + "titaniumIngot");
	public static final Item hellishIngot = new ItemSMMGeneral().setUnlocalizedName("hellishIngot").setTextureName(Reference.MODID + ":" + "hellishIngot");
	public static final Item leadIngot = new ItemSMMGeneral().setUnlocalizedName("leadIngot").setTextureName(Reference.MODID + ":" + "leadIngot");
	public static final Item sapphire = new ItemSMMGeneral().setUnlocalizedName("sapphire").setTextureName(Reference.MODID + ":" + "sapphire");
	public static final Item topaz = new ItemSMMGeneral().setUnlocalizedName("topaz").setTextureName(Reference.MODID + ":" + "topaz");
	public static final Item salt = new ItemSMMGeneral().setUnlocalizedName("salt").setTextureName(Reference.MODID + ":" + "salt");
	public static final Item diamondGoldStaff = new ItemSMMDGStaff().setUnlocalizedName("diamondGoldStaff").setTextureName(Reference.MODID + ":" + "diamondGoldStaff");
	public static final Item film = new ItemSMMGeneral().setUnlocalizedName("film").setTextureName(Reference.MODID + ":" + "film");
	public static final Item jade = new ItemSMMGeneral().setUnlocalizedName("jade").setTextureName(Reference.MODID + ":" + "jade");
	public static final Item limestone = new ItemSMMGeneral().setUnlocalizedName("limestoneDust").setTextureName(Reference.MODID + ":" + "limestone");
	public static final Item moltenIron = new ItemSMMGeneral().setUnlocalizedName("moltenIronIngot").setTextureName(Reference.MODID + ":" + "moltenIronIngot");
	public static final Item steelIngot = new ItemSMMGeneral().setUnlocalizedName("steelIngot").setTextureName(Reference.MODID + ":" + "steelIngot");
	public static final Item tanzanite = new ItemSMMGeneral().setUnlocalizedName("tanzanite").setTextureName(Reference.MODID + ":" + "tanzanite");
	public static final Item apatite = new ItemSMMGeneral().setUnlocalizedName("apatite").setTextureName(Reference.MODID + ":" + "apatite");
	public static final Item amethyst = new ItemSMMGeneral().setUnlocalizedName("amethyst").setTextureName(Reference.MODID + ":" + "amethyst");
	
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
		GameRegistry.registerItem(limestone, limestone.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(moltenIron, moltenIron.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelIngot, steelIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzanite , tanzanite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatite, apatite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(amethyst, amethyst.getUnlocalizedName().substring(5));
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
