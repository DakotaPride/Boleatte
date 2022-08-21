package net.dakotapride.boleatte.common.init;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class VillagerInit {
    public static final PointOfInterestType VERET_MESSENGER_POI = registerPOI("veret_messenger_poi",
            BlockInit.ARBUNE_ACCESSOR);
    public static final PointOfInterestType LAIDE_MESSENGER_POI = registerPOI("laide_messenger_poi",
            BlockInit.BABURBEN_ACCESSOR);
    public static final PointOfInterestType STERRES_MESSENGER_POI = registerPOI("sterres_messenger_poi",
            BlockInit.QUANTILA_ACCESSOR);
    public static final PointOfInterestType GELA_MESSENGER_POI = registerPOI("gela_messenger_poi",
            BlockInit.RASIORE_ACCESSOR);
    public static final PointOfInterestType BEUSERE_MESSENGER_POI = registerPOI("beusere_messenger_poi",
            BlockInit.BOTAKOA_ACCESSOR);
    public static final PointOfInterestType ORITEM_MESSENGER_POI = registerPOI("oritem_messenger_poi",
            BlockInit.PROTOSTERM_ACCESSOR);

    public static final VillagerProfession VERET_MESSENGER = registerProfession("veret_messenger",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "veret_messenger_poi")));
    public static final VillagerProfession LAIDE_MESSENGER = registerProfession("laide_messenger",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "laide_messenger_poi")));
    public static final VillagerProfession STERRES_MESSENGER = registerProfession("sterres_messenger",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "sterres_messenger_poi")));
    public static final VillagerProfession GELA_MESSENGER = registerProfession("gela_messenger",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "gela_messenger_poi")));
    public static final VillagerProfession BEUSERE_MESSENGER = registerProfession("beusere_messenger",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "beusere_messenger_poi")));
    public static final VillagerProfession ORITEM_MESSENGER = registerProfession("oritem_messenger",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "oritem_messenger_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void init() {
        checkVeretMessengerTrades();
        checkLaideMessengerTrades();
        checkSterresMessengerTrades();
        checkGelaMessengerTrades();
        checkBeusereMessengerTrades();
        checkOritemMessengerTrades();
    }

    private static void checkOritemMessengerTrades() {
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.REMENTIO.asItem(), 4),
                            16,4,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(BlockInit.PROTOSTERM_LOG, 8),
                            6,6,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ItemInit.NEMORAL_GEM, 1),
                            3,8,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LATZECK_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.OPAFEU_GEM, 1),
                            1,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LEPOSIATE_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.KUTUNITE_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.CINTONIUM_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(ItemInit.PROTOSTERM_DIMATIS, 1),
                            1,11,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.PROTOSTERM_DIMATIS, 1),
                            new ItemStack(ItemInit.DIMATIS, 1),
                            1,11,0.01f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ENCHANTED_BOOK, 1),
                            1,11,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.PAIORE, 6),
                            8,6,0.04f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.PAIEUX_DOUGH, 2),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.PAIEUX, 6),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.QUANTILA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BOTAKOA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.RASIORE_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BABURBEN_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(ORITEM_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.PROTOSTERM_REMENTIO.asItem(), 4),
                            12,7,0.03f));
                });
    }


    private static void checkBeusereMessengerTrades() {
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.REMENTIO.asItem(), 4),
                            16,4,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(BlockInit.BOTAKOA_LOG, 8),
                            6,6,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ItemInit.LATZECK_GEM, 1),
                            3,8,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.NEMORAL_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.OPAFEU_GEM, 1),
                            1,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LEPOSIATE_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.KUTUNITE_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.CINTONIUM_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(ItemInit.BOTAKOA_DIMATIS, 1),
                            1,11,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.BOTAKOA_DIMATIS, 1),
                            new ItemStack(ItemInit.DIMATIS, 1),
                            1,11,0.01f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ENCHANTED_BOOK, 1),
                            1,11,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.BASOLOTE, 8),
                            8,6,0.04f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.RAMUKAI, 8),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ItemInit.RAMOLITE_HONEY, 1),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.QUANTILA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.PROTOSTERM_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.RASIORE_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BABURBEN_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(BEUSERE_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.BOTAKOA_REMENTIO.asItem(), 4),
                            12,7,0.03f));
                });
    }


    private static void checkGelaMessengerTrades() {
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.REMENTIO.asItem(), 4),
                            16,4,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(BlockInit.RASIORE_LOG, 8),
                            6,6,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ItemInit.LEPOSIATE_GEM, 1),
                            3,8,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.NEMORAL_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.OPAFEU_GEM, 1),
                            1,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LATZECK_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.KUTUNITE_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.CINTONIUM_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(ItemInit.RASIORE_DIMATIS, 1),
                            1,11,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.RASIORE_DIMATIS, 1),
                            new ItemStack(ItemInit.DIMATIS, 1),
                            1,11,0.01f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ENCHANTED_BOOK, 1),
                            1,11,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.RASIORE, 8),
                            8,6,0.04f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.ROASTED_RASIORE, 8),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.RASIORE, 8),
                            new ItemStack(Items.EMERALD, 1),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.QUANTILA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.PROTOSTERM_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BOTAKOA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BABURBEN_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(GELA_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.RASIORE_REMENTIO.asItem(), 4),
                            12,7,0.03f));
                });
    }


    private static void checkSterresMessengerTrades() {
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.REMENTIO.asItem(), 4),
                            16,4,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.DEAD_LEAVES.asItem(), 8),
                            6,6,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ItemInit.CINTONIUM_GEM, 1),
                            3,8,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.NEMORAL_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LEPOSIATE_GEM, 1),
                            1,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LATZECK_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.OPAFEU_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.KUTUNITE_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(ItemInit.QUANTILA_DIMATIS, 1),
                            1,11,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.QUANTILA_DIMATIS, 1),
                            new ItemStack(ItemInit.DIMATIS, 1),
                            1,11,0.01f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ENCHANTED_BOOK, 1),
                            1,11,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.QUANALLA, 8),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.QUANALLA, 8),
                            new ItemStack(Items.EMERALD, 1),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BABURBEN_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.PROTOSTERM_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.RASIORE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BOTAKOA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(STERRES_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Blocks.RED_SAND.asItem(), 4),
                            12,7,0.03f));
                });
    }


    private static void checkLaideMessengerTrades() {
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.REMENTIO.asItem(), 4),
                            16,4,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(BlockInit.VETICOADE.asItem(), 8),
                            6,6,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ItemInit.KUTUNITE_GEM, 1),
                            3,8,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.NEMORAL_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LEPOSIATE_GEM, 1),
                            1,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LATZECK_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.OPAFEU_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.CINTONIUM_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(ItemInit.BABURBEN_DIMATIS, 1),
                            1,11,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.BABURBEN_DIMATIS, 1),
                            new ItemStack(ItemInit.DIMATIS, 1),
                            1,11,0.01f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ENCHANTED_BOOK, 1),
                            1,11,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.BABURBEN, 8),
                            8,6,0.04f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.ROASTED_BABURBEN, 8),
                            8,6,0.04f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.SAKALOU, 8),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.BABURBEN, 6),
                            new ItemStack(Items.EMERALD, 1),
                            8,6,0.04f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.SAKALOU, 6),
                            new ItemStack(Items.EMERALD, 1),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.QUANTILA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.PROTOSTERM_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.RASIORE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BOTAKOA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(LAIDE_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.LEPHELUSA_VIOLES.asItem(), 4),
                            12,7,0.03f));
                });
    }


    private static void checkVeretMessengerTrades() {
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.REMENTIO.asItem(), 4),
                            16,4,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(BlockInit.ARBUNE_LOG, 8),
                            6,6,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ItemInit.OPAFEU_GEM, 1),
                            3,8,0.02f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.NEMORAL_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LEPOSIATE_GEM, 1),
                            1,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.LATZECK_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.KUTUNITE_GEM, 1),
                            2,7,0.06f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.CINTONIUM_GEM, 1),
                            2,7,0.06f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            1,11,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            new ItemStack(ItemInit.DIMATIS, 1),
                            1,11,0.01f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ENCHANTED_BOOK, 1),
                            1,11,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.BASOLOTE, 8),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ItemInit.MIERIRE, 8),
                            8,6,0.04f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.QUANTILA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.PROTOSTERM_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.RASIORE_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BOTAKOA_DIMATIS, 1),
                            1,7,0.03f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 27),
                            new ItemStack(ItemInit.BABURBEN_DIMATIS, 1),
                            1,7,0.03f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(BlockInit.ARBUNE_REMENTIO.asItem(), 4),
                            12,7,0.03f));
                });
    }
}
