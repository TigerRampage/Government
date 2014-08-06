package gov.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class IngameOverlay {
	private FontRenderer fontRenderer = null;
	
	@SubscribeEvent
	public void renderText(RenderGameOverlayEvent.Text event) {
		Minecraft mc = Minecraft.getMinecraft();
		if (!mc.gameSettings.showDebugInfo) {
			EntityPlayer player = mc.thePlayer;
			event.right.add("");
			event.right.add("$5000.00");
		}
	}
}
