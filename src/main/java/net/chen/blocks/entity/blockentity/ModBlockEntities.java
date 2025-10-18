package net.chen.blocks.entity.blockentity;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static BlockEntityType<ModFurnaceBlockEntity> MOD_FURNACE_ENTITY;

    public static void registerAllBlockEntities() {

        MOD_FURNACE_ENTITY = Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(LegacyWorld.MOD_ID, "furnace"),
                FabricBlockEntityTypeBuilder.create(
                        ModFurnaceBlockEntity::new,   // 👈 方块实体构造器
                        ModBlock.FURNACE            // 👈 对应方块
                ).build(null)
        );
    }
}
