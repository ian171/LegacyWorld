package net.chen.blocks.devices;

import com.mojang.serialization.MapCodec;
import net.chen.blocks.entity.blockentity.ModBlockEntities;
import net.chen.blocks.entity.blockentity.ModFurnaceBlockEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class Furnace extends AbstractFurnaceBlock {
    public Furnace(AbstractBlock.Settings settings) {
        super(settings);
    }
    public static final MapCodec<Furnace> CODEC = createCodec(Furnace::new);

    @Override
    public MapCodec<Furnace> getCodec() {
        return CODEC;
    }

    @Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ModFurnaceBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(world, type, ModBlockEntities.MOD_FURNACE_ENTITY);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ModFurnaceBlockEntity(ModBlockEntities.MOD_FURNACE_ENTITY,pos, state, RecipeType.SMELTING);
    }

//    @Override
//    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
//        if (!world.isClient) {
//            player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
//            //player.incrementStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
//        }
//        return ActionResult.SUCCESS;
//
//    }
//    @Override
//    protected NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
//        return new SimpleNamedScreenHandlerFactory(
//                (syncId, inventory, player) ->
//                        new FurnaceGui(syncId, inventory
//                        ),Text.of("Furnace")
//        );
//    }
}
