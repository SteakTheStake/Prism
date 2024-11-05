package com.limitless.prism.world.gen;

import com.limitless.prism.Prism;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static FoliagePlacerType<PalmLeafPlacer> PALM_LEAF_PLACER;

    public static void register() {
        PALM_LEAF_PLACER = Registry.register(Registries.FOLIAGE_PLACER_TYPE,
                new Identifier(Prism.MOD_ID, "palm_leaf_placer"),
                new FoliagePlacerType<>(PalmLeafPlacer.CODEC));
    }
}