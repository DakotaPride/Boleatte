package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class EtteraveBambooBlock extends BambooBlock implements Fertilizable {
    public EtteraveBambooBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        if (world.getBlockState(pos.up()).isOf(BlockInit.ETTERAVE_BAMBOO)) {
            return false;
        }
        return super.isFertilizable(world, pos, state, isClient);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(4, 0, 4, 12, 16, 12);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return Block.createCuboidShape(4, 0, 4, 12, 16, 12);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isOf(BlockInit.ETTERAVE_REMENTIO) || world.getBlockState(pos.down()).isOf(BlockInit.ETTERAVE_BAMBOO);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.createAndScheduleBlockTick(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }

    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        if (!fluidState.isEmpty()) {
            return null;
        } else {
            BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().down());
            if (blockState.isOf(BlockInit.ETTERAVE_REMENTIO) || blockState.isOf(BlockInit.ETTERAVE_BAMBOO)) {
                if (blockState.isOf(BlockInit.ETTERAVE_BAMBOO)) {
                    return (BlockState)this.getDefaultState().with(AGE, 0);
                } else if (blockState.isOf(BlockInit.ETTERAVE_BAMBOO)) {
                    int i = (Integer)blockState.get(AGE) > 0 ? 1 : 0;
                    return (BlockState)this.getDefaultState().with(AGE, i);
                } else {
                    BlockState blockState2 = ctx.getWorld().getBlockState(ctx.getBlockPos().up());
                    return blockState2.isOf(BlockInit.ETTERAVE_BAMBOO) ? (BlockState)this.getDefaultState().with(AGE, (Integer)blockState2.get(AGE)) : BlockInit.ETTERAVE_BAMBOO.getDefaultState();
                }
            } else {
                return null;
            }
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPos = pos.up();
        if (world.isAir(blockPos)) {
            int i;
            for(i = 1; world.getBlockState(pos.down(i)).isOf(this); ++i) {
            }

            if (i < 3) {
                int j = (Integer)state.get(AGE);
                if (j == 15) {
                    world.setBlockState(blockPos, this.getDefaultState());
                    BlockState blockState = (BlockState)state.with(AGE, 0);
                    world.setBlockState(pos, blockState, 4);
                    world.updateNeighbor(blockState, blockPos, this, pos, false);
                } else {
                    world.setBlockState(pos, (BlockState)state.with(AGE, j + 1), 4);
                }

            }
        }
    }
}
