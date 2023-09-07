package com.limitless.prism.world.biome.surface;

import com.limitless.prism.block.ModBlocks;
import com.limitless.prism.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRule {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_TERRAIN = makeStateRule(ModBlocks.GRASS_TERRAIN);
    private static final MaterialRules.MaterialRule SAND = makeStateRule(Blocks.SAND);
    private static final MaterialRules.MaterialRule SAND_TERRAIN = makeStateRule(ModBlocks.SAND_TERRAIN);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_TERRAIN), DIRT);
        MaterialRules.MaterialRule sandSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, SAND_TERRAIN), SAND);

        // Default to a grass and dirt surface
        // Default to a grass and dirt surface
        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.ROLLING_HILLS),

                        MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.SMOOTH_DESERT_DUNES),

                        // Default to a grass and dirt surface
                        MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
                                // Default to a grass and dirt surface
                        ), MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, sandSurface)))));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}