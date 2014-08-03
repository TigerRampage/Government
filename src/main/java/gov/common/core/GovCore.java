package gov.common.core;

import gov.common.block.BlockList;
import gov.common.entity.EntityRegisters;
import gov.proxy.CommonProxy;
import gov.proxy.IProxy;
import gov.reference.Names;

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

	@SidedProxy(clientSide = "gov.proxy.ClientProxy", serverSide = "gov.proxy.ServerProxy")
	public static IProxy proxy;

	@Instance(GovData.modID)
	public static GovCore instance = new GovCore();

	@EventHandler
	private void preInit(FMLPreInitializationEvent fmlpie) {
		GovLogger.log(Level.INFO, GovData.modName + " Version " + GovData.version + " loading...");
		BlockList.initBlocks();
		EntityRegisters.registerEntities();
		this.proxy.renderEntities();
	}

	@EventHandler
	private void load(FMLInitializationEvent fmlie) {
	}

	@EventHandler
	private void postInit(FMLPostInitializationEvent fmlpie) {

	}

}
