package net.chen.blocks.entity.blockentity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.input.SingleStackRecipeInput;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    public ModFurnaceBlockEntity(BlockPos pos, BlockState state, RecipeManager.MatchGetter<SingleStackRecipeInput, ? extends AbstractCookingRecipe> matchGetter) {
        super(ModBlockEntities.MOD_FURNACE_ENTITY, pos, state,null);
        
    }
    public ModFurnaceBlockEntity(
            BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state, RecipeType<? extends AbstractCookingRecipe> recipeType
    ) {
        super(blockEntityType, pos, state, recipeType);
    }

    public ModFurnaceBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.MOD_FURNACE_ENTITY, blockPos, blockState,RecipeType.SMELTING);
    }

    @Override
    protected Text getContainerName() {
        return Text.of(Identifier.of("blocktext.furnace"));
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
