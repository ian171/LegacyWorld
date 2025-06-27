package net.chen.datagen;

import net.chen.blocks.ModBlock;
import net.chen.blocks.crops.Marijuana;
import net.chen.items.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    LootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlock.MARIJUANA)
            .properties(StatePredicate.Builder.create().exactMatch(Marijuana.AGE,5));

    @Override
    public void generate() {
        oreDrops(ModBlock.IRON_ORE, ModItem.IRON_STONE);
        oreDrops(ModBlock.ZINC_ORE,ModItem.ZINC_STONE);
        addDrop(ModBlock.DIRTYSTONE_FIRST);
        addDrop(Blocks.ACACIA_LEAVES, ModItem.BROKEN_STICK);
        addDrop(Blocks.AZALEA_LEAVES, ModItem.BROKEN_STICK);
        addDrop(Blocks.BIRCH_LEAVES, ModItem.BROKEN_STICK);
        addDrop(Blocks.CHERRY_LEAVES, ModItem.BROKEN_STICK);
        addDrop(Blocks.DARK_OAK_LEAVES, ModItem.BROKEN_STICK);
        addDrop(Blocks.JUNGLE_LEAVES, ModItem.BROKEN_STICK);
        addDrop(Blocks.OAK_LEAVES, ModItem.BROKEN_STICK);
        addDrop(Blocks.SPRUCE_LEAVES, ModItem.BROKEN_STICK);
        oreDrops(ModBlock.NO_SMOKE_COAL_ORE,ModItem.NO_SMOKE_COAL);
        oreDrops(ModBlock.COOPER_ORE,ModItem.COPPER_STONE);
        addDrop(ModBlock.MARIJUANA,cropDrops(ModBlock.MARIJUANA,ModItem.MARIJUANA,ModItem.MARIJUANA_SEED,builder2));
    }
}
