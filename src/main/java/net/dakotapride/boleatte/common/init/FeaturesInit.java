package net.dakotapride.boleatte.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryEntryList;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.root.AboveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacement;
import net.minecraft.world.gen.root.MangroveRootPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.UpwardsBranchingTrunkPlacer;

import java.util.Optional;


public class FeaturesInit {

    // Configured Features
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


    public static void init() {
        // Load This Class
    }

}
