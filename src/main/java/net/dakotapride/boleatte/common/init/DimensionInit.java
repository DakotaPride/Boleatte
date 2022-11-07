package net.dakotapride.boleatte.common.init;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.util.Identifier;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class DimensionInit {

    public static void init() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(BlockInit.ORETESSE)
                .customIgnitionSource(PortalIgnitionSource.ItemUseSource(ItemInit.DIMATIS.getDefaultStack().getItem()))
                .destDimID(new Identifier(ID, "boleatte"))
                .tintColor(211, 255, 239)
                .registerPortal();
    }

}
