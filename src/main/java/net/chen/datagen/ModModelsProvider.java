package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.DIRTYSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.DIRTYSTONE_FIRST);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.NO_SMOKE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.COOPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.ZINC_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.BIN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.ORE_WASHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.SULFUR_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(ModItem.chicken, Models.GENERATED);
            itemModelGenerator.register(ModItem.chisel, Models.GENERATED);
            itemModelGenerator.register(ModItem.IRON_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItem.IRON_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItem.RAW_IRON, Models.GENERATED);
            itemModelGenerator.register(ModItem.NO_SMOKE_COAL, Models.GENERATED);
            itemModelGenerator.register(ModItem.RAW_COPPER, Models.GENERATED);
            itemModelGenerator.register(ModItem.COPPER_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItem.COPPER_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItem.IRON_SWORD, Models.GENERATED);
            itemModelGenerator.register(ModItem.COPPER_SWORD, Models.GENERATED);
            itemModelGenerator.register(ModItem.RAW_ZINC, Models.GENERATED);
            itemModelGenerator.register(ModItem.ZINC_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItem.ZINC_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItem.RAW_NICKEL, Models.GENERATED);
            itemModelGenerator.register(ModItem.NICKEL_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItem.NICKEL_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItem.Sulfur,Models.GENERATED);


    }
}