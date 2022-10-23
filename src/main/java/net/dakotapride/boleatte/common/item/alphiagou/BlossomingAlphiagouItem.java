package net.dakotapride.boleatte.common.item.alphiagou;

import net.dakotapride.boleatte.common.init.StructureKeyInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.Structure;

public class BlossomingAlphiagouItem extends Item {
    public BlossomingAlphiagouItem(Settings settings) {
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
                Registry<Structure> getStructureKey = serverWorld.getStructureAccessor()
                        .getRegistryManager().get(Registry.STRUCTURE_KEY);

                if (!(serverWorld.getStructureAccessor().getStructureAt
                        (user.getBlockPos(), getStructureKey.get(StructureKeyInit.OVERGROWN_RAGE)).hasChildren()) && !user.isCreative()) {
                    user.sendMessage(Text.translatable("text.boleatte.beusere.denial"), false);
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
                Registry<Structure> getStructureKey = serverWorld.getStructureAccessor()
                        .getRegistryManager().get(Registry.STRUCTURE_KEY);

                if (serverWorld.getStructureAccessor().getStructureAt
                        (user.getBlockPos(), getStructureKey.get(StructureKeyInit.OVERGROWN_RAGE)).hasChildren()) {
                    user.sendMessage(Text.translatable("text.boleatte.alphiagou.signalling.beusere"));
                }
            }
        }

        return super.finishUsing(stack, world, user);
    }

}
