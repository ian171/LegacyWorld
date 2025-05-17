package net.chen.datagen;

import net.chen.items.ModItem;
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
        getOrCreateTagBuilder(ItemTags.IRON_ORES).add(ModItem.IRON_INGOT);
        getOrCreateTagBuilder(ItemTags.IRON_ORES).add(ModItem.IRON_STONE);
        getOrCreateTagBuilder(ModItemTags.RAW_ORES).add(ModItem.RAW_IRON, ModItem.RAW_ZINC, ModItem.RAW_TIN, ModItem.RAW_NICKEL);
    }
}