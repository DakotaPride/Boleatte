package net.dakotapride.boleatte.common.init;

import net.dakotapride.boleatte.common.block.*;
import net.dakotapride.boleatte.common.block.flowers.BaburbenWastesFlowerBlock;
import net.dakotapride.boleatte.common.block.flowers.BoleatteFlowerBlock;
import net.dakotapride.boleatte.common.block.roots.BaburbenRootsBlock;
import net.dakotapride.boleatte.common.block.roots.QuanallaBushBlock;
import net.dakotapride.boleatte.common.block.roots.SakalouRootsBlock;
import net.dakotapride.boleatte.common.block.sapling.*;
import net.dakotapride.boleatte.common.block.flowers.tall_flowers.BaburbenWastesTallFlowerBlock;
import net.dakotapride.boleatte.common.block.flowers.tall_flowers.QuantilaBarrensTallFlowerBlock;
import net.dakotapride.boleatte.common.block.flowers.tall_flowers.TallBoleatteFlowerBlock;
import net.dakotapride.boleatte.common.gen.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class BlockInit {

    public static RementioBlock REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block REMENTIO_BRICKS = new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS));
    public static RementioBlock ARBUNE_REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static RementioBlock BOTAKOA_REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static RementioBlock RASIORE_REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static RementioBlock PROTOSTERM_REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static RementioBlock ETTERAVE_REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static RementioBlock DENTICIUS_REMENTIO = new RementioBlock(FabricBlockSettings.copy(Blocks.STONE).requiresTool());
    public static Block ORETESSE = new Block(FabricBlockSettings.copy(Blocks.STRIPPED_WARPED_HYPHAE).requiresTool());

    public static EtteraveBambooBlock ETTERAVE_BAMBOO = new EtteraveBambooBlock(FabricBlockSettings.of(Material.BAMBOO, MapColor.LAPIS_BLUE)
            .ticksRandomly().strength(1.0F).sounds(BlockSoundGroup.BAMBOO).nonOpaque());
    public static BoleatteFlowerBlock PUSEIK = new BoleatteFlowerBlock(StatusEffects.LEVITATION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock SPROUTING_DAHALSIA = new BoleatteFlowerBlock(StatusEffects.LEVITATION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock AMBER_DAHALSIA = new BoleatteFlowerBlock(StatusEffects.LEVITATION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock PRANCING_BEQUALIT = new BoleatteFlowerBlock(StatusEffects.LEVITATION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock WITHERING_BEQUALIT = new BoleatteFlowerBlock(StatusEffects.LEVITATION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static TallBoleatteFlowerBlock ALGUALKIM = new TallBoleatteFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static TallBoleatteFlowerBlock DEMALSIM = new TallBoleatteFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));

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
    public static OreBlock REMENTIO_GEURINE_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_PAROMULINE_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_POUHGRIOD_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
            UniformIntProvider.create(3, 7));
    public static OreBlock REMENTIO_GENGERODE_ORE = new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE).requiresTool(),
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
    public static TallBoleatteFlowerBlock HYPNOTIC_SETHIOL = new TallBoleatteFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static TallBoleatteFlowerBlock TWISTING_SETHIOL = new TallBoleatteFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static BoleatteFlowerBlock CYAN_STAR_SETHIOL = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock IPALBA = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock CUPPED_CLERIFTA = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock SPIKED_CLERIFTA = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock RHOFELER = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock LUNAR_NASELZ = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock SOLAFILIL = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock ARDEVIK = new BoleatteFlowerBlock(StatusEffects.RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));

    public static BotakoaSaplingBlock BOTAKOA_SAPLING = new BotakoaSaplingBlock(new BotakoaSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock BOTAKOA_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_BOTAKOA_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock BOTAKOA_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_BOTAKOA_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block BOTAKOA_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock BOTAKOA_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());
    public static BoleatteFlowerBlock VIOLET_SETHIOL = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 120, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock CRIMSON_BOTAKOA_LILY = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock BOTAKOA_LILY = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static TallBoleatteFlowerBlock FLAMING_SETHIOL = new TallBoleatteFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static BoleatteFlowerBlock CLAWED_HELITHEUS = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 100, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock FEATHERED_HELITHEUS = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 60, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock COTTON_HYLEKTA = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 60, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static TallBoleatteFlowerBlock LESINTOCAMPTAS = new TallBoleatteFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static BoleatteFlowerBlock FLOWERING_DAHALSIA = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 60, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock RED_CALARTO = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 60, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock LAVENDER_CALARTO = new BoleatteFlowerBlock(StatusEffects.FIRE_RESISTANCE, 60, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));

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
    public static TallBoleatteFlowerBlock ACUNILLUS = new TallBoleatteFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static BoleatteFlowerBlock ARBUNE_LILY = new BoleatteFlowerBlock(StatusEffects.ABSORPTION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock MAUVE_EMERIO = new BoleatteFlowerBlock(StatusEffects.ABSORPTION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock VIOLET_TIPPED_EMERIO = new BoleatteFlowerBlock(StatusEffects.ABSORPTION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock UNSTAINED_EMERIO = new BoleatteFlowerBlock(StatusEffects.ABSORPTION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock SOLAR_NASELZ = new BoleatteFlowerBlock(StatusEffects.ABSORPTION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock OBSCURING_HELITHEUS = new BoleatteFlowerBlock(StatusEffects.ABSORPTION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));

    public static RasioreSaplingBlock RASIORE_SAPLING = new RasioreSaplingBlock(new RasioreSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock RASIORE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_RASIORE_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock RASIORE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_RASIORE_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block RASIORE_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static RasioreLeavesBlock RASIORE_LEAVES = new RasioreLeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());
    public static BoleatteFlowerBlock INTOXICATING_MIENTIS = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock GOLDEN_MIENTIS = new BoleatteFlowerBlock(StatusEffects.LUCK, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock VERMENSA = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock DWARF_RISICTULA = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));

    public static DenticiusSaplingBlock DENTICIUS_SAPLING = new DenticiusSaplingBlock(new DenticiusSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING).ticksRandomly().nonOpaque());
    public static PillarBlock DENTICIUS_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG));
    public static PillarBlock STRIPPED_DENTICIUS_LOG = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG));
    public static PillarBlock DENTICIUS_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD));
    public static PillarBlock STRIPPED_DENTICIUS_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD));
    public static Block DENTICIUS_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS));
    public static LeavesBlock DENTICIUS_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).ticksRandomly().nonOpaque());
    public static BoleatteFlowerBlock SPINED_FRITRIS = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock NOCTURNAL_EYED_FRITRIS = new BoleatteFlowerBlock(StatusEffects.NIGHT_VISION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock HANGING_BELL_FRITRIS = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock RAGING_RISICTULA = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock HISSING_HELITHEUS = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BoleatteFlowerBlock ANELOSTAM = new BoleatteFlowerBlock(StatusEffects.POISON, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));

    public static QuanallaBushBlock QUANALLA_BUSH = new QuanallaBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().nonOpaque());
    public static LeavesBlock DEAD_LEAVES = new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES));
    public static SakalouRootsBlock SAKALOU_ROOTS = new SakalouRootsBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().nonOpaque());
    public static QuantilaBarrensTallFlowerBlock PSYLOPHONICH = new QuantilaBarrensTallFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static QuantilaBarrensTallFlowerBlock INFLAMED_SETHIOL = new QuantilaBarrensTallFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));

    public static Block VIOLES = new Block(FabricBlockSettings.copy(Blocks.SAND));
    public static Block VETICOADE = new Block(FabricBlockSettings.copy(Blocks.SANDSTONE).requiresTool());
    public static Block LEPHELUSA_VIOLES = new Block(FabricBlockSettings.copy(Blocks.SAND));
    public static Block LEPHELUSA_CORAL_BLOCK = new Block(FabricBlockSettings.copy(Blocks.BUBBLE_CORAL_BLOCK));
    public static BaburbenRootsBlock BABURBEN_ROOTS = new BaburbenRootsBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).ticksRandomly().nonOpaque());
    public static BaburbenWastesTallFlowerBlock TELITONICH = new BaburbenWastesTallFlowerBlock(FabricBlockSettings.copy(Blocks.LILAC));
    public static BaburbenWastesFlowerBlock CHILLING_SETHIOL = new BaburbenWastesFlowerBlock(StatusEffects.NIGHT_VISION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BaburbenWastesFlowerBlock FRIGID_HYLEKTA = new BaburbenWastesFlowerBlock(StatusEffects.NIGHT_VISION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BaburbenWastesFlowerBlock ACOLONT = new BaburbenWastesFlowerBlock(StatusEffects.NIGHT_VISION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BaburbenWastesFlowerBlock LEJELUS = new BaburbenWastesFlowerBlock(StatusEffects.NIGHT_VISION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));
    public static BaburbenWastesFlowerBlock CROSELOTOS = new BaburbenWastesFlowerBlock(StatusEffects.NIGHT_VISION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));

    public static BaburbenWastesFlowerBlock CORAL_HYLEKTA = new BaburbenWastesFlowerBlock(StatusEffects.NIGHT_VISION, 180, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY));

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "hypnotic_sethiol"), HYPNOTIC_SETHIOL);
        Registry.register(Registry.ITEM, new Identifier(ID, "hypnotic_sethiol"), new BlockItem(HYPNOTIC_SETHIOL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "twisting_sethiol"), TWISTING_SETHIOL);
        Registry.register(Registry.ITEM, new Identifier(ID, "twisting_sethiol"), new BlockItem(TWISTING_SETHIOL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "cyan_star_sethiol"), CYAN_STAR_SETHIOL);
        Registry.register(Registry.ITEM, new Identifier(ID, "cyan_star_sethiol"), new BlockItem(CYAN_STAR_SETHIOL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "ipalba"), IPALBA);
        Registry.register(Registry.ITEM, new Identifier(ID, "ipalba"), new BlockItem(IPALBA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "cupped_clerifta"), CUPPED_CLERIFTA);
        Registry.register(Registry.ITEM, new Identifier(ID, "cupped_clerifta"), new BlockItem(CUPPED_CLERIFTA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "spiked_clerifta"), SPIKED_CLERIFTA);
        Registry.register(Registry.ITEM, new Identifier(ID, "spiked_clerifta"), new BlockItem(SPIKED_CLERIFTA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "rhofeler"), RHOFELER);
        Registry.register(Registry.ITEM, new Identifier(ID, "rhofeler"), new BlockItem(RHOFELER, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "lunar_naselz"), LUNAR_NASELZ);
        Registry.register(Registry.ITEM, new Identifier(ID, "lunar_naselz"), new BlockItem(LUNAR_NASELZ, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "solafilil"), SOLAFILIL);
        Registry.register(Registry.ITEM, new Identifier(ID, "solafilil"), new BlockItem(SOLAFILIL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "ardevik"), ARDEVIK);
        Registry.register(Registry.ITEM, new Identifier(ID, "ardevik"), new BlockItem(ARDEVIK, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "violet_sethiol"), VIOLET_SETHIOL);
        Registry.register(Registry.ITEM, new Identifier(ID, "violet_sethiol"), new BlockItem(VIOLET_SETHIOL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "crimson_botakoa_lily"), CRIMSON_BOTAKOA_LILY);
        Registry.register(Registry.ITEM, new Identifier(ID, "crimson_botakoa_lily"), new BlockItem(CRIMSON_BOTAKOA_LILY, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "botakoa_lily"), BOTAKOA_LILY);
        Registry.register(Registry.ITEM, new Identifier(ID, "botakoa_lily"), new BlockItem(BOTAKOA_LILY, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "flaming_sethiol"), FLAMING_SETHIOL);
        Registry.register(Registry.ITEM, new Identifier(ID, "flaming_sethiol"), new BlockItem(FLAMING_SETHIOL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "clawed_helitheus"), CLAWED_HELITHEUS);
        Registry.register(Registry.ITEM, new Identifier(ID, "clawed_helitheus"), new BlockItem(CLAWED_HELITHEUS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "feathered_helitheus"), FEATHERED_HELITHEUS);
        Registry.register(Registry.ITEM, new Identifier(ID, "feathered_helitheus"), new BlockItem(FEATHERED_HELITHEUS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "cotton_hylekta"), COTTON_HYLEKTA);
        Registry.register(Registry.ITEM, new Identifier(ID, "cotton_hylekta"), new BlockItem(COTTON_HYLEKTA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "lesintocamptas"), LESINTOCAMPTAS);
        Registry.register(Registry.ITEM, new Identifier(ID, "lesintocamptas"), new BlockItem(LESINTOCAMPTAS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "flowering_dahalsia"), FLOWERING_DAHALSIA);
        Registry.register(Registry.ITEM, new Identifier(ID, "flowering_dahalsia"), new BlockItem(FLOWERING_DAHALSIA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "red_calarto"), RED_CALARTO);
        Registry.register(Registry.ITEM, new Identifier(ID, "red_calarto"), new BlockItem(RED_CALARTO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "lavender_calarto"), LAVENDER_CALARTO);
        Registry.register(Registry.ITEM, new Identifier(ID, "lavender_calarto"), new BlockItem(LAVENDER_CALARTO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "acunillus"), ACUNILLUS);
        Registry.register(Registry.ITEM, new Identifier(ID, "acunillus"), new BlockItem(ACUNILLUS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "mauve_emerio"), MAUVE_EMERIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "mauve_emerio"), new BlockItem(MAUVE_EMERIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "violet_tipped_emerio"), VIOLET_TIPPED_EMERIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "violet_tipped_emerio"), new BlockItem(VIOLET_TIPPED_EMERIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "unstained_emerio"), UNSTAINED_EMERIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "unstained_emerio"), new BlockItem(UNSTAINED_EMERIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "arbune_lily"), ARBUNE_LILY);
        Registry.register(Registry.ITEM, new Identifier(ID, "arbune_lily"), new BlockItem(ARBUNE_LILY, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "solar_naselz"), SOLAR_NASELZ);
        Registry.register(Registry.ITEM, new Identifier(ID, "solar_naselz"), new BlockItem(SOLAR_NASELZ, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "obscuring_helitheus"), OBSCURING_HELITHEUS);
        Registry.register(Registry.ITEM, new Identifier(ID, "obscuring_helitheus"), new BlockItem(OBSCURING_HELITHEUS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "intoxicated_mientis"), INTOXICATING_MIENTIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "intoxicated_mientis"), new BlockItem(INTOXICATING_MIENTIS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "golden_mientis"), GOLDEN_MIENTIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "golden_mientis"), new BlockItem(GOLDEN_MIENTIS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "vermensa"), VERMENSA);
        Registry.register(Registry.ITEM, new Identifier(ID, "vermensa"), new BlockItem(VERMENSA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "dwarf_risictula"), DWARF_RISICTULA);
        Registry.register(Registry.ITEM, new Identifier(ID, "dwarf_risictula"), new BlockItem(DWARF_RISICTULA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "denticius_sapling"), DENTICIUS_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(ID, "denticius_sapling"), new BlockItem(DENTICIUS_SAPLING, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "denticius_log"), DENTICIUS_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "denticius_log"), new BlockItem(DENTICIUS_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "denticius_leaves"), DENTICIUS_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(ID, "denticius_leaves"), new BlockItem(DENTICIUS_LEAVES, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_denticius_log"), STRIPPED_DENTICIUS_LOG);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_denticius_log"), new BlockItem(STRIPPED_DENTICIUS_LOG, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "denticius_wood"), DENTICIUS_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "denticius_wood"), new BlockItem(DENTICIUS_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "stripped_denticius_wood"), STRIPPED_DENTICIUS_WOOD);
        Registry.register(Registry.ITEM, new Identifier(ID, "stripped_denticius_wood"), new BlockItem(STRIPPED_DENTICIUS_WOOD, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "denticius_planks"), DENTICIUS_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(ID, "denticius_planks"), new BlockItem(DENTICIUS_PLANKS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "spined_fritris"), SPINED_FRITRIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "spined_fritris"), new BlockItem(SPINED_FRITRIS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "nocturnal_eyed_fritris"), NOCTURNAL_EYED_FRITRIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "nocturnal_eyed_fritris"), new BlockItem(NOCTURNAL_EYED_FRITRIS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "hanging_bell_fritris"), HANGING_BELL_FRITRIS);
        Registry.register(Registry.ITEM, new Identifier(ID, "hanging_bell_fritris"), new BlockItem(HANGING_BELL_FRITRIS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "raging_risictula"), RAGING_RISICTULA);
        Registry.register(Registry.ITEM, new Identifier(ID, "raging_risictula"), new BlockItem(RAGING_RISICTULA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "hissing_helitheus"), HISSING_HELITHEUS);
        Registry.register(Registry.ITEM, new Identifier(ID, "hissing_helitheus"), new BlockItem(HISSING_HELITHEUS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "anelostam"), ANELOSTAM);
        Registry.register(Registry.ITEM, new Identifier(ID, "anelostam"), new BlockItem(ANELOSTAM, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "denticius_rementio"), DENTICIUS_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "denticius_rementio"), new BlockItem(DENTICIUS_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "geurine_ore"), REMENTIO_GEURINE_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "geurine_ore"), new BlockItem(REMENTIO_GEURINE_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "paromuline_ore"), REMENTIO_PAROMULINE_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "paromuline_ore"), new BlockItem(REMENTIO_PAROMULINE_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "pouhgriod_ore"), REMENTIO_POUHGRIOD_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "pouhgriod_ore"), new BlockItem(REMENTIO_POUHGRIOD_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "gengerode_ore"), REMENTIO_GENGERODE_ORE);
        Registry.register(Registry.ITEM, new Identifier(ID, "gengerode_ore"), new BlockItem(REMENTIO_GENGERODE_ORE, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

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
        Registry.register(Registry.BLOCK, new Identifier(ID, "telitonich"), TELITONICH);
        Registry.register(Registry.ITEM, new Identifier(ID, "telitonich"), new BlockItem(TELITONICH, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "chilling_sethiol"), CHILLING_SETHIOL);
        Registry.register(Registry.ITEM, new Identifier(ID, "chilling_sethiol"), new BlockItem(CHILLING_SETHIOL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "frigid_hylekta"), FRIGID_HYLEKTA);
        Registry.register(Registry.ITEM, new Identifier(ID, "frigid_hylekta"), new BlockItem(FRIGID_HYLEKTA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "acolont"), ACOLONT);
        Registry.register(Registry.ITEM, new Identifier(ID, "acolont"), new BlockItem(ACOLONT, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "lejelus"), LEJELUS);
        Registry.register(Registry.ITEM, new Identifier(ID, "lejelus"), new BlockItem(LEJELUS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "croselotos"), CROSELOTOS);
        Registry.register(Registry.ITEM, new Identifier(ID, "croselotos"), new BlockItem(CROSELOTOS, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "coral_hylekta"), CORAL_HYLEKTA);
        Registry.register(Registry.ITEM, new Identifier(ID, "coral_hylekta"), new BlockItem(CORAL_HYLEKTA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "psylophonich"), PSYLOPHONICH);
        Registry.register(Registry.ITEM, new Identifier(ID, "psylophonich"), new BlockItem(PSYLOPHONICH, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "inflamed_sethiol"), INFLAMED_SETHIOL);
        Registry.register(Registry.ITEM, new Identifier(ID, "inflamed_sethiol"), new BlockItem(INFLAMED_SETHIOL, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

        Registry.register(Registry.BLOCK, new Identifier(ID, "etterave_rementio"), ETTERAVE_REMENTIO);
        Registry.register(Registry.ITEM, new Identifier(ID, "etterave_rementio"), new BlockItem(ETTERAVE_REMENTIO, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "etterave_bamboo"), ETTERAVE_BAMBOO);
        Registry.register(Registry.BLOCK, new Identifier(ID, "puseik"), PUSEIK);
        Registry.register(Registry.ITEM, new Identifier(ID, "puseik"), new BlockItem(PUSEIK, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "sprouting_dahalsia"), SPROUTING_DAHALSIA);
        Registry.register(Registry.ITEM, new Identifier(ID, "sprouting_dahalsia"), new BlockItem(SPROUTING_DAHALSIA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "amber_dahalsia"), AMBER_DAHALSIA);
        Registry.register(Registry.ITEM, new Identifier(ID, "amber_dahalsia"), new BlockItem(AMBER_DAHALSIA, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "prancing_bequalit"), PRANCING_BEQUALIT);
        Registry.register(Registry.ITEM, new Identifier(ID, "prancing_bequalit"), new BlockItem(PRANCING_BEQUALIT, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "withering_bequalit"), WITHERING_BEQUALIT);
        Registry.register(Registry.ITEM, new Identifier(ID, "withering_bequalit"), new BlockItem(WITHERING_BEQUALIT, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "algualkim"), ALGUALKIM);
        Registry.register(Registry.ITEM, new Identifier(ID, "algualkim"), new BlockItem(ALGUALKIM, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));
        Registry.register(Registry.BLOCK, new Identifier(ID, "demalsim"), DEMALSIM);
        Registry.register(Registry.ITEM, new Identifier(ID, "demalsim"), new BlockItem(DEMALSIM, new FabricItemSettings().group(ItemInit.BoleatteItemGroup.BOLEATTE)));

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
        Registry.register(Registry.ITEM, new Identifier(ID, "rementio_barrel"), new BlockItem(REMENTIO_BARREL, new FabricItemSettings()));
    }

}
