package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MelkirschSeedsBlockItem extends AliasedBlockItem {
    public MelkirschSeedsBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    protected boolean canPlace(ItemPlacementContext context, BlockState state) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        return world.getBlockState(pos.down()).isOf(BlockInit.PATH_REMENTIO);
    }
}
