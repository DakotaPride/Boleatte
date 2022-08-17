package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.PotionUtil;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import static net.minecraft.entity.LivingEntity.containsOnlyAmbientEffects;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    private final LivingEntity livingEntity = (LivingEntity) (Object) this;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "updatePotionVisibility", at = @At("TAIL"))
    protected void activateShadowOfGelidity(CallbackInfo ci) {
        this.setInvisible(livingEntity.hasStatusEffect(EffectInit.LAIDE_BLESSING));
    }

    @ModifyVariable(method = "damage", at = @At("HEAD"), argsOnly = true)
    private float decreaseDamageWithDefiant(float amount) {
        if (livingEntity.hasStatusEffect(EffectInit.DEFIANT)) {
            return amount - (amount * (0.25f * (Objects.requireNonNull
                    (livingEntity.getStatusEffect(EffectInit.DEFIANT)).getAmplifier() + 1)));
        }
        return amount;
    }



}
