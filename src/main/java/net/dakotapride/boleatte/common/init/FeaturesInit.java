package net.dakotapride.boleatte.common.init;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryEntryList;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.root.AboveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;

import java.util.List;
import java.util.Optional;


public class FeaturesInit {
    private static final BeehiveTreeDecorator BEES_0002 = new BeehiveTreeDecorator(0.002F);
    private static final BeehiveTreeDecorator BEES_001 = new BeehiveTreeDecorator(0.01F);
    private static final BeehiveTreeDecorator BEES_002 = new BeehiveTreeDecorator(0.02F);
    private static final BeehiveTreeDecorator BEES_005 = new BeehiveTreeDecorator(0.05F);
    private static final BeehiveTreeDecorator BEES = new BeehiveTreeDecorator(1.0F);

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ARBUNE =
            ConfiguredFeatures.register("arbune", Feature.TREE,
                    (new TreeFeatureConfig.Builder(BlockStateProvider.of(BlockInit.ARBUNE_LOG),
                            new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.of(BlockInit.ARBUNE_LEAVES),
                            new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2),
                                    UniformIntProvider.create(1, 2)),
                            new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());

    // Configured Features
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_QUANALLA_BUSH =
            ConfiguredFeatures.register("patch_quanalla_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(BlockInit.QUANALLA_BUSH.getDefaultState()
                            .with(SweetBerryBushBlock.AGE, 3))),

            List.of(Blocks.RED_SAND)));

    private static TreeFeatureConfig.Builder botakoa() {
        return builder(BlockInit.BOTAKOA_LOG, BlockInit.BOTAKOA_LEAVES, 5, 2, 0, 2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder rasiore() {
        return builder(BlockInit.BOTAKOA_LOG, BlockInit.BOTAKOA_LEAVES, 5, 2, 0, 2).ignoreVines();
    }

    private static TreeFeatureConfig.Builder superbotakoa() {
        return builder(BlockInit.BOTAKOA_LOG, BlockInit.BOTAKOA_LEAVES, 5, 2, 6, 2).ignoreVines();
    }

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA = 
            ConfiguredFeatures.register("botokoa", Feature.TREE,
            botakoa().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RASIORE =
            ConfiguredFeatures.register("rasiore", Feature.TREE,
                    rasiore().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SUPER_BOTAKOA_BEES_0002 =
            ConfiguredFeatures.register("super_botakoa_bees_0002", Feature.TREE,
                    superbotakoa().decorators(ImmutableList.of(BEES_0002)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SUPER_BOTAKOA_BEES =
            ConfiguredFeatures.register("super_botakoa_bees", Feature.TREE,
                    superbotakoa().decorators(ImmutableList.of(BEES)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA_BEES_0002 =
            ConfiguredFeatures.register("botakoa_bees_0002", Feature.TREE,
            botakoa().decorators(List.of(BEES_0002)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA_BEES_002 =
            ConfiguredFeatures.register("botakoa_bees_002", Feature.TREE,
            botakoa().decorators(List.of(BEES_002)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOTAKOA_BEES_005 = 
            ConfiguredFeatures.register("botakoa_bees_005", Feature.TREE,
            botakoa().decorators(List.of(BEES_005)).build());

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> QUANALLA_BUSH =
            ConfiguredFeatures.register("quanalla_bush", Feature.FLOWER,
                    new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(BlockInit.QUANALLA_BUSH)))));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PROTOSTERM_TREE =
            ConfiguredFeatures.register("protosterm", Feature.TREE, (new TreeFeatureConfig.Builder(
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
                    new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> TALL_PROTOSTERM_TREE =
            ConfiguredFeatures.register("tall_protosterm", Feature.TREE, (new TreeFeatureConfig.Builder(
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
                    new TwoLayersFeatureSize(3, 0, 2))).ignoreVines().build());

    // Placed Features
    public static final RegistryEntry<PlacedFeature> QUANALLA_BUSH_PLACED = PlacedFeatures.register("quanalla_bush_placed",
            QUANALLA_BUSH, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());


    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight),

                BlockStateProvider.of(leaves), new BlobFoliagePlacer(
                ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }


    public static void init() {
        // Load This Class
    }

}
