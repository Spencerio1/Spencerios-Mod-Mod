package com.github.spencerio1.smm.helper;

import com.github.spencerio1.smm.lib.ConfigFields;
import com.github.spencerio1.smm.manager.SMMGenerationManager;

public abstract class ConfigToCodeHelper
{
	public static void load()
	{
		if(ConfigFields.flowersUseSameRarity)
			assignToAll();
		else
			readAndAssign();
	}
	
	private static void assignToAll()
	{
		SMMGenerationManager.chyCTS = ConfigFields.allFlowersRarity;
		SMMGenerationManager.camCTS = ConfigFields.allFlowersRarity;
		SMMGenerationManager.hydCTS = ConfigFields.allFlowersRarity;
	}
	private static void readAndAssign()
	{
		SMMGenerationManager.chyCTS = ConfigFields.chysanthemumRarity;
		SMMGenerationManager.camCTS = ConfigFields.camelliaRarity;
		SMMGenerationManager.hydCTS = ConfigFields.hydrangeaRarity;
	}
}
