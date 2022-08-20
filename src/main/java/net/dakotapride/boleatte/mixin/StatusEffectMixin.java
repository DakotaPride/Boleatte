package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.Box;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(StatusEffect.class)
public class StatusEffectMixin {

    @Inject(method = "applyUpdateEffect", at = @At("HEAD"))
    private void applyUpdateEffect(LivingEntity livingEntity, int amplifier, CallbackInfo ci) {
        Box boundingBox = livingEntity.getBoundingBox().expand(amplifier + 1);
        List<Entity> entities = livingEntity.world.getOtherEntities(livingEntity, boundingBox);

        if (livingEntity.hasStatusEffect(EffectInit.GELA_BENEFIT)) {
            for (Entity entity : entities) {
                if(entity instanceof LivingEntity && !livingEntity.isInvulnerableTo(DamageSource.WITHER)) {
                    livingEntity.damage(DamageSource.WITHER,0.5f * (amplifier + 1));
                }
            }
        }
    }

}
