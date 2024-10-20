package org.lirox.thunderenhancement.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LightningEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LightningEntity;
import net.minecraft.util.math.Matrix4f;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static org.lirox.thunderenhancement.ThunderEnhancement.LOGGER;


@Mixin(LightningEntityRenderer.class)
public abstract class LightningRenderMixin {
    @Shadow
    private static void drawBranch(Matrix4f matrix, VertexConsumer buffer, float x1, float z1, int y, float x2, float z2, float red, float green, float blue, float offset2, float offset1, boolean shiftEast1, boolean shiftSouth1, boolean shiftEast2, boolean shiftSouth2) {
    }

    @Inject(method = "render*", at = @At("HEAD"), cancellable = true)
    private void renderLightning(LightningEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, CallbackInfo ci) {
        LOGGER.info("a");
        ci.cancel();
    }
    // todo: random complexity (aka num of branches), random flashes count (how many times the main line will strike ground)
}