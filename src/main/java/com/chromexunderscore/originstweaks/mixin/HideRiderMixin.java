package com.chromexunderscore.originstweaks.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderDispatcher.class)
public class HideRiderMixin {

    @Inject(
        method = "render(Lnet/minecraft/entity/Entity;DDDFFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V",
        at = @At("HEAD"),
        cancellable = true
    )
    private <E extends Entity> void cancelVanillaRiderRender(
        E entity, double x, double y, double z, float yaw, float tickDelta, 
        MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, 
        CallbackInfo info
    ) {
        if (entity instanceof PlayerEntity && entity.getVehicle() instanceof PlayerEntity) {
            info.cancel();
        }
    }
}