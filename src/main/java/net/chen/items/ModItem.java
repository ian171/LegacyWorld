package net.chen.items;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.blocks.fluid.ModFluid;
import net.chen.items.acid.H2SO4;
import net.chen.items.food.ModFoodComponents;
import net.chen.items.ore.*;
import net.chen.items.tools.Chisel;
import net.chen.items.tools.GlassBukkit;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static final Item chicken = registerItems("chicken", new Item(new Item.Settings().food(ModFoodComponents.CHICKEN)));
    public static final Item chisel = registerItems("chisel", new Chisel(new Item.Settings().maxCount(1).maxDamage(127).fireproof()));
    public static final Item IRON_INGOT = registerItems("iron_ingot",new IronIngot(new Item.Settings()));
    public static final Item IRON_STONE = registerItems("iron_stone",new IronStone(new Item.Settings()));
    public static final Item RAW_IRON = registerItems("raw_iron",new IronIngot(new Item.Settings()));
    public static final Item NO_SMOKE_COAL = registerItems("no_smoke_coal",new Item(new Item.Settings().fireproof()));
    public static final Item RAW_COPPER = registerItems("raw_copper",new RawCopper(new Item.Settings()));
    public static final Item COPPER_INGOT = registerItems("copper_ingot",new CopperIngot(new Item.Settings()));
    public static final Item COPPER_STONE = registerItems("copper_stone",new CopperStone(new Item.Settings()));
    public static final Item RAW_ZINC = registerItems("raw_zinc",new RawZinc(new Item.Settings()));
    public static final Item ZINC_INGOT = registerItems("zinc_ingot",new ZincIngot(new Item.Settings()));
    public static final Item ZINC_STONE = registerItems("zinc_stone",new ZincStone(new Item.Settings()));
    public static final Item RAW_NICKEL = registerItems("raw_nickel",new RawNickel(new Item.Settings()));
    public static final Item NICKEL_INGOT = registerItems("nickel_ingot",new NickelIngot(new Item.Settings()));
    public static final Item NICKEL_STONE = registerItems("nickel_stone",new NickelStone(new Item.Settings()));

    public static final Item IRON_SWORD = registerItems("iron_sword",new SwordItem(ModToolMaterials.IRON_INGOT,new Item.Settings()));
    public static final Item COPPER_SWORD = registerItems("copper_sword",new SwordItem(ModToolMaterials.COPPER_INGOT,new Item.Settings()));
    public static final Item Sulfur = registerItems("sulfur",new Item(new Item.Settings()));
    public static final Item SULPHURIC_ACID_BOTTLE = registerItems("sulphuric_acid_bottle",new BucketItem(ModFluid.H2SO4,new Item.Settings().maxCount(1)));
    public static final Item GLASS_BUKKIT = registerItems("glass_bukkit",new GlassBukkit(new Item.Settings()));
    public static final Item Saltpeter = registerItems("salt_peter",new Item(new Item.Settings()));
    public static final Item Solvent = registerItems("solvent",new Item(new Item.Settings()));
    public static final Item TIN_STONE = registerItems("tin_stone",new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItems("tin_ingot",new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItems("raw_tin",new Item(new Item.Settings()));
    public static final Item MARIJUANA_SEED = registerItems("marijuana_seed",new AliasedBlockItem(ModBlock.MARIJUANA, new Item.Settings()));
    public static final Item MARIJUANA = registerItems("marijuana",new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LegacyWorld.MOD_ID, id), item);
    }
    public static void registerModItems(){
        LegacyWorld.LOGGER.info("Registering Items");
        FuelRegistry.INSTANCE.add(ModItem.NO_SMOKE_COAL, 1600);
        System.gc();
    }
}
