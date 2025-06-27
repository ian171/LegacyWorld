package net.chen.blocks;

import com.mojang.serialization.Codec;
import net.chen.LegacyWorld;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

@Deprecated
public final class ModOreFeatures extends OreFeature {
    public ModOreFeatures(Codec<OreFeatureConfig> codec) {
        super(codec);
    }
}
