package net.chen.items.tools;

import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GlassBukkit extends Item {
    public GlassBukkit(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos =context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        PlayerEntity player=context.getPlayer();
        if (world.isClient) {
            if (blockState.getBlock() == ModBlock.H2SO4) {
                world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
                    player.sendMessage(Text.of("H2SO4"));
                    player.getInventory().setStack(player.getInventory().selectedSlot, new ItemStack(ModItem.SULPHURIC_ACID_BOTTLE, 1));
            }
        }
        player=null;
        blockPos=null;
        blockState=null;
        world=null;
        return ActionResult.PASS;
    }
}
