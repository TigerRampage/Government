package gov.common.tab;

import gov.common.block.BlockList;
import gov.reference.GovData;
import gov.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class GovTabs {

	public static final CreativeTabs GOV_MACH_TAB = new CreativeTabs(Names.Tab.MACHINE_TAB) {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlockList.ATM); 
		}
	};
}
