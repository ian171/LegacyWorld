package net.chen.world.generation;

import net.chen.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generation(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DRIFTWOOD_PLACED_KEY);
    }
}
