package net.chen.blocks;

import net.chen.LegacyWorld;
import net.chen.blocks.devices.Bin;
import net.chen.blocks.devices.OreWasher;
import net.chen.blocks.ore.CopperOre;
import net.chen.blocks.ore.IronOre;
import net.chen.blocks.ore.NoSmokeCoal;
import net.chen.blocks.stones.DirtyStone;
import net.chen.items.ModItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static final Block DIRTYSTONE = register("dirty_stone", new DirtyStone(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)));
    public static final Block DIRTYSTONE_FIRST = register("dirty_stone_first", new Block(AbstractBlock.Settings.create().strength(1.5f, 6.0f).mapColor(MapColor.STONE_GRAY)));
    public static final Block IRON_ORE = register("iron_ore", new IronOre(AbstractBlock.Settings.create().mapColor(DyeColor.CYAN).strength(3.0f, 3.0f)));
    public static final Block NO_SMOKE_COAL_ORE = register("no_smoke_coal_ore", new NoSmokeCoal(AbstractBlock.Settings.create().mapColor(DyeColor.GRAY).strength(0.8f, 0.7f).requiresTool()));
    public static final Block COOPER_ORE = register("cooper_ore", new CopperOre(AbstractBlock.Settings.create().mapColor(DyeColor.GREEN).strength(2.5f, 2.7f)));
    public static final Block ZINC_ORE = register("zinc_ore", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.YELLOW).strength(2.5f, 2.7f)));
    public static final Block BIN = register("bin", new Bin(AbstractBlock.Settings.create().mapColor(DyeColor.BROWN).strength(0.8f, 0.7f).requiresTool()));
    public static final Block ORE_WASHER = register("ore_washer", new OreWasher(AbstractBlock.Settings.create().mapColor(DyeColor.BROWN).strength(0.8f, 0.7f).requiresTool()));
    public static void registerModBlocks(){
        LegacyWorld.LOGGER.info("Registering Blocks");

        System.gc();
    }
    public static void registerBlockItems(String id, Block block) {
        BlockItem item = Registry.register(Registries.ITEM, Identifier.of(LegacyWorld.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            item.appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LegacyWorld.MOD_ID, id), block);
    }
}
