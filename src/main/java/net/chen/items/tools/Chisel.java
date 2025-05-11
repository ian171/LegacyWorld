package net.chen.items.tools;

import net.chen.blocks.ModBlock;
import net.chen.sounds.ModSoundsEvent;
import net.chen.util.NBTHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Objects;

public class Chisel extends Item {
    private int energy = 0;
    public Chisel(Settings settings) {
        super(settings.component(NBTHelper.ELEC,0));
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        energy = stack.getOrDefault(NBTHelper.ELEC,null);
        tooltip.add(Text.of("Electronic: "+ energy));

        super.appendTooltip(stack, context, tooltip, type);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos blockPos =context.getBlockPos();
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        float hunger = player.getHungerManager().getSaturationLevel();


        if (world.getBlockState(blockPos).isOf(ModBlock.DIRTYSTONE)) {
            if (player.isCreative()){
                world.setBlockState(blockPos, ModBlock.DIRTYSTONE_FIRST.getDefaultState());
                return super.useOnBlock(context);
            }
            if (energy > 0) {
                energy--;
            }else {
                return super.useOnBlock(context);
            }
            world.setBlockState(blockPos, ModBlock.DIRTYSTONE_FIRST.getDefaultState());
            world.playSound(null,blockPos, ModSoundsEvent.BLOCK_PLACE, SoundCategory.BLOCKS,1.0f,1.0f);
            player.sendMessage(Text.of("Chiseled!"));
            if (hunger <= 0) player.sendMessage(Text.of("No energy!"));
        }
        //释放内存
        blockPos=null;
        world=null;
        player=null;
        return super.useOnBlock(context);
    }

}
