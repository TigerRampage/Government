package gov.reference;

import net.minecraft.util.ResourceLocation;
import gov.common.core.GovData;
import gov.common.core.ResourceFinder;

public class Textures {
	
	public static final String RESOURCE_PREFIX = GovData.modID.toLowerCase() + ":";
	
	public static final class Entity {
		public static final String ENTITY_LOCATION = "/textures/entity/";
		public static final ResourceLocation TELLER = ResourceFinder.getResourceLocation(ENTITY_LOCATION + "teller.png");
	}
	
	public static final class Block {
		public static final String BLOCK_LOCATION = "/textures/block/";
	}
	
	public static final class Item {
		public static final String ITEM_LOCATION = "/textures/item/";
	}
	
}
