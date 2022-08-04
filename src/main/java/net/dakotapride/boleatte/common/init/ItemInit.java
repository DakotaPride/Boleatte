package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.item.RamoliteHoneyBottleItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.*;

public class ItemInit {
    public static Item QUANALLA = new Item(new FabricItemSettings().food(FoodComponentInit.QUANALLA));
    public static Item BASOLOTE = new Item(new FabricItemSettings().food(FoodComponentInit.BASOLOTE));
    public static Item RAMUKAI = new Item(new FabricItemSettings().food(FoodComponentInit.RAMUKAI));
    public static Item NIKOTA_TU = new Item(new FabricItemSettings().food(FoodComponentInit.NIKOTA_TU));
    public static RamoliteHoneyBottleItem RAMOLITE_HONEY = new RamoliteHoneyBottleItem(new FabricItemSettings().food(FoodComponentInit.RAMOLITE_HONEY));

    public static Item PROTOSTERM_BARK = new Item(new FabricItemSettings());

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(ID, "quanalla"), QUANALLA);
        Registry.register(Registry.ITEM, new Identifier(ID, "basolote"), BASOLOTE);
        Registry.register(Registry.ITEM, new Identifier(ID, "ramukai"), RAMUKAI);
        Registry.register(Registry.ITEM, new Identifier(ID, "ramolite_honey"), RAMOLITE_HONEY);
        Registry.register(Registry.ITEM, new Identifier(ID, "nikota_tu"), NIKOTA_TU);

        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_bark"), PROTOSTERM_BARK);
    }
}
