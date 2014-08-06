package gov.proxy;

import gov.client.core.ClientSoundHelper;
import gov.client.gui.IngameOverlay;
import gov.client.render.RenderTeller;
import gov.common.entity.EntityTeller;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {

	@Override
	public void renderEntities() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTeller.class, new RenderTeller());
	}

	@Override
	public void playSound(String soundName, float x, float y, float z, float volume, float pitch) {
		ClientSoundHelper.playSound(soundName, x, y, z, volume, pitch);
	}

	@Override
	public File getMinecraftDir() {
		return Minecraft.getMinecraft().mcDataDir;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerOverlay() {
		MinecraftForge.EVENT_BUS.register(new IngameOverlay());
	}
}