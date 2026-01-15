package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.DIRT).add(ModBlock.DIRTYSTONE);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlock.DRIFTWOOD_LOG)
                .add(ModBlock.DRIFTWOOD_WOOD)
                .add(ModBlock.STRIPPED_DRIFTWOOD_LOG)
                .add(ModBlock.STRIPPED_DRIFTWOOD_WOOD);
    }
}
