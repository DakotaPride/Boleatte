package net.dakotapride.boleatte.common.item;

import net.dakotapride.boleatte.common.item.dimatis_use.AscunauticDimatis;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class AscunauticBlockItem extends BlockItem implements AscunauticDimatis {
    public AscunauticBlockItem(Block block, Settings settings) {
        super(block, settings);
    }
}
