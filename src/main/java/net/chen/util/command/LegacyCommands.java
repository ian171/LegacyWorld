package net.chen.util.command;

import net.chen.screen.LegacyCommandGui;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;

public class LegacyCommands {
    public static void commandRegister(){
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("lgui").executes(context -> {
                MinecraftClient.getInstance().mouse.unlockCursor();
                MinecraftClient.getInstance().setScreen(new LegacyCommandGui(Text.of("Hello World")));
                return 1;
            }));
        });
    }
}
