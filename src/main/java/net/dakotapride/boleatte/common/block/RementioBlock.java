package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.dakotapride.boleatte.common.init.FeaturesInit;
import net.dakotapride.boleatte.common.init.TagInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.chunk.ChunkGenerator;

public class RementioBlock extends Block
        implements Fertilizable {
    public RementioBlock(AbstractBlock.Settings settings) {
        super(settings);
    }


    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        if (state.isOf(BlockInit.REMENTIO)) {
            if (!world.getBlockState(pos.up()).isTranslucent(world, pos)) {
                return false;
            }

            for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
                if (world.getBlockState(blockPos).isIn(TagInit.MOSSY_REMENTIO)) {
                    return true;
                }
            }
        } else if (state.isIn(TagInit.MOSSY_REMENTIO)) {
            return world.getBlockState(pos.up()).isAir();
        }
        return false;
    }


    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }


    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if (state.isOf(BlockInit.REMENTIO)) {
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            boolean bl6 = false;
            boolean bl7 = false;
            for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.isOf(BlockInit.ARBUNE_REMENTIO)) {
                    bl = true;
                }

                if (blockState.isOf(BlockInit.BOTAKOA_REMENTIO)) {
                    bl2 = true;
                }

                if (blockState.isOf(BlockInit.PROTOSTERM_REMENTIO)) {
                    bl3 = true;
                }

                if (blockState.isOf(BlockInit.RASIORE_REMENTIO)) {
                    bl4 = true;
                }

                if (blockState.isOf(BlockInit.ETTERAVE_REMENTIO)) {
                    bl5 = true;
                }

                if (blockState.isOf(BlockInit.DENTICIUS_REMENTIO)) {
                    bl6 = true;
                }

                if (blockState.isOf(BlockInit.SANTIFICT_REMENTIO)) {
                    bl7 = true;
                }

                if (bl && bl2 && bl3 && bl4 && bl5 && bl6 && bl7) {
                    break;
                }
            }

            if (bl && bl2 && bl3 && bl4 && bl5 && bl6) {
                float randomValue = random.nextFloat() * 70;

                if (randomValue <= 10) {
                    world.setBlockState(pos, BlockInit.ARBUNE_REMENTIO.getDefaultState());
                } else if (randomValue > 10 && randomValue <= 20) {
                    world.setBlockState(pos, BlockInit.BOTAKOA_REMENTIO.getDefaultState());
                } else if (randomValue > 20 && randomValue <= 30) {
                    world.setBlockState(pos, BlockInit.PROTOSTERM_REMENTIO.getDefaultState());
                } else if (randomValue > 30 && randomValue <= 40) {
                    world.setBlockState(pos, BlockInit.RASIORE_REMENTIO.getDefaultState());
                } else if (randomValue > 40 && randomValue <= 50) {
                    world.setBlockState(pos, BlockInit.ETTERAVE_REMENTIO.getDefaultState());
                } else if (randomValue > 50 && randomValue <= 60) {
                    world.setBlockState(pos, BlockInit.ETTERAVE_REMENTIO.getDefaultState());
                } else if (randomValue > 60 && randomValue <= 70) {
                    world.setBlockState(pos, BlockInit.SANTIFICT_REMENTIO.getDefaultState());
                }
            } else if (bl) {
                world.setBlockState(pos, BlockInit.ARBUNE_REMENTIO.getDefaultState(), 3);
            } else if (bl2) {
                world.setBlockState(pos, BlockInit.BOTAKOA_REMENTIO.getDefaultState(), 3);
            } else if (bl3) {
                world.setBlockState(pos, BlockInit.PROTOSTERM_REMENTIO.getDefaultState(), 3);
            } else if (bl4) {
                world.setBlockState(pos, BlockInit.RASIORE_REMENTIO.getDefaultState(), 3);
            } else if (bl5) {
                world.setBlockState(pos, BlockInit.ETTERAVE_REMENTIO.getDefaultState(), 3);
            } else if (bl6) {
                world.setBlockState(pos, BlockInit.DENTICIUS_REMENTIO.getDefaultState(), 3);
            } else if (bl7) {
                world.setBlockState(pos, BlockInit.SANTIFICT_REMENTIO.getDefaultState(), 3);
            }
        } else if (state.isIn(TagInit.MOSSY_REMENTIO)) {
            BlockState blockState = world.getBlockState(pos);
            BlockPos blockPos = pos.up();
            ChunkGenerator chunkGenerator = world.getChunkManager().getChunkGenerator();
            if (blockState.isOf(BlockInit.BOTAKOA_REMENTIO)) {
                FeaturesInit.BOTAKOA_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            } else if (blockState.isOf(BlockInit.ARBUNE_REMENTIO)) {
                FeaturesInit.ARBUNE_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            } else if (blockState.isOf(BlockInit.PROTOSTERM_REMENTIO)) {
                FeaturesInit.PROTOSTERM_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            } else if (blockState.isOf(BlockInit.RASIORE_REMENTIO)) {
                FeaturesInit.RASIORE_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            } else if (blockState.isOf(BlockInit.ETTERAVE_REMENTIO)) {
                FeaturesInit.ETTERAVE_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            } else if (blockState.isOf(BlockInit.DENTICIUS_REMENTIO)) {
                FeaturesInit.DENTICIUS_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            } else if (blockState.isOf(BlockInit.SANTIFICT_REMENTIO)) {
                FeaturesInit.SANTIFICT_VEGETATION_BONEMEAL.value().generate(world, chunkGenerator, random, blockPos);
            }
        }
    }
}
