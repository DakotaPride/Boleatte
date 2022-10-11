package net.dakotapride.boleatte.client;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BoleatteClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PROTOSTERM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PROTOSTERM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.HYPNOTIC_SETHIOL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.TWISTING_SETHIOL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CYAN_STAR_SETHIOL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.IPALBA, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BOTAKOA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BOTAKOA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.VIOLET_SETHIOL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_BOTAKOA_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BOTAKOA_LILY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.FLAMING_SETHIOL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ARBUNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ARBUNE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MELKIRSCH_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ATTACHED_MELKIRSCH_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MAUVE_EMERIO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.VIOLET_TIPPED_EMERIO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.UNSTAINED_EMERIO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACUNILLUS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ARBUNE_LILY, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RASIORE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RASIORE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.INTOXICATING_MIENTIS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GOLDEN_MIENTIS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DENTICIUS_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DENTICIUS_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BLOOMING_DENTICIUS_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPINED_FRITRIS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.NOCTURNAL_EYED_FRITRIS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.HANGING_BELL_FRITRIS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.QUANALLA_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SAKALOU_ROOTS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BABURBEN_ROOTS, RenderLayer.getCutout());
    }
}
