package net.dakotapride.boleatte.common.item.inventory;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public interface ProtostermShieldInterface {

    int getCooldownTicks();

    boolean supportsBanner();

    default boolean acceptsShieldEnchantments() {
        return true;
    }

    default boolean displayTooltip() {
        return true;
    }

    default void appendShieldTooltip(ItemStack stack, List<Text> tooltip, TooltipContext context) {

    }

}
