package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.block.*;
import net.dakotapride.boleatte.common.gen.ArbuneSaplingGenerator;
import net.dakotapride.boleatte.common.gen.BotakoaSaplingGenerator;
import net.dakotapride.boleatte.common.gen.ProtostermSaplingGenerator;
import net.dakotapride.boleatte.common.gen.RasioreSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.*;

public class BlockInit {

    public static SaplingBlock PROTOSTERM_SAPLING = new SaplingBlock(new ProtostermSaplingGenerator(15),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock PROTOSTERM_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_PROTOSTERM_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock PROTOSTERM_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_PROTOSTERM_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block PROTOSTERM_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static SaplingBlock BOTAKOA_SAPLING = new SaplingBlock(new BotakoaSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock BOTAKOA_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_BOTAKOA_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock BOTAKOA_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_BOTAKOA_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block BOTAKOA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock BOTAKOA_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static SaplingBlock ARBUNE_SAPLING = new SaplingBlock(new ArbuneSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock ARBUNE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_ARBUNE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock ARBUNE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_ARBUNE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block ARBUNE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock ARBUNE_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static SaplingBlock RASIORE_SAPLING = new SaplingBlock(new RasioreSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock RASIORE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_RASIORE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock RASIORE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_RASIORE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block RASIORE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static RasioreLeavesBlock RASIORE_LEAVES = new RasioreLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static QuanallaBushBlock QUANALLA_BUSH = new QuanallaBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().nonOpaque());
    public static LeavesBlock DEAD_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES));

    public static Block VIOLES = new Block(FabricBlockSettings.copy(Blocks.SAND));
    public static Block VETICOADE = new Block(FabricBlockSettings.copy(Blocks.SANDSTONE));

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_sapling"), PROTOSTERM_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_sapling"), new BlockItem(PROTOSTERM_SAPLING, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_log"), PROTOSTERM_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_log"), new BlockItem(PROTOSTERM_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_leaves"), PROTOSTERM_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_leaves"), new BlockItem(PROTOSTERM_LEAVES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_protosterm_log"), STRIPPED_PROTOSTERM_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_protosterm_log"), new BlockItem(STRIPPED_PROTOSTERM_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_wood"), PROTOSTERM_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_wood"), new BlockItem(PROTOSTERM_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_protosterm_wood"), STRIPPED_PROTOSTERM_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_protosterm_wood"), new BlockItem(STRIPPED_PROTOSTERM_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_planks"), PROTOSTERM_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_planks"), new BlockItem(PROTOSTERM_PLANKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "botakoa_sapling"), BOTAKOA_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(ID, "botakoa_sapling"), new BlockItem(BOTAKOA_SAPLING, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "botakoa_log"), BOTAKOA_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "botakoa_log"), new BlockItem(BOTAKOA_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "botakoa_leaves"), BOTAKOA_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "botakoa_leaves"), new BlockItem(BOTAKOA_LEAVES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_botakoa_log"), STRIPPED_BOTAKOA_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_botakoa_log"), new BlockItem(STRIPPED_BOTAKOA_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "botakoa_wood"), BOTAKOA_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "botakoa_wood"), new BlockItem(BOTAKOA_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_botakoa_wood"), STRIPPED_BOTAKOA_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_botakoa_wood"), new BlockItem(STRIPPED_BOTAKOA_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "botakoa_planks"), BOTAKOA_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "botakoa_planks"), new BlockItem(BOTAKOA_PLANKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "arbune_sapling"), ARBUNE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(ID, "arbune_sapling"), new BlockItem(ARBUNE_SAPLING, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "arbune_log"), ARBUNE_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "arbune_log"), new BlockItem(ARBUNE_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "arbune_leaves"), ARBUNE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "arbune_leaves"), new BlockItem(ARBUNE_LEAVES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_arbune_log"), STRIPPED_ARBUNE_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_arbune_log"), new BlockItem(STRIPPED_ARBUNE_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "arbune_wood"), ARBUNE_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "arbune_wood"), new BlockItem(ARBUNE_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_arbune_wood"), STRIPPED_ARBUNE_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_arbune_wood"), new BlockItem(STRIPPED_ARBUNE_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "arbune_planks"), ARBUNE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "arbune_planks"), new BlockItem(ARBUNE_PLANKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "rasiore_sapling"), RASIORE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(ID, "rasiore_sapling"), new BlockItem(RASIORE_SAPLING, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rasiore_log"), RASIORE_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "rasiore_log"), new BlockItem(RASIORE_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rasiore_leaves"), RASIORE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "rasiore_leaves"), new BlockItem(RASIORE_LEAVES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_rasiore_log"), STRIPPED_RASIORE_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_rasiore_log"), new BlockItem(STRIPPED_RASIORE_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rasiore_wood"), RASIORE_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "rasiore_wood"), new BlockItem(RASIORE_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_rasiore_wood"), STRIPPED_RASIORE_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_rasiore_wood"), new BlockItem(STRIPPED_RASIORE_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rasiore_planks"), RASIORE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "rasiore_planks"), new BlockItem(RASIORE_PLANKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "quanalla_bush"), QUANALLA_BUSH);
        Registry.register(Registry.BLOCK, new Identifier(ID, "dead_leaves"), DEAD_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "dead_leaves"), new BlockItem(DEAD_LEAVES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "violes"), VIOLES);
        Registry.register(Registry.ITEM, new Identifier(ID, "violes"), new BlockItem(VIOLES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "veticoade"), VETICOADE);
        Registry.register(Registry.ITEM, new Identifier(ID, "veticoade"), new BlockItem(VETICOADE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

    }

}
