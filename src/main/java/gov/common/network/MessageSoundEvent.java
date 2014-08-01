package gov.common.network;

import java.util.UUID;

import gov.common.core.GovCore;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class MessageSoundEvent implements IMessage, IMessageHandler<MessageSoundEvent, IMessage> {

	private long mostSigUUID, leastSigUUID;
	private String soundName;
	private float x, y, z;
	private float volume, pitch;
	
	public MessageSoundEvent() {}
	
	public MessageSoundEvent(EntityPlayer ep, String soundName, float volume, float pitch) {
		this.mostSigUUID = ep.getUniqueID().getMostSignificantBits();
		this.leastSigUUID = ep.getUniqueID().getLeastSignificantBits();
		this.soundName = soundName;
		this.x = (float) ep.posX;
		this.y = (float) ep.posY;
		this.z = (float) ep.posZ;
		this.volume = volume;
		this.pitch = pitch;
	}
	
	public MessageSoundEvent(String soundName, float x, float y, float z, float volume, float pitch) {
		this.mostSigUUID = 0;
		this.leastSigUUID = 0;
		this.soundName = soundName;
		this.x = x;
		this.y = y;
		this.z = z;
		this.volume = volume;
		this.pitch = pitch;
	}
	
	@Override
	public void fromBytes(ByteBuf byteBuf) {
		this.mostSigUUID = byteBuf.readLong();
        this.leastSigUUID = byteBuf.readLong();
        int soundNameLength = byteBuf.readInt();
        this.soundName = new String(byteBuf.readBytes(soundNameLength).array());
        this.x = byteBuf.readFloat();
        this.y = byteBuf.readFloat();
        this.z = byteBuf.readFloat();
        this.volume = byteBuf.readFloat();
        this.pitch = byteBuf.readFloat();
	}

	@Override
	public void toBytes(ByteBuf byteBuf) {
		byteBuf.writeLong(mostSigUUID);
        byteBuf.writeLong(leastSigUUID);
        byteBuf.writeInt(soundName.length());
        byteBuf.writeBytes(soundName.getBytes());
        byteBuf.writeFloat(x);
        byteBuf.writeFloat(y);
        byteBuf.writeFloat(z);
        byteBuf.writeFloat(volume);
        byteBuf.writeFloat(pitch);
	}

	@Override
	public IMessage onMessage(MessageSoundEvent event, MessageContext context) {
        GovCore.proxy.playSound(event.soundName, event.x, event.y, event.z, event.volume, event.pitch);
        return null;
	}

}
