package gov.client.core;

import gov.common.core.ResourceFinder;
import net.minecraft.client.audio.PositionedSoundRecord;
import cpw.mods.fml.client.FMLClientHandler;

public class ClientSoundHelper {
	public static void playSound(String soundName, float x, float y, float z, float volume, float pitch) {
		FMLClientHandler.instance().getClient().getSoundHandler().playSound(new PositionedSoundRecord(ResourceFinder.getResourceLocation(soundName), volume, pitch, x, y, z));
	}
}
