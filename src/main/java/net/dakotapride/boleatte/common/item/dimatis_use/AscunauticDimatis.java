package net.dakotapride.boleatte.common.item.dimatis_use;

import net.dakotapride.boleatte.common.init.EffectInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;

public interface AscunauticDimatis {
    enum DimatisType {
        ARBUNE, // VERÊT
        BABURBEN, // LAIDE
        BOTAKOA, // BEUSÈRE
        PROTOSTERM, // ORITEM
        QUANTILA, // STÉRRES
        RASIORE // GELÀ
    }

    static StatusEffectInstance getDimatisEffect(DimatisType type) {
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

    static DimatisType getDimatisType(Item item) {
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
