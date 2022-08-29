package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.PropertiesInit;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

public class RementioBarrelBlock extends BarrelBlock {
    public static final DirectionProperty FACING;
    public static final BooleanProperty OPEN;

    public static final BooleanProperty IS_CINTONIUM;
    public static final BooleanProperty IS_NEMORAL;
    public static final BooleanProperty IS_OPAFEU;
    public static final BooleanProperty IS_LATZECK;
    public static final BooleanProperty IS_KUTUNITE;
    public static final BooleanProperty IS_LEPOSIATE;
    public RementioBarrelBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(OPEN, false));

        this.setDefaultState(this.getDefaultState().with(IS_NEMORAL, false));
        this.setDefaultState(this.getDefaultState().with(IS_OPAFEU, false));
        this.setDefaultState(this.getDefaultState().with(IS_LATZECK, false));
        this.setDefaultState(this.getDefaultState().with(IS_KUTUNITE, false));
        this.setDefaultState(this.getDefaultState().with(IS_LEPOSIATE, false));
        this.setDefaultState(this.getDefaultState().with(IS_CINTONIUM, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(IS_CINTONIUM);
        builder.add(IS_NEMORAL);
        builder.add(IS_OPAFEU);
        builder.add(IS_KUTUNITE);
        builder.add(IS_LATZECK);
        builder.add(IS_LEPOSIATE);

        builder.add(FACING, OPEN);
    }

    static {
        IS_CINTONIUM = PropertiesInit.IS_CINTONIUM;
        IS_NEMORAL = PropertiesInit.IS_NEMORAL;
        IS_OPAFEU = PropertiesInit.IS_OPAFEU;
        IS_KUTUNITE = PropertiesInit.IS_KUTUNITE;
        IS_LEPOSIATE = PropertiesInit.IS_LEPOSIATE;
        IS_LATZECK = PropertiesInit.IS_LATZECK;

        FACING = Properties.FACING;
        OPEN = Properties.OPEN;
    }

}
