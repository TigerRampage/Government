package gov.client.gui;

import gov.reference.Textures;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiATM extends GuiScreen {
	private static final ResourceLocation atmGui = Textures.Gui.ATM_MENU;
	
	@Override
	public void initGui() {
		this.buttonList.clear();
		byte b0 = -16;
	}
}
