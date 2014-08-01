package gov.common.core;

import net.minecraft.util.ResourceLocation;

public class ResourceFinder {
	public static ResourceLocation getResourceLocation(String path) {
		return new ResourceLocation(GovData.modID.toLowerCase(), path);
	}
}
