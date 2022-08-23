package net.dakotapride.boleatte.common.item.alphiagou;

import net.dakotapride.boleatte.common.init.StructureKeyInit;
import net.dakotapride.boleatte.common.item.AscunauticItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class PerfervidAlphiagouItem extends AscunauticItem {
    public PerfervidAlphiagouItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_EAT;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!user.getWorld().isClient()) {
            if (world instanceof ServerWorld serverWorld) {
                if (!(serverWorld.getStructureAccessor().getStructureAt
                        (user.getBlockPos(), getStructureKey.get(StructureKeyInit.BARREN_LANDS)).hasChildren())) {
                    user.sendMessage(Text.translatable("text.sterres.denial"), false);
                    user.getItemCooldownManager().set(this, 100);
                    return TypedActionResult.fail(user.getStackInHand(hand));
                } else {
                    return ItemUsage.consumeHeldItem(world, user, hand);
                }
            }
        }

            return super.use(world, user, hand);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!user.getWorld().isClient()) {
            if (world instanceof ServerWorld serverWorld) {
                if (serverWorld.getStructureAccessor().getStructureAt
                        (user.getBlockPos(), getStructureKey.get(StructureKeyInit.BARREN_LANDS)).hasChildren()) {
                    user.sendMessage(Text.translatable("text.alphiagou.signalling.sterres"));
                }
            }
        }

        return super.finishUsing(stack, world, user);
    }

}
