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
import com.github.spencerio1.smm.common.gui.SMMCustomSpawnerContainer;
import com.github.spencerio1.smm.helper.LocalizationHelper;
import com.github.spencerio1.smm.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SMMCustomSpawnerGUI extends GuiContainer
{
	private EntityPlayer entity = SpenceriosModMod.proxy.getClientPlayer();

	public SMMCustomSpawnerGUI()
	{
		super(new SMMCustomSpawnerContainer());

		xSize = 256;
		ySize = 256;
	}

	private static final ResourceLocation background = new ResourceLocation(ModInfo.MODID, "textures/gui/background_customSpawner.png");

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

		buttonList.add(new GuiButton(0, guiLeft + 8, guiTop + 8, 76, 20, LocalizationHelper.localize("entity.Creeper.name")));
		buttonList.add(new GuiButton(1, guiLeft + 89, guiTop + 8, 76, 20, LocalizationHelper.localize("entity.Skeleton.name")));
		buttonList.add(new GuiButton(2, guiLeft + 170, guiTop + 8, 76, 20, LocalizationHelper.localize("entity.Spider.name")));
		buttonList.add(new GuiButton(3, guiLeft + 8, guiTop + 34, 76, 20, LocalizationHelper.localize("entity.Giant.name")));
		buttonList.add(new GuiButton(4, guiLeft + 89, guiTop + 34, 76, 20, LocalizationHelper.localize("entity.Zombie.name")));
		buttonList.add(new GuiButton(5, guiLeft + 170, guiTop + 34, 76, 20, LocalizationHelper.localize("entity.Slime.name")));
		buttonList.add(new GuiButton(6, guiLeft + 8, guiTop + 60, 76, 20, LocalizationHelper.localize("entity.Ghast.name")));
		buttonList.add(new GuiButton(7, guiLeft + 89, guiTop + 60, 76, 20, LocalizationHelper.localize("entity.PigZombie.name")));
		buttonList.add(new GuiButton(8, guiLeft + 170, guiTop + 60, 76, 20, LocalizationHelper.localize("entity.Enderman.name")));
		buttonList.add(new GuiButton(9, guiLeft + 8, guiTop + 86, 76, 20, LocalizationHelper.localize("entity.CaveSpider.name")));
		buttonList.add(new GuiButton(10, guiLeft + 89, guiTop + 86, 76, 20, LocalizationHelper.localize("entity.Silverfish.name")));
		buttonList.add(new GuiButton(11, guiLeft + 170, guiTop + 86, 76, 20, LocalizationHelper.localize("entity.Blaze.name")));
		buttonList.add(new GuiButton(12, guiLeft + 8, guiTop + 112, 76, 20, LocalizationHelper.localize("entity.LavaSlime.name")));
		buttonList.add(new GuiButton(13, guiLeft + 89, guiTop + 112, 76, 20, LocalizationHelper.localize("entity.Witch.name")));
		buttonList.add(new GuiButton(14, guiLeft + 170, guiTop + 112, 76, 20, LocalizationHelper.localize("entity.Bat.name")));
		buttonList.add(new GuiButton(15, guiLeft + 8, guiTop + 138, 76, 20, LocalizationHelper.localize("entity.Pig.name")));
		buttonList.add(new GuiButton(16, guiLeft + 89, guiTop + 138, 76, 20, LocalizationHelper.localize("entity.Sheep.name")));
		buttonList.add(new GuiButton(17, guiLeft + 170, guiTop + 138, 76, 20, LocalizationHelper.localize("entity.Cow.name")));
		buttonList.add(new GuiButton(18, guiLeft + 8, guiTop + 164, 76, 20, LocalizationHelper.localize("entity.Chicken.name")));
		buttonList.add(new GuiButton(19, guiLeft + 89, guiTop + 164, 76, 20, LocalizationHelper.localize("entity.Squid.name")));
		buttonList.add(new GuiButton(20, guiLeft + 170, guiTop + 164, 76, 20, LocalizationHelper.localize("entity.Wolf.name")));
		buttonList.add(new GuiButton(21, guiLeft + 8, guiTop + 190, 76, 20, LocalizationHelper.localize("entity.MushroomCow.name")));
		buttonList.add(new GuiButton(22, guiLeft + 89, guiTop + 190, 76, 20, LocalizationHelper.localize("entity.SnowMan.name")));
		buttonList.add(new GuiButton(23, guiLeft + 170, guiTop + 190, 76, 20, LocalizationHelper.localize("entity.Ozelot.name")));
		buttonList.add(new GuiButton(24, guiLeft + 8, guiTop + 216, 76, 20, LocalizationHelper.localize("entity.VillagerGolem.name")));
		buttonList.add(new GuiButton(25, guiLeft + 89, guiTop + 216, 76, 20, LocalizationHelper.localize("entity.EntityHorse.name")));
		buttonList.add(new GuiButton(26, guiLeft + 170, guiTop + 216, 76, 20, LocalizationHelper.localize("entity.Villager.name")));
	}

	@Override
	protected void actionPerformed(GuiButton button)
	{
		World world = SpenceriosModMod.proxy.getServerWorld(entity.worldObj.provider.dimensionId);
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
