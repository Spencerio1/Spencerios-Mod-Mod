package com.github.spencerio1.smm.manager;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

import com.github.spencerio1.smm.init.SMMItems;

public class SMMAchievementManager
{
	public static final Achievement dgstaff = new Achievement("achievement.dgstaff", "dgstaff", 0, 0, SMMItems.diamondGoldStaff, (Achievement)null).initIndependentStat().setSpecial().registerStat();
	
	public static void registerAchievements()
	{
		AchievementPage.registerAchievementPage(new AchievementPage("Spencerio's Mod Mod", new Achievement[]{dgstaff}));
	}
}
