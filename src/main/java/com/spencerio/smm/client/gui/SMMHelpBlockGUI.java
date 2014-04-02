package com.spencerio.smm.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.spencerio.smm.lib.GuiStrings;
import com.spencerio.smm.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SMMHelpBlockGUI extends GuiContainer
{
	public SMMHelpBlockGUI()
	{
		super(new SMMHelpBlockContainer());
		
		xSize = 256;
		ySize = 171;
	}
	
	private static final ResourceLocation background = new ResourceLocation(Reference.MODID, "textures/gui/background.png");

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int z, int y)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(background);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
	{
		fontRendererObj.drawSplitString(GuiStrings.HELP_BLOCK_MESSAGE, 8, 6, 240, 0x404040);
	}
}
