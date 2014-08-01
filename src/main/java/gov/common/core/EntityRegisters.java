package gov.common.core;

import net.minecraft.entity.EntityList;
import gov.common.entity.EntityTeller;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityRegisters {
	public static void registerEntities(EntityNames en) {
		int tellerBg = 100 << 8;
		int tellerFg = (124 << 16) + (252 << 8);
		int entityid = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityTeller.class, en.TELLER, entityid);
		EntityRegistry.registerModEntity(EntityTeller.class, en.TELLER, entityid, GovCore.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityid), new EntityList.EntityEggInfo(entityid, tellerBg, tellerFg));
	}
}
