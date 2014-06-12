package com.github.spencerio1.smm.helper;

import net.minecraft.client.resources.I18n;

public class LocalizationHelper {
	
	public static String localize(String key) {
		return I18n.format(key, new Object[0]);
	}
}
