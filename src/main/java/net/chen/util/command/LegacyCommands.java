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
                MinecraftClient client = MinecraftClient.getInstance();
                if (client.player != null) {
                    client.player.sendMessage(Text.of("Hello World"), false);
                }
                client.setScreen(new LegacyCommandGui(Text.of("Hello World")));
                openUI();
                return 1;
            }));
        });
    }
    private static void openUI(){
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.isOnThread()) {
            // 如果已经在主线程中，直接切换屏幕
            client.setScreen(new LegacyCommandGui(Text.of("Hello World")));
        } else {
            // 如果不在主线程中，使用 execute() 将其调度到主线程
            client.execute(() -> client.setScreen(new LegacyCommandGui(Text.of("Hello World"))));
        }
    }
}
