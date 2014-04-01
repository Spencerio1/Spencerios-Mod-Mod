package com.spencerio.smm.item.tools;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

import com.spencerio.smm.SpenceriosModMod;

public class ItemSMMDGStaff extends Item
{
	public ItemSMMDGStaff()
	{
		setMaxDamage(4000);
		setMaxStackSize(1);
		this.setCreativeTab(SpenceriosModMod.tabSMMTools);
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer Entityplayer)
	{
		MovingObjectPosition Coord = Entityplayer.rayTrace(300, 1);
		if(Coord != null && Coord.typeOfHit == MovingObjectType.BLOCK)
		{
			EntityLightningBolt Lightning = new EntityLightningBolt(world, 1, 1, 1);
			Lightning.setPosition(Coord.blockX,Coord.blockY,Coord.blockZ);
			world.spawnEntityInWorld(Lightning);
			itemStack.damageItem(10, Entityplayer);
		}
		return itemStack;
	}

	public boolean onItemUse(ItemStack itemstack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
		super.onItemUse(itemstack, entity, world, i, j, k, l, a, b, c);
		if(!world.isRemote)
		{
			world.func_147480_a(i,j,k,true);
			itemstack.damageItem(1, entity);
		}
		return true;
	}
	
	public float func_150893_a(ItemStack par1ItemStack, Block par2Block)
	{
		return 0.0F;
	}

	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
		par1ItemStack.damageItem(2, par3EntityLiving);
		return true;
	}

	public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving){
		par1ItemStack.damageItem(1, par7EntityLiving);
		return true;
	}
	
    public int getDamageVsEntity(Entity par1Entity)
    {
        return 10;
    }
	
    public int getItemEnchantability()
    {
        return 0;
    }
}
