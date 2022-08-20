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
    public static StatusEffect VERET_FAVOUR = new EmptyStatusEffect(StatusEffectCategory.BENEFICIAL, 0xA7C9C9)
            .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635",
                    0.111566666667, EntityAttributeModifier.Operation.MULTIPLY_TOTAL)
            .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9",
                    1.5, EntityAttributeModifier.Operation.MULTIPLY_BASE);
    public static StatusEffect LAIDE_BLESSING = new EmptyStatusEffect(StatusEffectCategory.BENEFICIAL, 0xA7C9C9)
            .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635",
                    0.31777778789994D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    public static StatusEffect BEUSERE_VIRTUE = new EmptyStatusEffect(StatusEffectCategory.BENEFICIAL, 0xA7C9C9);
    public static StatusEffect ORITEM_PROFIT = new EmptyStatusEffect(StatusEffectCategory.BENEFICIAL, 0xA7C9C9);
    public static StatusEffect STERRES_GIFT = new EmptyStatusEffect(StatusEffectCategory.BENEFICIAL, 0xA7C9C9);
    public static StatusEffect GELA_BENEFIT = new EmptyStatusEffect(StatusEffectCategory.BENEFICIAL, 0xA7C9C9);

    public static void init() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "defiant"), DEFIANT);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "veret_favour"), VERET_FAVOUR);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "laide_blessing"), LAIDE_BLESSING);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "beusere_virtue"), BEUSERE_VIRTUE);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "oritem_profit"), ORITEM_PROFIT);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "sterres_gift"), STERRES_GIFT);
        Registry.register(Registry.STATUS_EFFECT, new Identifier(ID, "gela_benefit"), GELA_BENEFIT);
    }

}
