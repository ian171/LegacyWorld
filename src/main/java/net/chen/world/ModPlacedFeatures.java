package net.chen.world;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.world.generation.ModOrePlacement;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zink_ore_placed");
    public static final RegistryKey<PlacedFeature> COAL_ORE_PLACED_KEY = registerKey("coal_ore_placed");
    public static final RegistryKey<PlacedFeature> DRIFTWOOD_PLACED_KEY = registerKey("driftwood_placed");
    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context,ZINC_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.ZINK),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80),
                                YOffset.fixed(80))));
        register(context,COAL_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.COAL),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-70),
                                YOffset.fixed(70))));
        register(context,DRIFTWOOD_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.DRIFTWOOD_KEY), VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(2,0.1f,2), ModBlock.DRIFTWOOD_SAPLING
        ));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(LegacyWorld.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
