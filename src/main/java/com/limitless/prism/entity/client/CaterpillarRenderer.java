package com.limitless.prism.entity.client;

import com.google.common.collect.Maps;
import com.limitless.prism.Prism;
import com.limitless.prism.entity.custom.CaterpillarEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class CaterpillarRenderer extends MobEntityRenderer<CaterpillarEntity, Caterpillar<CaterpillarEntity>> {


    public static final Map<CaterpillarVariant, Identifier> CATERPILLAR_VARIANT =
            Util.make(Maps.newEnumMap(CaterpillarVariant.class), (map) -> {
                map.put(CaterpillarVariant.GREEN, new Identifier(Prism.MOD_ID, "textures/entity/caterpillar/caterpillar_green.png"));
                map.put(CaterpillarVariant.YELLOW, new Identifier(Prism.MOD_ID, "textures/entity/caterpillar/caterpillar_yellow.png"));
                map.put(CaterpillarVariant.GREEN_RED, new Identifier(Prism.MOD_ID, "textures/entity/caterpillar/caterpillar_green_red.png"));
            });

    public CaterpillarRenderer(EntityRendererFactory.Context context) {
        super(context, new Caterpillar<>(context.getPart(ModModelLayers.CATERPILLAR)), 0.35f);
    }

    @Override
    public Identifier getTexture(CaterpillarEntity instance) {
        return CATERPILLAR_VARIANT.get(instance.getVariant());
    }

    @Override
    public void render(CaterpillarEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
