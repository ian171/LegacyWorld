package net.chen.blocks.fluid;

import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public abstract class AbstractSulfuricAcidFluid extends AbstractModFluid {
    @Override
    public Fluid getStill() {
        return ModFluid.H2SO4;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluid.H2SO4_FLOWING;
    }

    @Override
    public Item getBucketItem() {
        return ModItem.SULPHURIC_ACID_BOTTLE;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlock.H2SO4.getDefaultState().with(FluidBlock.LEVEL, WaterFluid.getBlockStateLevel(state));
    }

    public static class Flowing extends AbstractSulfuricAcidFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
            return false;
        }

        @Override
        public int getTickRate(WorldView world) {
            return 0;
        }

        @Override
        protected float getBlastResistance() {
            return 0;
        }

        @Override
        protected int getMaxFlowDistance(WorldView world) {
            return 0;
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }
    }

    public static class Still extends AbstractSulfuricAcidFluid {

        @Override
        protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
            return false;
        }

        @Override
        public int getTickRate(WorldView world) {
            return 0;
        }

        @Override
        protected float getBlastResistance() {
            return 0;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }

        @Override
        protected int getMaxFlowDistance(WorldView world) {
            return 0;
        }

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }
    }
}
