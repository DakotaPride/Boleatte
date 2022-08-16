package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;

public class MelkirschBlock extends GourdBlock {
    public MelkirschBlock(Settings settings) {
        super(settings);
    }

    @Override
    public StemBlock getStem() {
        return BlockInit.MELKIRSCH_STEM;
    }

    @Override
    public AttachedStemBlock getAttachedStem() {
        return BlockInit.ATTACHED_MELKIRSCH_STEM;
    }
}
