package gov.common.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerATM extends Container {

	private TileEntityATM tileEntityATM;
	
	public ContainerATM(TileEntityATM tileEntity) {
		this.tileEntityATM = tileEntity;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		return true;
	}

}
