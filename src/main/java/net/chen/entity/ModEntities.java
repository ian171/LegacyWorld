package net.chen.entity;

import net.chen.LegacyWorld;
import net.chen.entity.custom.MantisEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MantisEntity> MANTIS = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(LegacyWorld.MOD_ID, "mantis"),
            EntityType.Builder.create(MantisEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f, 2.5f).build());


    public static void registerModEntities() {
        LegacyWorld.LOGGER.info("Registering Mod Entities for " + LegacyWorld.MOD_ID);
    }
}
