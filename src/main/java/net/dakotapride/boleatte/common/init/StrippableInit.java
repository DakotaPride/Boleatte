package net.dakotapride.boleatte.common.init;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class StrippableInit {
    public static void init() {
        StrippableBlockRegistry.register(BlockInit.PROTOSTERM_LOG, BlockInit.STRIPPED_PROTOSTERM_LOG);
        StrippableBlockRegistry.register(BlockInit.PROTOSTERM_WOOD, BlockInit.STRIPPED_PROTOSTERM_WOOD);
    }
}
