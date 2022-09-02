package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Iterator;

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

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Iterator<Direction> var4 = Direction.Type.HORIZONTAL.iterator();

        Direction direction;
        Material material;
        do {
            if (!var4.hasNext()) {
                BlockState blockState2 = world.getBlockState(pos.down());
                return (blockState2.isOf(BlockInit.ETTERAVE_BAMBOO) || blockState2.isOf(BlockInit.ETTERAVE_REMENTIO)) && !world.getBlockState(pos.up()).getMaterial().isLiquid();
            }

            direction = var4.next();
            BlockState blockState = world.getBlockState(pos.offset(direction));
            material = blockState.getMaterial();
        } while(!material.isSolid() && !world.getFluidState(pos.offset(direction)).isIn(FluidTags.LAVA));

        return false;
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
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        this.canGrow(world, random, pos, state);
    }
}
