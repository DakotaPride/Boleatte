package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BaseDimatisItem extends Item {
    public BaseDimatisItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.getMainHandStack().isOf(ItemInit.DIMATIS) && user.getOffHandStack().isOf(ItemInit.OPAFEU_GEM)) {
            user.getMainHandStack().decrement(1);
            user.getOffHandStack().decrement(1);

            user.giveItemStack(new ItemStack(ItemInit.ARBUNE_DIMATIS));
        } else if (user.getMainHandStack().isOf(ItemInit.DIMATIS) && user.getOffHandStack().isOf(ItemInit.LATZECK_GEM)) {
            user.getMainHandStack().decrement(1);
            user.getOffHandStack().decrement(1);

            user.giveItemStack(new ItemStack(ItemInit.BOTAKOA_DIMATIS));
        } else if (user.getMainHandStack().isOf(ItemInit.DIMATIS) && user.getOffHandStack().isOf(ItemInit.KUTUNITE_GEM)) {
            user.getMainHandStack().decrement(1);
            user.getOffHandStack().decrement(1);

            user.giveItemStack(new ItemStack(ItemInit.BABURBEN_DIMATIS));
        } else if (user.getMainHandStack().isOf(ItemInit.DIMATIS) && user.getOffHandStack().isOf(ItemInit.NEMORAL_GEM)) {
            user.getMainHandStack().decrement(1);
            user.getOffHandStack().decrement(1);

            user.giveItemStack(new ItemStack(ItemInit.PROTOSTERM_DIMATIS));
        } else if (user.getMainHandStack().isOf(ItemInit.DIMATIS) && user.getOffHandStack().isOf(ItemInit.CINTONIUM_GEM)) {
            user.getMainHandStack().decrement(1);
            user.getOffHandStack().decrement(1);

            user.giveItemStack(new ItemStack(ItemInit.QUANTILA_DIMATIS));
        } else if (user.getMainHandStack().isOf(ItemInit.DIMATIS) && user.getOffHandStack().isOf(ItemInit.LEPOSIATE_GEM)) {
            user.getMainHandStack().decrement(1);
            user.getOffHandStack().decrement(1);

            user.giveItemStack(new ItemStack(ItemInit.RASIORE_DIMATIS));
        }


        return super.use(world, user, hand);
    }
}
