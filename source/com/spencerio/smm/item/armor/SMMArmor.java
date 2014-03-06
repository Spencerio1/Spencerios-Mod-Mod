package com.spencerio.smm.item.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * The file in which all of the Armor is initialized for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.Item
 * @see net.minecraft.init.Items
 */
public class SMMArmor
{
	public static final ArmorMaterial COAL = EnumHelper.addArmorMaterial("COAL", 30, new int[] {4, 7, 6, 5}, 64);
	public static final ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("EMERALD", 35, new int[] {5, 8, 7, 6}, 10);
	public static final ArmorMaterial REDSTONE = EnumHelper.addArmorMaterial("REDSTONE", 25, new int[] {3, 6, 5, 4}, 60);
	public static final ArmorMaterial LAPISLAZULI = EnumHelper.addArmorMaterial("LAPISLAZULI", 20, new int[] {2, 5, 4, 3}, 50);
	public static final ArmorMaterial EARTHQUARTZ = EnumHelper.addArmorMaterial("EARTHQUARTZ", 30, new int[] {2, 7, 5, 3}, 20);
	public static final ArmorMaterial COPPER = EnumHelper.addArmorMaterial("COPPER", 30, new int[] {3, 6, 5, 4}, 25);
	public static final ArmorMaterial CARBON = EnumHelper.addArmorMaterial("CARBON", 35, new int[] {4, 7, 6, 5}, 15);
	public static final ArmorMaterial SILVER = EnumHelper.addArmorMaterial("SILVER", 37, new int[] {4, 6, 5, 4}, 9);
	public static final ArmorMaterial COBALT = EnumHelper.addArmorMaterial("COBALT", 30, new int[] {4, 7, 6, 5}, 10);
	public static final ArmorMaterial RUBY = EnumHelper.addArmorMaterial("RUBY", 50, new int[] {6, 9, 8, 7}, 5);
	public static final ArmorMaterial TITANIUM = EnumHelper.addArmorMaterial("TITANIUM", 32, new int[] {5, 8, 7, 6}, 11);
	public static final ArmorMaterial HELLISH = EnumHelper.addArmorMaterial("HELLISH", 30, new int[] {3, 6, 5, 4}, 28);
	public static final ArmorMaterial LEAD = EnumHelper.addArmorMaterial("LEAD", 30, new int[] {1, 4, 3, 2}, 20);
	public static final ArmorMaterial OBSIDIAN = EnumHelper.addArmorMaterial("OBSIDIAN", 30, new int[] {4, 7, 6, 5}, 15);
	public static final ArmorMaterial ENDSTONE = EnumHelper.addArmorMaterial("ENDSTONE", 27, new int[] {3, 6, 5, 4}, 13);
	public static final ArmorMaterial COBBLESTONE = EnumHelper.addArmorMaterial("COBBLESTONE", 10, new int[] {1, 4, 3, 2}, 8);
	public static final ArmorMaterial WOOD = EnumHelper.addArmorMaterial("WOOD", 20, new int[] {1, 4, 3, 2}, 15);
	public static final ArmorMaterial SAPPHIRE = EnumHelper.addArmorMaterial("SAPPHIRE", 36, new int[] {4, 7, 6, 5}, 12);
	public static final ArmorMaterial TOPAZ = EnumHelper.addArmorMaterial("TOPAZ", 35, new int[] {4, 7, 6, 5}, 10);
	
