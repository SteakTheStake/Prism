package com.limitless.prism.world.gen;

import com.limitless.prism.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import java.util.Arrays;
import java.util.List;

public class ModEntitySpawn {
    // Constants for spawn settings
    private static final int BUTTERFLY_WEIGHT = 40;
    private static final int DRAGONFLY_WEIGHT = 40;
    private static final int FIREFLY_WEIGHT = 40;
    private static final int CATERPILLAR_WEIGHT = 10;


    private static final List<RegistryKey<Biome>> BUTTERFLY_BIOMES = Arrays.asList(
            BiomeKeys.FOREST,
            BiomeKeys.FLOWER_FOREST,
            BiomeKeys.SUNFLOWER_PLAINS,
            BiomeKeys.TAIGA,
            BiomeKeys.OLD_GROWTH_PINE_TAIGA,
            BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,
            BiomeKeys.BIRCH_FOREST,
            BiomeKeys.OLD_GROWTH_BIRCH_FOREST,
            BiomeKeys.CHERRY_GROVE,
            BiomeKeys.MEADOW
    );

    private static final List<RegistryKey<Biome>> DRAGONFLY_BIOMES = Arrays.asList(
            BiomeKeys.RIVER,
            BiomeKeys.SWAMP,
            BiomeKeys.MANGROVE_SWAMP,
            BiomeKeys.BEACH
    );

    private static final List<RegistryKey<Biome>> FIREFLY_BIOMES = Arrays.asList(
            BiomeKeys.SWAMP,
            BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,
            BiomeKeys.OLD_GROWTH_PINE_TAIGA,
            BiomeKeys.OLD_GROWTH_BIRCH_FOREST,
            BiomeKeys.MANGROVE_SWAMP,
            BiomeKeys.RIVER,
            BiomeKeys.CHERRY_GROVE,
            BiomeKeys.TAIGA,
            BiomeKeys.SAVANNA,
            BiomeKeys.DARK_FOREST
    );

    private static final List<RegistryKey<Biome>> CATERPILLAR_BIOMES = Arrays.asList(
            BiomeKeys.FLOWER_FOREST,
            BiomeKeys.FOREST
    );

    public static void addEntitySpawn() {
        addButterflySpawns();
        addDragonflySpawns();
        addFireflySpawns();
        addCaterpillarSpawns();
        registerSpawnRestrictions();
    }

    private static void addButterflySpawns() {
        BUTTERFLY_BIOMES.forEach(biome ->
                BiomeModifications.addSpawn(
                        BiomeSelectors.includeByKey(biome),
                        SpawnGroup.CREATURE,
                        ModEntities.BUTTERFLY,
                        BUTTERFLY_WEIGHT,
                        1,
                        2
                )
        );
    }

    private static void addDragonflySpawns() {
        DRAGONFLY_BIOMES.forEach(biome ->
                BiomeModifications.addSpawn(
                        BiomeSelectors.includeByKey(biome),
                        SpawnGroup.CREATURE,
                        ModEntities.DRAGONFLY,
                        DRAGONFLY_WEIGHT,
                        1,
                        2
                )
        );
    }

    private static void addFireflySpawns() {
        FIREFLY_BIOMES.forEach(biome ->
                BiomeModifications.addSpawn(
                        BiomeSelectors.includeByKey(biome),
                        SpawnGroup.CREATURE,
                        ModEntities.FIRE_FLY_SWARM,
                        FIREFLY_WEIGHT,
                        1,
                        3
                )
        );
    }

    private static void addCaterpillarSpawns() {
        CATERPILLAR_BIOMES.forEach(biome ->
                BiomeModifications.addSpawn(
                        BiomeSelectors.includeByKey(biome),
                        SpawnGroup.CREATURE,
                        ModEntities.CATERPILLAR,
                        CATERPILLAR_WEIGHT,
                        1,
                        2
                )
        );
    }

    private static void registerSpawnRestrictions() {
        SpawnRestriction.register(
                ModEntities.BUTTERFLY,
                SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                AnimalEntity::isValidNaturalSpawn
        );

        SpawnRestriction.register(
                ModEntities.CATERPILLAR,
                SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                AnimalEntity::isValidNaturalSpawn
        );

        SpawnRestriction.register(
                ModEntities.FIRE_FLY_SWARM,
                SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                AnimalEntity::isValidNaturalSpawn
        );

        SpawnRestriction.register(
                ModEntities.DRAGONFLY,
                SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
                AnimalEntity::isValidNaturalSpawn
        );
    }
}