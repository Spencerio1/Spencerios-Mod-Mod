package com.github.spencerio1.smm.proxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;

public class ServerProxy implements IProxy {
	
	@Override
	public int addArmor(String armorPrefix) {
		return 0;
	}

	@Override
	public EntityPlayer getClientPlayer() {
		return null;
	}

	@Override
	public boolean isClientPlayer(Entity player) {
		return false;
	}

	@Override
	public World getClientWorld() {
		return null;
	}

	@Override
	public World getServerWorld(int dimId) {
		return DimensionManager.getWorld(dimId);
	}
}
