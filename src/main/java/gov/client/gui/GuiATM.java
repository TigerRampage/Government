package gov.client.gui;

import gov.common.tileentity.TileEntityATM;
import gov.reference.Names;
import gov.reference.Textures;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiATM extends GuiScreen {
	private static final ResourceLocation atmGui = Textures.Gui.ATM_MENU;
	private TileEntityATM tileEntityATM;
	
	public GuiATM(TileEntityATM atm) {
		super();
		this.tileEntityATM = atm;
	}
	
	@Override
	public void initGui() {
		this.buttonList.clear();
		byte b0 = -16;
		this.buttonList.add(new GuiButton(1, this.width / 2 - 57, this.height / 2 - 50, 114, 20, StatCollector.translateToLocal(Names.Container.ATM_DEPOSIT)));
		this.buttonList.add(new GuiButton(2, this.width / 2 - 57, this.height / 2 - 10, 114, 20, StatCollector.translateToLocal(Names.Container.ATM_WITHDRAWAL)));
		this.buttonList.add(new GuiButton(3, this.width / 2 - 57, this.height / 2 + 30, 114, 20, StatCollector.translateToLocal(Names.Container.ATM_LOG)));
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		super.actionPerformed(button);
//		if (!button.enabled) {
//			return;
//		}
//		
//		switch (button.id) {
//			case 1:
//		}
	}
	
	@Override
	public void drawDefaultBackground() {
		super.drawDefaultBackground();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(atmGui);
		int i = (this.width - 134) / 2;
		int j = (this.height - 166) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, 134, 166);
	}
	
	@Override
	public void drawScreen(int x, int y, float z) {
		this.drawDefaultBackground();
		int k = (this.width - 134) / 2 + 10;
		int l = (this.height - 166) / 2 + 8;
		this.fontRendererObj.drawString(StatCollector.translateToLocal(Names.Container.ATM_TITLE), k, l, 2039583);
		super.drawScreen(x, y, z);
	}
}
