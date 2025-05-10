package net.chen.blocks;

import com.mojang.datafixers.types.Type;
import net.chen.LegacyWorld;
import net.chen.blocks.entity.blockentity.SmallChest;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModBlockEntities {
    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(LegacyWorld.MOD_ID, id), builder.build(type));
    }
    public static final BlockEntityType<SmallChest> SMALL_CHEST = create("small_chest", BlockEntityType.Builder.create(SmallChest::new, ModBlock.Small_Chest));
    public static void registerBlockEntities() {
        LegacyWorld.LOGGER.info("Registering Block Entities for Legacy World");
    }
}
