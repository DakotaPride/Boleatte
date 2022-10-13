package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.TagInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class TallBoleatteFlowerBlock extends TallFlowerBlock {
    public TallBoleatteFlowerBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (state == this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.LOWER)) {
            return world.getBlockState(pos.down()).isIn(TagInit.MOSSY_REMENTIO);
        } else return state == this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.UPPER);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isIn(TagInit.MOSSY_REMENTIO);
    }

}
