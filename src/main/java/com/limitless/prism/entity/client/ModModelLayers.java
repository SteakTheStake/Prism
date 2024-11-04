package com.limitless.prism.entity.client;

import com.limitless.prism.Prism;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {

    public static final EntityModelLayer BUTTERFLY =
            new EntityModelLayer(new Identifier(Prism.MOD_ID, "butterfly"), "main");

    public static final EntityModelLayer CATERPILLAR =
            new EntityModelLayer(new Identifier(Prism.MOD_ID, "caterpillar"), "main");

    public static final EntityModelLayer DRAGONFLY =
            new EntityModelLayer(new Identifier(Prism.MOD_ID, "dragonfly"), "main");

    public static final EntityModelLayer FIRE_FLY_SWARM =
            new EntityModelLayer(new Identifier(Prism.MOD_ID, "fire_fly_swarm"), "main");

}
