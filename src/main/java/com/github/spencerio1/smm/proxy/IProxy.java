package com.github.spencerio1.smm.proxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public interface IProxy {
	public int addArmor(String armorPrefix);
	
	public EntityPlayer getClientPlayer();
	
	public boolean isClientPlayer(Entity player);
	
	public World getClientWorld();
	
	public World getServerWorld(int dimId);
}
