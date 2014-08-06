package gov.common.network;

import gov.common.player.MoneyStats;
import gov.common.player.StatHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

public class InitClientWorldPacket extends GovPacket {

	private float money;
	
	public InitClientWorldPacket(EntityPlayer player) {
		MoneyStats ms = StatHandler.getPlayerMoneyStats(player);
		ms.writeNBT(player.getEntityData());
		this.money = ms.getMoney();
	}
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		buffer.writeFloat(this.money);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
		this.money = buffer.readFloat();
	}

	@Override
	public void handleClientSide(EntityPlayer player) {
		MoneyStats ms = StatHandler.getPlayerMoneyStats(player);
		ms.playerMoney = this.money;
	}

	@Override
	public void handleServerSide(EntityPlayer player) {
		
	}

}
