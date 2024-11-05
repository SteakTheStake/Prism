package com.limitless.prism.world;

import com.limitless.prism.Prism;
import com.limitless.prism.block.ModBlocks;
import com.limitless.prism.world.gen.PalmLeafPlacer;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("palm");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CROTON_KEY = registerKey("garden_croton");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TALL_CROTON_KEY = registerKey("tall_garden_croton");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALM_LOG),
                new StraightTrunkPlacer(8, 4, 0), // Tall trunk
                BlockStateProvider.of(ModBlocks.PALM_LEAVES),

        new PalmLeafPlacer(
                        ConstantIntProvider.create(2), // Radius for foliage
                        ConstantIntProvider.create(0)  // No vertical offset
                ),
                new TwoLayersFeatureSize(0, 0, 0)
        ).ignoreVines().build());

        register(context, CROTON_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GARDEN_CROTON)))));

        register(context, TALL_CROTON_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TALL_GARDEN_CROTON)))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Prism.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key,
            F feature,
            FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}