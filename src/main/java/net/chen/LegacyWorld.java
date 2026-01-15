package net.chen;

import com.sun.jna.platform.unix.X11;
import net.chen.blocks.ModBlock;
import net.chen.blocks.ModBlockEntities;
import net.chen.blocks.entity.blockentity.SmallChest;
import net.chen.blocks.entity.blockentity.SmallChestBlock;
import net.chen.blocks.fluid.ModFluid;
import net.chen.entity.ModEntities;
import net.chen.entity.client.MantisModel;
import net.chen.entity.client.MantisRenderer;
import net.chen.entity.custom.MantisEntity;
import net.chen.items.ModItem;
import net.chen.screen.LegacyCommandGui;
import net.chen.sounds.ModSoundsEvent;
import net.chen.util.LegacyItemGroup;
import net.chen.util.NBTHelper;
import net.chen.util.command.LegacyCommands;
import net.chen.world.generation.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oshi.hardware.Display;

public class LegacyWorld implements ModInitializer {
	public static final String MOD_ID = "legacyworld";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		long start = System.currentTimeMillis();
		LOGGER.info("Welcome to LegacyWorld");
		LOGGER.info("Registering Mod Items");
		ModItem.registerModItems();
		LOGGER.info("Items Loaded\nLoading Blocks");
		net.chen.blocks.entity.blockentity.ModBlockEntities.registerAllBlockEntities();
		ModBlock.registerModBlocks();
		LOGGER.info("Blocks Loaded");
		LegacyItemGroup.registerModItemGroups();
		LOGGER.info("Registering Mod Sounds");
		ModSoundsEvent.registerModSoundEvents();
		LOGGER.info("Registering Mod Block Entities");
		ModBlockEntities.registerBlockEntities();
		ModEntities.registerModEntities();
		//FabricDefaultAttributeRegistry.register(ModEntities.MANTIS, MantisEntity.createAttributes());
		EntityModelLayerRegistry.registerModelLayer(MantisModel.MANTIS,MantisModel::getTexturedModelData);
		EntityRendererRegistry.register(ModEntities.MANTIS,MantisRenderer::new);
		LOGGER.info("Registering Mod Fluids");
		ModFluid.registerModFluids();
		LOGGER.info("Registering Mod Commands");
		LegacyCommands.commandRegister();
		LOGGER.info("Registering Mod NBTs");
		NBTHelper.init();
		LOGGER.info("Done!");
		CompostingChanceRegistry.INSTANCE.add(ModItem.CAULIFLOWER,0.5f);
		CompostingChanceRegistry.INSTANCE.add(ModItem.CAULIFLOWER_SEED,0.4f);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.CAULIFLOWER,RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.HONEY_BERRY_BUSH,RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlock.DRIFTWOOD_SAPLING, RenderLayer.getCutout());
		StrippableBlockRegistry.register(ModBlock.DRIFTWOOD_LOG, ModBlock.STRIPPED_DRIFTWOOD_LOG);
		StrippableBlockRegistry.register(ModBlock.DRIFTWOOD_WOOD, ModBlock.STRIPPED_DRIFTWOOD_WOOD);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlock.DRIFTWOOD_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlock.DRIFTWOOD_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlock.STRIPPED_DRIFTWOOD_LOG,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlock.STRIPPED_DRIFTWOOD_WOOD,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlock.DRIFTWOOD_PLANKS,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlock.DRIFTWOOD_LEAVES,5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlock.DRIFTWOOD_SAPLING,5,5);
		FabricDefaultAttributeRegistry.register(ModEntities.MANTIS, MantisEntity.createAttributes());
		ModWorldGeneration.generateModWorldGen();
		long end = System.currentTimeMillis();
        LOGGER.info("Time to load: {}ms", end - start);
		System.gc();
		LOGGER.info("Garbage collected");


//		try{
//			Class.forName("vazkii.patchouli.Patchouli");
//		} catch (ClassNotFoundException e) {
//            LOGGER.warn("You would better load Patchouli to use the book");
//        }finally {
//			LOGGER.error("Patchouli is not installed, please install it to use the book");
//			JOptionPane.showMessageDialog(null,"Patchouli is not installed, please install it to use the book","Error",JOptionPane.WARNING_MESSAGE);
//		}

    }
}