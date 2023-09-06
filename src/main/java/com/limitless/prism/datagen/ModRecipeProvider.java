package com.limitless.prism.datagen;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SingleItemRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
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

    }
}