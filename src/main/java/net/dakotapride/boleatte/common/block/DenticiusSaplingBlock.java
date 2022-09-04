package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class DenticiusSaplingBlock extends SaplingBlock {
    public DenticiusSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return (floor.isOf(BlockInit.DENTICIUS_REMENTIO) || floor.isOf(BlockInit.REMENTIO));
    }
}
