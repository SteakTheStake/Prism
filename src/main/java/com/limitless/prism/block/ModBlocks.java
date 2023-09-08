package com.limitless.prism.block;

import com.limitless.prism.Prism;
import com.limitless.prism.block.custom.*;
import com.limitless.prism.block.custom.SandTerrain;
import com.limitless.prism.world.flower.CrotonFlowerGenerator;
import com.limitless.prism.world.tree.PalmSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    /* START Plains */

    public static final Block CASTLE_BRICKS = registerBlock("castle_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CASTLE_BRICK_STAIRS = registerBlock("castle_brick_stairs",
            new StairsBlock(ModBlocks.CASTLE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CASTLE_BRICK_WALL = registerBlock("castle_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CASTLE_BRICK_BUTTON = registerBlock("castle_bricks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE), BlockSetType.STONE, 10, true));
    public static final Block CASTLE_BRICK_PRESSURE_PLATE = registerBlock("castle_bricks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICKS), BlockSetType.STONE));
    public static final Block CASTLE_BRICK_SLAB = registerBlock("castle_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CASTLE_BRICK_ARCH = registerBlock("castle_brick_arch",
            new CastleBrickArch(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(ModBlocks.CASTLE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block STONE_TILE_ARCH = registerBlock("stone_tile_arch",
            new StoneTileArch(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));

    /* END Plains */



    /* START Desert 1 */


    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block THIN_PALM_LOG = registerBlock("thin_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block THIN_STRIPPED_PALM_LOG = registerBlock("thin_stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES).strength(1f)));
    public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new ModSaplingBlock(new PalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(1f)));

    public static final Block GARDEN_CROTON = registerBlock("garden_croton",
            new ModFlowerBlock(new CrotonFlowerGenerator(), FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block TALL_GARDEN_CROTON = registerBlock("tall_garden_croton",
            new ModFlowerBlock(new CrotonFlowerGenerator(), FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block POTTED_GARDEN_CROTON = registerBlockWithoutBlockItem("potted_garden_croton",
            new FlowerPotBlock(GARDEN_CROTON, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)));

    /* END Desert 1 */



    /* START Desert 2 */

    public static final Block DESERT_BRICKS = registerBlock("desert_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DESERT_BRICK_STAIRS = registerBlock("desert_brick_stairs",
            new StairsBlock(ModBlocks.CASTLE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DESERT_BRICK_WALL = registerBlock("desert_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DESERT_BRICK_BUTTON = registerBlock("desert_bricks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE), BlockSetType.STONE, 10, true));
    public static final Block DESERT_BRICK_PRESSURE_PLATE = registerBlock("desert_bricks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.SANDSTONE), BlockSetType.STONE));
    public static final Block DESERT_BRICK_SLAB = registerBlock("desert_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DESERT_BRICK_ARCH = registerBlock("desert_brick_arch",
            new DesertBrickArch(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block MARBLE_TILES = registerBlock("marble_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MARBLE_TILE_STAIRS = registerBlock("marble_tile_stairs",
            new StairsBlock(ModBlocks.CASTLE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MARBLE_TILE_SLAB = registerBlock("marble_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MARBLE_TILE_ARCH = registerBlock("marble_tile_arch",
            new MarbleTileArch(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));

    /* END Desert 2 */



    /* START Terrain */

    public static final Block GRASS_TERRAIN = registerBlockWithoutBlockItem("grass_terrain",
            new GrassTerrain(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.GRASS)));
    public static final Block SAND_TERRAIN = registerBlockWithoutBlockItem("sand_terrain",
            new SandTerrain(FabricBlockSettings.copyOf(Blocks.SAND).sounds(BlockSoundGroup.SAND)));
    public static final Block STONE_TERRAIN = registerBlockWithoutBlockItem("stone_terrain",
            new StoneTerrain(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE)));

    /* END Terrain */


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Prism.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Prism.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Prism.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Prism.LOGGER.info("Registering ModBlocks for " + Prism.MOD_ID);
    }
}