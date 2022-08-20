package net.dakotapride.boleatte.common.block;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BoleatteAccessorBlock extends Block {
    public static final BooleanProperty IS_ARBUNE = BooleanProperty.of("is_arbune");
    public static final BooleanProperty IS_BABURBEN = BooleanProperty.of("is_baburben");
    public static final BooleanProperty IS_BOTAKOA = BooleanProperty.of("is_botakoa");
    public static final BooleanProperty IS_QUANTILA = BooleanProperty.of("is_quantila");
    public static final BooleanProperty IS_PROTOSTERM = BooleanProperty.of("is_protosterm");
    public static final BooleanProperty IS_RASIORE = BooleanProperty.of("is_rasiore");
    public BoleatteAccessorBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(IS_ARBUNE, Boolean.FALSE));
        setDefaultState(getDefaultState().with(IS_BABURBEN, Boolean.FALSE));
        setDefaultState(getDefaultState().with(IS_BOTAKOA, Boolean.FALSE));
        setDefaultState(getDefaultState().with(IS_QUANTILA, Boolean.FALSE));
        setDefaultState(getDefaultState().with(IS_PROTOSTERM, Boolean.FALSE));
        setDefaultState(getDefaultState().with(IS_RASIORE, Boolean.FALSE));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient() && hand == Hand.MAIN_HAND &&
                player.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.ARBUNE_DIMATIS)) {
            boolean arbune = state.get(IS_ARBUNE);
            world.setBlockState(pos, state.with(IS_ARBUNE, !arbune),3);
        } else if(!world.isClient() && hand == Hand.MAIN_HAND &&
                player.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.BOTAKOA_DIMATIS)) {
            boolean botakoa = state.get(IS_BOTAKOA);
            world.setBlockState(pos, state.with(IS_BOTAKOA, !botakoa),3);
        } else if(!world.isClient() && hand == Hand.MAIN_HAND &&
                player.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.BABURBEN_DIMATIS)) {
            boolean baburben = state.get(IS_BABURBEN);
            world.setBlockState(pos, state.with(IS_BABURBEN, !baburben),3);
        } else if(!world.isClient() && hand == Hand.MAIN_HAND &&
                player.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.QUANTILA_DIMATIS)) {
            boolean quantila = state.get(IS_QUANTILA);
            world.setBlockState(pos, state.with(IS_QUANTILA, !quantila),3);
        } else if(!world.isClient() && hand == Hand.MAIN_HAND &&
                player.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.PROTOSTERM_DIMATIS)) {
            boolean protosterm = state.get(IS_PROTOSTERM);
            world.setBlockState(pos, state.with(IS_PROTOSTERM, !protosterm),3);
        } else if(!world.isClient() && hand == Hand.MAIN_HAND &&
                player.getStackInHand(Hand.MAIN_HAND).isOf(ItemInit.RASIORE_DIMATIS)) {
            boolean rasiore = state.get(IS_RASIORE);
            world.setBlockState(pos, state.with(IS_RASIORE, !rasiore),3);
        }

        return ActionResult.PASS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(IS_ARBUNE);
        builder.add(IS_BABURBEN);
        builder.add(IS_BOTAKOA);
        builder.add(IS_QUANTILA);
        builder.add(IS_PROTOSTERM);
        builder.add(IS_RASIORE);
    }
}
