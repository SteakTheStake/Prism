package com.limitless.prism.entity.client;

import com.limitless.prism.Prism;
import com.limitless.prism.entity.custom.FireFlySwarmEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

@Environment(value = EnvType.CLIENT)
public class FireFliesFeatureRenderer<T extends FireFlySwarmEntity>
        extends EyesFeatureRenderer<T, Fireflies<T>> {
    private static final RenderLayer GLOW = RenderLayer.getEyes(new Identifier(Prism.MOD_ID, "textures/entity/fireflies/fireflies.png"));

    public FireFliesFeatureRenderer(FeatureRendererContext<T, Fireflies<T>> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return GLOW;
    }
}

