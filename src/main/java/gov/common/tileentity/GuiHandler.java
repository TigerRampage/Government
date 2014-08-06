package gov.common.tileentity;

import gov.client.gui.GuiATM;
import gov.reference.GuiList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GuiList.ATM_MENU.ordinal()) {
			TileEntityATM atm = (TileEntityATM) world.getTileEntity(x, y, z);
			return new ContainerATM(atm);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GuiList.ATM_MENU.ordinal()) {
			TileEntityATM atm = (TileEntityATM) world.getTileEntity(x, y, z);
			return new GuiATM(atm);
		}
		return null;
	}

}
