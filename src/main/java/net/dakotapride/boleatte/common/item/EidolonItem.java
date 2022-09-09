package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.dakotapride.boleatte.common.item.dimatis_use.Eidolon;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EidolonItem extends AscunauticItem implements Eidolon {
    public EidolonItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        BlockPos pos = user.getBlockPos();
        if (user.isSneaking()) {
            if (user.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.CITADEL_EIDOLON)) {
                float randomValue = world.random.nextFloat() * 60;
                if (randomValue < 60 && randomValue > 50) {
                    user.dropStack(ItemInit.STERRES_EIDOLON.getDefaultStack());
                } else if (randomValue < 50 && randomValue > 40) {
                    user.dropStack(ItemInit.VERET_EIDOLON.getDefaultStack());
                } else if (randomValue < 40 && randomValue > 30) {
                    user.dropStack(ItemInit.ORITEM_EIDOLON.getDefaultStack());
                } else if (randomValue < 30 && randomValue > 20) {
                    user.dropStack(ItemInit.GELA_EIDOLON.getDefaultStack());
                } else if (randomValue < 20 && randomValue > 10) {
                    user.dropStack(ItemInit.BEUSERE_EIDOLON.getDefaultStack());
                } else if (randomValue < 10) {
                    user.dropStack(ItemInit.LAIDE_EIDOLON.getDefaultStack());
                }

                user.getStackInHand(hand).damage(1, user, p -> p.sendToolBreakStatus(hand));
                for(int i = 0; i < 360; i++) {
                    if (i % 20 == 0) {
                        world.addParticle(ParticleTypes.SOUL,
                                pos.getX() + 0.5d, pos.getY() + 1, pos.getZ() + 0.5d,
                                Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d);
                    }
                }
            }

        }
        return super.use(world, user, hand);
    }
}
