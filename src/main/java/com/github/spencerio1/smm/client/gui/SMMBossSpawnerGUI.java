package com.github.spencerio1.smm.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.github.spencerio1.smm.SpenceriosModMod;
import com.github.spencerio1.smm.common.gui.SMMBossSpawnerContainer;
import com.github.spencerio1.smm.helper.LocalizationHelper;
import com.github.spencerio1.smm.lib.ModInfo;

public class SMMBossSpawnerGUI extends GuiContainer
{
	private EntityPlayer entity = SpenceriosModMod.proxy.getClientPlayer();

	public SMMBossSpawnerGUI()
	{
		super(new SMMBossSpawnerContainer());

		xSize = 256;
		ySize = 36;
	}

	private static final ResourceLocation background = new ResourceLocation(ModInfo.MODID, "textures/gui/background_bossSpawner.png");

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

		buttonList.add(new GuiButton(0, guiLeft + 8, guiTop + 8, 117, 20, LocalizationHelper.localize("entity.WitherBoss.name")));
		buttonList.add(new GuiButton(1, guiLeft + 131, guiTop + 8, 117, 20, LocalizationHelper.localize("entity.EnderDragon.name")));
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		World world = SpenceriosModMod.proxy.getServerWorld(entity.worldObj.provider.dimensionId);
		Entity spawn;
		switch(button.id){
			case 0:
				spawn = EntityList.createEntityByID(64, world);
				spawn.setLocationAndAngles(entity.posX, entity.posY + 20, entity.posZ, world.rand.nextFloat() * 360.0F, 0.0F);
				world.spawnEntityInWorld(spawn);
				break;
			case 1:
				spawn = EntityList.createEntityByID(63, world);
				spawn.setLocationAndAngles(entity.posX, entity.posY + 20, entity.posZ, world.rand.nextFloat() * 360.0F, 0.0F);
				world.spawnEntityInWorld(spawn);
				break;
		}
	}
}
