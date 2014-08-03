package gov.common.block;

import gov.reference.Names;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ATM extends GovBlock implements ITileEntityProvider {
	
	public ATM() {
		super();
		this.setHardness(200.0F);
		this.setResistance(2000.0F);
		this.setBlockName(Names.Block.ATM);
	}

	@Override
	public TileEntity createNewTileEntity(World w, int meta) {
		return null;
	}
}
