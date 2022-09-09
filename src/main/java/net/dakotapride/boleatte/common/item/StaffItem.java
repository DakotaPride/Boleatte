package net.dakotapride.boleatte.common.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class StaffItem extends SwordItem {
    public StaffItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
