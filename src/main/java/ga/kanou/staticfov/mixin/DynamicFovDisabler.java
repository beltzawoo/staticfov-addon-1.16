package ga.kanou.staticfov.mixin;

import ga.kanou.staticfov.Addon;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public class DynamicFovDisabler {
  @Inject(method = "Lnet/minecraft/client/entity/player/AbstractClientPlayerEntity;getFovModifier()F", at = @At("HEAD"), cancellable = true)
  private void injectRunTick(CallbackInfoReturnable<Float> cir) {
    if (Addon.staticEnabled) {
      cir.setReturnValue(1.0F);
    }
    //cir.setReturnValue(MathHelper.lerp(Minecraft.getInstance().gameSettings.fovScaleEffect, 1.0F, 1.0F));
    //cir.setReturnValue(1.0F);
  }

}
