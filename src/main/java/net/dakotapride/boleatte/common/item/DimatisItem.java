package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.dakotapride.boleatte.common.item.dimatis_use.AscunauticDimatis;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DimatisItem extends Item implements AscunauticDimatis {
    public DimatisItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.isOf(ItemInit.ARBUNE_DIMATIS)) {
            tooltip.add(Text.translatable("text.dimatis.veret_trusting").setStyle(Style.EMPTY.withColor(0xF9A357)));
        } else if (stack.isOf(ItemInit.BOTAKOA_DIMATIS)) {
            tooltip.add(Text.translatable("text.dimatis.beusere_trusting").setStyle(Style.EMPTY.withColor(0x686DA5)));
        } else if (stack.isOf(ItemInit.RASIORE_DIMATIS)) {
            tooltip.add(Text.translatable("text.dimatis.gela_trusting").setStyle(Style.EMPTY.withColor(0x393D72)));
        } else if (stack.isOf(ItemInit.BABURBEN_DIMATIS)) {
            tooltip.add(Text.translatable("text.dimatis.laide_trusting").setStyle(Style.EMPTY.withColor(0xDA9FB0)));
        } else if (stack.isOf(ItemInit.QUANTILA_DIMATIS)) {
            tooltip.add(Text.translatable("text.dimatis.sterres_trusting").setStyle(Style.EMPTY.withColor(0xCC4818)));
        } else if (stack.isOf(ItemInit.PROTOSTERM_DIMATIS)) {
            tooltip.add(Text.translatable("text.dimatis.oritem_trusting").setStyle(Style.EMPTY.withColor(0xD0E3ED)));
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.isSneaking()) {
            user.addStatusEffect(AscunauticDimatis.getDimatisEffect(AscunauticDimatis.getDimatisType(user.getStackInHand(hand).getItem())));
            if (user.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.ARBUNE_DIMATIS)) {
                user.sendMessage(Text.translatable("text.veret_favour.hunted_wild")
                        .formatted(Formatting.BOLD).setStyle(Style.EMPTY.withColor(0xF9A357)), true);
            } else if (user.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.BOTAKOA_DIMATIS)) {
                user.sendMessage(Text.translatable("text.beusere_virtue.prickly_rose")
                        .formatted(Formatting.BOLD).setStyle(Style.EMPTY.withColor(0x686DA5)), true);
            } else if (user.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.RASIORE_DIMATIS)) {
                user.sendMessage(Text.translatable("text.gela_benefit.decaying_shame")
                        .formatted(Formatting.BOLD).setStyle(Style.EMPTY.withColor(0x393D72)), true);
            } else if (user.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.BABURBEN_DIMATIS)) {
                user.sendMessage(Text.translatable("text.laide_blessing.gelidity_shadow")
                        .formatted(Formatting.BOLD).setStyle(Style.EMPTY.withColor(0xDA9FB0)), true);
            } else if (user.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.QUANTILA_DIMATIS)) {
                user.sendMessage(Text.translatable("text.sterres_gift.heated_bitterness")
                        .formatted(Formatting.BOLD).setStyle(Style.EMPTY.withColor(0xCC4818)), true);
            } else if (user.getStackInHand(Hand.OFF_HAND).isOf(ItemInit.PROTOSTERM_DIMATIS)) {
                user.sendMessage(Text.translatable("text.oritem_profit.magical_beginnings")
                        .formatted(Formatting.BOLD).setStyle(Style.EMPTY.withColor(0xD0E3ED)), true);
            }
            user.getItemCooldownManager().set(this, 800);
            user.getStackInHand(hand).damage(1, user, (player) -> player.sendToolBreakStatus(player.getActiveHand()));
            return super.use(world, user, hand);
        }
        return null;
    }

}
