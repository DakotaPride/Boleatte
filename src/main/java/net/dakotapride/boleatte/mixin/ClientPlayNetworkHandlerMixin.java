package net.dakotapride.boleatte.mixin;

import net.dakotapride.boleatte.common.init.ItemInit;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetworkThreadUtils;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {

    private static ClientPlayNetworkHandler clientPlayNetworkHandler;
    private final ClientWorld world;
    private final MinecraftClient client;

    public ClientPlayNetworkHandlerMixin(ClientWorld world, MinecraftClient client) {
        this.world = world;
        this.client = client;
    }

    private static ItemStack isActiveVeretEidolon(PlayerEntity player) {
        for (Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(ItemInit.VERET_EIDOLON)) {
                return itemStack;
            }
        }
        return new ItemStack(ItemInit.VERET_EIDOLON);
    }

    private static ItemStack isActiveOritemEidolon(PlayerEntity player) {
        for (Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(ItemInit.ORITEM_EIDOLON)) {
                return itemStack;
            }
        }
        return new ItemStack(ItemInit.ORITEM_EIDOLON);
    }

    private static ItemStack isActiveGelaEidolon(PlayerEntity player) {
        for (Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(ItemInit.GELA_EIDOLON)) {
                return itemStack;
            }
        }
        return new ItemStack(ItemInit.GELA_EIDOLON);
    }

    private static ItemStack isActiveBeusereEidolon(PlayerEntity player) {
        for (Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(ItemInit.BEUSERE_EIDOLON)) {
                return itemStack;
            }
        }
        return new ItemStack(ItemInit.BEUSERE_EIDOLON);
    }

    private static ItemStack isActiveSterresEidolon(PlayerEntity player) {
        for (Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(ItemInit.STERRES_EIDOLON)) {
                return itemStack;
            }
        }
        return new ItemStack(ItemInit.STERRES_EIDOLON);
    }

    private static ItemStack isActiveLaideEidolon(PlayerEntity player) {
        for (Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(ItemInit.LAIDE_EIDOLON)) {
                return itemStack;
            }
        }
        return new ItemStack(ItemInit.LAIDE_EIDOLON);
    }

    private static ItemStack isActiveCitadelEidolon(PlayerEntity player) {
        for (Hand hand : Hand.values()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(ItemInit.CITADEL_EIDOLON)) {
                return itemStack;
            }
        }
        return new ItemStack(ItemInit.CITADEL_EIDOLON);
    }


    @Inject(method = "onEntityStatus", at = @At("TAIL"))
    private void onEntityStatus(EntityStatusS2CPacket packet, CallbackInfo ci) {
        NetworkThreadUtils.forceMainThread(packet, clientPlayNetworkHandler, this.client);
        Entity entity = packet.getEntity(this.world);
        if (entity instanceof LivingEntity livingEntity) {
            Hand hand = livingEntity.getActiveHand();
            if (packet.getStatus() == 105) {
                if (livingEntity.getStackInHand(hand).isOf(ItemInit.VERET_EIDOLON)) {
                    this.world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ITEM_TOTEM_USE, entity.getSoundCategory(), 3.0F, 1.5F, false);
                    if (entity == this.client.player) {
                        this.client.gameRenderer.showFloatingItem(isActiveVeretEidolon(this.client.player));
                    }
                } else if (livingEntity.getStackInHand(hand).isOf(ItemInit.ORITEM_EIDOLON)) {
                    this.world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ITEM_TOTEM_USE, entity.getSoundCategory(), 3.0F, 1.5F, false);
                    if (entity == this.client.player) {
                        this.client.gameRenderer.showFloatingItem(isActiveOritemEidolon(this.client.player));
                    }
                } else if (livingEntity.getStackInHand(hand).isOf(ItemInit.GELA_EIDOLON)) {
                    this.world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ITEM_TOTEM_USE, entity.getSoundCategory(), 3.0F, 1.5F, false);
                    if (entity == this.client.player) {
                        this.client.gameRenderer.showFloatingItem(isActiveGelaEidolon(this.client.player));
                    }
                } else if (livingEntity.getStackInHand(hand).isOf(ItemInit.BEUSERE_EIDOLON)) {
                    this.world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ITEM_TOTEM_USE, entity.getSoundCategory(), 3.0F, 1.5F, false);
                    if (entity == this.client.player) {
                        this.client.gameRenderer.showFloatingItem(isActiveBeusereEidolon(this.client.player));
                    }
                } else if (livingEntity.getStackInHand(hand).isOf(ItemInit.STERRES_EIDOLON)) {
                    this.world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ITEM_TOTEM_USE, entity.getSoundCategory(), 3.0F, 1.5F, false);
                    if (entity == this.client.player) {
                        this.client.gameRenderer.showFloatingItem(isActiveSterresEidolon(this.client.player));
                    }
                } else if (livingEntity.getStackInHand(hand).isOf(ItemInit.LAIDE_EIDOLON)) {
                    this.world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ITEM_TOTEM_USE, entity.getSoundCategory(), 3.0F, 1.5F, false);
                    if (entity == this.client.player) {
                        this.client.gameRenderer.showFloatingItem(isActiveLaideEidolon(this.client.player));
                    }
                } else if (livingEntity.getStackInHand(hand).isOf(ItemInit.CITADEL_EIDOLON)) {
                    this.world.playSound(entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ITEM_TOTEM_USE, entity.getSoundCategory(), 3.0F, 1.5F, false);
                    if (entity == this.client.player) {
                        this.client.gameRenderer.showFloatingItem(isActiveCitadelEidolon(this.client.player));
                    }
                }
            }
        }
    }

}

