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
import net.minecraft.world.gen.feature.*;

import java.lang.module.Configuration;
import java.rmi.registry.Registry;
import java.security.Key;
import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> ZINK = registryKey("zink_ore");
    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stoneReplaceable = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        List<OreFeatureConfig.Target> overworldZinkOres = List.of(OreFeatureConfig.createTarget(stoneReplaceable, ModBlock.ZINC_ORE.getDefaultState()));
        register(context,ZINK,Feature.ORE,new OreFeatureConfig(overworldZinkOres,6));
    }
    public static RegistryKey<ConfiguredFeature<?,?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(LegacyWorld.MOD_ID,name));
    }
    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?,?>> context, RegistryKey<ConfiguredFeature<?,?>> key, F feature, FC configuration){
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}
