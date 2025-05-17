package net.chen.blocks.crops;

import net.chen.items.ModItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class Marijuana extends CropBlock {
    public Marijuana(Settings settings) {
        super(settings);
    }
    public static final int MAX_AGE = 5;
    public static final IntProperty AGE = Properties.AGE_5;
    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getAge(BlockState state) {
        return state.get(this.getAgeProperty());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItem.MARIJUANA_SEED;
    }
}
