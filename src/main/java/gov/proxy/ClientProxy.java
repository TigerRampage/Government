package gov.proxy;

import gov.client.core.ClientSoundHelper;
import gov.client.render.RenderTeller;
import gov.common.entity.EntityTeller;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void renderEntities() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTeller.class, new RenderTeller());
	}

	@Override
	public void playSound(String soundName, float x, float y, float z, float volume, float pitch) {
		ClientSoundHelper.playSound(soundName, x, y, z, volume, pitch);
	}
}