package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.dakotapride.boleatte.common.init.TagInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
    private final LivingEntity livingEntity = (LivingEntity) (Object) this;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "tryUseTotem", at = @At("HEAD"), cancellable = true)
    private void tryUseTotem(DamageSource source, CallbackInfoReturnable<Boolean> cir) {
        if (source.isOutOfWorld()) {
            cir.setReturnValue(false);
        } else {
            ItemStack itemStack = null;
            Hand[] var4 = Hand.values();

            for (Hand hand : var4) {
                ItemStack itemStack2 = livingEntity.getStackInHand(hand);
                if (itemStack2.isIn(TagInit.IS_EIDOLON)) {
                    itemStack = itemStack2.copy();
                    itemStack2.damage(1, livingEntity, p -> p.sendToolBreakStatus(hand));
                    break;
                }
            }

                livingEntity.setHealth(1.0F);
                livingEntity.clearStatusEffects();
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 0));
                this.world.sendEntityStatus(this, (byte)105);

            cir.setReturnValue(itemStack != null);
        }
    }


    @Inject(method = "updatePotionVisibility", at = @At("TAIL"))
    protected void activateShadowOfGelidity(CallbackInfo ci) {
        this.setInvisible(livingEntity.hasStatusEffect(EffectInit.LAIDE_BLESSING));
        this.setInvisible(livingEntity.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.SWORD_LAIDE) && livingEntity.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.LAIDE_EIDOLON));
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
