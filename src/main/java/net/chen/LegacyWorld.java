package net.chen;

import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.chen.sounds.ModSoundsEvent;
import net.chen.util.LegacyItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;

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

		LOGGER.info("Welcome to LegacyWorld");
		LOGGER.info("Registering Mod Items");
		ModItem.registerModItems();
		LOGGER.info("Items Loaded\nLoading Blocks");
		ModBlock.registerModBlocks();
		LOGGER.info("Blocks Loaded");
		LegacyItemGroup.registerModItemGroups();
		ModSoundsEvent.registerModSoundEvents();
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