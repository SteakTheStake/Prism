package com.limitless.prism.world.gen;

import com.limitless.prism.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.PALM_PLACED_KEY
        );
    }
}