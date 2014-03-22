package com.spencerio.smm.item.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * The file in which all of the Tools are initialized for Spencerio's Mod Mod
 * @author Spencerio
 * @author Parker8283
 * @see net.minecraft.item.Item
 * @see net.minecraft.init.Items
 */
public class SMMTools
{
	public static final ToolMaterial COAL = EnumHelper.addToolMaterial("COAL", 1, 128, 30F, 2, 64);
	public static final ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 5, 2048, 10F, 3, 10);
	public static final ToolMaterial REDSTONE = EnumHelper.addToolMaterial("REDSTONE", 2, 1048, 16F, 3, 60);
	public static final ToolMaterial LAPISLAZULI = EnumHelper.addToolMaterial("LAPISLAZULI", 1, 512, 20F, 2, 50);
	public static final ToolMaterial EARTHQUARTZ = EnumHelper.addToolMaterial("EARTHQUARTZ", 2, 1500, 24F, 3, 20);
	public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 500, 10F, 4, 25);
	public static final ToolMaterial CARBON = EnumHelper.addToolMaterial("CARBON", 3, 3150, 18F, 6, 15);
	public static final ToolMaterial SILVER = EnumHelper.addToolMaterial("SILVER", 2, 1250, 14F, 6, 9);
	public static final ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 2, 1150, 15F, 5, 10);
	public static final ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 5, 3950, 20F, 10, 5);
	public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 3, 3875, 17F, 5, 11);
	public static final ToolMaterial HELLISH = EnumHelper.addToolMaterial("HELLISH", 3, 2750, 15F, 4, 28);
	public static final ToolMaterial LEAD = EnumHelper.addToolMaterial("LEAD", 1, 650, 30F, 3, 20);
	public static final ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 2775, 10F, 2, 15);
	public static final ToolMaterial ENDSTONE = EnumHelper.addToolMaterial("ENDSTONE", 2, 750, 6F, 2, 13);
	public static final ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 4, 3250, 25F, 4, 12);
	public static final ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 4, 3225, 30F, 5, 10);
	public static final ToolMaterial JADE = EnumHelper.addToolMaterial("JADE", 5, 4000, 24F, 4, 14);
	public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 5, 3800, 11F, 4, 12);
	public static final ToolMaterial TANZANITE = EnumHelper.addToolMaterial("TANZANITE", 4, 3900, 14F, 5, 13);
	public static final ToolMaterial APATITE = EnumHelper.addToolMaterial("APATITE", 4, 3025, 11F, 3, 13);
	
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
	public static final Item silverPickaxe = new ItemSMMPickaxe(SILVER).setUnlocalizedName("silverPickaxe").setTextureName(Reference.MODID + ":" + "silverPickaxe");
	public static final Item silverAxe = new ItemSMMAxe(SILVER).setUnlocalizedName("silverAxe").setTextureName(Reference.MODID + ":" + "silverAxe");
	public static final Item silverShovel = new ItemSMMShovel(SILVER).setUnlocalizedName("silverShovel").setTextureName(Reference.MODID + ":" + "silverShovel");
	public static final Item silverHoe = new ItemSMMHoe(SILVER).setUnlocalizedName("silverHoe").setTextureName(Reference.MODID + ":" + "silverHoe");
	public static final Item silverSword = new ItemSMMSword(SILVER).setUnlocalizedName("silverSword").setTextureName(Reference.MODID + ":" + "silverSword");
	public static final Item cobaltPickaxe = new ItemSMMPickaxe(COBALT).setUnlocalizedName("cobaltPickaxe").setTextureName(Reference.MODID + ":" + "cobaltPickaxe");
	public static final Item cobaltAxe = new ItemSMMAxe(COBALT).setUnlocalizedName("cobaltAxe").setTextureName(Reference.MODID + ":" + "cobaltAxe");
	public static final Item cobaltShovel = new ItemSMMShovel(COBALT).setUnlocalizedName("cobaltShovel").setTextureName(Reference.MODID + ":" + "cobaltShovel");
	public static final Item cobaltHoe = new ItemSMMHoe(COBALT).setUnlocalizedName("cobaltHoe").setTextureName(Reference.MODID + ":" + "cobaltHoe");
	public static final Item cobaltSword = new ItemSMMSword(COBALT).setUnlocalizedName("cobaltSword").setTextureName(Reference.MODID + ":" + "cobaltSword");
	public static final Item rubyPickaxe = new ItemSMMPickaxe(RUBY).setUnlocalizedName("rubyPickaxe").setTextureName(Reference.MODID + ":" + "rubyPickaxe");
	public static final Item rubyAxe = new ItemSMMAxe(RUBY).setUnlocalizedName("rubyAxe").setTextureName(Reference.MODID + ":" + "rubyAxe");
	public static final Item rubyShovel = new ItemSMMShovel(RUBY).setUnlocalizedName("rubyShovel").setTextureName(Reference.MODID + ":" + "rubyShovel");
	public static final Item rubyHoe = new ItemSMMHoe(RUBY).setUnlocalizedName("rubyHoe").setTextureName(Reference.MODID + ":" + "rubyHoe");
	public static final Item rubySword = new ItemSMMSword(RUBY).setUnlocalizedName("rubySword").setTextureName(Reference.MODID + ":" + "rubySword");
	public static final Item titaniumPickaxe = new ItemSMMPickaxe(TITANIUM).setUnlocalizedName("titaniumPickaxe").setTextureName(Reference.MODID + ":" + "titaniumPickaxe");
	public static final Item titaniumAxe = new ItemSMMAxe(TITANIUM).setUnlocalizedName("titaniumAxe").setTextureName(Reference.MODID + ":" + "titaniumAxe");
	public static final Item titaniumShovel = new ItemSMMShovel(TITANIUM).setUnlocalizedName("titaniumShovel").setTextureName(Reference.MODID + ":" + "titaniumShovel");
	public static final Item titaniumHoe = new ItemSMMHoe(TITANIUM).setUnlocalizedName("titaniumHoe").setTextureName(Reference.MODID + ":" + "titaniumHoe");
	public static final Item titaniumSword = new ItemSMMSword(TITANIUM).setUnlocalizedName("titaniumSword").setTextureName(Reference.MODID + ":" + "titaniumSword");
	public static final Item hellishPickaxe = new ItemSMMPickaxe(HELLISH).setUnlocalizedName("hellishPickaxe").setTextureName(Reference.MODID + ":" + "hellishPickaxe");
	public static final Item hellishAxe = new ItemSMMAxe(HELLISH).setUnlocalizedName("hellishAxe").setTextureName(Reference.MODID + ":" + "hellishAxe");
	public static final Item hellishShovel = new ItemSMMShovel(HELLISH).setUnlocalizedName("hellishShovel").setTextureName(Reference.MODID + ":" + "hellishShovel");
	public static final Item hellishHoe = new ItemSMMHoe(HELLISH).setUnlocalizedName("hellishHoe").setTextureName(Reference.MODID + ":" + "hellishHoe");
	public static final Item hellishSword = new ItemSMMSword(HELLISH).setUnlocalizedName("hellishSword").setTextureName(Reference.MODID + ":" + "hellishSword");
	public static final Item leadPickaxe = new ItemSMMPickaxe(LEAD).setUnlocalizedName("leadPickaxe").setTextureName(Reference.MODID + ":" + "leadPickaxe");
	public static final Item leadAxe = new ItemSMMAxe(LEAD).setUnlocalizedName("leadAxe").setTextureName(Reference.MODID + ":" + "leadAxe");
	public static final Item leadShovel = new ItemSMMShovel(LEAD).setUnlocalizedName("leadShovel").setTextureName(Reference.MODID + ":" + "leadShovel");
	public static final Item leadHoe = new ItemSMMHoe(LEAD).setUnlocalizedName("leadHoe").setTextureName(Reference.MODID + ":" + "leadHoe");
	public static final Item leadSword = new ItemSMMSword(LEAD).setUnlocalizedName("leadSword").setTextureName(Reference.MODID + ":" + "leadSword");
	public static final Item obsidianPickaxe = new ItemSMMPickaxe(OBSIDIAN).setUnlocalizedName("obsidianPickaxe").setTextureName(Reference.MODID + ":" + "obsidianPickaxe");
	public static final Item obsidianAxe = new ItemSMMAxe(OBSIDIAN).setUnlocalizedName("obsidianAxe").setTextureName(Reference.MODID + ":" + "obsidianAxe");
	public static final Item obsidianShovel = new ItemSMMShovel(OBSIDIAN).setUnlocalizedName("obsidianShovel").setTextureName(Reference.MODID + ":" + "obsidianShovel");
	public static final Item obsidianHoe = new ItemSMMHoe(OBSIDIAN).setUnlocalizedName("obsidianHoe").setTextureName(Reference.MODID + ":" + "obsidianHoe");
	public static final Item obsidianSword = new ItemSMMSword(OBSIDIAN).setUnlocalizedName("obsidianSword").setTextureName(Reference.MODID + ":" + "obsidianSword");
	public static final Item endStonePickaxe = new ItemSMMPickaxe(ENDSTONE).setUnlocalizedName("endStonePickaxe").setTextureName(Reference.MODID + ":" + "endStonePickaxe");
	public static final Item endStoneAxe = new ItemSMMAxe(ENDSTONE).setUnlocalizedName("endStoneAxe").setTextureName(Reference.MODID + ":" + "endStoneAxe");
	public static final Item endStoneShovel = new ItemSMMShovel(ENDSTONE).setUnlocalizedName("endStoneShovel").setTextureName(Reference.MODID + ":" + "endStoneShovel");
	public static final Item endStoneHoe = new ItemSMMHoe(ENDSTONE).setUnlocalizedName("endStoneHoe").setTextureName(Reference.MODID + ":" + "endStoneHoe");
	public static final Item endStoneSword = new ItemSMMSword(ENDSTONE).setUnlocalizedName("endStoneSword").setTextureName(Reference.MODID + ":" + "endStoneSword");
	public static final Item sapphirePickaxe = new ItemSMMPickaxe(SAPPHIRE).setUnlocalizedName("sapphirePickaxe").setTextureName(Reference.MODID + ":" + "sapphirePickaxe");
	public static final Item sapphireAxe = new ItemSMMAxe(SAPPHIRE).setUnlocalizedName("sapphireAxe").setTextureName(Reference.MODID + ":" + "sapphireAxe");
	public static final Item sapphireShovel = new ItemSMMShovel(SAPPHIRE).setUnlocalizedName("sapphireShovel").setTextureName(Reference.MODID + ":" + "sapphireShovel");
	public static final Item sapphireHoe = new ItemSMMHoe(SAPPHIRE).setUnlocalizedName("sapphireHoe").setTextureName(Reference.MODID + ":" + "sapphireHoe");
	public static final Item sapphireSword = new ItemSMMSword(SAPPHIRE).setUnlocalizedName("sapphireSword").setTextureName(Reference.MODID + ":" + "sapphireSword");
	public static final Item topazPickaxe = new ItemSMMPickaxe(TOPAZ).setUnlocalizedName("topazPickaxe").setTextureName(Reference.MODID + ":" + "topazPickaxe");
	public static final Item topazAxe = new ItemSMMAxe(TOPAZ).setUnlocalizedName("topazAxe").setTextureName(Reference.MODID + ":" + "topazAxe");
	public static final Item topazShovel = new ItemSMMShovel(TOPAZ).setUnlocalizedName("topazShovel").setTextureName(Reference.MODID + ":" + "topazShovel");
	public static final Item topazHoe = new ItemSMMHoe(TOPAZ).setUnlocalizedName("topazHoe").setTextureName(Reference.MODID + ":" + "topazHoe");
	public static final Item topazSword = new ItemSMMSword(TOPAZ).setUnlocalizedName("topazSword").setTextureName(Reference.MODID + ":" + "topazSword");
	public static final Item jadePickaxe = new ItemSMMPickaxe(JADE).setUnlocalizedName("jadePickaxe").setTextureName(Reference.MODID + ":" + "jadePickaxe");
	public static final Item jadeAxe = new ItemSMMAxe(JADE).setUnlocalizedName("jadeAxe").setTextureName(Reference.MODID + ":" + "jadeAxe");
	public static final Item jadeShovel = new ItemSMMShovel(JADE).setUnlocalizedName("jadeShovel").setTextureName(Reference.MODID + ":" + "jadeShovel");
	public static final Item jadeHoe = new ItemSMMHoe(JADE).setUnlocalizedName("jadeHoe").setTextureName(Reference.MODID + ":" + "jadeHoe");
	public static final Item jadeSword = new ItemSMMSword(JADE).setUnlocalizedName("jadeSword").setTextureName(Reference.MODID + ":" + "jadeSword");
	public static final Item steelPickaxe = new ItemSMMPickaxe(STEEL).setUnlocalizedName("steelPickaxe").setTextureName(Reference.MODID + ":" + "steelPickaxe");
	public static final Item steelAxe = new ItemSMMAxe(STEEL).setUnlocalizedName("steelAxe").setTextureName(Reference.MODID + ":" + "steelAxe");
	public static final Item steelShovel = new ItemSMMShovel(STEEL).setUnlocalizedName("steelShovel").setTextureName(Reference.MODID + ":" + "steelShovel");
	public static final Item steelHoe = new ItemSMMHoe(STEEL).setUnlocalizedName("steelHoe").setTextureName(Reference.MODID + ":" + "steelHoe");
	public static final Item steelSword = new ItemSMMSword(STEEL).setUnlocalizedName("steelSword").setTextureName(Reference.MODID + ":" + "steelSword");
	public static final Item tanzanitePickaxe = new ItemSMMPickaxe(TANZANITE).setUnlocalizedName("tanzanitePickaxe").setTextureName(Reference.MODID + ":" + "tanzanitePickaxe");
	public static final Item tanzaniteAxe = new ItemSMMAxe(TANZANITE).setUnlocalizedName("tanzaniteAxe").setTextureName(Reference.MODID + ":" + "tanzaniteAxe");
	public static final Item tanzaniteShovel = new ItemSMMShovel(TANZANITE).setUnlocalizedName("tanzaniteShovel").setTextureName(Reference.MODID + ":" + "tanzaniteShovel");
	public static final Item tanzaniteHoe = new ItemSMMHoe(TANZANITE).setUnlocalizedName("tanzaniteHoe").setTextureName(Reference.MODID + ":" + "tanzaniteHoe");
	public static final Item tanzaniteSword = new ItemSMMSword(TANZANITE).setUnlocalizedName("tanzaniteSword").setTextureName(Reference.MODID + ":" + "tanzaniteSword");
	public static final Item apatitePickaxe = new ItemSMMPickaxe(APATITE).setUnlocalizedName("apatitePickaxe").setTextureName(Reference.MODID + ":" + "apatitePickaxe");
	public static final Item apatiteAxe = new ItemSMMAxe(APATITE).setUnlocalizedName("apatiteAxe").setTextureName(Reference.MODID + ":" + "apatiteAxe");
	public static final Item apatiteShovel = new ItemSMMShovel(APATITE).setUnlocalizedName("apatiteShovel").setTextureName(Reference.MODID + ":" + "apatiteShovel");
	public static final Item apatiteHoe = new ItemSMMHoe(APATITE).setUnlocalizedName("apatiteHoe").setTextureName(Reference.MODID + ":" + "apatiteHoe");
	public static final Item apatiteSword = new ItemSMMSword(APATITE).setUnlocalizedName("apatiteSword").setTextureName(Reference.MODID + ":" + "apatiteSword");
	
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
		GameRegistry.registerItem(silverPickaxe, silverPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverAxe, silverAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverShovel, silverShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverHoe, silverHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverSword, silverSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltPickaxe, cobaltPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltAxe, cobaltAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltShovel, cobaltShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltHoe, cobaltHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cobaltSword, cobaltSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyPickaxe, rubyPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyAxe, rubyAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyShovel, rubyShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubyHoe, rubyHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(rubySword, rubySword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumPickaxe, titaniumPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumAxe, titaniumAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumShovel, titaniumShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumHoe, titaniumHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(titaniumSword, titaniumSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishPickaxe, hellishPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishAxe, hellishAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishShovel, hellishShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishHoe, hellishHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hellishSword, hellishSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadPickaxe, leadPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadAxe, leadAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadShovel, leadShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadHoe, leadHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(leadSword, leadSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianPickaxe, obsidianPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianAxe, obsidianAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianShovel, obsidianShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianHoe, obsidianHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianSword, obsidianSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStonePickaxe, endStonePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneAxe, endStoneAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneShovel, endStoneShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneHoe, endStoneHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(endStoneSword, endStoneSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphirePickaxe, sapphirePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireAxe, sapphireAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireShovel, sapphireShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireHoe, sapphireHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphireSword, sapphireSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazPickaxe, topazPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazAxe, topazAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazShovel, topazShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazHoe, topazHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(topazSword, topazSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadePickaxe, jadePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadeAxe, jadeAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadeShovel, jadeShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadeHoe, jadeHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(jadeSword, jadeSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelPickaxe, steelPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelAxe, steelAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelShovel, steelShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelHoe, steelHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelSword, steelSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzanitePickaxe, tanzanitePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteAxe, tanzaniteAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteShovel, tanzaniteShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteHoe, tanzaniteHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tanzaniteSword, tanzaniteSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatitePickaxe, apatitePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteAxe, apatiteAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteShovel, apatiteShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteHoe, apatiteHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(apatiteSword, apatiteSword.getUnlocalizedName().substring(5));
	}
}
