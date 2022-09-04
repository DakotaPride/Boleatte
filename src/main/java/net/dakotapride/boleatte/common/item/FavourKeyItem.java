package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.dakotapride.boleatte.common.item.dimatis_use.FavourKey;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FavourKeyItem extends AscunauticItem implements FavourKey {
    public FavourKeyItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        BlockPos pos = user.getBlockPos();
        if (user.isSneaking()) {
            if (user.getStackInHand(hand).isOf(ItemInit.CITADEL_FAVOUR)) {
                float randomValue2 = world.random.nextFloat() * 60;
                if (randomValue2 < 60 && randomValue2 > 50) {
                    user.dropStack(ItemInit.STERRES_FAVOUR.getDefaultStack());
                } else if (randomValue2 < 50 && randomValue2 > 40) {
                    user.dropStack(ItemInit.VERET_FAVOUR.getDefaultStack());
                } else if (randomValue2 < 40 && randomValue2 > 30) {
                    user.dropStack(ItemInit.ORITEM_FAVOUR.getDefaultStack());
                } else if (randomValue2 < 30 && randomValue2 > 20) {
                    user.dropStack(ItemInit.GELA_FAVOUR.getDefaultStack());
                } else if (randomValue2 < 20 && randomValue2 > 10) {
                    user.dropStack(ItemInit.BEUSERE_FAVOUR.getDefaultStack());
                } else if (randomValue2 < 10) {
                    user.dropStack(ItemInit.LAIDE_FAVOUR.getDefaultStack());
                }
            } else if (user.getStackInHand(hand).isOf(ItemInit.STERRES_FAVOUR)) {
                user.dropStack(ItemInit.CINTONIUM_GEM.getDefaultStack());
            } else if (user.getStackInHand(hand).isOf(ItemInit.VERET_FAVOUR)) {
                user.dropStack(ItemInit.OPAFEU_GEM.getDefaultStack());
            } else if (user.getStackInHand(hand).isOf(ItemInit.ORITEM_FAVOUR)) {
                user.dropStack(ItemInit.NEMORAL_GEM.getDefaultStack());
            } else if (user.getStackInHand(hand).isOf(ItemInit.GELA_FAVOUR)) {
                user.dropStack(ItemInit.LEPOSIATE_GEM.getDefaultStack());
            } else if (user.getStackInHand(hand).isOf(ItemInit.BEUSERE_FAVOUR)) {
                user.dropStack(ItemInit.LATZECK_GEM.getDefaultStack());
            } else if (user.getStackInHand(hand).isOf(ItemInit.LAIDE_FAVOUR)) {
                user.dropStack(ItemInit.KUTUNITE_GEM.getDefaultStack());
            }

            for(int i = 0; i < 360; i++) {
                if (i % 20 == 0) {
                    world.addParticle(ParticleTypes.SOUL,
                            pos.getX() + 0.5d, pos.getY() + 1, pos.getZ() + 0.5d,
                            Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d);
                    world.addParticle(ParticleTypes.DRAGON_BREATH,
                            pos.getX() + 1.5d, pos.getY() + 1, pos.getZ() + 1.5d,
                            Math.cos(i) * 1.25d, 1.15d, Math.sin(i) * 1.25d);
                }
            }

        }
        return super.use(world, user, hand);
    }
}
