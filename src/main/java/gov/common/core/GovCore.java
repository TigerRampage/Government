package gov.common.core;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GovData.modID, name = GovData.modName, version = GovData.version)
public class GovCore {

	@SidedProxy(clientSide = "gov.client.core.ClientProxy", serverSide = "gov.common.core.ServerProxy")
	public static ServerProxy proxy;

	@Instance(GovData.modID)
	public static GovCore instance = new GovCore();

	@EventHandler
	private void preInit(FMLPreInitializationEvent fmlpie) {
		GovLogger.log(Level.INFO, GovData.modName + " Version " + GovData.version + " loading...");
		this.registerEntities();
		this.render();
	}

	public void registerEntities() {
		EntityRegisters.registerEntities(new EntityNames());
	}

	public void render() {
		this.proxy.renderEntities();
	}

	@EventHandler
	private void load(FMLInitializationEvent fmlie) {
	}

	@EventHandler
	private void postInit(FMLPostInitializationEvent fmlpie) {

	}

}
