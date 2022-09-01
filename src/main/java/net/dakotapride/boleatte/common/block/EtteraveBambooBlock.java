package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.SwordItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class EtteraveBambooBlock extends Block implements Fertilizable {
    public static final IntProperty AGE;
    public static final IntProperty STAGE;

    public EtteraveBambooBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0).with(STAGE, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, STAGE);
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return true;
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
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        if (!fluidState.isEmpty()) {
            return null;
        } else {
            BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos().down());
            if (blockState.isOf(BlockInit.ETTERAVE_REMENTIO)) {
                if (blockState.isOf(BlockInit.ETTERAVE_BAMBOO)) {
                    int i = blockState.get(AGE) > 0 ? 1 : 0;
                    return this.getDefaultState().with(AGE, i);
                } else {
                    BlockState blockState2 = ctx.getWorld().getBlockState(ctx.getBlockPos().up());
                    return blockState2.isOf(BlockInit.ETTERAVE_BAMBOO) ? this.getDefaultState().with(AGE, blockState2.get(AGE)) : BlockInit.ETTERAVE_BAMBOO.getDefaultState();
                }
            } else {
                return null;
            }
        }
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }

    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return state.get(STAGE) == 0;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isOf(BlockInit.ETTERAVE_REMENTIO);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        int i = this.countEtteraveBambooAbove(world, pos);
        int j = this.countEtteraveBambooBelow(world, pos);
        return i + j + 1 < 16 && world.getBlockState(pos.up(i)).get(STAGE) != 1;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = this.countEtteraveBambooAbove(world, pos);
        int j = this.countEtteraveBambooBelow(world, pos);
        int k = i + j + 1;
        int l = 1 + random.nextInt(2);

        for(int m = 0; m < l; ++m) {
            BlockPos blockPos = pos.up(i);
            BlockState blockState = world.getBlockState(blockPos);
            if (k >= 16 || blockState.get(STAGE) == 1 || !world.isAir(blockPos.up())) {
                return;
            }

            ++i;
            ++k;
        }

    }

    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        return player.getMainHandStack().getItem() instanceof SwordItem ? 1.0F : super.calcBlockBreakingDelta(state, player, world, pos);
    }

    protected int countEtteraveBambooAbove(BlockView world, BlockPos pos) {
        int i;
        for(i = 0; i < 16 && world.getBlockState(pos.up(i + 1)).isOf(BlockInit.ETTERAVE_BAMBOO); ++i) {
        }

        return i;
    }

    protected int countEtteraveBambooBelow(BlockView world, BlockPos pos) {
        int i;
        for(i = 0; i < 16 && world.getBlockState(pos.down(i + 1)).isOf(BlockInit.ETTERAVE_BAMBOO); ++i) {
        }

        return i;
    }

    static {
        AGE = Properties.AGE_1;
        STAGE = Properties.STAGE;
    }
}
