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

    public static SaplingBlock PROTOSTERM_SAPLING = new SaplingBlock(new ProtostermSaplingGenerator(15),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock PROTOSTERM_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_PROTOSTERM_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock PROTOSTERM_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_PROTOSTERM_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block PROTOSTERM_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque());
    public static LeavesBlock BASOLOTE_PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque());
    public static LeavesBlock QUANALLA_PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque());
    public static LeavesBlock MIERIRE_PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque());
    public static LeavesBlock RAMUKAI_PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque());

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_sapling"), PROTOSTERM_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_sapling"), new BlockItem(PROTOSTERM_SAPLING, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_log"), PROTOSTERM_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_log"), new BlockItem(PROTOSTERM_LOG, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_leaves"), PROTOSTERM_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_leaves"), new BlockItem(PROTOSTERM_LEAVES, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_leaves_basolote"), BASOLOTE_PROTOSTERM_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_leaves_basolote"), new BlockItem(BASOLOTE_PROTOSTERM_LEAVES, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_leaves_quanalla"), QUANALLA_PROTOSTERM_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_leaves_quanalla"), new BlockItem(QUANALLA_PROTOSTERM_LEAVES, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_leaves_mierire"), MIERIRE_PROTOSTERM_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_leaves_mierire"), new BlockItem(MIERIRE_PROTOSTERM_LEAVES, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_leaves_ramukai"), RAMUKAI_PROTOSTERM_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_leaves_ramukai"), new BlockItem(RAMUKAI_PROTOSTERM_LEAVES, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_protosterm_log"), STRIPPED_PROTOSTERM_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_protosterm_log"), new BlockItem(STRIPPED_PROTOSTERM_LOG, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_wood"), PROTOSTERM_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_wood"), new BlockItem(PROTOSTERM_WOOD, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_protosterm_wood"), STRIPPED_PROTOSTERM_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_protosterm_wood"), new BlockItem(STRIPPED_PROTOSTERM_WOOD, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_planks"), PROTOSTERM_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_planks"), new BlockItem(PROTOSTERM_PLANKS, new FabricItemSettings()));
    }

}
