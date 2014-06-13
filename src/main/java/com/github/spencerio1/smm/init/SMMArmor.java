package com.github.spencerio1.smm.init;

import net.minecraft.item.Item;

import com.github.spencerio1.smm.item.armor.ItemSMMArmor;
import com.github.spencerio1.smm.lib.ArmorMaterials;
import com.github.spencerio1.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

/**
 * The file in which all of the Armor is initialized for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.Item
 * @see net.minecraft.init.Items
 */
@ObjectHolder(Reference.MODID)
public class SMMArmor {
	public static final Item coalHelmet = new ItemSMMArmor(ArmorMaterials.COAL, 0, 0, "coal").setUnlocalizedName("coalHelmet").setTextureName(Reference.MODID + ":" + "coalHelmet").add();
	public static final Item coalChestplate = new ItemSMMArmor(ArmorMaterials.COAL, 0, 1, "coal").setUnlocalizedName("coalChestplate").setTextureName(Reference.MODID + ":" + "coalChestplate").add();
	public static final Item coalLeggings = new ItemSMMArmor(ArmorMaterials.COAL, 0, 2, "coal").setUnlocalizedName("coalLeggings").setTextureName(Reference.MODID + ":" + "coalLeggings").add();
	public static final Item coalBoots = new ItemSMMArmor(ArmorMaterials.COAL, 0, 3, "coal").setUnlocalizedName("coalBoots").setTextureName(Reference.MODID + ":" + "coalBoots").add();
	public static final Item emeraldHelmet = new ItemSMMArmor(ArmorMaterials.EMERALD, 0, 0, "emerald").setUnlocalizedName("emeraldHelmet").setTextureName(Reference.MODID + ":" + "emeraldHelmet").add();
	public static final Item emeraldChestplate = new ItemSMMArmor(ArmorMaterials.EMERALD, 0, 1, "emerald").setUnlocalizedName("emeraldChestplate").setTextureName(Reference.MODID + ":" + "emeraldChestplate").add();
	public static final Item emeraldLeggings = new ItemSMMArmor(ArmorMaterials.EMERALD, 0, 2, "emerald").setUnlocalizedName("emeraldLeggings").setTextureName(Reference.MODID + ":" + "emeraldLeggings").add();
	public static final Item emeraldBoots = new ItemSMMArmor(ArmorMaterials.EMERALD, 0, 3, "emerald").setUnlocalizedName("emeraldBoots").setTextureName(Reference.MODID + ":" + "emeraldBoots").add();
	public static final Item redstoneHelmet = new ItemSMMArmor(ArmorMaterials.REDSTONE, 0, 0, "redstone").setUnlocalizedName("redstoneHelmet").setTextureName(Reference.MODID + ":" + "redstoneHelmet").add();
	public static final Item redstoneChestplate = new ItemSMMArmor(ArmorMaterials.REDSTONE, 0, 1, "redstone").setUnlocalizedName("redstoneChestplate").setTextureName(Reference.MODID + ":" + "redstoneChestplate").add();
	public static final Item redstoneLeggings = new ItemSMMArmor(ArmorMaterials.REDSTONE, 0, 2, "redstone").setUnlocalizedName("redstoneLeggings").setTextureName(Reference.MODID + ":" + "redstoneLeggings").add();
	public static final Item redstoneBoots = new ItemSMMArmor(ArmorMaterials.REDSTONE, 0, 3, "redstone").setUnlocalizedName("redstoneBoots").setTextureName(Reference.MODID + ":" + "redstoneBoots").add();
	public static final Item lapisLazuliHelmet = new ItemSMMArmor(ArmorMaterials.LAPISLAZULI, 0, 0, "lapisLazuli").setUnlocalizedName("lapisLazuliHelmet").setTextureName(Reference.MODID + ":" + "lapisLazuliHelmet").add();
	public static final Item lapisLazuliChestplate = new ItemSMMArmor(ArmorMaterials.LAPISLAZULI, 0, 1, "lapisLazuli").setUnlocalizedName("lapisLazuliChestplate").setTextureName(Reference.MODID + ":" + "lapisLazuliChestplate").add();
	public static final Item lapisLazuliLeggings = new ItemSMMArmor(ArmorMaterials.LAPISLAZULI, 0, 2, "lapisLazuli").setUnlocalizedName("lapisLazuliLeggings").setTextureName(Reference.MODID + ":" + "lapisLazuliLeggings").add();
	public static final Item lapisLazuliBoots = new ItemSMMArmor(ArmorMaterials.LAPISLAZULI, 0, 3, "lapisLazuli").setUnlocalizedName("lapisLazuliBoots").setTextureName(Reference.MODID + ":" + "lapisLazuliBoots").add();
	public static final Item earthQuartzHelmet = new ItemSMMArmor(ArmorMaterials.EARTHQUARTZ, 0, 0, "earthQuartz").setUnlocalizedName("earthQuartzHelmet").setTextureName(Reference.MODID + ":" + "earthQuartzHelmet").add();
	public static final Item earthQuartzChestplate = new ItemSMMArmor(ArmorMaterials.EARTHQUARTZ, 0, 1, "earthQuartz").setUnlocalizedName("earthQuartzChestplate").setTextureName(Reference.MODID + ":" + "earthQuartzChestplate").add();
	public static final Item earthQuartzLeggings = new ItemSMMArmor(ArmorMaterials.EARTHQUARTZ, 0, 2, "earthQuartz").setUnlocalizedName("earthQuartzLeggings").setTextureName(Reference.MODID + ":" + "earthQuartzLeggings").add();
	public static final Item earthQuartzBoots = new ItemSMMArmor(ArmorMaterials.EARTHQUARTZ, 0, 3, "earthQuartz").setUnlocalizedName("earthQuartzBoots").setTextureName(Reference.MODID + ":" + "earthQuartzBoots").add();
	public static final Item copperHelmet = new ItemSMMArmor(ArmorMaterials.COPPER, 0, 0, "copper").setUnlocalizedName("copperHelmet").setTextureName(Reference.MODID + ":" + "copperHelmet").add();
	public static final Item copperChestplate = new ItemSMMArmor(ArmorMaterials.COPPER, 0, 1, "copper").setUnlocalizedName("copperChestplate").setTextureName(Reference.MODID + ":" + "copperChestplate").add();
	public static final Item copperLeggings = new ItemSMMArmor(ArmorMaterials.COPPER, 0, 2, "copper").setUnlocalizedName("copperLeggings").setTextureName(Reference.MODID + ":" + "copperLeggings").add();
	public static final Item copperBoots = new ItemSMMArmor(ArmorMaterials.COPPER, 0, 3, "copper").setUnlocalizedName("copperBoots").setTextureName(Reference.MODID + ":" + "copperBoots").add();
	public static final Item carbonHelmet = new ItemSMMArmor(ArmorMaterials.CARBON, 0, 0, "carbon").setUnlocalizedName("carbonHelmet").setTextureName(Reference.MODID + ":" + "carbonHelmet").add();
	public static final Item carbonChestplate = new ItemSMMArmor(ArmorMaterials.CARBON, 0, 1, "carbon").setUnlocalizedName("carbonChestplate").setTextureName(Reference.MODID + ":" + "carbonChestplate").add();
	public static final Item carbonLeggings = new ItemSMMArmor(ArmorMaterials.CARBON, 0, 2, "carbon").setUnlocalizedName("carbonLeggings").setTextureName(Reference.MODID + ":" + "carbonLeggings").add();
	public static final Item carbonBoots = new ItemSMMArmor(ArmorMaterials.CARBON, 0, 3, "carbon").setUnlocalizedName("carbonBoots").setTextureName(Reference.MODID + ":" + "carbonBoots").add();
	public static final Item silverHelmet = new ItemSMMArmor(ArmorMaterials.SILVER, 0, 0, "silver").setUnlocalizedName("silverHelmet").setTextureName(Reference.MODID + ":" + "silverHelmet").add();
	public static final Item silverChestplate = new ItemSMMArmor(ArmorMaterials.SILVER, 0, 1, "silver").setUnlocalizedName("silverChestplate").setTextureName(Reference.MODID + ":" + "silverChestplate").add();
	public static final Item silverLeggings = new ItemSMMArmor(ArmorMaterials.SILVER, 0, 2, "silver").setUnlocalizedName("silverLeggings").setTextureName(Reference.MODID + ":" + "silverLeggings").add();
	public static final Item silverBoots = new ItemSMMArmor(ArmorMaterials.SILVER, 0, 3, "silver").setUnlocalizedName("silverBoots").setTextureName(Reference.MODID + ":" + "silverBoots").add();
	public static final Item cobaltHelmet = new ItemSMMArmor(ArmorMaterials.COBALT, 0, 0, "cobalt").setUnlocalizedName("cobaltHelmet").setTextureName(Reference.MODID + ":" + "cobaltHelmet").add();
	public static final Item cobaltChestplate = new ItemSMMArmor(ArmorMaterials.COBALT, 0, 1, "cobalt").setUnlocalizedName("cobaltChestplate").setTextureName(Reference.MODID + ":" + "cobaltChestplate").add();
	public static final Item cobaltLeggings = new ItemSMMArmor(ArmorMaterials.COBALT, 0, 2, "cobalt").setUnlocalizedName("cobaltLeggings").setTextureName(Reference.MODID + ":" + "cobaltLeggings").add();
	public static final Item cobaltBoots = new ItemSMMArmor(ArmorMaterials.COBALT, 0, 3, "cobalt").setUnlocalizedName("cobaltBoots").setTextureName(Reference.MODID + ":" + "cobaltBoots").add();
	public static final Item rubyHelmet = new ItemSMMArmor(ArmorMaterials.RUBY, 0, 0, "ruby").setUnlocalizedName("rubyHelmet").setTextureName(Reference.MODID + ":" + "rubyHelmet").add();
	public static final Item rubyChestplate = new ItemSMMArmor(ArmorMaterials.RUBY, 0, 1, "ruby").setUnlocalizedName("rubyChestplate").setTextureName(Reference.MODID + ":" + "rubyChestplate").add();
	public static final Item rubyLeggings = new ItemSMMArmor(ArmorMaterials.RUBY, 0, 2, "ruby").setUnlocalizedName("rubyLeggings").setTextureName(Reference.MODID + ":" + "rubyLeggings").add();
	public static final Item rubyBoots = new ItemSMMArmor(ArmorMaterials.RUBY, 0, 3, "ruby").setUnlocalizedName("rubyBoots").setTextureName(Reference.MODID + ":" + "rubyBoots").add();
	public static final Item titaniumHelmet = new ItemSMMArmor(ArmorMaterials.TITANIUM, 0, 0, "titanium").setUnlocalizedName("titaniumHelmet").setTextureName(Reference.MODID + ":" + "titaniumHelmet").add();
	public static final Item titaniumChestplate = new ItemSMMArmor(ArmorMaterials.TITANIUM, 0, 1, "titanium").setUnlocalizedName("titaniumChestplate").setTextureName(Reference.MODID + ":" + "titaniumChestplate").add();
	public static final Item titaniumLeggings = new ItemSMMArmor(ArmorMaterials.TITANIUM, 0, 2, "titanium").setUnlocalizedName("titaniumLeggings").setTextureName(Reference.MODID + ":" + "titaniumLeggings").add();
	public static final Item titaniumBoots = new ItemSMMArmor(ArmorMaterials.TITANIUM, 0, 3, "titanium").setUnlocalizedName("titaniumBoots").setTextureName(Reference.MODID + ":" + "titaniumBoots").add();
	public static final Item hellishHelmet = new ItemSMMArmor(ArmorMaterials.HELLISH, 0, 0, "hellish").setUnlocalizedName("hellishHelmet").setTextureName(Reference.MODID + ":" + "hellishHelmet").add();
	public static final Item hellishChestplate = new ItemSMMArmor(ArmorMaterials.HELLISH, 0, 1, "hellish").setUnlocalizedName("hellishChestplate").setTextureName(Reference.MODID + ":" + "hellishChestplate").add();
	public static final Item hellishLeggings = new ItemSMMArmor(ArmorMaterials.HELLISH, 0, 2, "hellish").setUnlocalizedName("hellishLeggings").setTextureName(Reference.MODID + ":" + "hellishLeggings").add();
	public static final Item hellishBoots = new ItemSMMArmor(ArmorMaterials.HELLISH, 0, 3, "hellish").setUnlocalizedName("hellishBoots").setTextureName(Reference.MODID + ":" + "hellishBoots").add();
	public static final Item leadHelmet = new ItemSMMArmor(ArmorMaterials.LEAD, 0, 0, "lead").setUnlocalizedName("leadHelmet").setTextureName(Reference.MODID + ":" + "leadHelmet").add();
	public static final Item leadChestplate = new ItemSMMArmor(ArmorMaterials.LEAD, 0, 1, "lead").setUnlocalizedName("leadChestplate").setTextureName(Reference.MODID + ":" + "leadChestplate").add();
	public static final Item leadLeggings = new ItemSMMArmor(ArmorMaterials.LEAD, 0, 2, "lead").setUnlocalizedName("leadLeggings").setTextureName(Reference.MODID + ":" + "leadLeggings").add();
	public static final Item leadBoots = new ItemSMMArmor(ArmorMaterials.LEAD, 0, 3, "lead").setUnlocalizedName("leadBoots").setTextureName(Reference.MODID + ":" + "leadBoots").add();
	public static final Item obsidianHelmet = new ItemSMMArmor(ArmorMaterials.OBSIDIAN, 0, 0, "obsidian").setUnlocalizedName("obsidianHelmet").setTextureName(Reference.MODID + ":" + "obsidianHelmet").add();
	public static final Item obsidianChestplate = new ItemSMMArmor(ArmorMaterials.OBSIDIAN, 0, 1, "obsidian").setUnlocalizedName("obsidianChestplate").setTextureName(Reference.MODID + ":" + "obsidianChestplate").add();
	public static final Item obsidianLeggings = new ItemSMMArmor(ArmorMaterials.OBSIDIAN, 0, 2, "obsidian").setUnlocalizedName("obsidianLeggings").setTextureName(Reference.MODID + ":" + "obsidianLeggings").add();
	public static final Item obsidianBoots = new ItemSMMArmor(ArmorMaterials.OBSIDIAN, 0, 3, "obsidian").setUnlocalizedName("obsidianBoots").setTextureName(Reference.MODID + ":" + "obsidianBoots").add();
	public static final Item endStoneHelmet = new ItemSMMArmor(ArmorMaterials.ENDSTONE, 0, 0, "endStone").setUnlocalizedName("endStoneHelmet").setTextureName(Reference.MODID + ":" + "endStoneHelmet").add();
	public static final Item endStoneChestplate = new ItemSMMArmor(ArmorMaterials.ENDSTONE, 0, 1, "endStone").setUnlocalizedName("endStoneChestplate").setTextureName(Reference.MODID + ":" + "endStoneChestplate").add();
	public static final Item endStoneLeggings = new ItemSMMArmor(ArmorMaterials.ENDSTONE, 0, 2, "endStone").setUnlocalizedName("endStoneLeggings").setTextureName(Reference.MODID + ":" + "endStoneLeggings").add();
	public static final Item endStoneBoots = new ItemSMMArmor(ArmorMaterials.ENDSTONE, 0, 3, "endStone").setUnlocalizedName("endStoneBoots").setTextureName(Reference.MODID + ":" + "endStoneBoots").add();
	public static final Item cobblestoneHelmet = new ItemSMMArmor(ArmorMaterials.COBBLESTONE, 0, 0, "cobblestone").setUnlocalizedName("cobblestoneHelmet").setTextureName(Reference.MODID + ":" + "cobblestoneHelmet").add();
	public static final Item cobblestoneChestplate = new ItemSMMArmor(ArmorMaterials.COBBLESTONE, 0, 1, "cobblestone").setUnlocalizedName("cobblestoneChestplate").setTextureName(Reference.MODID + ":" + "cobblestoneChestplate").add();
	public static final Item cobblestoneLeggings = new ItemSMMArmor(ArmorMaterials.COBBLESTONE, 0, 2, "cobblestone").setUnlocalizedName("cobblestoneLeggings").setTextureName(Reference.MODID + ":" + "cobblestoneLeggings").add();
	public static final Item cobblestoneBoots = new ItemSMMArmor(ArmorMaterials.COBBLESTONE, 0, 3, "cobblestone").setUnlocalizedName("cobblestoneBoots").setTextureName(Reference.MODID + ":" + "cobblestoneBoots").add();
	public static final Item woodHelmet = new ItemSMMArmor(ArmorMaterials.WOOD, 0, 0, "wood").setUnlocalizedName("woodHelmet").setTextureName(Reference.MODID + ":" + "woodHelmet").add();
	public static final Item woodChestplate = new ItemSMMArmor(ArmorMaterials.WOOD, 0, 1, "wood").setUnlocalizedName("woodChestplate").setTextureName(Reference.MODID + ":" + "woodChestplate").add();
	public static final Item woodLeggings = new ItemSMMArmor(ArmorMaterials.WOOD, 0, 2, "wood").setUnlocalizedName("woodLeggings").setTextureName(Reference.MODID + ":" + "woodLeggings").add();
	public static final Item woodBoots = new ItemSMMArmor(ArmorMaterials.WOOD, 0, 3, "wood").setUnlocalizedName("woodBoots").setTextureName(Reference.MODID + ":" + "woodBoots").add();
	public static final Item sapphireHelmet = new ItemSMMArmor(ArmorMaterials.SAPPHIRE, 0, 0, "sapphire").setUnlocalizedName("sapphireHelmet").setTextureName(Reference.MODID + ":" + "sapphireHelmet").add();
	public static final Item sapphireChestplate = new ItemSMMArmor(ArmorMaterials.SAPPHIRE, 0, 1, "sapphire").setUnlocalizedName("sapphireChestplate").setTextureName(Reference.MODID + ":" + "sapphireChestplate").add();
	public static final Item sapphireLeggings = new ItemSMMArmor(ArmorMaterials.SAPPHIRE, 0, 2, "sapphire").setUnlocalizedName("sapphireLeggings").setTextureName(Reference.MODID + ":" + "sapphireLeggings").add();
	public static final Item sapphireBoots = new ItemSMMArmor(ArmorMaterials.SAPPHIRE, 0, 3, "sapphire").setUnlocalizedName("sapphireBoots").setTextureName(Reference.MODID + ":" + "sapphireBoots").add();
	public static final Item topazHelmet = new ItemSMMArmor(ArmorMaterials.TOPAZ, 0, 0, "topaz").setUnlocalizedName("topazHelmet").setTextureName(Reference.MODID + ":" + "topazHelmet").add();
	public static final Item topazChestplate = new ItemSMMArmor(ArmorMaterials.TOPAZ, 0, 1, "topaz").setUnlocalizedName("topazChestplate").setTextureName(Reference.MODID + ":" + "topazChestplate").add();
	public static final Item topazLeggings = new ItemSMMArmor(ArmorMaterials.TOPAZ, 0, 2, "topaz").setUnlocalizedName("topazLeggings").setTextureName(Reference.MODID + ":" + "topazLeggings").add();
	public static final Item topazBoots = new ItemSMMArmor(ArmorMaterials.TOPAZ, 0, 3, "topaz").setUnlocalizedName("topazBoots").setTextureName(Reference.MODID + ":" + "topazBoots").add();
	public static final Item jadeHelmet = new ItemSMMArmor(ArmorMaterials.JADE, 0, 0, "jade").setUnlocalizedName("jadeHelmet").setTextureName(Reference.MODID + ":" + "jadeHelmet").add();
	public static final Item jadeChestplate = new ItemSMMArmor(ArmorMaterials.JADE, 0, 1, "jade").setUnlocalizedName("jadeChestplate").setTextureName(Reference.MODID + ":" + "jadeChestplate").add();
	public static final Item jadeLeggings = new ItemSMMArmor(ArmorMaterials.JADE, 0, 2, "jade").setUnlocalizedName("jadeLeggings").setTextureName(Reference.MODID + ":" + "jadeLeggings").add();
	public static final Item jadeBoots = new ItemSMMArmor(ArmorMaterials.JADE, 0, 3, "jade").setUnlocalizedName("jadeBoots").setTextureName(Reference.MODID + ":" + "jadeBoots").add();
	public static final Item steelHelmet = new ItemSMMArmor(ArmorMaterials.STEEL, 0, 0, "steel").setUnlocalizedName("steelHelmet").setTextureName(Reference.MODID + ":" + "steelHelmet").add();
	public static final Item steelChestplate = new ItemSMMArmor(ArmorMaterials.STEEL, 0, 1, "steel").setUnlocalizedName("steelChestplate").setTextureName(Reference.MODID + ":" + "steelChestplate").add();
	public static final Item steelLeggings = new ItemSMMArmor(ArmorMaterials.STEEL, 0, 2, "steel").setUnlocalizedName("steelLeggings").setTextureName(Reference.MODID + ":" + "steelLeggings").add();
	public static final Item steelBoots = new ItemSMMArmor(ArmorMaterials.STEEL, 0, 3, "steel").setUnlocalizedName("steelBoots").setTextureName(Reference.MODID + ":" + "steelBoots").add();
	public static final Item tanzaniteHelmet = new ItemSMMArmor(ArmorMaterials.TANZANITE, 0, 0, "tanzanite").setUnlocalizedName("tanzaniteHelmet").setTextureName(Reference.MODID + ":" + "tanzaniteHelmet").add();
	public static final Item tanzaniteChestplate = new ItemSMMArmor(ArmorMaterials.TANZANITE, 0, 1, "tanzanite").setUnlocalizedName("tanzaniteChestplate").setTextureName(Reference.MODID + ":" + "tanzaniteChestplate").add();
	public static final Item tanzaniteLeggings = new ItemSMMArmor(ArmorMaterials.TANZANITE, 0, 2, "tanzanite").setUnlocalizedName("tanzaniteLeggings").setTextureName(Reference.MODID + ":" + "tanzaniteLeggings").add();
	public static final Item tanzaniteBoots = new ItemSMMArmor(ArmorMaterials.TANZANITE, 0, 3, "tanzanite").setUnlocalizedName("tanzaniteBoots").setTextureName(Reference.MODID + ":" + "tanzaniteBoots").add();
	public static final Item apatiteHelmet = new ItemSMMArmor(ArmorMaterials.APATITE, 0, 0, "apatite").setUnlocalizedName("apatiteHelmet").setTextureName(Reference.MODID + ":" + "apatiteHelmet").add();
	public static final Item apatiteChestplate = new ItemSMMArmor(ArmorMaterials.APATITE, 0, 1, "apatite").setUnlocalizedName("apatiteChestplate").setTextureName(Reference.MODID + ":" + "apatiteChestplate").add();
	public static final Item apatiteLeggings = new ItemSMMArmor(ArmorMaterials.APATITE, 0, 2, "apatite").setUnlocalizedName("apatiteLeggings").setTextureName(Reference.MODID + ":" + "apatiteLeggings").add();
	public static final Item apatiteBoots = new ItemSMMArmor(ArmorMaterials.APATITE, 0, 3, "apatite").setUnlocalizedName("apatiteBoots").setTextureName(Reference.MODID + ":" + "apatiteBoots").add();
	public static final Item netherQuartzHelmet = new ItemSMMArmor(ArmorMaterials.NETHERQUARTZ, 0, 0, "netherQuartz").setUnlocalizedName("netherQuartzHelmet").setTextureName(Reference.MODID + ":" + "netherQuartzHelmet").add();
	public static final Item netherQuartzChestplate = new ItemSMMArmor(ArmorMaterials.NETHERQUARTZ, 0, 1, "netherQuartz").setUnlocalizedName("netherQuartzChestplate").setTextureName(Reference.MODID + ":" + "netherQuartzChestplate").add();
	public static final Item netherQuartzLeggings = new ItemSMMArmor(ArmorMaterials.NETHERQUARTZ, 0, 2, "netherQuartz").setUnlocalizedName("netherQuartzLeggings").setTextureName(Reference.MODID + ":" + "netherQuartzLeggings").add();
	public static final Item netherQuartzBoots = new ItemSMMArmor(ArmorMaterials.NETHERQUARTZ, 0, 3, "netherQuartz").setUnlocalizedName("netherQuartzBoots").setTextureName(Reference.MODID + ":" + "netherQuartzBoots").add();
	public static final Item amethystHelmet = new ItemSMMArmor(ArmorMaterials.AMETHYST, 0, 0, "amethyst").setUnlocalizedName("amethystHelmet").setTextureName(Reference.MODID + ":" + "amethystHelmet").add();
	public static final Item amethystChestplate = new ItemSMMArmor(ArmorMaterials.AMETHYST, 0, 1, "amethyst").setUnlocalizedName("amethystChestplate").setTextureName(Reference.MODID + ":" + "amethystChestplate").add();
	public static final Item amethystLeggings = new ItemSMMArmor(ArmorMaterials.AMETHYST, 0, 2, "amethyst").setUnlocalizedName("amethystLeggings").setTextureName(Reference.MODID + ":" + "amethystLeggings").add();
	public static final Item amethystBoots = new ItemSMMArmor(ArmorMaterials.AMETHYST, 0, 3, "amethyst").setUnlocalizedName("amethystBoots").setTextureName(Reference.MODID + ":" + "amethystBoots").add();
	
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
		GameRegistry.registerItem(jadeHelmet, jadeHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadeChestplate, jadeChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadeLeggings, jadeLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadeBoots, jadeBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelHelmet, steelHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelChestplate, steelChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelLeggings, steelLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelBoots, steelBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteHelmet, tanzaniteHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteChestplate, tanzaniteChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteLeggings, tanzaniteLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteBoots, tanzaniteBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteHelmet, apatiteHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteChestplate, apatiteChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteLeggings, apatiteLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteBoots, apatiteBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherQuartzHelmet, netherQuartzHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherQuartzChestplate, netherQuartzChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherQuartzLeggings, netherQuartzLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherQuartzBoots, netherQuartzBoots.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(amethystHelmet, amethystHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(amethystChestplate, amethystChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(amethystLeggings, amethystLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(amethystBoots, amethystBoots.getUnlocalizedName().substring(5));
	}
}
