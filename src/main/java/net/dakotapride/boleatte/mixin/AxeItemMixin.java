package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AxeItem.class)
public abstract class AxeItemMixin {

    @Inject(method = "useOnBlock",at = @At("HEAD"))
    public void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir){
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        PlayerEntity playerEntity = context.getPlayer();
        BlockState blockState = world.getBlockState(blockPos);
        Block block = blockState.getBlock();
        ItemStack stackToDrop = null;
        if (block.getDefaultState().isOf(BlockInit.PROTOSTERM_LOG)) {
            stackToDrop = new ItemStack(ItemInit.PROTOSTERM_BARK, 1);
        } else if (block.getDefaultState().isOf(BlockInit.PROTOSTERM_WOOD)) {
            stackToDrop = new ItemStack(ItemInit.PROTOSTERM_BARK, 2);
        }
        if (stackToDrop != null) {
            playerEntity.dropItem(stackToDrop, false, false);
        }

    }
}
