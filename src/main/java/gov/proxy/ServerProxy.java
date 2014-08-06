package gov.proxy;

import java.io.File;

import cpw.mods.fml.common.FMLCommonHandler;

public class ServerProxy extends CommonProxy {

	@Override
	public void renderEntities() {}

	@Override
	public void playSound(String soundName, float x, float y, float z, float volume, float pitch) {}

	@Override
	public File getMinecraftDir() {
		return FMLCommonHandler.instance().getMinecraftServerInstance().getFile("");
	}

	@Override
	public void registerOverlay() {}
}