	public static final Item coalHelmet = new ItemSMMArmor(COAL, 0, 0, "coal").setUnlocalizedName("coalHelmet").setTextureName(Reference.MODID + ":" + "coalHelmet");
	public static final Item coalChestplate = new ItemSMMArmor(COAL, 0, 1, "coal").setUnlocalizedName("coalChestplate").setTextureName(Reference.MODID + ":" + "coalChestplate");
	public static final Item coalLeggings = new ItemSMMArmor(COAL, 0, 2, "coal").setUnlocalizedName("coalLeggings").setTextureName(Reference.MODID + ":" + "coalLeggings");
	public static final Item coalBoots = new ItemSMMArmor(COAL, 0, 3, "coal").setUnlocalizedName("coalBoots").setTextureName(Reference.MODID + ":" + "coalBoots");
	public static final Item emeraldHelmet = new ItemSMMArmor(EMERALD, 0, 0, "emerald").setUnlocalizedName("emeraldHelmet").setTextureName(Reference.MODID + ":" + "emeraldHelmet");
	public static final Item emeraldChestplate = new ItemSMMArmor(EMERALD, 0, 1, "emerald").setUnlocalizedName("emeraldChestplate").setTextureName(Reference.MODID + ":" + "emeraldChestplate");
	public static final Item emeraldLeggings = new ItemSMMArmor(EMERALD, 0, 2, "emerald").setUnlocalizedName("emeraldLeggings").setTextureName(Reference.MODID + ":" + "emeraldLeggings");
	public static final Item emeraldBoots = new ItemSMMArmor(EMERALD, 0, 3, "emerald").setUnlocalizedName("emeraldBoots").setTextureName(Reference.MODID + ":" + "emeraldBoots");
	public static final Item redstoneHelmet = new ItemSMMArmor(REDSTONE, 0, 0, "redstone").setUnlocalizedName("redstoneHelmet").setTextureName(Reference.MODID + ":" + "redstoneHelmet");
	public static final Item redstoneChestplate = new ItemSMMArmor(REDSTONE, 0, 1, "redstone").setUnlocalizedName("redstoneChestplate").setTextureName(Reference.MODID + ":" + "redstoneChestplate");
	public static final Item redstoneLeggings = new ItemSMMArmor(REDSTONE, 0, 2, "redstone").setUnlocalizedName("redstoneLeggings").setTextureName(Reference.MODID + ":" + "redstoneLeggings");
	public static final Item redstoneBoots = new ItemSMMArmor(REDSTONE, 0, 3, "redstone").setUnlocalizedName("redstoneBoots").setTextureName(Reference.MODID + ":" + "redstoneBoots");
	public static final Item lapisLazuliHelmet = new ItemSMMArmor(LAPISLAZULI, 0, 0, "lapisLazuli").setUnlocalizedName("lapisLazuliHelmet").setTextureName(Reference.MODID + ":" + "lapisLazuliHelmet");
	public static final Item lapisLazuliChestplate = new ItemSMMArmor(LAPISLAZULI, 0, 1, "lapisLazuli").setUnlocalizedName("lapisLazuliChestplate").setTextureName(Reference.MODID + ":" + "lapisLazuliChestplate");
	public static final Item lapisLazuliLeggings = new ItemSMMArmor(LAPISLAZULI, 0, 2, "lapisLazuli").setUnlocalizedName("lapisLazuliLeggings").setTextureName(Reference.MODID + ":" + "lapisLazuliLeggings");
	public static final Item lapisLazuliBoots = new ItemSMMArmor(LAPISLAZULI, 0, 3, "lapisLazuli").setUnlocalizedName("lapisLazuliBoots").setTextureName(Reference.MODID + ":" + "lapisLazuliBoots");
	public static final Item earthQuartzHelmet = new ItemSMMArmor(EARTHQUARTZ, 0, 0, "earthQuartz").setUnlocalizedName("earthQuartzHelmet").setTextureName(Reference.MODID + ":" + "earthQuartzHelmet");
	public static final Item earthQuartzChestplate = new ItemSMMArmor(EARTHQUARTZ, 0, 1, "earthQuartz").setUnlocalizedName("earthQuartzChestplate").setTextureName(Reference.MODID + ":" + "earthQuartzChestplate");
	public static final Item earthQuartzLeggings = new ItemSMMArmor(EARTHQUARTZ, 0, 2, "earthQuartz").setUnlocalizedName("earthQuartzLeggings").setTextureName(Reference.MODID + ":" + "earthQuartzLeggings");
	public static final Item earthQuartzBoots = new ItemSMMArmor(EARTHQUARTZ, 0, 3, "earthQuartz").setUnlocalizedName("earthQuartzBoots").setTextureName(Reference.MODID + ":" + "earthQuartzBoots");
	public static final Item copperHelmet = new ItemSMMArmor(COPPER, 0, 0, "copper").setUnlocalizedName("copperHelmet").setTextureName(Reference.MODID + ":" + "copperHelmet");
	public static final Item copperChestplate = new ItemSMMArmor(COPPER, 0, 1, "copper").setUnlocalizedName("copperChestplate").setTextureName(Reference.MODID + ":" + "copperChestplate");
	public static final Item copperLeggings = new ItemSMMArmor(COPPER, 0, 2, "copper").setUnlocalizedName("copperLeggings").setTextureName(Reference.MODID + ":" + "copperLeggings");
	public static final Item copperBoots = new ItemSMMArmor(COPPER, 0, 3, "copper").setUnlocalizedName("copperBoots").setTextureName(Reference.MODID + ":" + "copperBoots");
	public static final Item carbonHelmet = new ItemSMMArmor(CARBON, 0, 0, "carbon").setUnlocalizedName("carbonHelmet").setTextureName(Reference.MODID + ":" + "carbonHelmet");
	public static final Item carbonChestplate = new ItemSMMArmor(CARBON, 0, 1, "carbon").setUnlocalizedName("carbonChestplate").setTextureName(Reference.MODID + ":" + "carbonChestplate");
	public static final Item carbonLeggings = new ItemSMMArmor(CARBON, 0, 2, "carbon").setUnlocalizedName("carbonLeggings").setTextureName(Reference.MODID + ":" + "carbonLeggings");
	public static final Item carbonBoots = new ItemSMMArmor(CARBON, 0, 3, "carbon").setUnlocalizedName("carbonBoots").setTextureName(Reference.MODID + ":" + "carbonBoots");
	public static final Item silverHelmet = new ItemSMMArmor(SILVER, 0, 0, "silver").setUnlocalizedName("silverHelmet").setTextureName(Reference.MODID + ":" + "silverHelmet");
	public static final Item silverChestplate = new ItemSMMArmor(SILVER, 0, 1, "silver").setUnlocalizedName("silverChestplate").setTextureName(Reference.MODID + ":" + "silverChestplate");
	public static final Item silverLeggings = new ItemSMMArmor(SILVER, 0, 2, "silver").setUnlocalizedName("silverLeggings").setTextureName(Reference.MODID + ":" + "silverLeggings");
	public static final Item silverBoots = new ItemSMMArmor(SILVER, 0, 3, "silver").setUnlocalizedName("silverBoots").setTextureName(Reference.MODID + ":" + "silverBoots");
	public static final Item cobaltHelmet = new ItemSMMArmor(COBALT, 0, 0, "cobalt").setUnlocalizedName("cobaltHelmet").setTextureName(Reference.MODID + ":" + "cobaltHelmet");
	public static final Item cobaltChestplate = new ItemSMMArmor(COBALT, 0, 1, "cobalt").setUnlocalizedName("cobaltChestplate").setTextureName(Reference.MODID + ":" + "cobaltChestplate");
	public static final Item cobaltLeggings = new ItemSMMArmor(COBALT, 0, 2, "cobalt").setUnlocalizedName("cobaltLeggings").setTextureName(Reference.MODID + ":" + "cobaltLeggings");
	public static final Item cobaltBoots = new ItemSMMArmor(COBALT, 0, 3, "cobalt").setUnlocalizedName("cobaltBoots").setTextureName(Reference.MODID + ":" + "cobaltBoots");
	public static final Item rubyHelmet = new ItemSMMArmor(RUBY, 0, 0, "ruby").setUnlocalizedName("rubyHelmet").setTextureName(Reference.MODID + ":" + "rubyHelmet");
	public static final Item rubyChestplate = new ItemSMMArmor(RUBY, 0, 1, "ruby").setUnlocalizedName("rubyChestplate").setTextureName(Reference.MODID + ":" + "rubyChestplate");
	public static final Item rubyLeggings = new ItemSMMArmor(RUBY, 0, 2, "ruby").setUnlocalizedName("rubyLeggings").setTextureName(Reference.MODID + ":" + "rubyLeggings");
	public static final Item rubyBoots = new ItemSMMArmor(RUBY, 0, 3, "ruby").setUnlocalizedName("rubyBoots").setTextureName(Reference.MODID + ":" + "rubyBoots");
	public static final Item titaniumHelmet = new ItemSMMArmor(TITANIUM, 0, 0, "titanium").setUnlocalizedName("titaniumHelmet").setTextureName(Reference.MODID + ":" + "titaniumHelmet");
	public static final Item titaniumChestplate = new ItemSMMArmor(TITANIUM, 0, 1, "titanium").setUnlocalizedName("titaniumChestplate").setTextureName(Reference.MODID + ":" + "titaniumChestplate");
	public static final Item titaniumLeggings = new ItemSMMArmor(TITANIUM, 0, 2, "titanium").setUnlocalizedName("titaniumLeggings").setTextureName(Reference.MODID + ":" + "titaniumLeggings");
	public static final Item titaniumBoots = new ItemSMMArmor(TITANIUM, 0, 3, "titanium").setUnlocalizedName("titaniumBoots").setTextureName(Reference.MODID + ":" + "titaniumBoots");
	public static final Item hellishHelmet = new ItemSMMArmor(HELLISH, 0, 0, "hellish").setUnlocalizedName("hellishHelmet").setTextureName(Reference.MODID + ":" + "hellishHelmet");
	public static final Item hellishChestplate = new ItemSMMArmor(HELLISH, 0, 1, "hellish").setUnlocalizedName("hellishChestplate").setTextureName(Reference.MODID + ":" + "hellishChestplate");
	public static final Item hellishLeggings = new ItemSMMArmor(HELLISH, 0, 2, "hellish").setUnlocalizedName("hellishLeggings").setTextureName(Reference.MODID + ":" + "hellishLeggings");
	public static final Item hellishBoots = new ItemSMMArmor(HELLISH, 0, 3, "hellish").setUnlocalizedName("hellishBoots").setTextureName(Reference.MODID + ":" + "hellishBoots");
	public static final Item leadHelmet = new ItemSMMArmor(LEAD, 0, 0, "lead").setUnlocalizedName("leadHelmet").setTextureName(Reference.MODID + ":" + "leadHelmet");
	public static final Item leadChestplate = new ItemSMMArmor(LEAD, 0, 1, "lead").setUnlocalizedName("leadChestplate").setTextureName(Reference.MODID + ":" + "leadChestplate");
	public static final Item leadLeggings = new ItemSMMArmor(LEAD, 0, 2, "lead").setUnlocalizedName("leadLeggings").setTextureName(Reference.MODID + ":" + "leadLeggings");
	public static final Item leadBoots = new ItemSMMArmor(LEAD, 0, 3, "lead").setUnlocalizedName("leadBoots").setTextureName(Reference.MODID + ":" + "leadBoots");
	public static final Item obsidianHelmet = new ItemSMMArmor(OBSIDIAN, 0, 0, "obsidian").setUnlocalizedName("obsidianHelmet").setTextureName(Reference.MODID + ":" + "obsidianHelmet");
	public static final Item obsidianChestplate = new ItemSMMArmor(OBSIDIAN, 0, 1, "obsidian").setUnlocalizedName("obsidianChestplate").setTextureName(Reference.MODID + ":" + "obsidianChestplate");
	public static final Item obsidianLeggings = new ItemSMMArmor(OBSIDIAN, 0, 2, "obsidian").setUnlocalizedName("obsidianLeggings").setTextureName(Reference.MODID + ":" + "obsidianLeggings");
	public static final Item obsidianBoots = new ItemSMMArmor(OBSIDIAN, 0, 3, "obsidian").setUnlocalizedName("obsidianBoots").setTextureName(Reference.MODID + ":" + "obsidianBoots");
	public static final Item endStoneHelmet = new ItemSMMArmor(ENDSTONE, 0, 0, "endStone").setUnlocalizedName("endStoneHelmet").setTextureName(Reference.MODID + ":" + "endStoneHelmet");
	public static final Item endStoneChestplate = new ItemSMMArmor(ENDSTONE, 0, 1, "endStone").setUnlocalizedName("endStoneChestplate").setTextureName(Reference.MODID + ":" + "endStoneChestplate");
	public static final Item endStoneLeggings = new ItemSMMArmor(ENDSTONE, 0, 2, "endStone").setUnlocalizedName("endStoneLeggings").setTextureName(Reference.MODID + ":" + "endStoneLeggings");
	public static final Item endStoneBoots = new ItemSMMArmor(ENDSTONE, 0, 3, "endStone").setUnlocalizedName("endStoneBoots").setTextureName(Reference.MODID + ":" + "endStoneBoots");
	public static final Item cobblestoneHelmet = new ItemSMMArmor(COBBLESTONE, 0, 0, "cobblestone").setUnlocalizedName("cobblestoneHelmet").setTextureName(Reference.MODID + ":" + "cobblestoneHelmet");
	public static final Item cobblestoneChestplate = new ItemSMMArmor(COBBLESTONE, 0, 1, "cobblestone").setUnlocalizedName("cobblestoneChestplate").setTextureName(Reference.MODID + ":" + "cobblestoneChestplate");
	public static final Item cobblestoneLeggings = new ItemSMMArmor(COBBLESTONE, 0, 2, "cobblestone").setUnlocalizedName("cobblestoneLeggings").setTextureName(Reference.MODID + ":" + "cobblestoneLeggings");
	public static final Item cobblestoneBoots = new ItemSMMArmor(COBBLESTONE, 0, 3, "cobblestone").setUnlocalizedName("cobblestoneBoots").setTextureName(Reference.MODID + ":" + "cobblestoneBoots");
	public static final Item woodHelmet = new ItemSMMArmor(WOOD, 0, 0, "wood").setUnlocalizedName("woodHelmet").setTextureName(Reference.MODID + ":" + "woodHelmet");
	public static final Item woodChestplate = new ItemSMMArmor(WOOD, 0, 1, "wood").setUnlocalizedName("woodChestplate").setTextureName(Reference.MODID + ":" + "woodChestplate");
	public static final Item woodLeggings = new ItemSMMArmor(WOOD, 0, 2, "wood").setUnlocalizedName("woodLeggings").setTextureName(Reference.MODID + ":" + "woodLeggings");
	public static final Item woodBoots = new ItemSMMArmor(WOOD, 0, 3, "wood").setUnlocalizedName("woodBoots").setTextureName(Reference.MODID + ":" + "woodBoots");
	public static final Item sapphireHelmet = new ItemSMMArmor(SAPPHIRE, 0, 0, "sapphire").setUnlocalizedName("sapphireHelmet").setTextureName(Reference.MODID + ":" + "sapphireHelmet");
	public static final Item sapphireChestplate = new ItemSMMArmor(SAPPHIRE, 0, 1, "sapphire").setUnlocalizedName("sapphireChestplate").setTextureName(Reference.MODID + ":" + "sapphireChestplate");
	public static final Item sapphireLeggings = new ItemSMMArmor(SAPPHIRE, 0, 2, "sapphire").setUnlocalizedName("sapphireLeggings").setTextureName(Reference.MODID + ":" + "sapphireLeggings");
	public static final Item sapphireBoots = new ItemSMMArmor(SAPPHIRE, 0, 3, "sapphire").setUnlocalizedName("sapphireBoots").setTextureName(Reference.MODID + ":" + "sapphireBoots");
	public static final Item topazHelmet = new ItemSMMArmor(TOPAZ, 0, 0, "topaz").setUnlocalizedName("topazHelmet").setTextureName(Reference.MODID + ":" + "topazHelmet");
	public static final Item topazChestplate = new ItemSMMArmor(TOPAZ, 0, 1, "topaz").setUnlocalizedName("topazChestplate").setTextureName(Reference.MODID + ":" + "topazChestplate");
	public static final Item topazLeggings = new ItemSMMArmor(TOPAZ, 0, 2, "topaz").setUnlocalizedName("topazLeggings").setTextureName(Reference.MODID + ":" + "topazLeggings");
	public static final Item topazBoots = new ItemSMMArmor(TOPAZ, 0, 3, "topaz").setUnlocalizedName("topazBoots").setTextureName(Reference.MODID + ":" + "topazBoots");
	
