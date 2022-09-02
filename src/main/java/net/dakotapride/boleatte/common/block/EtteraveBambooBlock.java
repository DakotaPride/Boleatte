package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class EtteraveBambooBlock extends Block implements Fertilizable {
    public static final IntProperty AGE;
    protected static final VoxelShape COLLISION_SHAPE;
    protected static final VoxelShape OUTLINE_SHAPE;

    public EtteraveBambooBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
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
                int j = state.get(AGE);
                if (j == 15) {
                    world.setBlockState(blockPos, this.getDefaultState());
                    BlockState blockState = state.with(AGE, 0);
                    world.setBlockState(pos, blockState, 4);
                    world.updateNeighbor(blockState, blockPos, this, pos, false);
                } else {
                    world.setBlockState(pos, state.with(AGE, j + 1), 4);
                }

            }
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return COLLISION_SHAPE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return OUTLINE_SHAPE;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.createAndScheduleBlockTick(pos, this, 1);
        }

        if (direction == Direction.UP && neighborState.isOf(BlockInit.ETTERAVE_BAMBOO) && (Integer)neighborState.get(AGE) > (Integer)state.get(AGE)) {
            world.setBlockState(pos, (BlockState)state.cycle(AGE), 2);
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isOf(BlockInit.ETTERAVE_REMENTIO) || world.getBlockState(pos.down()).isOf(BlockInit.ETTERAVE_BAMBOO);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }

    static {
        AGE = Properties.AGE_15;
        COLLISION_SHAPE = Block.createCuboidShape(4, 0, 4, 12, 16, 12);
        OUTLINE_SHAPE = Block.createCuboidShape(4, 0, 4, 12, 16, 12);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        int i = this.countBambooAbove(world, pos);
        int j = this.countBambooBelow(world, pos);
        return i + j + 1 < 16 && (Integer)world.getBlockState(pos.up(i)).get(AGE) != 1;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = this.countBambooAbove(world, pos);
        int j = this.countBambooBelow(world, pos);
        int k = i + j + 1;
        int l = 1 + random.nextInt(2);

        for(int m = 0; m < l; ++m) {
            BlockPos blockPos = pos.up(i);
            BlockState blockState = world.getBlockState(blockPos);
            if (k >= 16 || (Integer)blockState.get(AGE) == 1 || !world.isAir(blockPos.up())) {
                return;
            }

            ++i;
            ++k;
        }

    }

    protected int countBambooAbove(BlockView world, BlockPos pos) {
        int i;
        for(i = 0; i < 16 && world.getBlockState(pos.up(i + 1)).isOf(Blocks.BAMBOO); ++i) {
        }

        return i;
    }

    protected int countBambooBelow(BlockView world, BlockPos pos) {
        int i;
        for(i = 0; i < 16 && world.getBlockState(pos.down(i + 1)).isOf(Blocks.BAMBOO); ++i) {
        }

        return i;
    }
}
