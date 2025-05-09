package net.chen.blocks.stones;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class DirtyStone extends Block {
    public DirtyStone(Settings settings) {
        super(settings);
    }
    @Override
    public boolean shouldDropItemsOnExplosion(Explosion explosion) {
        return false;
    }
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (world.isClient) {
            if(entity instanceof PlayerEntity) {
                world.playSound((PlayerEntity) entity, pos, SoundEvent.of(Identifier.of("sounds.player_run")), SoundCategory.BLOCKS, 1.0f, 1.0f);
            }
        }
    }
}
