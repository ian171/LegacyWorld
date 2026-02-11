package net.chen.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ScreenMixin {
    @Mutable
    @Shadow
    @Final
    private static Text COPYRIGHT;

    @Inject(method = "init",at = @At("HEAD"))
    public void init(CallbackInfo ci){
        COPYRIGHT = Text.empty();
    }
}
