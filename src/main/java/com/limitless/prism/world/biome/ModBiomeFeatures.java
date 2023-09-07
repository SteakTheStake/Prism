package com.limitless.prism.world.biome;

import com.limitless.prism.world.ModPlacedFeatures;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class ModBiomeFeatures {
    public static void addRollingHills(GenerationSettings.LookupBackedBuilder biomeBuilder) {
        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModPlacedFeatures.ROLLING_HILLS7);
        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModPlacedFeatures.ROLLING_HILLS7);
        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModPlacedFeatures.ROLLING_HILLS7);
        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModPlacedFeatures.ROLLING_HILLS7);
        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModPlacedFeatures.ROLLING_HILLS7);
        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModPlacedFeatures.ROLLING_HILLS7);
        biomeBuilder.feature(GenerationStep.Feature.TOP_LAYER_MODIFICATION, ModPlacedFeatures.ROLLING_HILLS7);
    }
}
