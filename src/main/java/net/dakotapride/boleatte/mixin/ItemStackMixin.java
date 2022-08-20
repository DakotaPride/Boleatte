package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStack.class)
public class ItemStackMixin {

    @Inject(method = "postHit", at = @At("TAIL"))
    private void attackWithAGodsMight(LivingEntity target, PlayerEntity attacker, CallbackInfo ci) {
        if (target.hasStatusEffect(EffectInit.BEUSERE_VIRTUE)) {
            attacker.damage(DamageSource.thorns(target), 5.0F);
        }

        if (attacker.getStackInHand(Hand.MAIN_HAND).getItem() instanceof SwordItem && attacker.hasStatusEffect(EffectInit.STERRES_GIFT)
                || attacker.getStackInHand(Hand.MAIN_HAND).getItem() instanceof AxeItem && attacker.hasStatusEffect(EffectInit.STERRES_GIFT)) {
            target.setOnFire(true);
            target.setFireTicks(100);
        }
    }
}
