package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    private final PlayerEntity playerEntity = (PlayerEntity) (Object) this;
    private static final Identifier BOLEATTE = new Identifier("boleatte:boleatte");

    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo ci) {
        if (!(playerEntity.getOffHandStack().isOf(ItemInit.DIMATIS))
                && (playerEntity.world.getRegistryKey().getValue().equals(BOLEATTE))) {
            playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 60, 0));
        }
    }

}
