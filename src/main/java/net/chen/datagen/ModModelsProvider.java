package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.blocks.bush.HoneyBerryBushBlock;
import net.chen.blocks.crops.CauliflowerCrops;
import net.chen.items.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.BIN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.ORE_WASHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.SULFUR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.H2SO4);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.H2SO4_FLOWING);
        blockStateModelGenerator.registerSimpleState(ModBlock.Small_Chest);
        blockStateModelGenerator.registerCrop(ModBlock.MARIJUANA, Properties.AGE_5, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.FURNACE);
        blockStateModelGenerator.registerCrop(ModBlock.CAULIFLOWER, CauliflowerCrops.AGE,0,1,2,3,4,5,6);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlock.HONEY_BERRY_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED, HoneyBerryBushBlock.AGE,0,1,2,3);
        blockStateModelGenerator.registerLog(ModBlock.DRIFTWOOD_LOG).log(ModBlock.DRIFTWOOD_LOG).wood(ModBlock.DRIFTWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlock.STRIPPED_DRIFTWOOD_LOG).log(ModBlock.STRIPPED_DRIFTWOOD_LOG).wood(ModBlock.STRIPPED_DRIFTWOOD_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.DRIFTWOOD_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlock.DRIFTWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlock.DRIFTWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

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
            itemModelGenerator.register(ModItem.BROKEN_STICK, Models.GENERATED);
            itemModelGenerator.register(ModItem.THICK_STICK,Models.GENERATED);
            itemModelGenerator.register(ModItem.MARIJUANA,Models.GENERATED);
            itemModelGenerator.register(ModItem.ALUMINIUM,Models.GENERATED);
            itemModelGenerator.register(ModItem.PHOSPHORUS,Models.GENERATED);
            itemModelGenerator.register(ModItem.MANGANESE,Models.GENERATED);
            itemModelGenerator.register(ModItem.Molybdenum,Models.GENERATED);
            itemModelGenerator.register(ModItem.CAULIFLOWER,Models.GENERATED);
            //itemModelGenerator.register(ModItem.MARIJUANA_SEED,Models.GENERATED);
    }
}