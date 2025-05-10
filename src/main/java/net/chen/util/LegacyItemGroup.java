package net.chen.util;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.chen.items.food.ModFoodComponents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LegacyItemGroup {
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(LegacyWorld.MOD_ID, "tutorial_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.legacyworld"))
                    .icon(() -> new ItemStack(Items.DIAMOND))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.DIAMOND);
                        entries.add(ModItem.chicken);
                        entries.add(ModBlock.DIRTYSTONE);
                        entries.add(ModBlock.DIRTYSTONE_FIRST);
                        entries.add(ModItem.chisel);
                        entries.add(ModItem.NO_SMOKE_COAL);
                        entries.add(ModBlock.NO_SMOKE_COAL_ORE);
                        entries.add(ModItem.IRON_INGOT);
                        entries.add(ModItem.RAW_IRON);
                        entries.add(ModItem.IRON_STONE);
                        entries.add(ModBlock.IRON_ORE);
                        entries.add(ModItem.COPPER_INGOT);
                        entries.add(ModItem.RAW_COPPER);
                        entries.add(ModItem.COPPER_STONE);
                        entries.add(ModBlock.COOPER_ORE);
                        entries.add(ModItem.IRON_SWORD);
                        entries.add(ModItem.COPPER_SWORD);
                        entries.add(ModItem.ZINC_INGOT);
                        entries.add(ModItem.RAW_ZINC);
                        entries.add(ModItem.ZINC_STONE);
                        entries.add(ModBlock.ZINC_ORE);
                        entries.add(ModItem.NICKEL_INGOT);
                        entries.add(ModItem.RAW_NICKEL);
                        entries.add(ModItem.NICKEL_STONE);
                        entries.add(ModBlock.ORE_WASHER);
                        entries.add(ModItem.Sulfur);
                        entries.add(ModBlock.SULFUR_ORE);
                        entries.add(ModItem.SULPHURIC_ACID_BOTTLE);
                        entries.add(ModItem.GLASS_BUKKIT);
                        entries.add(ModItem.Saltpeter);
                        entries.add(ModBlock.Small_Chest);
                    }).build());
    public static void registerModItemGroups() {
        LegacyWorld.LOGGER.info("Registering Item Groups"+TUTORIAL_GROUP.toString());
    }
}
