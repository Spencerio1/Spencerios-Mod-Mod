package com.github.spencerio1.smm.client.gui;

import java.awt.Desktop;
import java.net.URI;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.github.spencerio1.smm.common.gui.SMMHelpBlockContainer;
import com.github.spencerio1.smm.helper.LocalizationHelper;
import com.github.spencerio1.smm.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SMMHelpBlockGUI extends GuiContainer
{
	public SMMHelpBlockGUI()
	{
		super(new SMMHelpBlockContainer());

		xSize = 256;
		ySize = 221;
	}

	private static final ResourceLocation background = new ResourceLocation(Reference.MODID, "textures/gui/background_helpBlock.png");

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
		fontRendererObj.drawSplitString(LocalizationHelper.localize("gui.help.message"), 8, 6, 240, 0x404040);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void initGui()
	{
		super.initGui();
		buttonList.clear();

		buttonList.add(new GuiButton(0, guiLeft + 8, guiTop + 166, 116, 20, LocalizationHelper.localize("gui.help.btn.mcreator")));
		buttonList.add(new GuiButton(1, guiLeft + 132, guiTop + 166, 116, 20, LocalizationHelper.localize("gui.help.btn.mcforums")));
		buttonList.add(new GuiButton(2, guiLeft + 8, guiTop + 194, 116, 20, LocalizationHelper.localize("gui.help.btn.curseforge")));
		buttonList.add(new GuiButton(3, guiLeft + 132, guiTop + 194, 116, 20, LocalizationHelper.localize("gui.help.btn.curse")));
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		switch(button.id) {
			case 0:
				try {
					Desktop.getDesktop().browse(new URI("http://mcreator.pylo.si/modification/4837/spencerios-mod-mod"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 1:
				try {
					Desktop.getDesktop().browse(new URI("http://www.minecraftforum.net/topic/2067837-"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					Desktop.getDesktop().browse(new URI("http://minecraft.curseforge.com/mc-mods/spencerios-mod-mod-loads-stuff"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					Desktop.getDesktop().browse(new URI("http://www.curse.com/mc-mods/minecraft/spencerios-mod-mod-loads-stuff"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
		}
	}
}
