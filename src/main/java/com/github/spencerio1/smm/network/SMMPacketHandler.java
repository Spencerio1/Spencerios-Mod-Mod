package com.github.spencerio1.smm.network;

import com.github.spencerio1.smm.lib.ModInfo;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class SMMPacketHandler {
	
	public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.CHANNEL);
	
	public static void init() {
		//Register packets here
	}
}
