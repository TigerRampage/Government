package gov.common.network;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.network.NetworkRegistry;

public class NetworkSoundHelper {
	public static void playSoundAt(EntityPlayer ep, String soundName, float volume, float pitch) {
		playSoundAt(ep, soundName, volume, pitch, 32.0D);
	}
	
	public static void playSoundAt(EntityPlayer ep, String soundName, float volume, float pitch, double range) {
		PacketHandler.INSTANCE.sendToAllAround(new MessageSoundEvent(ep, soundName, volume, pitch), new NetworkRegistry.TargetPoint(ep.worldObj.provider.dimensionId, ep.posX, ep.posY, ep.posZ, range));
	}
}
