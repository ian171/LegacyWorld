package net.chen.mixin;

import net.chen.LegacyWorld;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {

	long start,end;
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadWorld()V
		start = System.currentTimeMillis();
	}
	@Inject(at = @At("TAIL"),method = "loadWorld")
	private void init2(CallbackInfo info) {
		// This code is injected into the end of MinecraftServer.loadWorld()V
		end = System.currentTimeMillis();
		LegacyWorld.LOGGER.debug("World loaded in {}ms", end - start);
	}
}