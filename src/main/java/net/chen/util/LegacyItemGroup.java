package net.chen.util;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.items.ModItems;
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
                        entries.add(ModItems.chicken);
                        entries.add(ModBlock.DIRTYSTONE);
                        entries.add(ModBlock.DIRTYSTONE_FIRST);
                        entries.add(ModItems.chisel);
                        entries.add(ModItems.NO_SMOKE_COAL);
                        entries.add(ModBlock.NO_SMOKE_COAL_ORE);
                        entries.add(ModItems.IRON_INGOT);
                        entries.add(ModItems.RAW_IRON);
                        entries.add(ModItems.IRON_STONE);
                        entries.add(ModBlock.IRON_ORE);
                        entries.add(ModItems.COPPER_INGOT);
                        entries.add(ModItems.RAW_COPPER);
                        entries.add(ModItems.COPPER_STONE);
                        entries.add(ModBlock.COOPER_ORE);
                        entries.add(ModItems.IRON_SWORD);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.ZINC_INGOT);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModItems.ZINC_STONE);
                        entries.add(ModBlock.ZINC_ORE);
                        entries.add(ModItems.NICKEL_INGOT);
                        entries.add(ModItems.RAW_NICKEL);
                        entries.add(ModItems.NICKEL_STONE);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.LEAD_STONE);
                        entries.add(ModBlock.LEAD_ORE);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_STONE);
                        entries.add(ModBlock.SILVER_ORE);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.TUNGSTEN_STONE);
                        entries.add(ModBlock.TUNGSTEN_ORE);
                        entries.add(ModItems.COBALT_INGOT);
                        entries.add(ModItems.RAW_COBALT);
                        entries.add(ModItems.COBALT_STONE);
                        entries.add(ModBlock.COBALT_ORE);
                        entries.add(ModBlock.ORE_WASHER);
                        entries.add(ModItems.Sulfur);
                        entries.add(ModItems.Solvent);
                        entries.add(ModBlock.SULFUR_ORE);
                        entries.add(ModItems.SULPHURIC_ACID_BOTTLE);
                        entries.add(ModItems.GLASS_BUKKIT);
                        entries.add(ModItems.Saltpeter);
                        entries.add(ModBlock.Small_Chest);
                        entries.add(ModBlock.TIN_ORE);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_STONE);
                        entries.add(ModBlock.FURNACE);
                        entries.add(ModItems.BROKEN_STICK);
                        entries.add(ModItems.ALUMINIUM);
                        entries.add(ModItems.PHOSPHORUS);
                        entries.add(ModItems.MANGANESE);
                        entries.add(ModItems.Molybdenum);
                        entries.add(ModItems.CAULIFLOWER_SEED);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModBlock.HONEY_BERRY_BUSH);
                        entries.add(ModBlock.DRIFTWOOD_LOG);
                        entries.add(ModBlock.DRIFTWOOD_WOOD);
                        entries.add(ModBlock.STRIPPED_DRIFTWOOD_LOG);
                        entries.add(ModBlock.STRIPPED_DRIFTWOOD_WOOD);
                        entries.add(ModBlock.DRIFTWOOD_PLANKS);
                        entries.add(ModBlock.DRIFTWOOD_LEAVES);
                        entries.add(ModBlock.DRIFTWOOD_SAPLING);
                        entries.add(ModItems.MANTIS_SPAWN_EGG);
                        entries.add(ModItems.TOMAHAWK);
                        entries.add(ModBlock.CHAIR);
                        entries.add(ModItems.SPECTRE_STAFF);
                    }).build());
    public static void registerModItemGroups() {
        LegacyWorld.LOGGER.info("Registering Item Groups"+TUTORIAL_GROUP.toString());
    }
}
