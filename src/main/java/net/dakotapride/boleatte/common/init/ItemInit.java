package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.item.*;
import net.dakotapride.boleatte.common.item.alphiagou.BlossomingAlphiagouItem;
import net.dakotapride.boleatte.common.item.alphiagou.GhostAlphiagouItem;
import net.dakotapride.boleatte.common.item.alphiagou.PerfervidAlphiagouItem;
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
                    itemStacks.add(new ItemStack(SAKALOU));
                    itemStacks.add(new ItemStack(RASIORE));
                    itemStacks.add(new ItemStack(ROASTED_RASIORE));
                    itemStacks.add(new ItemStack(BABURBEN));
                    itemStacks.add(new ItemStack(ROASTED_BABURBEN));
                    itemStacks.add(new ItemStack(LEPHELUSA_CORAL_SHARD));
                    itemStacks.add(new ItemStack(MELKIRSCH_SEEDS));
                    itemStacks.add(new ItemStack(MELKIRSCH_PIE));
                    itemStacks.add(new ItemStack(ETTERAVE_BAMBOO));
                    itemStacks.add(new ItemStack(QUESTEAR));
                    itemStacks.add(new ItemStack(CENTILOPIK));
                    itemStacks.add(new ItemStack(POLECEA));
                    itemStacks.add(new ItemStack(ALPHIAGOU));
                    itemStacks.add(new ItemStack(PERFERVID_ALPHIAGOU));
                    itemStacks.add(new ItemStack(GHOST_ALPHIAGOU));
                    itemStacks.add(new ItemStack(BLOSSOMING_ALPHIAGOU));
                    itemStacks.add(new ItemStack(PHANTASMAL_ALPHIAGOU));
                    itemStacks.add(new ItemStack(CONSTRUCTIVE_ALPHIAGOU));
                    itemStacks.add(new ItemStack(PLENTIFUL_ALPHIAGOU));
                    itemStacks.add(new ItemStack(ALPHIAGOU_SUBSTANCE));
                    itemStacks.add(new ItemStack(LEMENTRIO_SUBSTANCE));
                    itemStacks.add(new ItemStack(PYETSIT_SUBSTANCE));
                    itemStacks.add(new ItemStack(SATALUK_SUBSTANCE));
                    itemStacks.add(new ItemStack(LEPHELUSA_STEW));
                    itemStacks.add(new ItemStack(DE_FEATIANTE));
                    itemStacks.add(new ItemStack(ALPHIAGOU_CIDER));
                    itemStacks.add(new ItemStack(MYSTICAL_ALPHIAGOU_CIDER));

                    itemStacks.add(new ItemStack(OPAFEU_GEM));
                    itemStacks.add(new ItemStack(KUTUNITE_GEM));
                    itemStacks.add(new ItemStack(LATZECK_GEM));
                    itemStacks.add(new ItemStack(NEMORAL_GEM));
                    itemStacks.add(new ItemStack(CINTONIUM_GEM));
                    itemStacks.add(new ItemStack(LEPOSIATE_GEM));
                    itemStacks.add(new ItemStack(GEURINE_GEM));
                    itemStacks.add(new ItemStack(PAROMULINE_GEM));
                    itemStacks.add(new ItemStack(POUHGRIOD_GEM));
                    itemStacks.add(new ItemStack(GENGERODE_GEM));
                    itemStacks.add(new ItemStack(COGEMMES));

                    itemStacks.add(new ItemStack(VERET_EIDOLON));
                    itemStacks.add(new ItemStack(LAIDE_EIDOLON));
                    itemStacks.add(new ItemStack(BEUSERE_EIDOLON));
                    itemStacks.add(new ItemStack(ORITEM_EIDOLON));
                    itemStacks.add(new ItemStack(STERRES_EIDOLON));
                    itemStacks.add(new ItemStack(GELA_EIDOLON));
                    itemStacks.add(new ItemStack(CITADEL_EIDOLON));

                    itemStacks.add(new ItemStack(STAFF_VERET));
                    itemStacks.add(new ItemStack(SWORD_LAIDE));
                    itemStacks.add(new ItemStack(SWORD_BEUSERE));
                    itemStacks.add(new ItemStack(AXE_ORITEM));
                    itemStacks.add(new ItemStack(AXE_STERRES));
                    itemStacks.add(new ItemStack(STAFF_GELA));

                    itemStacks.add(new ItemStack(DIMATIS));
                    itemStacks.add(new ItemStack(ARBUNE_DIMATIS));
                    itemStacks.add(new ItemStack(BABURBEN_DIMATIS));
                    itemStacks.add(new ItemStack(BOTAKOA_DIMATIS));
                    itemStacks.add(new ItemStack(PROTOSTERM_DIMATIS));
                    itemStacks.add(new ItemStack(QUANTILA_DIMATIS));
                    itemStacks.add(new ItemStack(RASIORE_DIMATIS));

                    itemStacks.add(new ItemStack(BlockInit.ORETESSE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_BRICKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.DARK_REMENTIO.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.DARK_REMENTIO_BRICKS.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_OPAFEU_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_KUTUNITE_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_LATZECK_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_NEMORAL_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_CINTONIUM_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_LEPOSIATE_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_GEURINE_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_PAROMULINE_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_POUHGRIOD_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_GENGERODE_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_IRON_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_GOLD_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_DIAMOND_ORE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.REMENTIO_EMERALD_ORE.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.MELKIRSCH.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_REMENTIO.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_REMENTIO.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_REMENTIO.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_REMENTIO.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ETTERAVE_REMENTIO.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.DENTICIUS_REMENTIO.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.DEAD_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.DENTICIUS_LEAVES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BLOOMING_DENTICIUS_LEAVES.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_SAPLING.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_SAPLING.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_SAPLING.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_SAPLING.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.DENTICIUS_SAPLING.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_PLANKS.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.DENTICIUS_PLANKS.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.PROTOSTERM_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_PROTOSTERM_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_PROTOSTERM_WOOD.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.BOTAKOA_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_BOTAKOA_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_BOTAKOA_WOOD.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.ARBUNE_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_ARBUNE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_ARBUNE_WOOD.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.RASIORE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.RASIORE_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_RASIORE_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_RASIORE_WOOD.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.DENTICIUS_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.DENTICIUS_WOOD.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_DENTICIUS_LOG.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.STRIPPED_DENTICIUS_WOOD.asItem()));

                    itemStacks.add(new ItemStack(BlockInit.VIOLES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.VETICOADE.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.LEPHELUSA_VIOLES.asItem()));
                    itemStacks.add(new ItemStack(BlockInit.LEPHELUSA_CORAL_BLOCK.asItem()));
                }).build();
    }

    public static Item LEPHELUSA_CORAL_SHARD = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item KUTUNITE_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item LATZECK_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item NEMORAL_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item OPAFEU_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item CINTONIUM_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item LEPOSIATE_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item GEURINE_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item PAROMULINE_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item POUHGRIOD_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item GENGERODE_GEM = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static Item COGEMMES = new Item(new FabricItemSettings().group(BoleatteItemGroup.BOLEATTE));
    public static EidolonItem CITADEL_EIDOLON = new EidolonItem(new FabricItemSettings().maxDamage(105).group(BoleatteItemGroup.BOLEATTE));
    public static Item VERET_EIDOLON = new Item(new FabricItemSettings().maxDamage(65).group(BoleatteItemGroup.BOLEATTE));
    public static Item ORITEM_EIDOLON = new Item(new FabricItemSettings().maxDamage(65).group(BoleatteItemGroup.BOLEATTE));
    public static Item BEUSERE_EIDOLON = new Item(new FabricItemSettings().maxDamage(65).group(BoleatteItemGroup.BOLEATTE));
    public static Item LAIDE_EIDOLON = new Item(new FabricItemSettings().maxDamage(65).group(BoleatteItemGroup.BOLEATTE));
    public static Item STERRES_EIDOLON = new Item(new FabricItemSettings().maxDamage(65).group(BoleatteItemGroup.BOLEATTE));
    public static Item GELA_EIDOLON = new Item(new FabricItemSettings().maxDamage(65).group(BoleatteItemGroup.BOLEATTE));
    public static StaffItem STAFF_VERET = new StaffItem(ToolMaterials.NETHERITE, 6, -2.4F, new FabricItemSettings().maxDamage(786).group(BoleatteItemGroup.BOLEATTE));
    public static AxeItem AXE_ORITEM = new AxeItem(ToolMaterials.NETHERITE, 7, -3.2F, new FabricItemSettings().maxDamage(814).group(BoleatteItemGroup.BOLEATTE));
    public static SwordItem SWORD_BEUSERE = new SwordItem(ToolMaterials.NETHERITE, 7, -2.7F, new FabricItemSettings().maxDamage(803).group(BoleatteItemGroup.BOLEATTE));
    public static SwordItem SWORD_LAIDE = new SwordItem(ToolMaterials.NETHERITE, 7, -2.7F, new FabricItemSettings().maxDamage(803).group(BoleatteItemGroup.BOLEATTE));
    public static AxeItem AXE_STERRES = new AxeItem(ToolMaterials.NETHERITE, 7, -3.2F, new FabricItemSettings().maxDamage(814).group(BoleatteItemGroup.BOLEATTE));
    public static StaffItem STAFF_GELA = new StaffItem(ToolMaterials.NETHERITE, 6, -2.4F, new FabricItemSettings().maxDamage(786).group(BoleatteItemGroup.BOLEATTE));
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
    public static FilledBottleItem RAMOLITE_HONEY = new FilledBottleItem(new FabricItemSettings().food(FoodComponentInit.RAMOLITE_HONEY).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticBlockItem SAKALOU = new AscunauticBlockItem(BlockInit.SAKALOU_ROOTS, new FabricItemSettings().food(FoodComponentInit.SAKALOU).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem RASIORE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.RASIORE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem ROASTED_RASIORE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.ROASTED_RASIORE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticBlockItem BABURBEN = new AscunauticBlockItem(BlockInit.BABURBEN_ROOTS, new FabricItemSettings().food(FoodComponentInit.BABURBEN).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem ROASTED_BABURBEN = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.ROASTED_BABURBEN).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem ALPHIAGOU = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static PerfervidAlphiagouItem PERFERVID_ALPHIAGOU = new PerfervidAlphiagouItem(new FabricItemSettings().food(FoodComponentInit.PERFERVID_ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static GhostAlphiagouItem GHOST_ALPHIAGOU = new GhostAlphiagouItem(new FabricItemSettings().food(FoodComponentInit.GHOST_ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static BlossomingAlphiagouItem BLOSSOMING_ALPHIAGOU = new BlossomingAlphiagouItem(new FabricItemSettings().food(FoodComponentInit.BLOSSOMING_ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static PerfervidAlphiagouItem PHANTASMAL_ALPHIAGOU = new PerfervidAlphiagouItem(new FabricItemSettings().food(FoodComponentInit.PHANTASMAL_ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static GhostAlphiagouItem CONSTRUCTIVE_ALPHIAGOU = new GhostAlphiagouItem(new FabricItemSettings().food(FoodComponentInit.CONSTRUCTIVE_ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static BlossomingAlphiagouItem PLENTIFUL_ALPHIAGOU = new BlossomingAlphiagouItem(new FabricItemSettings().food(FoodComponentInit.PLENTIFUL_ALPHIAGOU).group(BoleatteItemGroup.BOLEATTE));
    public static FilledBottleItem ALPHIAGOU_SUBSTANCE = new FilledBottleItem(new FabricItemSettings().food(FoodComponentInit.ALPHIAGOU_SUBSTANCE).group(BoleatteItemGroup.BOLEATTE));
    public static FilledBottleItem LEMENTRIO_SUBSTANCE = new FilledBottleItem(new FabricItemSettings().food(FoodComponentInit.LEMENTRIO_SUBSTANCE).group(BoleatteItemGroup.BOLEATTE));
    public static FilledBottleItem PYETSIT_SUBSTANCE = new FilledBottleItem(new FabricItemSettings().food(FoodComponentInit.PYETSIT_SUBSTANCE).group(BoleatteItemGroup.BOLEATTE));
    public static FilledBottleItem SATALUK_SUBSTANCE = new FilledBottleItem(new FabricItemSettings().food(FoodComponentInit.SATALUK_SUBSTANCE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem MELKIRSCH_PIE = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.MELKIRSCH_PIE).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticBlockItem ETTERAVE_BAMBOO = new AscunauticBlockItem(BlockInit.ETTERAVE_BAMBOO, new FabricItemSettings().food(FoodComponentInit.ETTERAVE_BAMBOO).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem CENTILOPIK = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.CENTILOPIK).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem QUESTEAR = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.QUESTEAR).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem POLECEA = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.POLECEA).group(BoleatteItemGroup.BOLEATTE));
    public static AscunauticItem LEPHELUSA_STEW = new AscunauticItem(new FabricItemSettings().food(FoodComponentInit.LEPHELUSA_STEW).group(BoleatteItemGroup.BOLEATTE));
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
        Registry.register(Registry.ITEM, new Identifier(ID, "lephelusa_coral_shard"), LEPHELUSA_CORAL_SHARD);
        Registry.register(Registry.ITEM, new Identifier(ID, "melkirsch_pie"), MELKIRSCH_PIE);
        Registry.register(Registry.ITEM, new Identifier(ID, "etterave_bamboo"), ETTERAVE_BAMBOO);
        Registry.register(Registry.ITEM, new Identifier(ID, "questear"), QUESTEAR);
        Registry.register(Registry.ITEM, new Identifier(ID, "centilopik"), CENTILOPIK);
        Registry.register(Registry.ITEM, new Identifier(ID, "polecea"), POLECEA);
        Registry.register(Registry.ITEM, new Identifier(ID, "alphiagou"), ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "perfervid_alphiagou"), PERFERVID_ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "ghost_alphiagou"), GHOST_ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "blossoming_alphiagou"), BLOSSOMING_ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "phantasmal_alphiagou"), PHANTASMAL_ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "constructive_alphiagou"), CONSTRUCTIVE_ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "plentiful_alphiagou"), PLENTIFUL_ALPHIAGOU);
        Registry.register(Registry.ITEM, new Identifier(ID, "alphiagou_substance"), ALPHIAGOU_SUBSTANCE);
        Registry.register(Registry.ITEM, new Identifier(ID, "lementrio_substance"), LEMENTRIO_SUBSTANCE);
        Registry.register(Registry.ITEM, new Identifier(ID, "pyetsit_substance"), PYETSIT_SUBSTANCE);
        Registry.register(Registry.ITEM, new Identifier(ID, "sataluk_substance"), SATALUK_SUBSTANCE);
        Registry.register(Registry.ITEM, new Identifier(ID, "lephelusa_stew"), LEPHELUSA_STEW);
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
        Registry.register(Registry.ITEM, new Identifier(ID, "geurine"), GEURINE_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "paromuline"), PAROMULINE_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "pouhgriod"), POUHGRIOD_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "gengerode"), GENGERODE_GEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "cogemmes"), COGEMMES);

        Registry.register(Registry.ITEM, new Identifier(ID, "citadel_eidolon"), CITADEL_EIDOLON);
        Registry.register(Registry.ITEM, new Identifier(ID, "veret_eidolon"), VERET_EIDOLON);
        Registry.register(Registry.ITEM, new Identifier(ID, "oritem_eidolon"), ORITEM_EIDOLON);
        Registry.register(Registry.ITEM, new Identifier(ID, "beusere_eidolon"), BEUSERE_EIDOLON);
        Registry.register(Registry.ITEM, new Identifier(ID, "laide_eidolon"), LAIDE_EIDOLON);
        Registry.register(Registry.ITEM, new Identifier(ID, "sterres_eidolon"), STERRES_EIDOLON);
        Registry.register(Registry.ITEM, new Identifier(ID, "gela_eidolon"), GELA_EIDOLON);

        Registry.register(Registry.ITEM, new Identifier(ID, "veret_staff"), STAFF_VERET);
        Registry.register(Registry.ITEM, new Identifier(ID, "oritem_axe"), AXE_ORITEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "beusere_sword"), SWORD_BEUSERE);
        Registry.register(Registry.ITEM, new Identifier(ID, "laide_sword"), SWORD_LAIDE);
        Registry.register(Registry.ITEM, new Identifier(ID, "sterres_axe"), AXE_STERRES);
        Registry.register(Registry.ITEM, new Identifier(ID, "gela_staff"), STAFF_GELA);
    }
}
