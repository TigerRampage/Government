package gov.common.core;

import gov.reference.GovData;
import net.minecraft.util.ResourceLocation;

public class ResourceFinder {
	public static ResourceLocation getResourceLocation(String path) {
		return new ResourceLocation(GovData.modID.toLowerCase(), path);
	}
}
