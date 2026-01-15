package net.chen.world.tree;

import net.chen.LegacyWorld;
import net.chen.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerator {
    public static SaplingGenerator DRIFTWOOD = new SaplingGenerator(
            LegacyWorld.MOD_ID + "driftwood",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.DRIFTWOOD_KEY),
            Optional.empty());
}
