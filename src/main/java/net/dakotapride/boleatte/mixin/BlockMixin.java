package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.dakotapride.boleatte.common.init.EffectInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class BlockMixin {

    @Inject(method = "onSteppedOn", at = @At("HEAD"))
    private void incantation$onGoldenBlockSteppedOn(World world, BlockPos pos, BlockState state, Entity entity, CallbackInfo ci) {
        if (entity instanceof LivingEntity livingEntity) {
            float randomValue = world.random.nextFloat() * 100;
            if (randomValue < 11 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_EMERALD_ORE.getDefaultState());
            } else if (randomValue > 10 && randomValue < 21 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_DIAMOND_ORE.getDefaultState());
            } else if (randomValue > 20 && randomValue < 31 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_GOLD_ORE.getDefaultState());
            } else if (randomValue > 30 && randomValue < 41 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_IRON_ORE.getDefaultState());
            } else if (randomValue > 40 && randomValue < 51 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_LEPOSIATE_ORE.getDefaultState());
            } else if (randomValue > 50 && randomValue < 61 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_NEMORAL_ORE.getDefaultState());
            } else if (randomValue > 60 && randomValue < 71 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_CINTONIUM_ORE.getDefaultState());
            } else if (randomValue > 70 && randomValue < 81 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_LATZECK_ORE.getDefaultState());
            } else if (randomValue > 80 && randomValue < 91 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_KUTUNITE_ORE.getDefaultState());
            } else if (randomValue > 90 && randomValue <= 100 && state.isIn(BlockTags.STONE_ORE_REPLACEABLES)
                    && livingEntity.hasStatusEffect(EffectInit.ORITEM_PROFIT)) {
                world.setBlockState(pos, BlockInit.REMENTIO_OPAFEU_ORE.getDefaultState());
            }
        }
    }

}
