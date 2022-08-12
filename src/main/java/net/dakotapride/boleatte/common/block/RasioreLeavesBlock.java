package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class RasioreLeavesBlock extends LeavesBlock implements Fertilizable {
    public static final IntProperty AGE = Properties.AGE_3;
    public RasioreLeavesBlock(AbstractBlock.Settings settings) {
        super(settings);
        setDefaultState(((BlockState)this.stateManager.getDefaultState()).with(AGE, Integer.valueOf(0)));
        setDefaultState(((BlockState)this.stateManager.getDefaultState()).with(DISTANCE, Integer.valueOf(7))
                .with(PERSISTENT, Boolean.valueOf(false)).with(WATERLOGGED, Boolean.valueOf(false)));
    }


    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(BlockInit.RASIORE_LEAVES.asItem());
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        if (state.get(AGE) > 3) {
            return (((Integer)state.get(AGE)).intValue() < 3);
        } else {
            super.hasRandomTicks(state);
        }
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = ((Integer)state.get(AGE)).intValue();
        if (i < 3 && random.nextInt(5) == 0 && world.getBaseLightLevel(pos.up(), 0) >= 9) {
            BlockState blockState = state.with(AGE, Integer.valueOf(i + 1));
            world.setBlockState(pos, blockState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(blockState));
        } else if (shouldDecay(state)) {
            dropStacks(state, world, pos);
            world.removeBlock(pos, false);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = ((Integer)state.get(AGE)).intValue();
        boolean bl = (i == 3);

        if (!bl && player.getStackInHand(hand).isOf(Items.BONE_MEAL)) {
            return ActionResult.PASS;
        }

        if (i > 1) {
            int j = 1 + world.random.nextInt(2);
            dropStack(world, pos, new ItemStack(ItemInit.SAKALOU, j + (bl ? 1 : 0)));
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 0.8F + world.random.nextFloat() * 0.4F);
            BlockState blockState = state.with(AGE, Integer.valueOf(1));
            world.setBlockState(pos, blockState, 2);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.success(world.isClient);
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add((Property<?>[])new Property[] { AGE });
        builder.add((Property<?>[])new Property[] { DISTANCE, PERSISTENT, WATERLOGGED });
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return (((Integer)state.get(AGE)).intValue() < 3);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        int i = Math.min(3, ((Integer)state.get(AGE)).intValue() + 1);
        world.setBlockState(pos, state.with(AGE, Integer.valueOf(i)), 2);
    }



}
