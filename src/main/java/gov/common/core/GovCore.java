package gov.common.core;

import gov.common.block.BlockList;
import gov.common.entity.EntityRegisters;
import gov.proxy.CommonProxy;
import gov.proxy.IProxy;
import gov.reference.GovData;
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

	@SidedProxy(clientSide = GovData.clientProxy, serverSide = GovData.serverProxy)
	public static IProxy proxy;

	@Instance(GovData.modID)
	public static GovCore instance = new GovCore();

	@EventHandler
	private void preInit(FMLPreInitializationEvent fmlpie) {
		GovLogger.log(Level.INFO, "===================== " + GovData.modName.toUpperCase() + " " + GovData.version + " LOADING =====================");
		GovLogger.log(Level.INFO, "Thank you for downloading Government! Government is developed by ISQUISHALL, Andy608, dmanzawsome, and ice812.");
		ConfigNPC.setupNPCConfig(fmlpie);
		BlockList.initBlocks();
		EntityRegisters.registerEntities();
		this.proxy.renderEntities();
	}

	@EventHandler
	private void init(FMLInitializationEvent fmlie) {
	}

	@EventHandler
	private void postInit(FMLPostInitializationEvent fmlpie) {

	}

}
