package net.dakotapride.boleatte.common.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponentInit {

    public static final FoodComponent QUANALLA = new FoodComponent.Builder().hunger(3).saturationModifier(0.6F).build();
    public static final FoodComponent BASOLOTE = new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build();
    public static final FoodComponent RAMUKAI = new FoodComponent.Builder().hunger(3).saturationModifier(0.4F).build();
    public static final FoodComponent NIKOTA_TU = new FoodComponent.Builder().hunger(5).saturationModifier(0.4F).build();
    public static final FoodComponent RAMOLITE_HONEY = new FoodComponent.Builder().statusEffect(new StatusEffectInstance
            (EffectInit.DEFIANT, 400, 1), 1.0F).hunger(7).saturationModifier(0.2F).build();
    public static final FoodComponent MIERIRE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build();
    public static final FoodComponent PAIORE = new FoodComponent.Builder().statusEffect(new StatusEffectInstance
            (StatusEffects.HUNGER, 200, 1), 4.0F).hunger(3).saturationModifier(0.1F).build();
    public static final FoodComponent PAIEUX = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent DE_FEATIANTE = new FoodComponent.Builder().hunger(8).saturationModifier(0.9F).build();
    public static final FoodComponent SAKALOU = new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build();
    public static final FoodComponent RASIORE = new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build();
    public static final FoodComponent ROASTED_RASIORE = new FoodComponent.Builder().hunger(5).saturationModifier(0.7F).build();
    public static final FoodComponent BABURBEN = new FoodComponent.Builder().hunger(6).saturationModifier(0.7F).build();
    public static final FoodComponent ROASTED_BABURBEN = new FoodComponent.Builder().hunger(7).saturationModifier(0.9F).build();
    public static final FoodComponent ALPHIAGOU = new FoodComponent.Builder().hunger(5).saturationModifier(0.5F).build();
    public static final FoodComponent PERFERVID_ALPHIAGOU = new FoodComponent.Builder().statusEffect(new StatusEffectInstance
                    (EffectInit.STERRES_GIFT, 240, 1), 1.0F).statusEffect(new StatusEffectInstance
            (StatusEffects.FIRE_RESISTANCE, 360, 0), 0.5f).hunger(5).saturationModifier(0.5F).build();
    public static final FoodComponent GHOST_ALPHIAGOU = new FoodComponent.Builder().statusEffect(new StatusEffectInstance
            (EffectInit.LAIDE_BLESSING, 240, 1), 1.0F).statusEffect(new StatusEffectInstance
            (StatusEffects.RESISTANCE, 360, 1), 0.5f).hunger(5).saturationModifier(0.5F).build();
    public static final FoodComponent BLOSSOMING_ALPHIAGOU = new FoodComponent.Builder().statusEffect(new StatusEffectInstance
            (EffectInit.BEUSERE_VIRTUE, 240, 1), 1.0F).statusEffect(new StatusEffectInstance
            (StatusEffects.LUCK, 360, 1), 0.5f).hunger(5).saturationModifier(0.5F).build();
    public static final FoodComponent LEPHELUSA_STEW = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent ALPHIAGOU_SUBSTANCE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build();
    public static final FoodComponent LEMENTRIO_SUBSTANCE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build();
    public static final FoodComponent PYETSIT_SUBSTANCE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build();
    public static final FoodComponent SATALUK_SUBSTANCE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build();
    public static final FoodComponent MELKIRSCH_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(0.6F).build();
    public static final FoodComponent ALPHIAGOU_CIDER = new FoodComponent.Builder().hunger(7).saturationModifier(0.8F).build();
    public static final FoodComponent MYSTICAL_ALPHIAGOU_CIDER = new FoodComponent.Builder().hunger(9).saturationModifier(0.7F).build();

}
