package net.chen.items;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.blocks.fluid.ModFluid;
import net.chen.entity.ModEntities;
import net.chen.items.food.ModFoodComponents;
import net.chen.items.ore.*;
import net.chen.items.tools.Chisel;
import net.chen.items.tools.GlassBukkit;
import net.chen.items.tools.TomahawkItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
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
    public static final Item RAW_LEAD = registerItems("raw_lead",new RawLead(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItems("lead_ingot",new LeadIngot(new Item.Settings()));
    public static final Item LEAD_STONE = registerItems("lead_stone",new LeadStone(new Item.Settings()));
    public static final Item RAW_SILVER = registerItems("raw_silver",new RawSilver(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItems("silver_ingot",new SilverIngot(new Item.Settings()));
    public static final Item SILVER_STONE = registerItems("silver_stone",new SilverStone(new Item.Settings()));
    public static final Item RAW_TUNGSTEN = registerItems("raw_tungsten",new RawTungsten(new Item.Settings()));
    public static final Item TUNGSTEN_INGOT = registerItems("tungsten_ingot",new TungstenIngot(new Item.Settings()));
    public static final Item TUNGSTEN_STONE = registerItems("tungsten_stone",new TungstenStone(new Item.Settings()));
    public static final Item RAW_COBALT = registerItems("raw_cobalt",new RawCobalt(new Item.Settings()));
    public static final Item COBALT_INGOT = registerItems("cobalt_ingot",new CobaltIngot(new Item.Settings()));
    public static final Item COBALT_STONE = registerItems("cobalt_stone",new CobaltStone(new Item.Settings()));

    /*TODO：
      方块贴图（4个）

  - src/main/resources/assets/legacyworld/textures/block/lead_ore.png
  - src/main/resources/assets/legacyworld/textures/block/silver_ore.png
  - src/main/resources/assets/legacyworld/textures/block/tungsten_ore.png
  - src/main/resources/assets/legacyworld/textures/block/cobalt_ore.png

  物品贴图（12个）

  - src/main/resources/assets/legacyworld/textures/item/raw_lead.png
  - src/main/resources/assets/legacyworld/textures/item/lead_ingot.png
  - src/main/resources/assets/legacyworld/textures/item/lead_stone.png
  - src/main/resources/assets/legacyworld/textures/item/raw_silver.png
  - src/main/resources/assets/legacyworld/textures/item/silver_ingot.png
  - src/main/resources/assets/legacyworld/textures/item/silver_stone.png
  - src/main/resources/assets/legacyworld/textures/item/raw_tungsten.png
  - src/main/resources/assets/legacyworld/textures/item/tungsten_ingot.png
  - src/main/resources/assets/legacyworld/textures/item/tungsten_stone.png
  - src/main/resources/assets/legacyworld/textures/item/raw_cobalt.png
  - src/main/resources/assets/legacyworld/textures/item/cobalt_ingot.png
  - src/main/resources/assets/legacyworld/textures/item/cobalt_stone.png
     */

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
    public static final Item BROKEN_STICK = registerItems("broken_stick",new Item(new Item.Settings()));
    public static final Item THICK_STICK = registerItems("thick_stick",new Item(new Item.Settings()));
    public static final Item NEITHER_INGOT = registerItems("nether_ingot",new Item(new Item.Settings()));
    public static final Item ALUMINIUM = registerItems("aluminium",new Aluminum(new Item.Settings()));
    public static final Item MANGANESE = registerItems("manganese", new Manganese(new Item.Settings()));
    public static final Item PHOSPHORUS = registerItems("phosphorus",new Phosphorus(new Item.Settings()));
    public static final Item Molybdenum = registerItems("molybdenum",new Molybdenum(new Item.Settings()));
    public static final Item CAULIFLOWER = registerItems("cauliflower",new Item(new Item.Settings()));
    public static final Item CAULIFLOWER_SEED = registerItems("cauliflower_seed",new AliasedBlockItem(ModBlock.CAULIFLOWER, new Item.Settings()));
    public static final Item HONEY_BERRIES = registerItems("honey_berries",new AliasedBlockItem(ModBlock.HONEY_BERRY_BUSH, new Item.Settings().food(ModFoodComponents.HONEY_BERRY)));
    public static final Item MANTIS_SPAWN_EGG = registerItems("mantis_spawn_egg", new SpawnEggItem(ModEntities.MANTIS,0x9dc783,0xbfaf5f,new Item.Settings()));
    public static final Item TOMAHAWK = registerItems("tomahawk", new TomahawkItem(new Item.Settings().maxCount(16)));
    public static final Item SPECTRE_STAFF = registerItems("spectre_staff", new Item(new Item.Settings().maxCount(1)));

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LegacyWorld.MOD_ID, id), item);
    }
    public static void registerModItems(){
        LegacyWorld.LOGGER.info("Registering Items");
        FuelRegistry.INSTANCE.add(ModItems.NO_SMOKE_COAL, 1600);
        FuelRegistry.INSTANCE.add(ModItems.PHOSPHORUS,1300);
    }
}
