package net.chen.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.legacyworld","Legacy World");
        translationBuilder.add("item.legacyworld.chicken","测试食物");
        translationBuilder.add("item.legacyworld.chisel","凿子");
        translationBuilder.add("block.legacyworld.dirty_stone","泥石");
        translationBuilder.add("block.legacyworld.dirty_stone_first","凿刻的泥石");
        translationBuilder.add("sounds.legacyworld.player_run_on_dirty_stone","你在跑");
        translationBuilder.add("item.legacyworld.iron_ingot","铁锭");
        translationBuilder.add("item.legacyworld.iron_stone","铁石");
        translationBuilder.add("item.legacyworld.raw_iron","粗铁");
        translationBuilder.add("block.legacyworld.iron_ore","铁矿石");
        translationBuilder.add("item.legacyworld.no_smoke_coal","无烟煤");
        translationBuilder.add("block.legacyworld.no_smoke_coal_ore","无烟煤矿石");
        translationBuilder.add("item.legacyworld.raw_copper","粗铜");
        translationBuilder.add("item.legacyworld.copper_ingot","铜锭");
        translationBuilder.add("item.legacyworld.copper_stone","铜石");
        translationBuilder.add("block.legacyworld.copper_ore","铜矿石");
        translationBuilder.add("item.legacyworld.copper_sword","铜剑");
        translationBuilder.add("item.legacyworld.iron_sword","铁剑");

    }
}
