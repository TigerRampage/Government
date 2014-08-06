package gov.common.player;

import gov.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class MoneyStats {
	
	public float playerMoney = 500.00F;
	public EntityPlayer player;
	
	public MoneyStats(EntityPlayer player) {
		this.player = player;
	}
	
	public void giveMoney(float amount) {
		this.playerMoney += amount;
	}
	
	public void takeMoney(float amount) {
		this.playerMoney -= amount;
	}
	
	public float getMoney() {
		return this.playerMoney;
	}
	
	public boolean hasMoney() {
		return this.playerMoney > 0.0F;
	}
	
	public void stripMoney() {
		this.playerMoney = 0.0F;
	}
	
	public void readNBT(NBTTagCompound nbt) {
		if (nbt.hasKey(Names.NBT.GOV_MONEY_COMPOUND)) {
			NBTTagCompound money = nbt.getCompoundTag(Names.NBT.GOV_MONEY_COMPOUND);
			this.playerMoney = money.getFloat(Names.NBT.GOV_MONEY);
		}
	}
	
	public void writeNBT(NBTTagCompound nbt) {
		NBTTagCompound money = new NBTTagCompound();
		money.setFloat(Names.NBT.GOV_MONEY, this.playerMoney);
	}
	
}
