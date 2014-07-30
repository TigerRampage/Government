package gov.client.core;

import gov.client.render.RenderTeller;
import gov.common.core.ServerProxy;
import gov.common.entity.EntityTeller;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy {

	@Override
	public void renderEntities() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTeller.class, new RenderTeller());
	}
	
}