package com.limitless.prism.item;

import com.limitless.prism.Prism;
import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CONSTRUCTION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Prism.MOD_ID, "construction"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.construction"))
                    .icon(() -> new ItemStack(ModBlocks.STONE_TILES)).entries((displayContext, entries) -> {
                        /* ADD ITEMS & BLOCKS HERE */

                        entries.add(ModBlocks.CASTLE_BRICKS);
                        entries.add(ModBlocks.BUILT_CASTLE_BRICK_WALL);
                        entries.add(ModBlocks.BUILT_CASTLE_BRICK_FLOOR);
                        entries.add(ModBlocks.CASTLE_BRICK_STAIRS);
                        entries.add(ModBlocks.CASTLE_BRICK_SLAB);
                        entries.add(ModBlocks.CASTLE_BRICK_WALL);
                        entries.add(ModBlocks.CASTLE_BRICK_BUTTON);
                        entries.add(ModBlocks.CASTLE_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.CASTLE_BRICK_ARCH);
                        entries.add(ModBlocks.STONE_TILES);
                        entries.add(ModBlocks.STONE_TILE_STAIRS);
                        entries.add(ModBlocks.STONE_TILE_SLAB);
                        entries.add(ModBlocks.STONE_TILE_ARCH);
                        entries.add(ModBlocks.LARGE_STONE_TILES);

                        entries.add(ModBlocks.DESERT_BRICKS);
                        entries.add(ModBlocks.BUILT_DESERT_BRICK_WALL);
                        entries.add(ModBlocks.BUILT_DESERT_BRICK_FLOOR);
                        entries.add(ModBlocks.DESERT_BRICK_STAIRS);
                        entries.add(ModBlocks.DESERT_BRICK_SLAB);
                        entries.add(ModBlocks.DESERT_BRICK_WALL);
                        entries.add(ModBlocks.DESERT_BRICK_BUTTON);
                        entries.add(ModBlocks.DESERT_BRICK_PRESSURE_PLATE);
                        entries.add(ModBlocks.DESERT_BRICK_ARCH);
                        entries.add(ModBlocks.MARBLE_TILES);
                        entries.add(ModBlocks.MARBLE_TILE_STAIRS);
                        entries.add(ModBlocks.MARBLE_TILE_SLAB);
                        entries.add(ModBlocks.MARBLE_TILE_ARCH);
                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.THIN_PALM_LOG);
                        entries.add(ModBlocks.THIN_STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.BEACH_PEBBLES);
                        entries.add(ModBlocks.ROTTEN_PLANKS);
                        entries.add(ModBlocks.ROTTEN_DOOR);
                        entries.add(ModBlocks.ROTTEN_TRAPDOOR);
                        entries.add(ModBlocks.ROTTEN_FENCE);
                        entries.add(ModBlocks.ROTTEN_FENCE_GATE);
                        entries.add(ModBlocks.ROTTEN_SLAB);
                        entries.add(ModBlocks.ROTTEN_STAIRS);

                        /* ADD ITEMS & BLOCKS HERE */
                    }).build());
    public static final ItemGroup ORGANIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Prism.MOD_ID, "organic"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.organic"))
                    .icon(() -> new ItemStack(ModBlocks.PALM_SAPLING)).entries((displayContext, entries) -> {
                        /* ADD ITEMS & BLOCKS HERE */

                        entries.add(ModBlocks.PALM_LEAVES);
                        entries.add(ModBlocks.PALM_SAPLING);
                        entries.add(ModBlocks.GARDEN_CROTON);
                        entries.add(ModBlocks.TALL_GARDEN_CROTON);
                        entries.add(ModBlocks.ROT_BLOCK);
                        entries.add(ModBlocks.ROTTEN_LOG);
                        entries.add(ModBlocks.ROTTEN_WOOD);
                        entries.add(ModBlocks.STRIPPED_ROTTEN_LOG);
                        entries.add(ModBlocks.STRIPPED_ROTTEN_WOOD);
                        entries.add(ModBlocks.SHELF_MUSHROOM_BLOCK);
                        entries.add(ModBlocks.COLUMBINE);
                        entries.add(ModBlocks.CALLALILY_WHITE);
                        entries.add(ModBlocks.CALLALILY_LILAC);
                        entries.add(ModBlocks.CALLALILY_PINK);
                        entries.add(ModBlocks.CALLALILY_PURPLE);
                        entries.add(ModBlocks.CALLALILY_YELLOW);
                        entries.add(ModBlocks.IVY);
                        entries.add(ModBlocks.UNDERGROWTH);

                        /* ADD ITEMS & BLOCKS HERE */
                    }).build());
    public static final ItemGroup DECORATION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Prism.MOD_ID, "decoration"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.decoration"))
                    .icon(() -> new ItemStack(ModBlocks.TELESCOPE)).entries((displayContext, entries) -> {
                        /* ADD ITEMS & BLOCKS HERE */

                        entries.add(ModBlocks.CHESS_SET);
                        entries.add(ModBlocks.TELESCOPE);
                        entries.add(ModBlocks.WOODEN_CRATE);
                        entries.add(ModBlocks.WOODEN_BASKET);

                        /* ADD ITEMS & BLOCKS HERE */
                    }).build());
    public static final ItemGroup TERRAIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Prism.MOD_ID, "terrain"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.terrain"))
                    .icon(() -> new ItemStack(Blocks.GRASS_BLOCK)).entries((displayContext, entries) -> {
                        /* ADD ITEMS & BLOCKS HERE */

                        entries.add(ModBlocks.GRASS_TERRAIN);
                        entries.add(ModBlocks.SAND_TERRAIN);
                        entries.add(ModBlocks.STONE_TERRAIN);

                        /* ADD ITEMS & BLOCKS HERE */
                    }).build());


    public static void registerItemGroups() {
        Prism.LOGGER.info("Registering Mod Item Groups for " + Prism.MOD_ID + "..");
    }

    public static void registerModItems() {
        Prism.LOGGER.info("Registering Mod Items for " + Prism.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(com.limitless.prism.item.ModItems::addItemsToEggItemTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(com.limitless.prism.item.ModItems::addItemsToCombatTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(com.limitless.prism.item.ModItems::addItemsToColorBlockTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(com.limitless.prism.item.ModItems::addItemsToIngredientsTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(com.limitless.prism.item.ModItems::addItemsToBuildingBlockTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(com.limitless.prism.item.ModItems::addItemsToNaturalBlockTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(com.limitless.prism.item.ModItems::addItemsToFunctionalBlockTabGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(com.limitless.prism.item.ModItems::addItemsToToolsTabGroup);
    }
}
