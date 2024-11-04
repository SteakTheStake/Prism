package com.limitless.prism.entity.client;

import com.limitless.prism.Prism;
import com.limitless.prism.entity.custom.FireFlySwarmEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class FireflyRenderer extends MobEntityRenderer<FireFlySwarmEntity, Fireflies<FireFlySwarmEntity>> {

    private static final Identifier TEXTURE = new Identifier(Prism.MOD_ID,"textures/entity/fireflies/fireflies.png");

    public FireflyRenderer(EntityRendererFactory.Context context) {
        super(context, new Fireflies<>(context.getPart(ModModelLayers.FIRE_FLY_SWARM)), 0f);
        this.addFeature(new FireFliesFeatureRenderer<>(this));
    }

    @Override
    public Identifier getTexture(FireFlySwarmEntity instance) {
        return TEXTURE;

    }

    @Override
    public void render(FireFlySwarmEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
