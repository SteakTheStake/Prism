package com.limitless.prism.datagen;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CASTLE_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DESERT_BRICKS);



        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CASTLE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DESERT_BRICK_WALL);



        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(com.limitless.prism.block.ModBlocks.COLUMBINE)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_LILAC)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_YELLOW)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_PURPLE)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_WHITE)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_PINK);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(com.limitless.prism.block.ModBlocks.COLUMBINE);

        getOrCreateTagBuilder(BlockTags.REPLACEABLE)
                .add(com.limitless.prism.block.ModBlocks.COLUMBINE)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_LILAC)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_YELLOW)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_PURPLE)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_WHITE)
                .add(com.limitless.prism.block.ModBlocks.CALLALILY_PINK)
                .add(com.limitless.prism.block.ModBlocks.SHELF_MUSHROOM_BLOCK)
                .add(com.limitless.prism.block.ModBlocks.IVY)
                .add(com.limitless.prism.block.ModBlocks.UNDERGROWTH);

        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES)
                .add(com.limitless.prism.block.ModBlocks.SHELF_MUSHROOM_BLOCK)
                .add(com.limitless.prism.block.ModBlocks.IVY)
                .add(com.limitless.prism.block.ModBlocks.UNDERGROWTH);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_LOG)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_WOOD)
                .add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG)
                .add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_DOOR)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(com.limitless.prism.block.ModBlocks.ROT_BLOCK);
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(com.limitless.prism.block.ModBlocks.ROT_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_DOOR)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_TRAPDOOR)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE_GATE)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_SLAB)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_STAIRS)
                .add(com.limitless.prism.block.ModBlocks.WALL_ROTTEN_SIGN)
                .add(com.limitless.prism.block.ModBlocks.STANDING_ROTTEN_SIGN)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_LOG)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_WOOD)
                .add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG)
                .add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD)
                .add(com.limitless.prism.block.ModBlocks.SHELF_MUSHROOM_BLOCK);

        getOrCreateTagBuilder(BlockTags.MUSHROOM_GROW_BLOCK)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_LOG)
                .add(com.limitless.prism.block.ModBlocks.ROTTEN_WOOD)
                .add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG)
                .add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD);
    }
}