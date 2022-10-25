package net.dakotapride.boleatte.common.init;

import com.google.common.collect.ImmutableList;
import net.dakotapride.boleatte.common.gen.BoleatteVegetationFeature;
import net.dakotapride.boleatte.common.gen.EtteraveBambooFeature;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryEntryList;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.gen.root.AboveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;

import java.util.List;
import java.util.Optional;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;


public class FeaturesInit {
    private static final BeehiveTreeDecorator BEES_0002 = new BeehiveTreeDecorator(0.002F);
    private static final BeehiveTreeDecorator BEES_001 = new BeehiveTreeDecorator(0.01F);
    private static final BeehiveTreeDecorator BEES_002 = new BeehiveTreeDecorator(0.02F);
    private static final BeehiveTreeDecorator BEES_005 = new BeehiveTreeDecorator(0.05F);
    private static final BeehiveTreeDecorator BEES = new BeehiveTreeDecorator(1.0F);

    // Rule Tests
    private static final RuleTest REMENTIO_REPLACEABLES = new BlockMatchRuleTest(BlockInit.REMENTIO);


    // Configured Features

    public static final List<OreFeatureConfig.Target> BOLEATTE_ADENTISK = List.of(
            OreFeatureConfig.createTarget(REMENTIO_REPLACEABLES, BlockInit.ADENTISK.getDefaultState()));
    public static final List<OreFeatureConfig.Target> BOLEATTE_MELITEMF = List.of(
            OreFeatureConfig.createTarget(REMENTIO_REPLACEABLES, BlockInit.MELITEMF.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ADENTISK =
            ConfiguredFeatures.register(ID + "adentisk", Feature.ORE, new OreFeatureConfig(BOLEATTE_ADENTISK, 64));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MELITEMF =
            ConfiguredFeatures.register(ID + "melitemf", Feature.ORE, new OreFeatureConfig(BOLEATTE_MELITEMF, 64));


    public static final Feature<NetherForestVegetationFeatureConfig> BOLEATTE_VEGETATION = register("boleatte_vegetation",
            new BoleatteVegetationFeature(NetherForestVegetationFeatureConfig.VEGETATION_CODEC));

    public static final WeightedBlockStateProvider BOTAKOA_VEGETATION_PROVIDER = new WeightedBlockStateProvider
            (DataPool.<BlockState>builder()
                    .add(BlockInit.BOTAKOA_LILY.getDefaultState(), 14)
                    .add(BlockInit.CRIMSON_BOTAKOA_LILY.getDefaultState(), 13)
                    .add(BlockInit.VIOLET_SETHIOL.getDefaultState(), 12)
                    .add(BlockInit.CLAWED_HELITHEUS.getDefaultState(), 10)
                    .add(BlockInit.FEATHERED_HELITHEUS.getDefaultState(), 10)
                    .add(BlockInit.COTTON_HYLEKTA.getDefaultState(), 11)
                    .add(BlockInit.FLOWERING_DAHALSIA.getDefaultState(), 10)
                    .add(BlockInit.RED_CALARTO.getDefaultState(), 10)
                    .add(BlockInit.LAVENDER_CALARTO.getDefaultState(), 10));

    public static final WeightedBlockStateProvider ARBUNE_VEGETATION_PROVIDER = new WeightedBlockStateProvider
            (DataPool.<BlockState>builder()
                    .add(BlockInit.ARBUNE_LILY.getDefaultState(), 16)
                    .add(BlockInit.MAUVE_EMERIO.getDefaultState(), 16)
                    .add(BlockInit.VIOLET_TIPPED_EMERIO.getDefaultState(), 17)
                    .add(BlockInit.UNSTAINED_EMERIO.getDefaultState(), 17)
                    .add(BlockInit.SOLAR_NASELZ.getDefaultState(), 17)
                    .add(BlockInit.OBSCURING_HELITHEUS.getDefaultState(), 17));

    public static final WeightedBlockStateProvider PROTOSTERM_VEGETATION_PROVIDER = new WeightedBlockStateProvider
            (DataPool.<BlockState>builder()
                    .add(BlockInit.CYAN_STAR_SETHIOL.getDefaultState(), 12)
                    .add(BlockInit.IPALBA.getDefaultState(), 12)
                    .add(BlockInit.CUPPED_CLERIFTA.getDefaultState(), 13)
                    .add(BlockInit.SPIKED_CLERIFTA.getDefaultState(), 13)
                    .add(BlockInit.RHOFELER.getDefaultState(), 13)
                    .add(BlockInit.LUNAR_NASELZ.getDefaultState(), 12)
                    .add(BlockInit.SOLAFILIL.getDefaultState(), 13)
                    .add(BlockInit.ARDEVIK.getDefaultState(), 12));

    public static final WeightedBlockStateProvider RASIORE_VEGETATION_PROVIDER = new WeightedBlockStateProvider
            (DataPool.<BlockState>builder()
                    .add(BlockInit.INTOXICATING_MIENTIS.getDefaultState(), 50)
                    .add(BlockInit.GOLDEN_MIENTIS.getDefaultState(), 50));

    public static final WeightedBlockStateProvider SANTIFICT_VEGETATION_PROVIDER = new WeightedBlockStateProvider
            (DataPool.<BlockState>builder()
                    .add(BlockInit.LAVENDER_CYLONETHIUS.getDefaultState(), 50)
                    .add(BlockInit.SCARLET_CYLONETHIUS.getDefaultState(), 50));

    public static final WeightedBlockStateProvider ETTERAVE_VEGETATION_PROVIDER = new WeightedBlockStateProvider
            (DataPool.<BlockState>builder()
                    .add(BlockInit.PUSEIK.getDefaultState(), 20)
                    .add(BlockInit.SPROUTING_DAHALSIA.getDefaultState(), 20)
                    .add(BlockInit.AMBER_DAHALSIA.getDefaultState(), 20)
                    .add(BlockInit.PRANCING_BEQUALIT.getDefaultState(), 20)
                    .add(BlockInit.WITHERING_BEQUALIT.getDefaultState(), 20));

    public static final WeightedBlockStateProvider DENTICIUS_VEGETATION_PROVIDER = new WeightedBlockStateProvider
            (DataPool.<BlockState>builder()
                    .add(BlockInit.HANGING_BELL_FRITRIS.getDefaultState(), 33)
                    .add(BlockInit.NOCTURNAL_EYED_FRITRIS.getDefaultState(), 33)
                    .add(BlockInit.SPINED_FRITRIS.getDefaultState(), 34));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> BOTAKOA_VEGETATION_BONEMEAL =
            ConfiguredFeatures.register(ID + ":botakoa_vegetation_bonemeal", BOLEATTE_VEGETATION,
                    new NetherForestVegetationFeatureConfig(BOTAKOA_VEGETATION_PROVIDER, 3, 1));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> ARBUNE_VEGETATION_BONEMEAL =
            ConfiguredFeatures.register(ID + "arbune_vegetation_bonemeal", BOLEATTE_VEGETATION,
                    new NetherForestVegetationFeatureConfig(ARBUNE_VEGETATION_PROVIDER, 3, 1));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> PROTOSTERM_VEGETATION_BONEMEAL =
            ConfiguredFeatures.register(ID + ":protosterm_vegetation_bonemeal", BOLEATTE_VEGETATION,
                    new NetherForestVegetationFeatureConfig(PROTOSTERM_VEGETATION_PROVIDER, 3, 1));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> RASIORE_VEGETATION_BONEMEAL =
            ConfiguredFeatures.register(ID + ":rasiore_vegetation_bonemeal", BOLEATTE_VEGETATION,
                    new NetherForestVegetationFeatureConfig(RASIORE_VEGETATION_PROVIDER, 3, 1));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> ETTERAVE_VEGETATION_BONEMEAL =
            ConfiguredFeatures.register(ID + ":etterave_vegetation_bonemeal", BOLEATTE_VEGETATION,
                    new NetherForestVegetationFeatureConfig(ETTERAVE_VEGETATION_PROVIDER, 3, 1));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> DENTICIUS_VEGETATION_BONEMEAL =
            ConfiguredFeatures.register(ID + ":denticius_vegetation_bonemeal", BOLEATTE_VEGETATION,
                    new NetherForestVegetationFeatureConfig(DENTICIUS_VEGETATION_PROVIDER, 3, 1));

    public static final RegistryEntry<ConfiguredFeature<NetherForestVegetationFeatureConfig, ?>> SANTIFICT_VEGETATION_BONEMEAL =
            ConfiguredFeatures.register(ID + ":santifict_vegetation_bonemeal", BOLEATTE_VEGETATION,
                    new NetherForestVegetationFeatureConfig(DENTICIUS_VEGETATION_PROVIDER, 3, 1));

    public static final Feature<ProbabilityConfig> ETTERAVE_BAMBOO =
            register(ID + ":etterave_bamboo", new EtteraveBambooFeature(ProbabilityConfig.CODEC));

    public static final RegistryEntry<ConfiguredFeature<ProbabilityConfig, ?>> ETTERAVE_BAMBOO_NORMAL =
            ConfiguredFeatures.register(ID + ":etterave_bamboo_normal", ETTERAVE_BAMBOO, new ProbabilityConfig(0.0F));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> QUANTILA_DEAD_BUSH =
            ConfiguredFeatures.register(ID + ":quantila_dead_bush", Feature.TREE, (new TreeFeatureConfig.Builder(
            BlockStateProvider.of(Blocks.OAK_LOG), new StraightTrunkPlacer(1, 0, 0),
            BlockStateProvider.of(BlockInit.DEAD_LEAVES), new BushFoliagePlacer(
            ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                    new TwoLayersFeatureSize(0, 0, 0))).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> TALL_RASIORE =
            ConfiguredFeatures.register(ID + ":tall_rasiore", Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(BlockInit.RASIORE_LOG),
                            new GiantTrunkPlacer(12, 3, 15), BlockStateProvider.of(BlockInit.RASIORE_LEAVES),
                            new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0),
                                    UniformIntProvider.create(13, 17)),
                            new TwoLayersFeatureSize(1, 1, 2))).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ARBUNE =
            ConfiguredFeatures.register(ID + ":arbune", Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(BlockInit.ARBUNE_LOG),
                            new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.of(BlockInit.ARBUNE_LEAVES),
                            new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2),
                                    UniformIntProvider.create(1, 2)),
                            new TwoLayersFeatureSize(2, 0, 2)))
                            .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SANTIFICT =
            ConfiguredFeatures.register(ID + ":santifict", Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(BlockInit.SANTIFICT_LOG),
                            new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.of(BlockInit.SANTIFICT_LEAVES),
                            new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2),
                                    UniformIntProvider.create(1, 2)),
                            new TwoLayersFeatureSize(2, 0, 2)))
                            .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines().build());

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_QUANALLA_BUSH =
            ConfiguredFeatures.register(ID + ":patch_quanalla_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(BlockInit.QUANALLA_BUSH.getDefaultState()
                            .with(SweetBerryBushBlock.AGE, 3))),

            List.of(Blocks.RED_SAND)));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA = 
            ConfiguredFeatures.register(ID + ":botokoa", Feature.TREE,
            botakoa().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RASIORE =
            ConfiguredFeatures.register(ID + ":rasiore", Feature.TREE,
                    rasiore().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DENTICIUS =
            ConfiguredFeatures.register(ID + ":denticius", Feature.TREE,
                    denticius().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SUPER_BOTAKOA_BEES_0002 =
            ConfiguredFeatures.register(ID + ":super_botakoa_bees_0002", Feature.TREE,
                    superbotakoa().decorators(ImmutableList.of(BEES_0002))
                            .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SUPER_BOTAKOA_BEES =
            ConfiguredFeatures.register(ID + ":super_botakoa_bees", Feature.TREE,
                    superbotakoa().decorators(ImmutableList.of(BEES))
                            .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA_BEES_0002 =
            ConfiguredFeatures.register(ID + ":botakoa_bees_0002", Feature.TREE,
            botakoa().decorators(List.of(BEES_0002))
                    .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA_BEES_002 =
            ConfiguredFeatures.register(ID + ":botakoa_bees_002", Feature.TREE,
            botakoa().decorators(List.of(BEES_002))
                    .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA_BEES_005 = 
            ConfiguredFeatures.register(ID + ":botakoa_bees_005", Feature.TREE,
            botakoa().decorators(List.of(BEES_005))
                    .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).build());

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> QUANALLA_BUSH =
            ConfiguredFeatures.register(ID + ":quanalla_bush", Feature.FLOWER,
                    new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(BlockInit.QUANALLA_BUSH)))));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PROTOSTERM_TREE =
            ConfiguredFeatures.register(ID + ":protosterm", Feature.TREE, (new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BlockInit.PROTOSTERM_LOG),
                    new UpwardsBranchingTrunkPlacer(2, 1, 4,
                    UniformIntProvider.create(1, 4), 0.5F, UniformIntProvider.create(0, 1),
                    Registry.BLOCK.getOrCreateEntryList(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
                    BlockStateProvider.of(BlockInit.PROTOSTERM_LEAVES), new RandomSpreadFoliagePlacer(
                    ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 70),
                    Optional.of(new MangroveRootPlacer(
                            UniformIntProvider.create(1, 3),
                            BlockStateProvider.of(BlockInit.PROTOSTERM_LOG),
                            Optional.of(new AboveRootPlacement
                                    (BlockStateProvider.of(Blocks.AIR), 0.0F)), new MangroveRootPlacement(Registry.BLOCK
                            .getOrCreateEntryList(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH),
                            RegistryEntryList.of(Block::getRegistryEntry, BlockInit.PROTOSTERM_LOG),
                            BlockStateProvider.of(BlockInit.PROTOSTERM_LOG), 8, 15, 0.2F))),
                    new TwoLayersFeatureSize(2, 0, 2)))
                    .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> TALL_PROTOSTERM_TREE =
            ConfiguredFeatures.register(ID + ":tall_protosterm", Feature.TREE, (new TreeFeatureConfig.Builder(
            BlockStateProvider.of(BlockInit.PROTOSTERM_LOG),
                    new UpwardsBranchingTrunkPlacer(4, 1, 9,
            UniformIntProvider.create(1, 6), 0.5F, UniformIntProvider.create(0, 1),
                            Registry.BLOCK.getOrCreateEntryList(BlockTags.MANGROVE_LOGS_CAN_GROW_THROUGH)),
            BlockStateProvider.of(BlockInit.PROTOSTERM_LEAVES), new RandomSpreadFoliagePlacer(
            ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 70),
            Optional.of(new MangroveRootPlacer(
                    UniformIntProvider.create(3, 7),
                    BlockStateProvider.of(BlockInit.PROTOSTERM_LOG),
                    Optional.of(new AboveRootPlacement(
                            BlockStateProvider.of(Blocks.AIR), 0.5F)), new MangroveRootPlacement(Registry.BLOCK
                    .getOrCreateEntryList(BlockTags.MANGROVE_ROOTS_CAN_GROW_THROUGH),
                    RegistryEntryList.of(Block::getRegistryEntry, BlockInit.PROTOSTERM_LOG),
                    BlockStateProvider.of(BlockInit.PROTOSTERM_LOG), 8, 15, 0.2F))),
                    new TwoLayersFeatureSize(3, 0, 2)))
                    .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines().build());

    // Placed Features
    public static final RegistryEntry<PlacedFeature> QUANALLA_BUSH_PLACED = PlacedFeatures.register(ID + ":quanalla_bush_placed",
            QUANALLA_BUSH, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> QUANTILA_DEAD_BUSH_PLACED = PlacedFeatures.register
            (ID + ":quantila_dead_bush", QUANTILA_DEAD_BUSH, PlacedFeatures.wouldSurvive(Blocks.OAK_SAPLING));

    public static final RegistryEntry<PlacedFeature> ETTERAVE_BAMBOO_PLACED =
            PlacedFeatures.register(ID + ":etterave_bamboo", ETTERAVE_BAMBOO_NORMAL,
                    NoiseBasedCountPlacementModifier.of(160, 80.0D, 0.3D),
                    SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> ADENTISK_PLACED = PlacedFeatures.register(ID + "adentisk_placed",
             ADENTISK, modifiersWithCount(8,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> MELITEMF_PLACED = PlacedFeatures.register(ID + "melitemf_placed",
             MELITEMF, modifiersWithCount(8,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));



    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight),

                BlockStateProvider.of(leaves), new BlobFoliagePlacer(
                ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return (F) Registry.register(Registry.FEATURE, name, feature);
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }


    public static void init() {
        // Load This Class
    }



    private static TreeFeatureConfig.Builder botakoa() {
        return builder(BlockInit.BOTAKOA_LOG, BlockInit.BOTAKOA_LEAVES, 5, 2, 0, 2)
                .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines();
    }

    private static TreeFeatureConfig.Builder rasiore() {
        return builder(BlockInit.RASIORE_LOG, BlockInit.RASIORE_LEAVES, 5, 2, 0, 2)
                .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines();
    }

    private static TreeFeatureConfig.Builder denticius() {
        return builder(BlockInit.DENTICIUS_LOG, BlockInit.DENTICIUS_LEAVES, 7, 4, 0, 2)
                .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines();
    }

    private static TreeFeatureConfig.Builder superbotakoa() {
        return builder(BlockInit.BOTAKOA_LOG, BlockInit.BOTAKOA_LEAVES, 5, 2, 6, 2)
                .dirtProvider(BlockStateProvider.of(BlockInit.REMENTIO.getDefaultState())).ignoreVines();
    }

}