	public static void initArmor()
	{
		GameRegistry.registerItem(coalHelmet, coalHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalChestplate, coalChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalLeggings, coalLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalBoots, coalBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldHelmet, emeraldHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldChestplate, emeraldChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldLeggings, emeraldLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(emeraldBoots, emeraldBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneHelmet, redstoneHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneChestplate, redstoneChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneLeggings, redstoneLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(redstoneBoots, redstoneBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliHelmet, lapisLazuliHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliChestplate, lapisLazuliChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliLeggings, lapisLazuliLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lapisLazuliBoots, lapisLazuliBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzHelmet, earthQuartzHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzChestplate, earthQuartzChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzLeggings, earthQuartzLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthQuartzBoots, earthQuartzBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperHelmet, copperHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperChestplate, copperChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperLeggings, copperLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperBoots, copperBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonHelmet, carbonHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonChestplate, carbonChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonLeggings, carbonLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbonBoots, carbonBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverHelmet, silverHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverChestplate, silverChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverLeggings, silverLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverBoots, silverBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltHelmet, cobaltHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltChestplate, cobaltChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltLeggings, cobaltLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltBoots, cobaltBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyHelmet, rubyHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyChestplate, rubyChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyLeggings, rubyLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyBoots, rubyBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumHelmet, titaniumHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumChestplate, titaniumChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumLeggings, titaniumLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumBoots, titaniumBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishHelmet, hellishHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishChestplate, hellishChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishLeggings, hellishLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishBoots, hellishBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadHelmet, leadHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadChestplate, leadChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadLeggings, leadLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadBoots, leadBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianHelmet, obsidianHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianChestplate, obsidianChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianLeggings, obsidianLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianBoots, obsidianBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneHelmet, endStoneHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneChestplate, endStoneChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneLeggings, endStoneLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneBoots, endStoneBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobblestoneHelmet, cobblestoneHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobblestoneChestplate, cobblestoneChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobblestoneLeggings, cobblestoneLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobblestoneBoots, cobblestoneBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodHelmet, woodHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodChestplate, woodChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodLeggings, woodLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodBoots, woodBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireHelmet, sapphireHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireChestplate, sapphireChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireLeggings, sapphireLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireBoots, sapphireBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazHelmet, topazHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazChestplate, topazChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazLeggings, topazLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazBoots, topazBoots.getUnlocalizedName().substring(5));
	}
}
