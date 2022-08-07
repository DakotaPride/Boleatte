package net.dakotapride.boleatte.common.init;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryEntryList;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.root.AboveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;

import java.util.List;
import java.util.Optional;


public class FeaturesInit {

    // Configured Features
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_QUANALLA_BUSH =
            ConfiguredFeatures.register("patch_quanalla_bush", Feature.RANDOM_PATCH,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(BlockInit.QUANALLA_BUSH.getDefaultState()
                            .with(SweetBerryBushBlock.AGE, 3))),

            List.of(Blocks.GRASS_BLOCK)));

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


    public static void init() {
        // Load This Class
    }

}
