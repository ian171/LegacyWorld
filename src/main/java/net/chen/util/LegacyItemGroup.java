package net.chen.util;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
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
                        entries.add(ModItem.Solvent);
                        entries.add(ModBlock.SULFUR_ORE);
                        entries.add(ModItem.SULPHURIC_ACID_BOTTLE);
                        entries.add(ModItem.GLASS_BUKKIT);
                        entries.add(ModItem.Saltpeter);
                        entries.add(ModBlock.Small_Chest);
                        entries.add(ModBlock.TIN_ORE);
                        entries.add(ModItem.TIN_INGOT);
                        entries.add(ModItem.RAW_TIN);
                        entries.add(ModItem.TIN_STONE);
                        entries.add(ModBlock.FURNACE);
                        entries.add(ModItem.BROKEN_STICK);
                        entries.add(ModItem.ALUMINIUM);
                        entries.add(ModItem.PHOSPHORUS);
                        entries.add(ModItem.MANGANESE);
                        entries.add(ModItem.Molybdenum);
                        entries.add(ModItem.CAULIFLOWER_SEED);
                        entries.add(ModBlock.HONEY_BERRY_BUSH);
                        entries.add(ModBlock.DRIFTWOOD_LOG);
                        entries.add(ModBlock.DRIFTWOOD_WOOD);
                        entries.add(ModBlock.STRIPPED_DRIFTWOOD_LOG);
                        entries.add(ModBlock.STRIPPED_DRIFTWOOD_WOOD);
                        entries.add(ModBlock.DRIFTWOOD_PLANKS);
                        entries.add(ModBlock.DRIFTWOOD_LEAVES);
                        entries.add(ModBlock.DRIFTWOOD_SAPLING);
                        entries.add(ModItem.MANTIS_SPAWN_EGG);
                    }).build());
    public static void registerModItemGroups() {
        LegacyWorld.LOGGER.info("Registering Item Groups"+TUTORIAL_GROUP.toString());
    }
}
