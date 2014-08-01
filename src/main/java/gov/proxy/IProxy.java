package gov.proxy;

public interface IProxy {

	/**
	 * Assign all entity classes (keys) to their respective render classes (values). Client side.
	 */
	public abstract void renderEntities();
	
	/**
	 * Play a sound.
	 * @param soundName 
	 * @param x
	 * @param y
	 * @param z
	 * @param volume
	 * @param pitch
	 */
	public abstract void playSound(String soundName, float x, float y, float z, float volume, float pitch);
}
