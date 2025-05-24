package net.chen.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.toast.SystemToast;
import net.minecraft.text.Text;

public class LegacyCommandGui extends Screen {

    public LegacyCommandGui(Text title) {
        super(title);
    }
    @Override
    public void init(){
        ButtonWidget buttonWidget =ButtonWidget.builder(Text.of("Click me"), (btn) -> {
            if (this.client != null) {
                this.client.getToastManager()
                        .add(SystemToast.create(this.client,
                                SystemToast.Type.NARRATOR_TOGGLE,Text.of("Hello"), Text.of("World")));
            }
        }).dimensions(40,40,120,20).build();
        this.addDrawableChild(buttonWidget);
    }
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);

        // Minecraft doesn't have a "label" widget, so we'll have to draw our own text.
        // We'll subtract the font height from the Y position to make the text appear above the button.
        // Subtracting an extra 10 pixels will give the text some padding.
        // textRenderer, text, x, y, color, hasShadow
        context.drawText(this.textRenderer, "Special Button", 40, 40 - this.textRenderer.fontHeight - 10, 0xFFFFFFFF, true);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }

//    @Override
//    public boolean mouseClicked(double mouseX, double mouseY, int button) {
//        if (!super.mouseClicked(mouseX, mouseY, button)) {
//            this.close();
//            return false;
//        }
//        return true;
//    }


    public static void init2(){

    }
}

