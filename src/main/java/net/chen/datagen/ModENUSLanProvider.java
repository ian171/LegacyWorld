package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.blocks.ModBlockEntities;
import net.chen.items.ModItem;
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
        translationBuilder.add(ModBlock.COOPER_ORE,"铜矿石");
        translationBuilder.add("item.legacyworld.copper_sword","铜剑");
        translationBuilder.add("item.legacyworld.iron_sword","铁剑");
        translationBuilder.add("item.legacyworld.raw_zinc","粗锌");
        translationBuilder.add("item.legacyworld.zinc_ingot","锌锭");
        translationBuilder.add("item.legacyworld.zinc_stone","锌石");
        translationBuilder.add("block.legacyworld.zinc_ore","锌矿石");
        translationBuilder.add("item.legacyworld.raw_nickel","粗镍");
        translationBuilder.add(ModItem.NICKEL_INGOT,"镍锭");
        translationBuilder.add(ModItem.NICKEL_STONE,"镍石");
        //translationBuilder.add("block.legacyworld.nickel_ore","镍矿石");
        translationBuilder.add(ModBlock.ORE_WASHER,"洗矿机");
        translationBuilder.add(ModItem.Sulfur,"硫磺");
        translationBuilder.add(ModBlock.SULFUR_ORE,"硫磺矿石");

        translationBuilder.add(ModItem.SULPHURIC_ACID_BOTTLE,"硫酸瓶");
        translationBuilder.add(ModItem.GLASS_BUKKIT,"玻璃杯");
        translationBuilder.add(ModBlock.H2SO4,"硫酸");
        translationBuilder.add(ModBlock.Small_Chest,"small chest");
        translationBuilder.add("container.chen.small_chest","小容器");
        translationBuilder.add(ModItem.Saltpeter,"硝石");
        translationBuilder.add(ModItem.Solvent,"助溶剂");
        translationBuilder.add(ModItem.TIN_INGOT,"锡锭");
        translationBuilder.add(ModItem.TIN_STONE,"锡石");
        translationBuilder.add(ModItem.RAW_TIN,"锡矿石");
        translationBuilder.add(ModBlock.FURNACE,"熔炉");
        translationBuilder.add(ModBlock.MARIJUANA,"大麻");
        translationBuilder.add(ModItem.BROKEN_STICK,"断棍");
        translationBuilder.add(ModItem.THICK_STICK,"粗棍");
    }
}
