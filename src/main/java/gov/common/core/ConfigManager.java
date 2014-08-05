package gov.common.core;

import java.util.List;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import scala.actors.threadpool.Arrays;

public class ConfigManager {
	
	public static List<String> retrieveStringList(Configuration config, String category, String item, String[] value, String comment) {
		if (config == null) {
			return Arrays.asList(value);
		}
		
		try {
			Property prop = config.get(category, item, value, comment);
			return Arrays.asList(prop.getStringList());
		} catch (Exception e) {
			GovLogger.log(Level.ERROR, "Could not add String array to configuration file!");
		}
		return Arrays.asList(value);
	}
	
}
