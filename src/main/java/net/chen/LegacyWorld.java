package net.chen;

import com.sun.jna.platform.unix.X11;
import net.chen.blocks.ModBlock;
import net.chen.blocks.ModBlockEntities;
import net.chen.blocks.entity.blockentity.SmallChest;
import net.chen.blocks.entity.blockentity.SmallChestBlock;
import net.chen.blocks.fluid.ModFluid;
import net.chen.items.ModItem;
import net.chen.screen.LegacyCommandGui;
import net.chen.sounds.ModSoundsEvent;
import net.chen.util.LegacyItemGroup;
import net.chen.util.command.LegacyCommands;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
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
		ModBlock.registerModBlocks();
		LOGGER.info("Blocks Loaded");
		LegacyItemGroup.registerModItemGroups();
		LOGGER.info("Registering Mod Sounds");
		ModSoundsEvent.registerModSoundEvents();
		LOGGER.info("Registering Mod Block Entities");
		ModBlockEntities.registerBlockEntities();
		LOGGER.info("Registering Mod Fluids");
		ModFluid.registerModFluids();
		LOGGER.info("Registering Mod Commands");
		LegacyCommands.commandRegister();
		LegacyCommandGui.init2();
		LOGGER.info("Done!");
		long end = System.currentTimeMillis();
        LOGGER.info("Time to load: {}ms", end - start);


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