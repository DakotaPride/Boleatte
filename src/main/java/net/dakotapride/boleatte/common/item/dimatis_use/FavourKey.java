package net.dakotapride.boleatte.common.item.dimatis_use;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.item.Item;

public interface FavourKey {
    enum KeyType {
        ARBUNE, // VERÊT
        BABURBEN, // LAIDE
        BOTAKOA, // BEUSÈRE
        PROTOSTERM, // ORITEM
        QUANTILA, // STÉRRES
        RASIORE, // GELÀ
        CITADEL
    }

    static KeyType getDimatisType(Item item) {
        KeyType type = null;

        if (item == ItemInit.VERET_FAVOUR) {
            type = KeyType.ARBUNE;
        } else if (item == ItemInit.LAIDE_FAVOUR) {
            type = KeyType.BABURBEN;
        } else if (item == ItemInit.BEUSERE_FAVOUR) {
            type = KeyType.BOTAKOA;
        } else if (item == ItemInit.ORITEM_FAVOUR) {
            type = KeyType.PROTOSTERM;
        } else if (item == ItemInit.STERRES_FAVOUR) {
            type = KeyType.QUANTILA;
        } else if (item == ItemInit.GELA_FAVOUR) {
            type = KeyType.RASIORE;
        } else if (item == ItemInit.CITADEL_FAVOUR) {
            type = KeyType.ARBUNE;
        }

        return type;
    }
}
