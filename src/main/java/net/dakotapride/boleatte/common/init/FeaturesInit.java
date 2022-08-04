package net.dakotapride.boleatte.common.init;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;


public class FeaturesInit {

    // Configured Features
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PROTOSTERM_TREE =
            ConfiguredFeatures.register("protosterm", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BlockInit.PROTOSTERM_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(BlockInit.PROTOSTERM_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());


    public static void init() {
        // Load This Class
    }

}
