package com.github.spencerio1.smm.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy {
	@Override
	public int addArmor(String armorPrefix) {
		return RenderingRegistry.addNewArmourRendererPrefix(armorPrefix);
	}
}
