package net.dakotapride.boleatte.common.init;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class StrippableInit {
    public static void init() {
        StrippableBlockRegistry.register(BlockInit.PROTOSTERM_LOG, BlockInit.STRIPPED_PROTOSTERM_LOG);
        StrippableBlockRegistry.register(BlockInit.PROTOSTERM_WOOD, BlockInit.STRIPPED_PROTOSTERM_WOOD);

        StrippableBlockRegistry.register(BlockInit.BOTAKOA_LOG, BlockInit.STRIPPED_BOTAKOA_LOG);
        StrippableBlockRegistry.register(BlockInit.BOTAKOA_WOOD, BlockInit.STRIPPED_BOTAKOA_WOOD);

        StrippableBlockRegistry.register(BlockInit.ARBUNE_LOG, BlockInit.STRIPPED_ARBUNE_LOG);
        StrippableBlockRegistry.register(BlockInit.ARBUNE_WOOD, BlockInit.STRIPPED_ARBUNE_WOOD);

        StrippableBlockRegistry.register(BlockInit.RASIORE_LOG, BlockInit.STRIPPED_RASIORE_LOG);
        StrippableBlockRegistry.register(BlockInit.RASIORE_WOOD, BlockInit.STRIPPED_RASIORE_WOOD);

        StrippableBlockRegistry.register(BlockInit.DENTICIUS_LOG, BlockInit.STRIPPED_DENTICIUS_LOG);
        StrippableBlockRegistry.register(BlockInit.DENTICIUS_WOOD, BlockInit.STRIPPED_DENTICIUS_WOOD);

        StrippableBlockRegistry.register(BlockInit.SANTIFICT_LOG, BlockInit.STRIPPED_SANTIFICT_LOG);
        StrippableBlockRegistry.register(BlockInit.SANTIFICT_WOOD, BlockInit.STRIPPED_SANTIFICT_WOOD);
    }
}
