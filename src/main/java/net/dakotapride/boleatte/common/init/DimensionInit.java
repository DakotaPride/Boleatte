package net.dakotapride.boleatte.common.init;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class DimensionInit {
    public static final RegistryKey<World> BOLEATTE_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(ID, "boleatte"));

    public static void init() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(BlockInit.ORETESSE)
                .lightWithItem(ItemInit.DIMATIS)
                .destDimID(BOLEATTE_DIMENSION_KEY.getValue())
                .tintColor(211, 255, 239)
                .onlyLightInOverworld()
                .registerPortal();
    }

}
