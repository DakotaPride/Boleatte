package net.dakotapride.boleatte.client;

import net.dakotapride.boleatte.client.gui.BoleatteSkillsGui;
import net.dakotapride.boleatte.client.gui.BoleatteSkillsScreen;
import net.dakotapride.boleatte.common.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class BoleatteClient implements ClientModInitializer {
    public static final String KEY_OPEN_SKILLS_SCEEN = "key.boleatte.open_screen.skills";
    public static KeyBinding openScreenSkills;

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (openScreenSkills.wasPressed()) {
                MinecraftClient.getInstance().setScreen(new BoleatteSkillsScreen(new BoleatteSkillsGui()));
            }});
        openScreenSkills = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_OPEN_SKILLS_SCEEN,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_V,
                KeyBinding.INVENTORY_CATEGORY
        ));
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PROTOSTERM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PROTOSTERM_LEAVES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BOTAKOA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BOTAKOA_LEAVES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ARBUNE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ARBUNE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MELKIRSCH_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ATTACHED_MELKIRSCH_STEM, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RASIORE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.RASIORE_LEAVES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.QUANALLA_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SAKALOU_ROOTS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BABURBEN_ROOTS, RenderLayer.getCutout());
    }
}
