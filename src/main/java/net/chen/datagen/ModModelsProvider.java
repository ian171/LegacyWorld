package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.blocks.bush.HoneyBerryBushBlock;
import net.chen.blocks.crops.CauliflowerCrops;
import net.chen.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.Optional;

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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlock.COBALT_ORE);
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

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlock.CHAIR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(ModItems.chicken, Models.GENERATED);
            itemModelGenerator.register(ModItems.chisel, Models.GENERATED);
            itemModelGenerator.register(ModItems.IRON_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.IRON_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_IRON, Models.GENERATED);
            itemModelGenerator.register(ModItems.NO_SMOKE_COAL, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_COPPER, Models.GENERATED);
            itemModelGenerator.register(ModItems.COPPER_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.COPPER_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.IRON_SWORD, Models.GENERATED);
            itemModelGenerator.register(ModItems.COPPER_SWORD, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_ZINC, Models.GENERATED);
            itemModelGenerator.register(ModItems.ZINC_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.ZINC_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_NICKEL, Models.GENERATED);
            itemModelGenerator.register(ModItems.NICKEL_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.NICKEL_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
            itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.LEAD_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
            itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.SILVER_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);
            itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.TUNGSTEN_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_COBALT, Models.GENERATED);
            itemModelGenerator.register(ModItems.COBALT_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.COBALT_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.Sulfur,Models.GENERATED);
            itemModelGenerator.register(ModItems.SULPHURIC_ACID_BOTTLE,Models.GENERATED);
            itemModelGenerator.register(ModItems.GLASS_BUKKIT,Models.GENERATED);
            itemModelGenerator.register(ModItems.Saltpeter,Models.GENERATED);
            itemModelGenerator.register(ModItems.Solvent,Models.GENERATED);
            itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
            itemModelGenerator.register(ModItems.TIN_STONE, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
            itemModelGenerator.register(ModItems.BROKEN_STICK, Models.GENERATED);
            itemModelGenerator.register(ModItems.THICK_STICK,Models.GENERATED);
            itemModelGenerator.register(ModItems.MARIJUANA,Models.GENERATED);
            itemModelGenerator.register(ModItems.ALUMINIUM,Models.GENERATED);
            itemModelGenerator.register(ModItems.PHOSPHORUS,Models.GENERATED);
            itemModelGenerator.register(ModItems.MANGANESE,Models.GENERATED);
            itemModelGenerator.register(ModItems.Molybdenum,Models.GENERATED);
            itemModelGenerator.register(ModItems.CAULIFLOWER,Models.GENERATED);
            itemModelGenerator.register(ModItems.MANTIS_SPAWN_EGG,
                    new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        //itemModelGenerator.register(ModItem.MARIJUANA_SEED,Models.GENERATED);
    }
}