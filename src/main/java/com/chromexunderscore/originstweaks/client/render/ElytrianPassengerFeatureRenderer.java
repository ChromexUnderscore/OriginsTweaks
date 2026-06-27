package com.chromexunderscore.originstweaks.client.render;

import com.chromexunderscore.originstweaks.mixin.AccessorLivingEntityRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class ElytrianPassengerFeatureRenderer
        extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {

    private final FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context;

    public ElytrianPassengerFeatureRenderer(
            FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> context,
            EntityModelLoader loader) {
        super(context);
        this.context = context;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light,
            AbstractClientPlayerEntity player, float limbAngle, float limbDistance, float tickDelta,
            float animationProgress, float headYaw, float headPitch) {
        if (player.hasPassengers()) {
            for (Entity passenger : player.getPassengerList()) {
                if (passenger instanceof AbstractClientPlayerEntity rider) {

                    MinecraftClient client = MinecraftClient.getInstance();
                    if (rider == client.player && client.options.getPerspective().isFirstPerson()) {
                        continue;
                    }

                    matrices.push();

                    // 1. Lock to Elytrian
                    this.context.getModel().body.rotate(matrices);

                    // Position Override
                    if (player.isFallFlying()) {
                        // Flying position
                        matrices.translate(0.0, -0.1, 0.85);
                        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-45.0F));
                    } else {
                        // Grounded position
                        matrices.translate(0.0, -0.2, 0.5);
                        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-1.0F));
                    }

                    // Camera to Head rotation
                    float interpolatedHeadYaw = MathHelper.lerp(tickDelta, rider.prevHeadYaw, rider.headYaw);
                    float interpolatedBodyYaw = MathHelper.lerp(tickDelta, rider.prevBodyYaw, rider.bodyYaw);
                    float relativeHeadYaw = interpolatedHeadYaw - interpolatedBodyYaw;
                    float interpolatedPitch = MathHelper.lerp(tickDelta, rider.prevPitch, rider.getPitch());

                    // Dyn Animation variables
                    float riderLimbPos = rider.limbAnimator.getPos(tickDelta);
                    float riderLimbSpeed = rider.limbAnimator.getSpeed(tickDelta);
                    float riderHandSwing = rider.getHandSwingProgress(tickDelta);

                    PlayerEntityRenderer riderRenderer = (PlayerEntityRenderer) MinecraftClient.getInstance()
                            .getEntityRenderDispatcher().getRenderer(rider);
                    PlayerEntityModel<AbstractClientPlayerEntity> riderModel = riderRenderer.getModel();

                    // Sync Pose
                    boolean originalRidingState = riderModel.riding;
                    riderModel.riding = true;
                    riderModel.handSwingProgress = riderHandSwing;

                    riderModel.setAngles(rider, riderLimbPos, riderLimbSpeed, animationProgress, relativeHeadYaw,
                            interpolatedPitch);

                    // Draw Passenger Model
                    var skinBuffer = vertexConsumers.getBuffer(riderModel.getLayer(rider.getSkinTextures().texture()));
                    riderModel.render(matrices, skinBuffer, light,
                            net.minecraft.client.render.OverlayTexture.DEFAULT_UV);

                    // Equipment (Armor, Items, Trinkets, etc)
                    for (FeatureRenderer<?, ?> feature : ((AccessorLivingEntityRenderer) riderRenderer).getFeatures()) {
                        @SuppressWarnings("unchecked")
                        FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> playerFeature = (FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>>) feature;

                        playerFeature.render(
                                matrices, vertexConsumers, light, rider,
                                riderLimbPos, riderLimbSpeed, tickDelta,
                                animationProgress, relativeHeadYaw, interpolatedPitch);
                    }

                    // 8. Clean up
                    riderModel.riding = originalRidingState;
                    riderModel.handSwingProgress = 0.0f;

                    matrices.pop();
                    break;
                }
            }
        }
    }
}