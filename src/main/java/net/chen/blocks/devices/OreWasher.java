package net.chen.blocks.devices;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OreWasher extends AbstractMachineBlock{
    public OreWasher(Settings settings) {
        super(settings);
    }
    @Override
    public void onBlockDestroy() {
        super.onBlockDestroy();
    }
    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        player.sendMessage(Text.of("hello"));
        return ActionResult.PASS;
    }
}
