package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.state.property.Properties;

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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.H2SO4);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.H2SO4_FLOWING);
        blockStateModelGenerator.registerSimpleState(ModBlock.Small_Chest);
        blockStateModelGenerator.registerCrop(ModBlock.MARIJUANA, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
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
            itemModelGenerator.register(ModItem.SULPHURIC_ACID_BOTTLE,Models.GENERATED);
            itemModelGenerator.register(ModItem.GLASS_BUKKIT,Models.GENERATED);
            itemModelGenerator.register(ModItem.Saltpeter,Models.GENERATED);
            itemModelGenerator.register(ModItem.Solvent,Models.GENERATED);
            itemModelGenerator.register(ModItem.TIN_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItem.TIN_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItem.RAW_TIN, Models.GENERATED);
    }
}