package gov.common.block;

import gov.common.core.GovCore;
import gov.common.tileentity.TileEntityATM;
import gov.reference.GuiList;
import gov.reference.Names;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ATM extends GovBlock implements ITileEntityProvider {
	
	public ATM() {
		super();
		this.setHardness(200.0F);
		this.setResistance(2000.0F);
		this.setLightLevel(0.7F);
		this.setBlockName(Names.Block.ATM);
	}

	@Override
	public TileEntity createNewTileEntity(World w, int meta) {
		return new TileEntityATM();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		if (player.isSneaking()) {
			return false;
		}
		else {
			if (!world.isRemote) {
				if (world.getTileEntity(x, y, z) instanceof TileEntityATM) {
					TileEntityATM tileEntity = (TileEntityATM) world.getTileEntity(x, y, z);
					player.openGui(GovCore.instance, GuiList.ATM_MENU.ordinal(), world, x, y, z);
				}
			}
			return true;
		}
	}
}
