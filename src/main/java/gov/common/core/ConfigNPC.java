package gov.common.core;

import gov.reference.Files;

import java.io.File;

import org.apache.logging.log4j.Level;

import scala.actors.threadpool.Arrays;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigNPC {

	public static final String NAMES_CAT = "NPC_Names";
	private static final String[] NAMES = new String[] {
			"Andrew", "Alex", "Devin",
			"Peter", "Paul", "Sarah", "Bob", "Bobby", "Robert", "Scott",
			"Charisse", "Shanna", "Shenaynay", "Barack", "Hussein",
			"Rhohandra", "Shaytanya", "Trianelly", "Dayquan", "Akon", "Azure",
			"Kwame", "Shaniqua", "Latifah", "Vlantalamanamanisha",
			"Dequayquay", "Tyrone", "Kanye", "Latoya", "Laquisha", "Bonifa",
			"Shataniana", "Kisha", "Boeton", "Gon", "Killua", "Kurapika",
			"Gang", "Vladamir", "Jesus", "Marco", "Maria", "Helen", "Jody",
			"Kemsit", "Ra", "Shona", "Leone", "Annarae", "Boquiqui", "Paris",
			"Watermelondra", "Virgo", "Terri", "Luna", "Teddy", "Cosmo",
			"Carly", "Zoey", "Riley"
	};
	
	public static void setupNPCConfig(FMLPreInitializationEvent event) {
		Configuration config;
		
		GovLogger.log(Level.INFO, "Loading Government NPC configuration file...");
		try {
			config = new Configuration(new File(GovCore.proxy.getMinecraftDir(), Files.npcConfigFilePath));
			config.load();
		} catch (Exception e) {
			GovLogger.log(Level.ERROR, "Government NPC config file could not be loaded! Try deleting the config file, then restart MC so we can create a working file.");
			config = null;
		}
		
		GovSettings.npcNames = ConfigManager.retrieveStringList(config, NAMES_CAT, "nameList", NAMES, "Possible names that NPCs can have. Upon spawning, every NPC (within this mod of course) is assigned a random name from this list. Add your own!");
		
		if (config != null) {
			config.save();
		}
	}
	
}
