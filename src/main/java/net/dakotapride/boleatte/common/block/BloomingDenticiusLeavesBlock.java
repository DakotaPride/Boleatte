package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BloomingDenticiusLeavesBlock extends LeavesBlock {
    public BloomingDenticiusLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(Hand.MAIN_HAND).isOf(Items.SHEARS)) {
            dropStack(world, pos, new ItemStack(ItemInit.CENTILOPIK, 1));

            player.getStackInHand(Hand.MAIN_HAND).damage(2, player, (e) -> {
                e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
            });
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
