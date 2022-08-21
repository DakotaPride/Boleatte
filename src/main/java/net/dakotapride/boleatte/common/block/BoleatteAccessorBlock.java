package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.dakotapride.boleatte.common.init.TagInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BoleatteAccessorBlock extends Block {
    public BoleatteAccessorBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);

        if (player.getMainHandStack().isOf(ItemInit.DIMATIS) && state.isIn(TagInit.IS_ACCESSOR)) {
            world.setBlockState(pos, BlockInit.BOLEATTE_ACCESSOR.getDefaultState());
        } else if (player.getMainHandStack().isOf(ItemInit.ARBUNE_DIMATIS) && state.isOf(BlockInit.BOLEATTE_ACCESSOR)) {
            world.setBlockState(pos, BlockInit.ARBUNE_ACCESSOR.getDefaultState());
        } else if (player.getMainHandStack().isOf(ItemInit.BOTAKOA_DIMATIS) && state.isOf(BlockInit.BOLEATTE_ACCESSOR)) {
            world.setBlockState(pos, BlockInit.BOTAKOA_ACCESSOR.getDefaultState());
        } else if (player.getMainHandStack().isOf(ItemInit.BABURBEN_DIMATIS) && state.isOf(BlockInit.BOLEATTE_ACCESSOR)) {
            world.setBlockState(pos, BlockInit.BABURBEN_ACCESSOR.getDefaultState());
        } else if (player.getMainHandStack().isOf(ItemInit.RASIORE_DIMATIS) && state.isOf(BlockInit.BOLEATTE_ACCESSOR)) {
            world.setBlockState(pos, BlockInit.RASIORE_ACCESSOR.getDefaultState());
        } else if (player.getMainHandStack().isOf(ItemInit.PROTOSTERM_DIMATIS) && state.isOf(BlockInit.BOLEATTE_ACCESSOR)) {
            world.setBlockState(pos, BlockInit.PROTOSTERM_ACCESSOR.getDefaultState());
        } else if (player.getMainHandStack().isOf(ItemInit.QUANTILA_DIMATIS) && state.isOf(BlockInit.BOLEATTE_ACCESSOR)) {
            world.setBlockState(pos, BlockInit.QUANTILA_ACCESSOR.getDefaultState());
        }
        stack.damage(1, player, (user) -> user.sendToolBreakStatus(user.getActiveHand()));

        return super.onUse(state, world, pos, player, hand, hit);
    }
}
