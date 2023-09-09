package com.limitless.prism.item;

import com.limitless.prism.Prism;
import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CONSTRUCTION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Prism.MOD_ID, "construction"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.construction"))
                    .icon(() -> new ItemStack(ModItems.PILE_OF_GRAVEL)).entries((displayContext, entries) -> {
                        /* ADD ITEMS & BLOCKS HERE */

                        entries.add(ModItems.PILE_OF_GRAVEL);
                        entries.add(ModBlocks.CASTLE_BRICKS);
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

                        entries.add(ModItems.PILE_OF_SAND);
                        entries.add(ModBlocks.DESERT_BRICKS);
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
                    .icon(() -> new ItemStack(ModBlocks.GRASS_TERRAIN)).entries((displayContext, entries) -> {
                        /* ADD ITEMS & BLOCKS HERE */

                        entries.add(ModBlocks.GRASS_TERRAIN);
                        entries.add(ModBlocks.SAND_TERRAIN);
                        entries.add(ModBlocks.STONE_TERRAIN);

                        /* ADD ITEMS & BLOCKS HERE */
                    }).build());

    public static void registerItemGroups() {
        Prism.LOGGER.info("Registering Mod Item Groups for " + Prism.MOD_ID + "...");
    }
}
