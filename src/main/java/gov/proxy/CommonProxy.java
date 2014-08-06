package gov.proxy;

import gov.common.tileentity.TileEntityATM;
import gov.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;


public abstract class CommonProxy implements IProxy {
	
	@Override
	public void registerTileEntities() {
		GameRegistry.registerTileEntityWithAlternatives(TileEntityATM.class, Names.Block.ATM, "tile." + Names.Block.ATM);
	}
}
