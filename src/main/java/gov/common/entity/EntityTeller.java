package gov.common.entity;

import gov.common.core.GovCore;
import gov.common.core.GuiList;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTeller extends EntityCreature {

	private EntityPlayer currentCustomer;
	
	public EntityTeller(World w) {
		super(w);
		this.setSize(0.6F, 1.8F);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIServePlayer(this));
		this.tasks.addTask(1, new EntityAILookAtCustomer(this));
		this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.6D));
		this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
		this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityTeller.class, 5.0F, 0.02F));
        this.tasks.addTask(9, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
	}
	
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
    }

    @Override
    public boolean isAIEnabled()
    {
        return true;
    }
    
    @Override
    public void updateAITick() {
    	super.updateAITick();
    }
    
    @Override
    public boolean interact(EntityPlayer ep) {
    	if (this.isEntityAlive() && !this.isServingCustomer() && !ep.isSneaking()) {
    		if (!this.worldObj.isRemote) {
    			this.setCustomer(ep);
    			ep.openGui(GovCore.instance, GuiList.TELLER_MENU, this.worldObj, 0, 0, 0);
    		}
    		return true;
    	}
    	else {
    		return super.interact(ep);
    	}
    }
    
    @Override
    protected void entityInit()
    {
        super.entityInit();
//        this.dataWatcher.addObject(16, Integer.valueOf(0));
    }
    
    @Override
    protected boolean canDespawn()
    {
        return false;
    }
    
    @Override
    protected String getLivingSound()
    {
        return this.isServingCustomer() ? "mob.villager.haggle" : "mob.villager.idle";
    }

    @Override
    protected String getHurtSound()
    {
        return "mob.villager.hit";
    }

    @Override
    protected String getDeathSound()
    {
        return "mob.villager.death";
    }
	
	public boolean isServingCustomer() {
		return this.currentCustomer != null;
	}
	
	public EntityPlayer getCustomer() {
		return this.currentCustomer;
	}
	
	public void setCustomer(EntityPlayer ep) {
		this.currentCustomer = ep;
	}
	
	@Override
	public boolean allowLeashing()
    {
        return false;
    }

}