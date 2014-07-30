package gov.common.entity;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class EntityAIServePlayer extends EntityAIBase {

	private EntityTeller teller;
	
	public EntityAIServePlayer(EntityTeller et) {
		this.teller = et;
		this.setMutexBits(5);
	}
	
	@Override
	public boolean shouldExecute() {
		if (!this.teller.isEntityAlive()) {
			return false;
		}
		else if (this.teller.isInWater()) {
			return false;
		}
		else if (!this.teller.onGround) {
			return false;
		}
		else if (this.teller.velocityChanged) {
			return false;
		}
		else {
			EntityPlayer ep = this.teller.getCustomer();
			return ep == null ? false : (this.teller.getDistanceSqToEntity(ep) > 16.0D ? false : ep.openContainer instanceof Container);
		}
			
	}

	@Override
	public void startExecuting() {
		this.teller.getNavigator().clearPathEntity();
	}
	
	@Override
	public void resetTask() {
		this.teller.setCustomer((EntityPlayer)null);
	}
	
}
