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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class BlockInit {

    public static RementioBlock REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block REMENTIO_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS));
    public static Block ARBUNE_REMENTIO = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block BOTAKOA_REMENTIO = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block RASIORE_REMENTIO = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block PROTOSTERM_REMENTIO = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block ETTERAVE_REMENTIO = new Block(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block ORETESSE = new Block(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_HYPHAE).requiresTool());

    public static EtteraveBambooBlock ETTERAVE_BAMBOO = new EtteraveBambooBlock(FabricBlockSettings.of(Material.BAMBOO, MapColor.LAPIS_BLUE)
            .ticksRandomly().strength(1.0F).sounds(BlockSoundGroup.BAMBOO).nonOpaque());

    public static OreBlock REMENTIO_OPAFEU_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_KUTUNITE_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_LATZECK_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_NEMORAL_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_CINTONIUM_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_LEPOSIATE_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));

    public static Block REMENTIO_IRON_ORE = new Block(FabricBlockSettings.copy(Blocks.IRON_ORE).requiresTool());
    public static Block REMENTIO_GOLD_ORE = new Block(FabricBlockSettings.copy(Blocks.GOLD_ORE).requiresTool());
    public static OreBlock REMENTIO_DIAMOND_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_EMERALD_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.EMERALD_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));

    public static RementioBarrelBlock REMENTIO_BARREL = new RementioBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL).requiresTool());

    public static ProtostermSaplingBlock PROTOSTERM_SAPLING = new ProtostermSaplingBlock(new ProtostermSaplingGenerator(15),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock PROTOSTERM_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_PROTOSTERM_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock PROTOSTERM_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_PROTOSTERM_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block PROTOSTERM_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock PROTOSTERM_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static BotakoaSaplingBlock BOTAKOA_SAPLING = new BotakoaSaplingBlock(new BotakoaSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock BOTAKOA_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_BOTAKOA_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock BOTAKOA_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_BOTAKOA_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block BOTAKOA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock BOTAKOA_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static MelkirschBlock MELKIRSCH = new MelkirschBlock(FabricBlockSettings.copy(Blocks.PUMPKIN));
    public static AttachedStemBlock ATTACHED_MELKIRSCH_STEM = new AttachedStemBlock(MELKIRSCH, () -> ItemInit.MELKIRSCH_SEEDS,
            FabricBlockSettings.copy(Blocks.ATTACHED_PUMPKIN_STEM));
    public static StemBlock MELKIRSCH_STEM = new StemBlock(MELKIRSCH, () -> ItemInit.MELKIRSCH_SEEDS,
            FabricBlockSettings.copy(Blocks.PUMPKIN_STEM));
    public static ArbuneSaplingBlock ARBUNE_SAPLING = new ArbuneSaplingBlock(new ArbuneSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock ARBUNE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_ARBUNE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock ARBUNE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_ARBUNE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block ARBUNE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock ARBUNE_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static RasioreSaplingBlock RASIORE_SAPLING = new RasioreSaplingBlock(new RasioreSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock RASIORE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_RASIORE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock RASIORE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_RASIORE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block RASIORE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static RasioreLeavesBlock RASIORE_LEAVES = new RasioreLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());

    public static QuanallaBushBlock QUANALLA_BUSH = new QuanallaBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().nonOpaque());
    public static LeavesBlock DEAD_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES));
    public static SakalouRootsBlock SAKALOU_ROOTS = new SakalouRootsBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().nonOpaque());

    public static Block VIOLES = new Block(FabricBlockSettings.copy(Blocks.SAND));
    public static Block VETICOADE = new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static Block LEPHELUSA_VIOLES = new Block(FabricBlockSettings.copy(Blocks.SAND));
    public static Block LEPHELUSA_CORAL_BLOCK = new Block(FabricBlockSettings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static BaburbenRootsBlock BABURBEN_ROOTS = new BaburbenRootsBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().nonOpaque());

    public static Block DARK_REMENTIO = new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0F, 3600000.0F).dropsNothing());
    public static Block DARK_REMENTIO_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0F, 3600000.0F).dropsNothing());
    public static Block SCORCHED_REMENTIO_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0F, 3600000.0F).dropsNothing());
    public static Block SCORCHED_REMENTIO = new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0F, 3600000.0F).dropsNothing());

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "melkirsch"), MELKIRSCH);
        Registry.register(Registry.ITEM, new Identifier(ID, "melkirsch"), new BlockItem(MELKIRSCH, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "melkirsch_stem"), MELKIRSCH_STEM);
        Registry.register(Registry.BLOCK, new Identifier(ID, "attached_melkirsch_stem"), ATTACHED_MELKIRSCH_STEM);

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "oretesse"), ORETESSE);
        Registry.register(Registry.ITEM, new Identifier(ID, "oretesse"), new BlockItem(ORETESSE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rementio"), REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio"), new BlockItem(REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "arbune_rementio"), ARBUNE_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "arbune_rementio"), new BlockItem(ARBUNE_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rasiore_rementio"), RASIORE_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "rasiore_rementio"), new BlockItem(RASIORE_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "botakoa_rementio"), BOTAKOA_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "botakoa_rementio"), new BlockItem(BOTAKOA_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "protosterm_rementio"), PROTOSTERM_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "protosterm_rementio"), new BlockItem(PROTOSTERM_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "opafeu_ore"), REMENTIO_OPAFEU_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "opafeu_ore"), new BlockItem(REMENTIO_OPAFEU_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "leposiate_ore"), REMENTIO_LEPOSIATE_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "leposiate_ore"), new BlockItem(REMENTIO_LEPOSIATE_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "cintonium_ore"), REMENTIO_CINTONIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "cintonium_ore"), new BlockItem(REMENTIO_CINTONIUM_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "kutunite_ore"), REMENTIO_KUTUNITE_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "kutunite_ore"), new BlockItem(REMENTIO_KUTUNITE_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "latzeck_ore"), REMENTIO_LATZECK_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "latzeck_ore"), new BlockItem(REMENTIO_LATZECK_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "nemoral_ore"), REMENTIO_NEMORAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "nemoral_ore"), new BlockItem(REMENTIO_NEMORAL_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "rementio_iron_ore"), REMENTIO_IRON_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio_iron_ore"), new BlockItem(REMENTIO_IRON_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rementio_gold_ore"), REMENTIO_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio_gold_ore"), new BlockItem(REMENTIO_GOLD_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rementio_diamond_ore"), REMENTIO_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio_diamond_ore"), new BlockItem(REMENTIO_DIAMOND_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rementio_emerald_ore"), REMENTIO_EMERALD_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio_emerald_ore"), new BlockItem(REMENTIO_EMERALD_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "violes"), VIOLES);
        Registry.register(Registry.ITEM, new Identifier(ID, "violes"), new BlockItem(VIOLES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "veticoade"), VETICOADE);
        Registry.register(Registry.ITEM, new Identifier(ID, "veticoade"), new BlockItem(VETICOADE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "lephelusa_violes"), LEPHELUSA_VIOLES);
        Registry.register(Registry.ITEM, new Identifier(ID, "lephelusa_violes"), new BlockItem(LEPHELUSA_VIOLES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "lephelusa_block"), LEPHELUSA_CORAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(ID, "lephelusa_block"), new BlockItem(LEPHELUSA_CORAL_BLOCK, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "baburben_roots"), BABURBEN_ROOTS);
        Registry.register(Registry.BLOCK, new Identifier(ID, "sakalou_roots"), SAKALOU_ROOTS);

        Registry.register(Registry.BLOCK, new Identifier(ID, "etterave_rementio"), ETTERAVE_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "etterave_rementio"), new BlockItem(ETTERAVE_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "etterave_bamboo"), ETTERAVE_BAMBOO);

        Registry.register(Registry.BLOCK, new Identifier(ID, "dark_rementio"), DARK_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "dark_rementio"), new BlockItem(DARK_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "dark_rementio_bricks"), DARK_REMENTIO_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "dark_rementio_bricks"), new BlockItem(DARK_REMENTIO_BRICKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "scorched_rementio"), SCORCHED_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "scorched_rementio"), new BlockItem(SCORCHED_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "scorched_rementio_bricks"), SCORCHED_REMENTIO_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "scorched_rementio_bricks"), new BlockItem(SCORCHED_REMENTIO_BRICKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rementio_bricks"), REMENTIO_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio_bricks"), new BlockItem(REMENTIO_BRICKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rementio_barrel"), REMENTIO_BARREL);
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio_barrel"), new BlockItem(REMENTIO_BARREL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
    }

}
