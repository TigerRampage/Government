package gov.proxy;

import java.io.File;

public interface IProxy {

	/**
	 * Assign all entity classes (keys) to their respective render classes (values). Client side.
	 */
	public abstract void renderEntities();
	
	/**
	 * Play a sound.
	 * @param soundName Name of sound
	 * @param x X coord to play at
	 * @param y Y coord to play at
	 * @param z Z coord to play at
	 * @param volume Volume of sound
	 * @param pitch Pitch of sound
	 */
	public abstract void playSound(String soundName, float x, float y, float z, float volume, float pitch);
	
	/**
	 * Retrieve the Minecraft directory
	 */
	public abstract File getMinecraftDir();
	
	public abstract void registerTileEntities();
	
	public abstract void registerOverlay();
}
