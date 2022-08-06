package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Objects;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    private final LivingEntity livingEntity = (LivingEntity) (Object) this;

    @ModifyVariable(method = "damage", at = @At("HEAD"), argsOnly = true)
    private float decreaseDamageWithDefiant(float amount) {
        if (livingEntity.hasStatusEffect(EffectInit.DEFIANT)) {
            return amount - (amount * (0.25f * (Objects.requireNonNull
                    (livingEntity.getStatusEffect(EffectInit.DEFIANT)).getAmplifier() + 1)));
        }
        return amount;
    }

}
