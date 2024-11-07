package com.limitless.prism.block;

import com.limitless.prism.Prism;
import com.limitless.prism.block.custom.*;
import com.limitless.prism.world.flower.CrotonFlowerGenerator;
import com.limitless.prism.world.tree.PalmSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Identifier;

public class ModBlocks {
    /* START Plains */

    public static final Block CASTLE_BRICKS = registerBlock("castle_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BUILT_CASTLE_BRICK_WALL = registerBlock("built_castle_brick_wall",
            new BuiltCastleBrick(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BUILT_CASTLE_BRICK_FLOOR = registerBlock("built_castle_brick_floor",
            new BuiltCastleBrick(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE)));
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
    public static final Block LARGE_STONE_TILES = registerBlock("large_stone_tiles",
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
            new ThinLog(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block THIN_STRIPPED_PALM_LOG = registerBlock("thin_stripped_palm_log",
            new ThinLog(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
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

    public static final Block BEACH_PEBBLES = registerBlock("beach_pebbles",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAVEL).sounds(BlockSoundGroup.GRAVEL).strength(4f)));

    public static final Block GARDEN_CROTON = registerBlock("garden_croton",
            new ModFlowerBlock(new CrotonFlowerGenerator(), FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block TALL_GARDEN_CROTON = registerBlock("tall_garden_croton",
            new ModFlowerBlock(new CrotonFlowerGenerator(), FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block POTTED_GARDEN_CROTON = registerBlockWithoutBlockItem("potted_garden_croton",
            new FlowerPotBlock(GARDEN_CROTON, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)));

    /* END Desert 1 */



    /* START Decoration */

    public static final Block CHESS_SET = registerBlock("chess_set",
            new ChessSet(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block WOODEN_CRATE = registerBlock("wooden_crate",
            new WoodenCrate(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));
    public static final Block TELESCOPE = registerBlock("telescope",
            new Telescope(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block WOODEN_BASKET = registerBlock("wooden_basket",
            new WoodenBasket(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD)));

    /* END Decoration */



    /* START Desert 2 */

    public static final Block DESERT_BRICKS = registerBlock("desert_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BUILT_DESERT_BRICK_WALL = registerBlock("built_desert_brick_wall",
            new BuiltDesertBricks(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BUILT_DESERT_BRICK_FLOOR = registerBlock("built_desert_brick_floor",
            new BuiltDesertBricks(FabricBlockSettings.copyOf(Blocks.SANDSTONE).sounds(BlockSoundGroup.DEEPSLATE)));
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


    /* START Plants */
    public static final IntProperty SIZE = IntProperty.of("size", 0, 2);

    public static final Block ROT_BLOCK = registerBlock("rot_block",
            new com.limitless.prism.block.custom.RotBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WET_GRASS).ticksRandomly()));

    public static final Block IVY = registerBlock("ivy",
            new com.limitless.prism.block.custom.IvyBlock(FabricBlockSettings.copyOf(Blocks.VINE).sounds(BlockSoundGroup.VINE).ticksRandomly()));

    public static final Block UNDERGROWTH = registerBlock("undergrowth",
            new com.limitless.prism.block.custom.UndergrowthBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).sounds(BlockSoundGroup.WET_GRASS).noCollision().breakInstantly()));


    public static final Block SHELF_MUSHROOM_BLOCK = registerBlock("shelf_mushroom",
            new ShelfMushroomBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).sounds(BlockSoundGroup.SHROOMLIGHT)));

    public static final Block CALLALILY_WHITE = registerBlock("callalily_white",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_PINK = registerBlock("callalily_pink",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_YELLOW = registerBlock("callalily_yellow",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_LILAC = registerBlock("callalily_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_PURPLE = registerBlock("callalily_purple",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block COLUMBINE = registerBlock("columbine",
            new FlowerBlock(StatusEffects.DARKNESS, 60, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    //Rotten Wood

    public static final Block ROTTEN_LOG = registerBlock("rotten_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2f).burnable()));

    public static final Block ROTTEN_WOOD = registerBlock("rotten_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f).burnable()));

    public static final Block STRIPPED_ROTTEN_LOG = registerBlock("stripped_rotten_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2f).burnable()));

    public static final Block STRIPPED_ROTTEN_WOOD = registerBlock("stripped_rotten_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2f).burnable()));

    public static final Block ROTTEN_PLANKS = registerBlock("rotten_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f).burnable()));

    public static final Block ROTTEN_BUTTON = registerBlock("rotten_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).sounds(BlockSoundGroup.WOOD), BlockSetType.OAK, 10, true));
    public static final Block ROTTEN_PRESSURE_PLATE = registerBlock("rotten_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Identifier ROTTEN_SIGN_TEXTURE = new Identifier(Prism.MOD_ID, "entity/signs/rotten");

    public static final Block ROTTEN_STAIRS = registerBlock("rotten_stairs",
            new StairsBlock(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).burnable()));
    public static final Block ROTTEN_SLAB = registerBlock("rotten_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).burnable()));

    public static final Block ROTTEN_FENCE = registerBlock("rotten_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).burnable()));
    public static final Block ROTTEN_FENCE_GATE = registerBlock("rotten_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).burnable(), WoodType.OAK));

    public static final Block ROTTEN_DOOR = registerBlock("rotten_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().burnable(), BlockSetType.OAK));
    public static final Block ROTTEN_TRAPDOOR = registerBlock("rotten_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().burnable(), BlockSetType.OAK));

    public static final BlockFamily ROTTEN_FAMILY = BlockFamilies.register(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
            .group("wooden").unlockCriterionName("has_planks").build();

    /* END Plants */


    /* START Terrain */

    public static final Block GRASS_TERRAIN = registerBlock("grass_terrain",
            new GrassTerrain(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.GREEN)));
    public static final Block SAND_TERRAIN = registerBlock("sand_terrain",
            new SandTerrain(FabricBlockSettings.copyOf(Blocks.SAND).sounds(BlockSoundGroup.SAND).mapColor(MapColor.PALE_YELLOW)));
    public static final Block STONE_TERRAIN = registerBlock("stone_terrain",
            new StoneTerrain(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).mapColor(MapColor.STONE_GRAY)));

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