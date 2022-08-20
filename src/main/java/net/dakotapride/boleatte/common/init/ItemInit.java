package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.item.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class ItemInit {

    public static class BoleatteItemGroup {
        public static ItemGroup BOLEATTE = FabricItemGroupBuilder.create(
                        new Identifier(ID, "boleatte_group"))
                .icon(() -> new ItemStack(BlockInit.PROTOSTERM_LOG.asItem()))
                .appendItems(itemStacks -> {
                    itemStacks.add(new ItemStack(QUANALLA));
                    itemStacks.add(new ItemStack(BASOLOTE));
                    itemStacks.add(new ItemStack(RAMUKAI));
                    itemStacks.add(new ItemStack(RAMOLITE_HONEY));
                    itemStacks.add(new ItemStack(NIKOTA_TU));
                    itemStacks.add(new ItemStack(MIERIRE));
                    itemStacks.add(new ItemStack(PAIORE));
                    itemStacks.add(new ItemStack(PAIEUX_DOUGH));
                    itemStacks.add(new ItemStack(PAIEUX));
                    itemStacks.add(new ItemStack(ALPHIAGOU));
                    itemStacks.add(new ItemStack(SAKALOU));
                    itemStacks.add(new ItemStack(RASIORE));
                    itemStacks.add(new ItemStack(ROASTED_RASIORE));
                    itemStacks.add(new ItemStack(BABURBEN));
                    itemStacks.add(new ItemStack(ROASTED_BABURBEN));
                    itemStacks.add(new ItemStack(DE_FEATIANTE));
                    itemStacks.add(new ItemStack(ALPHIAGOU_CIDER));
                    itemStacks.add(new ItemStack(MYSTICAL_ALPHIAGOU_CIDER));

                    itemStacks.add(new ItemStack(OPAFEU_GEM));
                    itemStacks.add(new ItemStack(KUTUNITE_GEM));
                    itemStacks.add(new ItemStack(LATZECK_GEM));
                    itemStacks.add(new ItemStack(NEMORAL_GEM));
                    itemStacks.add(new ItemStack(CINTONIUM_GEM));
                    itemStacks.add(new ItemStack(LEPOSIATE_GEM));
                    itemStacks.add(new ItemStack(DIMATIS));
                    itemStacks.add(new ItemStack(ARBUNE_DIMATIS));
                    itemStacks.add(new ItemStack(BABURBEN_DIMATIS));
                    itemStacks.add(new ItemStack(BOTAKOA_DIMATIS));
                    itemStacks.add(new ItemStack(PROTOSTERM_DIMATIS));
                    itemStacks.add(new ItemStack(QUANTILA_DIMATIS));
                    itemStacks.add(new ItemStack(RASIORE_DIMATIS));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_OPAFEU_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_KUTUNITE_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_LATZECK_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_NEMORAL_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_CINTONIUM_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_LEPOSIATE_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_IRON_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_GOLD_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_DIAMOND_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_EMERALD_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ORETESSE.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.DEAD_LEAVES.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_PROTOSTERM_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_PROTOSTERM_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_SAPLING.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_BOTAKOA_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_BOTAKOA_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_SAPLING.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_ARBUNE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_ARBUNE_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_SAPLING.asItem()));
                    itemStacks.add(new ItemStack(MELKIRSCH_SEEDS));
                    itemStacks.add(new ItemStack(BlockInit.MELKIRSCH.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.RASIORE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_RASIORE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_RASIORE_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_SAPLING.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.VIOLES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.VETICOADE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.LEPHELUSA_VIOLES.asItem()));
                }).build();
    }

    public static Item KUTUNITE_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item LATZECK_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item NEMORAL_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item OPAFEU_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item CINTONIUM_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item LEPOSIATE_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static BaseDimatisItem DIMATIS = new BaseDimatisItem(new FabricItemSettings().maxCount(1).group(BoleatteItemGroup.BOLEATTE));
    public static DimatisItem ARBUNE_DIMATIS = new DimatisItem(new FabricItemSettings().maxCount(1).maxDamage(61).group(BoleatteItemGroup.BOLEATTE));
    public static DimatisItem BABURBEN_DIMATIS = new DimatisItem(new FabricItemSettings().maxCount(1).maxDamage(61).group(BoleatteItemGroup.BOLEATTE));
    public static DimatisItem BOTAKOA_DIMATIS = new DimatisItem(new FabricItemSettings().maxCount(1).maxDamage(61).group(BoleatteItemGroup.BOLEATTE));
    public static DimatisItem PROTOSTERM_DIMATIS = new DimatisItem(new FabricItemSettings().maxCount(1).maxDamage(61).group(BoleatteItemGroup.BOLEATTE));
    public static DimatisItem RASIORE_DIMATIS = new DimatisItem(new FabricItemSettings().maxCount(1).maxDamage(61).group(BoleatteItemGroup.BOLEATTE));
    public static DimatisItem QUANTILA_DIMATIS = new DimatisItem(new FabricItemSettings().maxCount(1).maxDamage(61).group(BoleatteItemGroup.BOLEATTE));
    public static AliasedBlockItem MELKIRSCH_SEEDS = new AliasedBlockItem(BlockInit.MELKIRSCH_STEM, new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticBlockItem QUANALLA = new AscunauticBlockItem(BlockInit.QUANALLA_BUSH, new FabricItemSettings().food(FoodComponentInit.QUANALLA).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem BASOLOTE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.BASOLOTE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem RAMUKAI = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.RAMUKAI).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem NIKOTA_TU = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.NIKOTA_TU).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem MIERIRE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.MIERIRE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem PAIORE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.PAIORE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem PAIEUX = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.PAIEUX).group(BoleatteItemGroup.BOLEATTE));
    public static Item PAIEUX_DOUGH = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem DE_FEATIANTE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.DE_FEATIANTE).group(BoleatteItemGroup.BOLEATTE));
    public static RamoliteHoneyBottleItem RAMOLITE_HONEY = new RamoliteHoneyBottleItem(new FabricItemSettings().food(FoodComponentInit.RAMOLITE_HONEY).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticBlockItem SAKALOU = new AscunauticBlockItem(BlockInit.SAKALOU_ROOTS, new FabricItemSettings().food(FoodComponentInit.SAKALOU).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem RASIORE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.RASIORE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem ROASTED_RASIORE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.ROASTED_RASIORE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticBlockItem BABURBEN = new AscunauticBlockItem(BlockInit.BABURBEN_ROOTS, new FabricItemSettings().food(FoodComponentInit.BABURBEN).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem ROASTED_BABURBEN = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.ROASTED_BABURBEN).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem ALPHIAGOU = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem ALPHIAGOU_CIDER = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.ALPHIAGOU_CIDER).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem MYSTICAL_ALPHIAGOU_CIDER = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.MYSTICAL_ALPHIAGOU_CIDER).group(BoleatteItemGroup.BOLEATTE));

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
        Registry.register(Registry.ITEM, new Identifier(ID, "sakalou"), SAKALOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "rasiore"), RASIORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "roasted_rasiore"), ROASTED_RASIORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "baburben"), BABURBEN);
        Registry.register(Registry.ITEM, new Identifier(ID, "roasted_baburben"), ROASTED_BABURBEN);
        Registry.register(Registry.ITEM, new Identifier(ID, "melkirsch_seeds"), MELKIRSCH_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(ID, "alphiagou"), ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "alphiagou_cider"), ALPHIAGOU_CIDER);
        Registry.register(Registry.ITEM, new Identifier(ID, "mystical_alphiagou_cider"), MYSTICAL_ALPHIAGOU_CIDER);

        Registry.register(Registry.ITEM, new Identifier(ID, "dimatis"), DIMATIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "dimatis_arbune"), ARBUNE_DIMATIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "dimatis_baburben"), BABURBEN_DIMATIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "dimatis_botakoa"), BOTAKOA_DIMATIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "dimatis_protosterm"), PROTOSTERM_DIMATIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "dimatis_quantila"), QUANTILA_DIMATIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "dimatis_rasiore"), RASIORE_DIMATIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "opafeu"), OPAFEU_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "kutunite"), KUTUNITE_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "latzeck"), LATZECK_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "nemoral"), NEMORAL_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "cintonium"), CINTONIUM_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "leposiate"), LEPOSIATE_GEM);
    }
}
