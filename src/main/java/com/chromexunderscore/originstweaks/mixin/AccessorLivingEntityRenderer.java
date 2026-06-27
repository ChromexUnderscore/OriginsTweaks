package com.chromexunderscore.originstweaks.mixin;

import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(LivingEntityRenderer.class)
public interface AccessorLivingEntityRenderer {
    
    @Accessor("features")
    <T extends LivingEntity, M extends EntityModel<T>> List<FeatureRenderer<T, M>> getFeatures();
}