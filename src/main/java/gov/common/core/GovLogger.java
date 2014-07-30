package gov.common.core;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GovLogger {

	private static Logger govLogger = LogManager.getLogger(GovData.modName);
	
	public static void log(Level lev, String str) {
		govLogger.log(lev, str);
	}
	
}
