package net.dakotapride.boleatte.common.init;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
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
            BlockInit.BOLEATTE_ACCESSOR);
    public static final VillagerProfession VERET_MESSENGER = registerProfession("veret_messenger",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "veret_messenger_poi")));

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
                            6,6,0.08f));
                });

        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ItemInit.OPAFEU_GEM, 1),
                            3,8,1.08f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.NEMORAL_GEM, 1),
                            1,7,1.12f));
                });
        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 19),
                            new ItemStack(ItemInit.KUTUNITE_GEM, 1),
                            2,7,1.12f));
                });

        TradeOfferHelper.registerVillagerOffers(VERET_MESSENGER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 33),
                            new ItemStack(ItemInit.ARBUNE_DIMATIS, 1),
                            1,11,2.08f));
                });
    }
}
