package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.blocks.bush.HoneyBerryBushBlock;
import net.chen.blocks.crops.CauliflowerCrops;
import net.chen.blocks.crops.Marijuana;
import net.chen.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class  ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    LootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlock.MARIJUANA)
            .properties(StatePredicate.Builder.create().exactMatch(Marijuana.AGE,5));

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        oreDrops(ModBlock.IRON_ORE, ModItems.IRON_STONE);
        oreDrops(ModBlock.ZINC_ORE, ModItems.ZINC_STONE);
        oreDrops(ModBlock.LEAD_ORE, ModItems.LEAD_STONE);
        oreDrops(ModBlock.SILVER_ORE, ModItems.SILVER_STONE);
        oreDrops(ModBlock.TUNGSTEN_ORE, ModItems.TUNGSTEN_STONE);
        oreDrops(ModBlock.COBALT_ORE, ModItems.COBALT_STONE);
        addDrop(ModBlock.DIRTYSTONE_FIRST);
        addDrop(Blocks.ACACIA_LEAVES, ModItems.BROKEN_STICK);
        addDrop(Blocks.AZALEA_LEAVES, ModItems.BROKEN_STICK);
        addDrop(Blocks.BIRCH_LEAVES, ModItems.BROKEN_STICK);
        addDrop(Blocks.CHERRY_LEAVES, ModItems.BROKEN_STICK);
        addDrop(Blocks.DARK_OAK_LEAVES, ModItems.BROKEN_STICK);
        addDrop(Blocks.JUNGLE_LEAVES, ModItems.BROKEN_STICK);
        addDrop(Blocks.OAK_LEAVES, ModItems.BROKEN_STICK);
        addDrop(Blocks.SPRUCE_LEAVES, ModItems.BROKEN_STICK);
        oreDrops(ModBlock.NO_SMOKE_COAL_ORE, ModItems.NO_SMOKE_COAL);
        oreDrops(ModBlock.COOPER_ORE, ModItems.COPPER_STONE);
        addDrop(ModBlock.MARIJUANA,cropDrops(ModBlock.MARIJUANA, ModItems.MARIJUANA, ModItems.MARIJUANA_SEED,builder2));
        addDrop(ModBlock.DRIFTWOOD_LOG);
        addDrop(ModBlock.DRIFTWOOD_WOOD);
        addDrop(ModBlock.STRIPPED_DRIFTWOOD_LOG);
        addDrop(ModBlock.STRIPPED_DRIFTWOOD_WOOD);
        addDrop(ModBlock.DRIFTWOOD_PLANKS);

        addDrop(ModBlock.DRIFTWOOD_LEAVES,leavesDrops(ModBlock.DRIFTWOOD_LEAVES,ModBlock.DRIFTWOOD_SAPLING,0.0625f));



        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlock.CAULIFLOWER).properties(StatePredicate.Builder.create().exactMatch(CauliflowerCrops.AGE,6));
        this.addDrop(ModBlock.CAULIFLOWER,this.cropDrops(ModBlock.CAULIFLOWER, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEED,builder));
        this.addDrop(ModBlock.HONEY_BERRY_BUSH, (Block block) ->
                this.applyExplosionDecay((ItemConvertible)block,
                        LootTable.builder()
                                .pool(LootPool.builder()
                                        .conditionally(BlockStatePropertyLootCondition.builder(ModBlock.HONEY_BERRY_BUSH)
                                                .properties(StatePredicate.Builder.create().exactMatch(HoneyBerryBushBlock.AGE, 3)))
                                        .with(ItemEntry.builder(ModItems.HONEY_BERRIES))
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 3.0f)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))
                                .pool(LootPool.builder().conditionally(BlockStatePropertyLootCondition.builder(ModBlock.HONEY_BERRY_BUSH)
                                        .properties(StatePredicate.Builder.create().exactMatch(HoneyBerryBushBlock.AGE, 2)))
                                        .with(ItemEntry.builder(ModItems.HONEY_BERRIES))
                                        .apply(SetCountLootFunction
                                                .builder(UniformLootNumberProvider.create(1.0f, 2.0f)))
                                        .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE))))));
    }
}
