package gov.common.block;

import gov.reference.Textures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GovBlock extends Block {

	public GovBlock() {
		this(Material.rock);
	}
	
	public GovBlock(Material m) {
		super(m);
	}
	
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, this.unwrapName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(String.format("%s", unwrapName(this.getUnlocalizedName())));
	}
	
	private String unwrapName(String name) {
		return name.substring(name.indexOf(".") + 1);
	}
}
