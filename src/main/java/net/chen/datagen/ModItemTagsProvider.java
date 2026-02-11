package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.items.ModItems;
import net.chen.tags.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {


    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.IRON_ORES).add(ModItems.IRON_INGOT);
        getOrCreateTagBuilder(ItemTags.IRON_ORES).add(ModItems.IRON_STONE);
        getOrCreateTagBuilder(ModItemTags.RAW_ORES).add(ModItems.RAW_IRON, ModItems.RAW_ZINC, ModItems.RAW_TIN, ModItems.RAW_NICKEL);
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlock.DRIFTWOOD_LOG.asItem())
                .add(ModBlock.DRIFTWOOD_WOOD.asItem())
                .add(ModBlock.STRIPPED_DRIFTWOOD_LOG.asItem())
                .add(ModBlock.STRIPPED_DRIFTWOOD_WOOD.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlock.DRIFTWOOD_PLANKS.asItem());
    }
}