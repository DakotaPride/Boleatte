package net.dakotapride.boleatte.common.item.dimatis_use;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.item.Item;

public interface Eidolon {
    enum EidolonType {
        ARBUNE, // VERÊT
        BABURBEN, // LAIDE
        BOTAKOA, // BEUSÈRE
        PROTOSTERM, // ORITEM
        QUANTILA, // STÉRRES
        RASIORE, // GELÀ
        CITADEL // Ascunautic
    }

    static EidolonType getEidolonType(Item item) {
        EidolonType type = null;

        if (item == ItemInit.VERET_EIDOLON) {
            type = EidolonType.ARBUNE;
        } else if (item == ItemInit.LAIDE_EIDOLON) {
            type = EidolonType.BABURBEN;
        } else if (item == ItemInit.BEUSERE_EIDOLON) {
            type = EidolonType.BOTAKOA;
        } else if (item == ItemInit.ORITEM_EIDOLON) {
            type = EidolonType.PROTOSTERM;
        } else if (item == ItemInit.STERRES_EIDOLON) {
            type = EidolonType.QUANTILA;
        } else if (item == ItemInit.GELA_EIDOLON) {
            type = EidolonType.RASIORE;
        } else if (item == ItemInit.CITADEL_EIDOLON) {
            type = EidolonType.CITADEL;
        }

        return type;
    }
}
