package com.chromexunderscore.originstweaks.mixin;

import io.github.apace100.apoli.component.PowerHolderComponent;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.SubPower;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.ConduitBlockEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ConduitBlockEntity.class)
public class ConduitRangeMixin {

    // Radius in blocks that conduit power reaches for holders of the power.
    private static final int RANGE = 32;

    // Duration of the applied effect.
    private static final int DURATION = 6000;

    private static final String EXTEND_CONDUIT = "extend_conduit";

    @Inject(
        method = "serverTick",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/block/entity/ConduitBlockEntity;givePlayersEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;)V",
            shift = At.Shift.AFTER
        )
    )
    private static void originstweaks$extendConduitRange(World world, BlockPos pos, BlockState state, ConduitBlockEntity conduit, CallbackInfo ci) {

        if (!conduit.isActive()) {
            return;
        }

        Box area = Box.of(pos.toCenterPos(), RANGE * 2.0D + 1.0D, RANGE * 2.0D + 1.0D, RANGE * 2.0D + 1.0D);

        for (PlayerEntity player : world.getEntitiesByClass(PlayerEntity.class, area, ConduitRangeMixin::hasExtendConduit)) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, DURATION, 0, true, true));
        }
    }

    @Unique
    private static boolean hasExtendConduit(PlayerEntity player) {

        PowerHolderComponent holder = PowerHolderComponent.getOptional(player).orElse(null);

        if (holder == null) {
            return false;
        }

        for (Power power : holder.getPowers(true)) {

            // A SubPower's id is its parent's (originstweaks:body_moisture), so match the sub-name.
            // isActive() evaluates the power's JSON condition, which is where "submerged in water
            // while under conduit power" is expressed.
            if (power instanceof SubPower subPower && EXTEND_CONDUIT.equals(subPower.getSubName())) {
                return power.isActive(player);
            }
        }

        return false;
    }
}
