package net.dakotapride.boleatte.common.init;

import com.google.common.collect.ImmutableSet;
import net.dakotapride.boleatte.common.block.BoleatteAccessorBlock;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class VillagerInit {
    public static final PointOfInterestType VERET_DESCENDANT_POI = registerPOI("veret_descendant_poi",
            BlockInit.BOLEATTE_ACCESSOR);
    public static final VillagerProfession VERET_DESCENDANT = registerProfession("veret_descendant",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(ID, "veret_descendant_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(ID, name),
                new PointOfInterestType(ImmutableSet.copyOf(block.getStateManager().getStates()),1, 1));
    }
}
