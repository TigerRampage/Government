package gov.common.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;

public class EntityAILookAtCustomer extends EntityAIWatchClosest {

	private final EntityTeller teller;
	
	public EntityAILookAtCustomer(EntityTeller et) {
		super(et, EntityPlayer.class, 8.0F);
		this.teller = et;
	}
	
	
	@Override
	public boolean shouldExecute() {
		if (this.teller.isServingCustomer()) {
			this.closestEntity = this.teller.getCustomer();
			return true;
		}
		else {
			return false;
		}
	}
}
