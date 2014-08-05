package gov.common.block;

import gov.reference.GovData;
import gov.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(GovData.modID)
public class BlockList {

	public static final GovBlock ATM = new ATM();
	
	public static void initBlocks() {
		GameRegistry.registerBlock(ATM, Names.Block.ATM);
	}
	
}
