package com.spencerio.smm.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import org.lwjgl.opengl.GL11;

import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SMMCustomSpawnerGUI extends GuiContainer
{
	EntityPlayer entity = Minecraft.getMinecraft().thePlayer;
	
	public SMMCustomSpawnerGUI()
	{
		super(new SMMCustomSpawnerContainer());
		
		xSize = 256;
		ySize = 256;
	}
	
	private static final ResourceLocation background = new ResourceLocation(Reference.MODID, "textures/gui/background_customSpawner.png");

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int x, int y)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(background);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void initGui()
	{
		super.initGui();
		buttonList.clear();
		
		buttonList.add(new GuiButton(0, guiLeft + 8, guiTop + 8, 76, 20, "Creeper"));
		buttonList.add(new GuiButton(1, guiLeft + 89, guiTop + 8, 76, 20, "Skeleton"));
		buttonList.add(new GuiButton(2, guiLeft + 170, guiTop + 8, 76, 20, "Spider"));
		buttonList.add(new GuiButton(3, guiLeft + 8, guiTop + 34, 76, 20, "Giant"));
		buttonList.add(new GuiButton(4, guiLeft + 89, guiTop + 34, 76, 20, "Zombie"));
		buttonList.add(new GuiButton(5, guiLeft + 170, guiTop + 34, 76, 20, "Slime"));
		buttonList.add(new GuiButton(6, guiLeft + 8, guiTop + 60, 76, 20, "Ghast"));
		buttonList.add(new GuiButton(7, guiLeft + 89, guiTop + 60, 76, 20, "Pigman"));
		buttonList.add(new GuiButton(8, guiLeft + 170, guiTop + 60, 76, 20, "Enderman"));
		buttonList.add(new GuiButton(9, guiLeft + 8, guiTop + 86, 76, 20, "Cave Spider"));
		buttonList.add(new GuiButton(10, guiLeft + 89, guiTop + 86, 76, 20, "Silverfish"));
		buttonList.add(new GuiButton(11, guiLeft + 170, guiTop + 86, 76, 20, "Blaze"));
		buttonList.add(new GuiButton(12, guiLeft + 8, guiTop + 112, 76, 20, "Magma Cube"));
		buttonList.add(new GuiButton(13, guiLeft + 89, guiTop + 112, 76, 20, "Witch"));
		buttonList.add(new GuiButton(14, guiLeft + 170, guiTop + 112, 76, 20, "Bat"));
		buttonList.add(new GuiButton(15, guiLeft + 8, guiTop + 138, 76, 20, "Pig"));
		buttonList.add(new GuiButton(16, guiLeft + 89, guiTop + 138, 76, 20, "Sheep"));
		buttonList.add(new GuiButton(17, guiLeft + 170, guiTop + 138, 76, 20, "Cow"));
		buttonList.add(new GuiButton(18, guiLeft + 8, guiTop + 164, 76, 20, "Chicken"));
		buttonList.add(new GuiButton(19, guiLeft + 89, guiTop + 164, 76, 20, "Squid"));
		buttonList.add(new GuiButton(20, guiLeft + 170, guiTop + 164, 76, 20, "Wolf"));
		buttonList.add(new GuiButton(21, guiLeft + 8, guiTop + 190, 76, 20, "Mooshroom"));
		buttonList.add(new GuiButton(22, guiLeft + 89, guiTop + 190, 76, 20, "Snow Golem"));
		buttonList.add(new GuiButton(23, guiLeft + 170, guiTop + 190, 76, 20, "Ocelot"));
		buttonList.add(new GuiButton(24, guiLeft + 8, guiTop + 216, 76, 20, "Iron Golem"));
		buttonList.add(new GuiButton(25, guiLeft + 89, guiTop + 216, 76, 20, "Horse"));
		buttonList.add(new GuiButton(26, guiLeft + 170, guiTop + 216, 76, 20, "Villager"));
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		World world = null;
		WorldServer[] list = MinecraftServer.getServer().worldServers;
		for(WorldServer ins : list)
		{
			if(ins.provider.dimensionId==entity.worldObj.provider.dimensionId)
				world = ins;
		}
		Entity spawn;
		switch(button.id){
		case 0:
			spawn = EntityList.createEntityByID(50, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 1:
			spawn = EntityList.createEntityByID(51, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 2:
			spawn = EntityList.createEntityByID(52, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 3:
			spawn = EntityList.createEntityByID(53, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 4:
			spawn = EntityList.createEntityByID(54, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 5:
			spawn = EntityList.createEntityByID(55, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 6:
			spawn = EntityList.createEntityByID(56, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 7:
			spawn = EntityList.createEntityByID(57, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 8:
			spawn = EntityList.createEntityByID(58, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 9:
			spawn = EntityList.createEntityByID(59, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 10:
			spawn = EntityList.createEntityByID(60, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 11:
			spawn = EntityList.createEntityByID(61, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 12:
			spawn = EntityList.createEntityByID(62, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 13:
			spawn = EntityList.createEntityByID(66, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 14:
			spawn = EntityList.createEntityByID(65, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 15:
			spawn = EntityList.createEntityByID(90, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 16:
			spawn = EntityList.createEntityByID(91, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 17:
			spawn = EntityList.createEntityByID(92, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 18:
			spawn = EntityList.createEntityByID(93, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 19:
			spawn = EntityList.createEntityByID(94, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 20:
			spawn = EntityList.createEntityByID(95, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 21:
			spawn = EntityList.createEntityByID(96, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 22:
			spawn = EntityList.createEntityByID(97, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 23:
			spawn = EntityList.createEntityByID(98, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 24:
			spawn = EntityList.createEntityByID(99, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 25:
			spawn = EntityList.createEntityByID(100, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		case 26:
			spawn = EntityList.createEntityByID(120, world);
			spawn.setLocationAndAngles(entity.posX, entity.posY, entity.posZ + 4, world.rand.nextFloat() * 360.0F, 0.0F);
			world.spawnEntityInWorld(spawn);
			break;
		}
	}
}
