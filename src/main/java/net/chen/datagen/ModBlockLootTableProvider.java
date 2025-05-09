package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        oreDrops(ModBlock.IRON_ORE, ModItem.IRON_STONE);
        addDrop(ModBlock.DIRTYSTONE_FIRST);
        oreDrops(ModBlock.NO_SMOKE_COAL_ORE,ModItem.NO_SMOKE_COAL);
        oreDrops(ModBlock.COOPER_ORE,ModItem.COPPER_STONE);
    }
}
