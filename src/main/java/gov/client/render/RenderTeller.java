package gov.client.render;

import org.lwjgl.opengl.GL11;

import gov.common.entity.EntityTeller;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTeller extends RenderLiving {

	private static final ResourceLocation farmerVillagerTextures = new ResourceLocation("textures/entity/villager/farmer.png");
	protected ModelVillager villagerModel;
	
	public RenderTeller() {
		super(new ModelVillager(0.0F), 0.5F);
		this.villagerModel = (ModelVillager)this.mainModel;
	}

	protected int shouldRenderPass(EntityTeller et, int i, float f)
    {
        return -1;
    }
	
	public void doRender(EntityTeller p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        super.doRender((EntityLiving)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }
	
	protected void renderEquippedItems(EntityTeller p_77029_1_, float p_77029_2_)
    {
        super.renderEquippedItems(p_77029_1_, p_77029_2_);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity e) {
		return this.farmerVillagerTextures;
	}
	
	@Override
	public void doRender(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        this.doRender((EntityTeller)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }
	
	@Override
	protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_)
    {
		float f1 = 0.9375F;
        this.shadowSize = 0.5F;

        GL11.glScalef(f1, f1, f1);
    }
	
	@Override
	protected void renderEquippedItems(EntityLivingBase p_77029_1_, float p_77029_2_)
    {
        this.renderEquippedItems((EntityVillager)p_77029_1_, p_77029_2_);
    }
	
	@Override
	protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityTeller)p_77032_1_, p_77032_2_, p_77032_3_);
    }
	
	@Override
	public void doRender(EntityLivingBase p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        this.doRender((EntityTeller)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }
	
	@Override
	public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
    {
        this.doRender((EntityTeller)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
    }
}
