package com.spencerio.smm.helper;

import com.spencerio.smm.lib.ConfigFields;
import com.spencerio.smm.manager.SMMGenerationManager;

public abstract class SMMConfigToCodeHelper
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
