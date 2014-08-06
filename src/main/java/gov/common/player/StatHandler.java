package gov.common.player;

import net.minecraft.entity.player.EntityPlayer;

public class StatHandler {
	public static MoneyStats getPlayerMoneyStats(EntityPlayer player) {
		MoneyStats ms = new MoneyStats(player);
		ms.readNBT(player.getEntityData());
		return ms;
	}
	
	public static void setPlayerMoneyStats(EntityPlayer player, MoneyStats ms) {
		ms.writeNBT(player.getEntityData());
	}
	
}
