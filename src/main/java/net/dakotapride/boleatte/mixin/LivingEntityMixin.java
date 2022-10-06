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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

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
        } else if (livingEntity instanceof PlayerEntity player) {
            ItemStack itemStack = null;
            Hand[] var4 = Hand.values();

            for (Hand hand : var4) {
                ItemStack itemStack2 = player.getStackInHand(hand);
                if (itemStack2.isIn(TagInit.IS_EIDOLON)) {
                    itemStack = itemStack2.copy();
                    itemStack2.damage(1, player, p -> p.sendToolBreakStatus(hand));
                    break;
                }
            }

            player.setHealth(1.0F);
            player.clearStatusEffects();
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 0));
            this.world.sendEntityStatus(this, (byte)105);

            cir.setReturnValue(itemStack != null);
        }
    }


    @Inject(method = "updatePotionVisibility", at = @At("TAIL"))
    protected void activateShadowOfGelidity(CallbackInfo ci) {
        this.setInvisible(livingEntity.hasStatusEffect(EffectInit.LAIDE_BLESSING));
        this.setInvisible(livingEntity.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.SWORD_LAIDE) && livingEntity.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.LAIDE_EIDOLON));
    }



}
