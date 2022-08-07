package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.item.ProtostermShieldItem;
import net.dakotapride.boleatte.common.item.RamoliteHoneyBottleItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.*;

public class ItemInit {
    public static BlockItem QUANALLA = new BlockItem(BlockInit.QUANALLA_BUSH, new FabricItemSettings().food(FoodComponentInit.QUANALLA));
    public static Item BASOLOTE = new Item(new FabricItemSettings().food(FoodComponentInit.BASOLOTE));
    public static Item RAMUKAI = new Item(new FabricItemSettings().food(FoodComponentInit.RAMUKAI));
    public static Item NIKOTA_TU = new Item(new FabricItemSettings().food(FoodComponentInit.NIKOTA_TU));
    public static Item MIERIRE = new Item(new FabricItemSettings().food(FoodComponentInit.MIERIRE));
    public static Item PAIORE = new Item(new FabricItemSettings().food(FoodComponentInit.PAIORE));
    public static Item PAIEUX = new Item(new FabricItemSettings().food(FoodComponentInit.PAIEUX));
    public static Item PAIEUX_DOUGH = new Item(new FabricItemSettings());
    public static Item DE_FEATIANTE = new Item(new FabricItemSettings().food(FoodComponentInit.DE_FEATIANTE));
    public static RamoliteHoneyBottleItem RAMOLITE_HONEY = new RamoliteHoneyBottleItem(new FabricItemSettings().food(FoodComponentInit.RAMOLITE_HONEY));
    public static Item PROTOSTERM_BARK = new Item(new FabricItemSettings());
    public static ProtostermShieldItem PROTOSTERM_SHIELD_BASE = new ProtostermShieldItem(new FabricItemSettings().maxDamage(283),
            15, 4);
    public static ProtostermShieldItem PROTOSTERM_SHIELD = new ProtostermShieldItem(new FabricItemSettings().maxDamage(358),
            10, 6);


    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(ID, "quanalla"), QUANALLA);
        Registry.register(Registry.ITEM, new Identifier(ID, "basolote"), BASOLOTE);
        Registry.register(Registry.ITEM, new Identifier(ID, "ramukai"), RAMUKAI);
        Registry.register(Registry.ITEM, new Identifier(ID, "ramolite_honey"), RAMOLITE_HONEY);
        Registry.register(Registry.ITEM, new Identifier(ID, "nikota_tu"), NIKOTA_TU);
        Registry.register(Registry.ITEM, new Identifier(ID, "mierire"), MIERIRE);
        Registry.register(Registry.ITEM, new Identifier(ID, "paiore"), PAIORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "paieux"), PAIEUX);
        Registry.register(Registry.ITEM, new Identifier(ID, "paieux_dough"), PAIEUX_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(ID, "de_featiante"), DE_FEATIANTE);

        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_bark"), PROTOSTERM_BARK);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_shield_unfinished"), PROTOSTERM_SHIELD_BASE);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_shield"), PROTOSTERM_SHIELD);
    }
}
