package net.dakotapride.boleatte.common.item.alphiagou;

import com.google.common.collect.Maps;
import net.dakotapride.boleatte.common.init.TagInit;
import net.dakotapride.boleatte.common.item.AscunauticItem;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.criterion.CriterionConditions;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.entity.LocationPredicate;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureKeys;

import java.util.Map;

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
            if (!user.getSteppingBlockState().isIn(TagInit.IS_STERRES_DUNGEON_BLOCKS)
                    && Advancement.Builder.criterion("ancient_city", TickCriterion.Conditions.createLocation
                    (LocationPredicate.feature(StructureKeys.ANCIENT_CITY)))) {
                user.sendMessage(Text.translatable("text.sterres.denial"), false);
                user.getItemCooldownManager().set(this, 100);
                return TypedActionResult.fail(user.getStackInHand(hand));
            } else {
                return ItemUsage.consumeHeldItem(world, user, hand);
            }
        }

        return super.use(world, user, hand);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!user.getWorld().isClient()) {
            user.sendMessage(Text.translatable("text.alphiagou.signalling.sterres"));
        }

        return super.finishUsing(stack, world, user);
    }

}
