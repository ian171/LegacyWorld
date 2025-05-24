package net.chen.util.command;

import net.chen.LegacyWorld;
import net.chen.screen.LegacyCommandGui;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;
import net.minecraft.util.crash.CrashException;

public class LegacyCommands {
    public static void commandRegister(){
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("lgui").executes(context -> {
                MinecraftClient.getInstance().setScreen(new LegacyCommandGui(Text.of("Hello World")));
                return 1;
            }));
        });
    }
}
