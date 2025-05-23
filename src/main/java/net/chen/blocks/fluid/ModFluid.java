package net.chen.blocks.fluid;

import net.chen.LegacyWorld;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluid {
    private static <T extends Fluid> T register(String id, T value) {
        return Registry.register(Registries.FLUID, Identifier.of(LegacyWorld.MOD_ID, id), value);
    }

    static {
        for (Fluid fluid : Registries.FLUID) {
            for (FluidState fluidState : fluid.getStateManager().getStates()) {
                Fluid.STATE_IDS.add(fluidState);
            }
        }
    }
    public static final FlowableFluid H2SO4 = register("sulphuric_acid",new AbstractSulfuricAcidFluid.Still());
    public static final FlowableFluid H2SO4_FLOWING = register("sulphuric_acid_flowing",new AbstractSulfuricAcidFluid.Flowing());
    public static void registerModFluids() {
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), ModFluid.H2SO4);
        LegacyWorld.LOGGER.info("Loaded Fluids");
    }
}
