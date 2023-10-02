package net.unknownbits.waypoints.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;

// TODO fixed TitleScreen

@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin extends Screen {
    protected TitleScreenMixin(Text title) {
        super(title);
    }


    /// @ModifyArg(method = "init()V",at = @At(value = "INVOKE",target = "Lnet/minecraft/client/gui/widget/ButtonWidget$Builder;dimensions(IIII)Lnet/minecraft/client/gui/widget/ButtonWidget$Builder;"), index = 1)
    /// private int anInts(int y) { return y + 12; }

    /// @Inject(method = "initWidgetsNormal", at = @At("TAIL"), locals = LocalCapture.CAPTURE_FAILHARD)
    /// private void setButton(int y, int spacingY, CallbackInfo ci) { this.addDrawableChild(ButtonWidget.builder(Text.translatable("menu.waypoints"), (button) -> {}).dimensions(this.width / 2 - 100, y + spacingY * 3, 200, 20).build());}
}
