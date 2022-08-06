package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.effect.EmptyStatusEffect;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.*;

public class EffectInit {

    public static StatusEffect DEFIANT = new EmptyStatusEffect(StatusEffectCategory.NEUTRAL, 0xA7C9C9)
            .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890",
                    -0.15000000596046448D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);

    public static void init() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "defiant"), DEFIANT);
    }

}
