package com.limitless.prism.world;

import com.limitless.prism.Prism;
import com.limitless.prism.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("palm");


    public static final RegistryKey<ConfiguredFeature<?, ?>> CROTON_KEY = registerKey("croton");

    public static final RegistryKey<ConfiguredFeature<?, ?>> TALL_CROTON_KEY = registerKey("tall_croton");


    public static final RegistryKey<ConfiguredFeature<?, ?>> ROLLING_HILLS7 = registerKey("7");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROLLING_HILLS6 = registerKey("6");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROLLING_HILLS5 = registerKey("5");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROLLING_HILLS4 = registerKey("4");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROLLING_HILLS3 = registerKey("3");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROLLING_HILLS2 = registerKey("2");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROLLING_HILLS1 = registerKey("1");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALM_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.PALM_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, CROTON_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GARDEN_CROTON)))));

        register(context, TALL_CROTON_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TALL_GARDEN_CROTON)))));

        register(context, ROLLING_HILLS7, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(191, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GRASS_TERRAIN.getDefaultState().with(Properties.LAYERS, 7))).toPlace(BlockPredicate.allOf(BlockPredicate.anyOf())))));
        register(context, ROLLING_HILLS6, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(191, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GRASS_TERRAIN.getDefaultState().with(Properties.LAYERS, 6))))));
        register(context, ROLLING_HILLS5, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(191, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GRASS_TERRAIN.getDefaultState().with(Properties.LAYERS, 5))))));
        register(context, ROLLING_HILLS4, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(191, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GRASS_TERRAIN.getDefaultState().with(Properties.LAYERS, 4))))));
        register(context, ROLLING_HILLS3, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(191, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GRASS_TERRAIN.getDefaultState().with(Properties.LAYERS, 3))))));
        register(context, ROLLING_HILLS2, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(191, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GRASS_TERRAIN.getDefaultState().with(Properties.LAYERS, 2))))));
        register(context, ROLLING_HILLS1, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(191, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GRASS_TERRAIN.getDefaultState().with(Properties.LAYERS, 1))))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Prism.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}