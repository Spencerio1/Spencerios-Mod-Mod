package com.github.spencerio1.smm.manager;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.github.spencerio1.smm.helper.SMMConfigToCodeHelper;
import com.github.spencerio1.smm.lib.ConfigFields;

public class SMMConfigManager 
{
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		
		config.load();
		
		ConfigFields.flowersUseSameRarity = config.get(ConfigFields.CONTROLLER_CATEGORY, ConfigFields.FUSR_KEY, ConfigFields.FUSR_DEFAULT, ConfigFields.FUSR_COMMENT).getBoolean(ConfigFields.FUSR_DEFAULT);
		ConfigFields.allFlowersRarity = config.get(ConfigFields.FLOWERS_CATEGORY, ConfigFields.AFR_KEY, ConfigFields.AFR_DEFAULT, ConfigFields.AFR_COMMENT).getInt(ConfigFields.AFR_DEFAULT);
		ConfigFields.chysanthemumRarity = config.get(ConfigFields.FLOWERS_CATEGORY, ConfigFields.CHY_KEY, ConfigFields.CHY_DEFAULT, ConfigFields.CHY_COMMENT).getInt(ConfigFields.CHY_DEFAULT);
		ConfigFields.camelliaRarity = config.get(ConfigFields.FLOWERS_CATEGORY, ConfigFields.CAM_KEY, ConfigFields.CAM_DEFAULT, ConfigFields.CAM_COMMENT).getInt(ConfigFields.CAM_DEFAULT);
		ConfigFields.hydrangeaRarity = config.get(ConfigFields.FLOWERS_CATEGORY, ConfigFields.HYD_KEY, ConfigFields.HYD_DEFAULT, ConfigFields.HYD_COMMENT).getInt(ConfigFields.HYD_DEFAULT);
		ConfigFields.madagascarianForestBiomeID = config.get(ConfigFields.ID_CATEGORY, ConfigFields.MFBID_KEY, ConfigFields.MFBID_DEFAULT, ConfigFields.MFBID_COMMENT).getInt(ConfigFields.MFBID_DEFAULT);
		
		if(config.hasChanged())
			config.save();
		
		SMMConfigToCodeHelper.load();
	}
}
