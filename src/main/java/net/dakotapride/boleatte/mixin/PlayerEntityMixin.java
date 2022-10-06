package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.DamageSourcesInit;
import net.dakotapride.boleatte.common.init.TagInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    private final PlayerEntity playerEntity = (PlayerEntity) (Object) this;
    private static final Identifier BOLEATTE = new Identifier("boleatte:boleatte");

    public PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo ci) {
        if (!(playerEntity.getOffHandStack().isIn(TagInit.SAFE_BOLEATTE))
                && (playerEntity.world.getRegistryKey().getValue().equals(BOLEATTE))) {
                playerEntity.damage(DamageSourcesInit.VIRULENT, 1.0F);
        }

    }

}
