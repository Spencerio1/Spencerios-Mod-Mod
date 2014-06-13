package com.github.spencerio1.smm.lib;


public abstract class ConfigFields
{
	public static final String CONTROLLER_CATEGORY = "Config Controller";
	public static final String FLOWERS_CATEGORY = "Flower Generation";
	public static final String ID_CATEGORY = "IDs";
	
	public static boolean flowersUseSameRarity;
	public static final String FUSR_KEY = "flowersUseSameRarity";
	public static final boolean FUSR_DEFAULT = true;
	public static final String FUSR_COMMENT = "If you would like to alter the rarities of each flower individually, instead of having all at the same rarity, set the field below to false, skip the \"allFlowersRarity\" field below it, and use the three afterwards to alter the flowers' individual rarity. Otherwise, leave at true, and change ONLY the field below this.";
	
	public static int allFlowersRarity;
	public static final String AFR_KEY = "allFlowersRarity";
	public static final int AFR_DEFAULT = 2;
	public static final String AFR_COMMENT = "The rarity of all the flowers. WILL ONLY BE READ IF THE flowersUseSameRarity FIELD IS SET TO true.";
	
	public static int chysanthemumRarity;
	public static final String CHY_KEY = "chysanthemumRarity";
	public static final int CHY_DEFAULT = 2;
	public static final String CHY_COMMENT = "The rarity for Chysanthemum. WILL ONLY BE READ IF THE flowersUseSameRarity FIELD ABOVE IS SET TO false.";
	
	public static int camelliaRarity;
	public static final String CAM_KEY = "camelliaRarity";
	public static final int CAM_DEFAULT = 2;
	public static final String CAM_COMMENT = "The rarity for Camellia. WILL ONLY BE READ IF THE flowersUseSameRarity FIELD ABOVE IS SET TO false.";
	
	public static int hydrangeaRarity;
	public static final String HYD_KEY = "hydrangeaRarity";
	public static final int HYD_DEFAULT = 2;
	public static final String HYD_COMMENT = "The rarity for Hydrangea. WILL ONLY BE READ IF THE flowersUseSameRarity FIELD ABOVE IS SET TO false.";
	
	public static int madagascarianForestBiomeID;
	public static final String MFBID_KEY = "madagascarianForestBiomeID";
	public static final int MFBID_DEFAULT = 50;
	public static final String MFBID_COMMENT = "The biome ID for the Madagacarian Forest. Change this if it conflicts with other mods.";
	
	public static int madagascarianForestRarity;
	public static final String MFBR_KEY = "madagascarianForestRarity";
	public static final int MFBR_DEFAULT = 10;
	public static final String MFBR_COMMENT = "The rarity weight for the Madagascarian Forest. Higher = more common.";
}
