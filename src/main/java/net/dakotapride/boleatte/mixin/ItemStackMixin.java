package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    
    @Inject(method = "postHit", at = @At("TAIL"))
    private void attackWithAGodsMight(LivingEntity target, PlayerEntity attacker, CallbackInfo ci) {
        int gelaAmplifier = Objects.requireNonNull(target.getStatusEffect(EffectInit.GELA_BENEFIT)).getAmplifier();
        int beusereAmplifier = Objects.requireNonNull(target.getStatusEffect(EffectInit.BEUSERE_VIRTUE)).getAmplifier();
        if (target.hasStatusEffect(EffectInit.BEUSERE_VIRTUE)
                || attacker.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.SWORD_BEUSERE) && attacker.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.BEUSERE_EIDOLON)) {
            attacker.damage(DamageSource.thorns(target), 5.0F * (beusereAmplifier + 1));
        }

        if (target.hasStatusEffect(EffectInit.GELA_BENEFIT)
                || attacker.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.STAFF_GELA) && attacker.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.GELA_EIDOLON)) {
            attacker.damage(DamageSource.WITHER, 0.5F * (gelaAmplifier + 1));
        }

        if (attacker.getStackInHand(Hand.MAIN_HAND).getItem() instanceof SwordItem && attacker.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.STERRES_EIDOLON) && attacker.hasStatusEffect(EffectInit.STERRES_GIFT)
                || attacker.getStackInHand(Hand.MAIN_HAND).getItem() instanceof AxeItem && attacker.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.STERRES_EIDOLON) && attacker.hasStatusEffect(EffectInit.STERRES_GIFT)
                || attacker.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.AXE_STERRES) && attacker.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.STERRES_EIDOLON)) {
            target.setOnFire(true);
            target.setFireTicks(100);
        }
    }
}
