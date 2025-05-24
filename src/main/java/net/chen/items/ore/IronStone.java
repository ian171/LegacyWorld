package net.chen.items.ore;

import net.chen.util.NBTHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

import java.util.List;

public class IronStone extends Item {
    public IronStone(Settings settings) {
        super(settings.component(NBTHelper.QUALITY,3));
    }
    private final int quality = new ItemStack(this).getOrDefault(NBTHelper.QUALITY, null);

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.of("Quality:"+quality));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
