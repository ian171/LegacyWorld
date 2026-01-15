package net.chen.blocks;

import net.chen.LegacyWorld;
import net.chen.blocks.bush.HoneyBerryBushBlock;
import net.chen.blocks.crops.CauliflowerCrops;
import net.chen.blocks.crops.Marijuana;
import net.chen.blocks.devices.Bin;
import net.chen.blocks.devices.Furnace;
import net.chen.blocks.devices.OreWasher;
import net.chen.blocks.entity.blockentity.SmallChestBlock;
import net.chen.blocks.fluid.ModFluid;
import net.chen.blocks.ore.CopperOre;
import net.chen.blocks.ore.IronOre;
import net.chen.blocks.ore.NoSmokeCoal;
import net.chen.blocks.stones.DirtyStone;
import net.chen.world.tree.ModSaplingGenerator;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static final Block DIRTYSTONE = register("dirty_stone", new DirtyStone(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)));
    public static final Block DIRTYSTONE_FIRST = register("dirty_stone_first", new Block(AbstractBlock.Settings.create().strength(1.5f, 6.0f).mapColor(MapColor.STONE_GRAY)));
    public static final Block IRON_ORE = register("iron_ore", new IronOre(AbstractBlock.Settings.create().mapColor(DyeColor.CYAN).strength(3.0f, 3.0f)));
    public static final Block NO_SMOKE_COAL_ORE = register("no_smoke_coal_ore", new NoSmokeCoal(AbstractBlock.Settings.create().mapColor(DyeColor.GRAY).strength(0.8f, 0.7f).requiresTool()));
    public static final Block COOPER_ORE = register("cooper_ore", new CopperOre(AbstractBlock.Settings.create().mapColor(DyeColor.GREEN).strength(2.5f, 2.7f)));
    public static final Block ZINC_ORE = register("zinc_ore", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.YELLOW).strength(2.5f, 2.7f)));
    public static final Block TIN_ORE = register("tin_ore",new Block(AbstractBlock.Settings.create().strength(1.8f,2.0f)));
    public static final Block BIN = register("bin", new Bin(AbstractBlock.Settings.create().mapColor(DyeColor.BROWN).strength(0.8f, 0.7f).requiresTool()));
    public static final Block ORE_WASHER = register("ore_washer", new OreWasher(AbstractBlock.Settings.create().mapColor(DyeColor.BROWN).strength(0.8f, 0.7f).requiresTool()));
    public static final Block SULFUR_ORE = register("sulfur_ore", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.YELLOW).strength(2.5f, 2.7f)));
    public static final Block H2SO4 = register("sulphuric_acid", new FluidBlock(ModFluid.H2SO4,AbstractBlock.Settings.create()));
    public static final Block H2SO4_FLOWING = register("sulphuric_acid_flowing", new FluidBlock(ModFluid.H2SO4_FLOWING,AbstractBlock.Settings.create()));
    public static final Block Small_Chest = register("small_chest", new SmallChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), () -> ModBlockEntities.SMALL_CHEST));
    public static final Block MARIJUANA = Registry.register(Registries.BLOCK, Identifier.of(LegacyWorld.MOD_ID, "marijuana"), new Marijuana(AbstractBlock.Settings.create().mapColor(MapColor.LIME)));
    public static final Block FURNACE = register("furnace", new Furnace(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(0.8f, 0.7f).requiresTool()));
    //public static final Block FURNACE = register("furnace", new ModFurnaceBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(0.8f, 0.7f).requiresTool()));
    public static final Block CAULIFLOWER = registerWithoutItem("cauliflower_crop",new CauliflowerCrops(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block HONEY_BERRY_BUSH = registerWithoutItem("honey_berry_bush",new HoneyBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final Block DRIFTWOOD_LOG = register("driftwood_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block DRIFTWOOD_WOOD = register("driftwood_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_DRIFTWOOD_LOG = register("stripped_driftwood_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_DRIFTWOOD_WOOD = register("stripped_driftwood_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block DRIFTWOOD_PLANKS = register("driftwood_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block DRIFTWOOD_LEAVES = register("driftwood_leaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block DRIFTWOOD_SAPLING = register("driftwood_sapling", new SaplingBlock(ModSaplingGenerator.DRIFTWOOD,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static void registerModBlocks(){
        LegacyWorld.LOGGER.info("Registering Blocks");
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.MARIJUANA, RenderLayer.getCutout());
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

    public static Block registerWithoutItem(String id, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(LegacyWorld.MOD_ID, id), block);
    }
}
