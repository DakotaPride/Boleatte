package net.dakotapride.boleatte.common.gen;

import com.mojang.serialization.Codec;
import net.dakotapride.boleatte.common.block.EtteraveBambooBlock;
import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.BambooLeaves;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class EtteraveBambooFeature extends Feature<ProbabilityConfig> {
    private static final BlockState ETTERAVE_BAMBOO;
    private static final BlockState ETTERAVE_BAMBOO_TOP_1;
    private static final BlockState ETTERAVE_BAMBOO_TOP_2;
    private static final BlockState ETTERAVE_BAMBOO_TOP_3;

    public EtteraveBambooFeature(Codec<ProbabilityConfig> codec) {
        super(codec);
    }

    public boolean generate(FeatureContext<ProbabilityConfig> context) {
        int i = 0;
        BlockPos blockPos = context.getOrigin();
        StructureWorldAccess structureWorldAccess = context.getWorld();
        Random random = context.getRandom();
        ProbabilityConfig probabilityConfig = context.getConfig();
        BlockPos.Mutable mutable = blockPos.mutableCopy();
        BlockPos.Mutable mutable2 = blockPos.mutableCopy();
        if (structureWorldAccess.isAir(mutable)) {
            if (BlockInit.ETTERAVE_BAMBOO.getDefaultState().canPlaceAt(structureWorldAccess, mutable)) {
                int j = random.nextInt(12) + 5;
                int k;
                if (random.nextFloat() < probabilityConfig.probability) {
                    k = random.nextInt(4) + 1;

                    for (int l = blockPos.getX() - k; l <= blockPos.getX() + k; ++l) {
                        for (int m = blockPos.getZ() - k; m <= blockPos.getZ() + k; ++m) {
                            int n = l - blockPos.getX();
                            int o = m - blockPos.getZ();
                            if (n * n + o * o <= k * k) {
                                mutable2.set(l, structureWorldAccess.getTopY(Heightmap.Type.WORLD_SURFACE, l, m) - 1, m);
                                if (isSoil(structureWorldAccess.getBlockState(mutable2))) {
                                    structureWorldAccess.setBlockState(mutable2, Blocks.PODZOL.getDefaultState(), 2);
                                }
                            }
                        }
                    }
                }

                for (k = 0; k < j && structureWorldAccess.isAir(mutable); ++k) {
                    structureWorldAccess.setBlockState(mutable, ETTERAVE_BAMBOO, 2);
                    mutable.move(Direction.UP, 1);
                }

                if (mutable.getY() - blockPos.getY() >= 3) {
                    structureWorldAccess.setBlockState(mutable, ETTERAVE_BAMBOO_TOP_1, 2);
                    structureWorldAccess.setBlockState(mutable.move(Direction.DOWN, 1), ETTERAVE_BAMBOO_TOP_2, 2);
                    structureWorldAccess.setBlockState(mutable.move(Direction.DOWN, 1), ETTERAVE_BAMBOO_TOP_3, 2);
                }
            }

            ++i;
        }

        return i > 0;
    }

    static {
        ETTERAVE_BAMBOO = BlockInit.ETTERAVE_BAMBOO.getDefaultState().with(EtteraveBambooBlock.AGE, 1).with(EtteraveBambooBlock.LEAVES, BambooLeaves.NONE).with(EtteraveBambooBlock.STAGE, 0);
        ETTERAVE_BAMBOO_TOP_1 = ETTERAVE_BAMBOO.with(EtteraveBambooBlock.LEAVES, BambooLeaves.LARGE).with(EtteraveBambooBlock.STAGE, 1);
        ETTERAVE_BAMBOO_TOP_2 = ETTERAVE_BAMBOO.with(EtteraveBambooBlock.LEAVES, BambooLeaves.LARGE);
        ETTERAVE_BAMBOO_TOP_3 = ETTERAVE_BAMBOO.with(EtteraveBambooBlock.LEAVES, BambooLeaves.SMALL);
    }
}
