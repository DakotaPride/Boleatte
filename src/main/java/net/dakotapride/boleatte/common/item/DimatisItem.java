package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DimatisItem extends Item {
    public DimatisItem(Settings settings) {
        super(settings);
    }

    private enum DimatisType {
        ARBUNE, // VERÊT
        BABURBEN, // LAIDE
        BOTAKOA, // BEUSÈRE
        PROTOSTERM, // ORITEM
        QUANTILA, // STÉRRES
        RASIORE // GELÀ
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
        user.addStatusEffect(getDimatisEffect(getDimatisType(user.getStackInHand(hand).getItem())));
        return super.use(world, user, hand);
    }

    public static StatusEffectInstance getDimatisEffect(DimatisType type) {
        switch (type) {
            case ARBUNE -> {
                return new StatusEffectInstance(EffectInit.VERET_FAVOUR, 600, 0);
            }
            case BABURBEN -> {
                return new StatusEffectInstance(EffectInit.LAIDE_BLESSING, 600, 0);
            }
            case BOTAKOA -> {
                return new StatusEffectInstance(EffectInit.BEUSERE_VIRTUE, 600, 0);
            }
            case PROTOSTERM -> {
                return new StatusEffectInstance(EffectInit.ORITEM_PROFIT, 600, 0);
            }
            case QUANTILA -> {
                return new StatusEffectInstance(EffectInit.STERRES_GIFT, 600, 0);
            }
            case RASIORE -> {
                return new StatusEffectInstance(EffectInit.GELA_BENEFIT, 600, 0);
            }
        }

        return null;
    }



    public DimatisType getDimatisType(Item item) {
        DimatisType type = null;

        if (item == ItemInit.ARBUNE_DIMATIS) {
            type = DimatisType.ARBUNE;
        } else if (item == ItemInit.BABURBEN_DIMATIS) {
            type = DimatisType.BABURBEN;
        } else if (item == ItemInit.BOTAKOA_DIMATIS) {
            type = DimatisType.BOTAKOA;
        } else if (item == ItemInit.PROTOSTERM_DIMATIS) {
            type = DimatisType.PROTOSTERM;
        } else if (item == ItemInit.QUANTILA_DIMATIS) {
            type = DimatisType.QUANTILA;
        } else if (item == ItemInit.RASIORE_DIMATIS) {
            type = DimatisType.RASIORE;
        }

        return type;
    }

}
