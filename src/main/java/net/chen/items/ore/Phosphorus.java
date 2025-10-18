package net.chen.items.ore;

import net.chen.LegacyWorld;
import net.chen.sounds.ModSoundsEvent;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Phosphorus extends Item {
    public Phosphorus(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        Block block = world.getBlockState(blockPos).getBlock();
        if(block != Blocks.AIR){
            PlayerEntity playerEntity = context.getPlayer();
            if (playerEntity != null) {
                playerEntity.playSound(ModSoundsEvent.PLAYER_RUN_ON_DIRTY_STONE);
            }else {
                LegacyWorld.LOGGER.error("Error when playing sound");
            }
        }
        return super.useOnBlock(context);
    }
}
