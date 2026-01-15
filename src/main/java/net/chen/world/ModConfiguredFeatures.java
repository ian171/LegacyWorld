package net.chen.world;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.lang.module.Configuration;
import java.rmi.registry.Registry;
import java.security.Key;
import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> ZINK = registryKey("zink_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> COAL = registryKey("coal_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DRIFTWOOD_KEY = registryKey("driftwood");
    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest coalRepalceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        List<OreFeatureConfig.Target> overworldZinkOres = List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlock.ZINC_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCoalOres = List.of(OreFeatureConfig.createTarget(coalRepalceable,ModBlock.NO_SMOKE_COAL_ORE.getDefaultState()));
        register(context,ZINK,Feature.ORE,new OreFeatureConfig(overworldZinkOres,6));
        register(context,COAL,Feature.ORE,new OreFeatureConfig(overworldCoalOres,12));

        register(context, DRIFTWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlock.DRIFTWOOD_LOG),
                new StraightTrunkPlacer(5, 6, 3),

                BlockStateProvider.of(ModBlock.DRIFTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }
    public static RegistryKey<ConfiguredFeature<?,?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(LegacyWorld.MOD_ID,name));
    }
    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context, RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration){
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}
