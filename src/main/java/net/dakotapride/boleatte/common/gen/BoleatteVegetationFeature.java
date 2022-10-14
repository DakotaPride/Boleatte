package net.dakotapride.boleatte.common.gen;

import com.mojang.serialization.Codec;
import net.dakotapride.boleatte.common.init.TagInit;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NetherForestVegetationFeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class BoleatteVegetationFeature extends Feature<NetherForestVegetationFeatureConfig> {
    public BoleatteVegetationFeature(Codec<NetherForestVegetationFeatureConfig> codec) {
        super(codec);
    }

    public boolean generate(FeatureContext<NetherForestVegetationFeatureConfig> context) {
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        BlockState blockState = structureWorldAccess.getBlockState(blockPos.down());
        NetherForestVegetationFeatureConfig netherForestVegetationFeatureConfig = context.getConfig();
        Random random = context.getRandom();
        if (!blockState.isIn(TagInit.MOSSY_REMENTIO)) {
            return false;
        } else {
            int i = blockPos.getY();
            if (i >= structureWorldAccess.getBottomY() + 1 && i + 1 < structureWorldAccess.getTopY()) {
                int j = 0;

                for(int k = 0; k < netherForestVegetationFeatureConfig.spreadWidth * netherForestVegetationFeatureConfig.spreadWidth; ++k) {
                    BlockPos blockPos2 = blockPos.add(random.nextInt(netherForestVegetationFeatureConfig.spreadWidth) - random.nextInt(netherForestVegetationFeatureConfig.spreadWidth), random.nextInt(netherForestVegetationFeatureConfig.spreadHeight) - random.nextInt(netherForestVegetationFeatureConfig.spreadHeight), random.nextInt(netherForestVegetationFeatureConfig.spreadWidth) - random.nextInt(netherForestVegetationFeatureConfig.spreadWidth));
                    BlockState blockState2 = netherForestVegetationFeatureConfig.stateProvider.getBlockState(random, blockPos2);
                    if (structureWorldAccess.isAir(blockPos2) && blockPos2.getY() > structureWorldAccess.getBottomY() && blockState2.canPlaceAt(structureWorldAccess, blockPos2)) {
                        structureWorldAccess.setBlockState(blockPos2, blockState2, 2);
                        ++j;
                    }
                }

                return j > 0;
            } else {
                return false;
            }
        }
    }
}