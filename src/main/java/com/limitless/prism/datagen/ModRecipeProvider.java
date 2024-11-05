package com.limitless.prism.datagen;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        /* RECIPES FOR STONE CUTTER */
        /*
        SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofStacks(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_BRICKS, 1)
                .criterion(hasItem(ModBlocks.CASTLE_BRICKS), conditionsFromItem(ModBlocks.CASTLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASTLE_BRICK_STAIRS)));
        */

        /* RECIPES FOR CRAFTING TABLE */

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_BRICK_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', ModBlocks.CASTLE_BRICKS)
                .criterion(hasItem(ModBlocks.CASTLE_BRICKS), conditionsFromItem(ModBlocks.CASTLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASTLE_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("CCC")
                .input('C', ModBlocks.CASTLE_BRICKS)
                .criterion(hasItem(ModBlocks.CASTLE_BRICKS), conditionsFromItem(ModBlocks.CASTLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASTLE_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_BRICK_ARCH, 1)
                .pattern("CCC")
                .pattern("C  ")
                .pattern("C  ")
                .input('C', ModBlocks.CASTLE_BRICKS)
                .criterion(hasItem(ModBlocks.CASTLE_BRICKS), conditionsFromItem(ModBlocks.CASTLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASTLE_BRICK_ARCH)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_BRICK_PRESSURE_PLATE, 1)
                .pattern("   ")
                .pattern("   ")
                .pattern("CC ")
                .input('C', ModBlocks.CASTLE_BRICKS)
                .criterion(hasItem(ModBlocks.CASTLE_BRICKS), conditionsFromItem(ModBlocks.CASTLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASTLE_BRICK_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_BRICK_WALL, 6)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("   ")
                .input('C', ModBlocks.CASTLE_BRICKS)
                .criterion(hasItem(ModBlocks.CASTLE_BRICKS), conditionsFromItem(ModBlocks.CASTLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASTLE_BRICK_WALL)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CASTLE_BRICK_BUTTON, 1)
                .input(ModBlocks.CASTLE_BRICKS, '1')
                .criterion(hasItem(ModBlocks.CASTLE_BRICKS), conditionsFromItem(ModBlocks.CASTLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CASTLE_BRICK_BUTTON)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_TILE_ARCH, 1)
                .pattern("CCC")
                .pattern("C  ")
                .pattern("C  ")
                .input('C', ModBlocks.STONE_TILES)
                .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MARBLE_TILE_ARCH)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', ModBlocks.STONE_TILES)
                .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_TILE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("CCC")
                .input('C', ModBlocks.STONE_TILES)
                .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_TILE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_TILE_ARCH, 1)
                .pattern("CCC")
                .pattern("C  ")
                .pattern("C  ")
                .input('C', ModBlocks.STONE_TILES)
                .criterion(hasItem(ModBlocks.STONE_TILES), conditionsFromItem(ModBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_TILE_ARCH)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_BRICK_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', ModBlocks.DESERT_BRICKS)
                .criterion(hasItem(ModBlocks.DESERT_BRICKS), conditionsFromItem(ModBlocks.DESERT_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("CCC")
                .input('C', ModBlocks.DESERT_BRICKS)
                .criterion(hasItem(ModBlocks.DESERT_BRICKS), conditionsFromItem(ModBlocks.DESERT_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_BRICK_ARCH, 1)
                .pattern("CCC")
                .pattern("C  ")
                .pattern("C  ")
                .input('C', ModBlocks.DESERT_BRICKS)
                .criterion(hasItem(ModBlocks.DESERT_BRICKS), conditionsFromItem(ModBlocks.DESERT_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_BRICK_ARCH)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_BRICK_PRESSURE_PLATE, 1)
                .pattern("   ")
                .pattern("   ")
                .pattern("CC ")
                .input('C', ModBlocks.DESERT_BRICKS)
                .criterion(hasItem(ModBlocks.DESERT_BRICKS), conditionsFromItem(ModBlocks.DESERT_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DESERT_BRICK_PRESSURE_PLATE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_TILE_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', ModBlocks.MARBLE_TILES)
                .criterion(hasItem(ModBlocks.MARBLE_TILES), conditionsFromItem(ModBlocks.MARBLE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MARBLE_TILE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("CCC")
                .input('C', ModBlocks.MARBLE_TILES)
                .criterion(hasItem(ModBlocks.MARBLE_TILES), conditionsFromItem(ModBlocks.MARBLE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MARBLE_TILE_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_STAIRS, 4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .input('C', ModBlocks.PALM_PLANKS)
                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("CCC")
                .input('C', ModBlocks.PALM_PLANKS)
                .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PALM_SLAB)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.ROTTEN_DOOR, 3)
                .pattern("RR")
                .pattern("RR")
                .pattern("RR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.ROTTEN_TRAPDOOR, 2)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.ROTTEN_FENCE, 3)
                .pattern("RXR")
                .pattern("RXR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.ROTTEN_FENCE_GATE, 1)
                .pattern("RXR")
                .pattern("RXR")
                .input('X', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.ROTTEN_SLAB, 6)
                .pattern("RRR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.ROTTEN_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.OAK_BOAT, 1)
                .pattern("R R")
                .pattern("RRR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Items.OAK_BOAT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.ROTTEN_WOOD, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_LOG)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_LOG), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG), conditionsFromItem(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, com.limitless.prism.block.ModBlocks.ROTTEN_PRESSURE_PLATE, 1)
                .pattern("RR")
                .input('R', com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS), conditionsFromItem(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROTTEN_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, com.limitless.prism.block.ModBlocks.ROT_BLOCK, 4)
                .pattern("XR")
                .pattern("RX")
                .input('R', Blocks.DIRT)
                .input('X', Items.BONE_MEAL)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .criterion(hasItem(Items.BONE_MEAL), conditionsFromItem(Items.BONE_MEAL))
                .offerTo(exporter, new Identifier(getRecipeName(com.limitless.prism.block.ModBlocks.ROT_BLOCK)));
    }
}