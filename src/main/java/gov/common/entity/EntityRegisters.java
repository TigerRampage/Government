package gov.common.entity;

import net.minecraft.entity.EntityList;
import gov.common.core.GovCore;
import gov.reference.Names;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityRegisters {
	public static void registerEntities() {
		int tellerBg = 0;
		int tellerFg = (255 << 16) + (255 << 8) + 255;
		int entityid = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(EntityTeller.class, Names.Entity.TELLER, entityid);
		EntityRegistry.registerModEntity(EntityTeller.class, Names.Entity.TELLER, entityid, GovCore.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityid), new EntityList.EntityEggInfo(entityid, tellerBg, tellerFg));
	}
}
