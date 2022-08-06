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
            (EffectInit.DEFIANT, 400, 1), 100).hunger(7).saturationModifier(0.2F).build();
    public static final FoodComponent MIERIRE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4F).build();
    public static final FoodComponent PAIORE = new FoodComponent.Builder().statusEffect(new StatusEffectInstance
            (StatusEffects.HUNGER, 200, 1), 40).hunger(3).saturationModifier(0.1F).build();
    // PAIORE_DOUGH
    public static final FoodComponent PAIEUX = new FoodComponent.Builder().hunger(6).saturationModifier(0.6F).build();
    public static final FoodComponent DE_FEATIANTE = new FoodComponent.Builder().hunger(8).saturationModifier(0.9F).build();

}
