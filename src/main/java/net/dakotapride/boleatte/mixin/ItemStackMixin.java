package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.dakotapride.boleatte.common.init.TagInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStack.class)
public class ItemStackMixin {

    @Inject(method = "postHit", at = @At("TAIL"))
    private void postHit(LivingEntity target, PlayerEntity attacker, CallbackInfo ci) {
        if (attacker.getStackInHand(Hand.MAIN_HAND).getItem() instanceof SwordItem && attacker.hasStatusEffect(EffectInit.STERRES_GIFT)
                || attacker.getStackInHand(Hand.MAIN_HAND).getItem() instanceof AxeItem && attacker.hasStatusEffect(EffectInit.STERRES_GIFT)) {
            target.setOnFire(true);
            target.setFireTicks(100);
        }

        if (attacker.getStackInHand(Hand.OFF_HAND).getItem() instanceof BowItem && attacker.hasStatusEffect(EffectInit.VERET_FAVOUR)
                || attacker.getStackInHand(Hand.MAIN_HAND).getItem() instanceof BowItem && attacker.hasStatusEffect(EffectInit.VERET_FAVOUR)) {
            target.setGlowing(true);
            target.setMovementSpeed(-10);
        }
    }

}
