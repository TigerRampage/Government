package gov.reference;

import net.minecraft.util.ResourceLocation;
import gov.common.core.ResourceFinder;

public class Textures {
	
	public static final String RESOURCE_PREFIX = GovData.modID.toLowerCase() + ":";
	
	public static final class Entity {
		public static final String ENTITY_LOCATION = "/textures/entity/";
		public static final ResourceLocation TELLER = ResourceFinder.getResourceLocation(ENTITY_LOCATION + "teller.png");
	}
	
	public static final class Gui {
		public static final String GUI_LOCATION = "/textures/gui/";
		public static final ResourceLocation ATM_MENU = ResourceFinder.getResourceLocation(GUI_LOCATION + "atm_background.png");
	}
}
