package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.gen.ProtostermSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class BlockInit {

    public static SaplingBlock PROTOSTERM_SAPLING = new SaplingBlock(new ProtostermSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING));
    public static PillarBlock PROTOSTERM_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static LeavesBlock PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES));

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_sapling"), PROTOSTERM_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_sapling"), new BlockItem(PROTOSTERM_SAPLING, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_log"), PROTOSTERM_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_log"), new BlockItem(PROTOSTERM_LOG, new FabricItemSettings()));
    }

}
