package com.limitless.prism.datagen;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool castlePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CASTLE_BRICKS);

        castlePool.stairs(ModBlocks.CASTLE_BRICK_STAIRS);
        castlePool.wall(ModBlocks.CASTLE_BRICK_WALL);
        castlePool.button(ModBlocks.CASTLE_BRICK_BUTTON);
        castlePool.pressurePlate(ModBlocks.CASTLE_BRICK_PRESSURE_PLATE);
        castlePool.slab(ModBlocks.CASTLE_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool stoneTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_TILES);

        stoneTilePool.stairs(ModBlocks.STONE_TILE_STAIRS);
        stoneTilePool.slab(ModBlocks.STONE_TILE_SLAB);


        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GARDEN_CROTON, ModBlocks.POTTED_GARDEN_CROTON, BlockStateModelGenerator.TintType.TINTED);


        BlockStateModelGenerator.BlockTexturePool desertPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DESERT_BRICKS);

        desertPool.stairs(ModBlocks.DESERT_BRICK_STAIRS);
        desertPool.wall(ModBlocks.DESERT_BRICK_WALL);
        desertPool.button(ModBlocks.DESERT_BRICK_BUTTON);
        desertPool.pressurePlate(ModBlocks.DESERT_BRICK_PRESSURE_PLATE);
        desertPool.slab(ModBlocks.DESERT_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);

        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);


        BlockStateModelGenerator.BlockTexturePool marbleTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE_TILES);

        marbleTilePool.stairs(ModBlocks.MARBLE_TILE_STAIRS);
        marbleTilePool.slab(ModBlocks.MARBLE_TILE_SLAB);


        blockStateModelGenerator.registerTintableCross(com.limitless.prism.block.ModBlocks.COLUMBINE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(com.limitless.prism.block.ModBlocks.CALLALILY_WHITE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(com.limitless.prism.block.ModBlocks.CALLALILY_PURPLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(com.limitless.prism.block.ModBlocks.CALLALILY_YELLOW, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(com.limitless.prism.block.ModBlocks.CALLALILY_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(com.limitless.prism.block.ModBlocks.CALLALILY_PINK, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerLog(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG).log(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG).wood(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD);

        BlockStateModelGenerator.BlockTexturePool rotten_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS);
        rotten_pool.family(com.limitless.prism.block.ModBlocks.ROTTEN_FAMILY);

        rotten_pool.stairs(com.limitless.prism.block.ModBlocks.ROTTEN_STAIRS);
        rotten_pool.slab(com.limitless.prism.block.ModBlocks.ROTTEN_SLAB);
        rotten_pool.fence(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE);
        rotten_pool.fenceGate(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE_GATE);
        rotten_pool.button(com.limitless.prism.block.ModBlocks.ROTTEN_BUTTON);
        rotten_pool.pressurePlate(com.limitless.prism.block.ModBlocks.ROTTEN_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(com.limitless.prism.block.ModBlocks.ROTTEN_DOOR);
        blockStateModelGenerator.registerTrapdoor(com.limitless.prism.block.ModBlocks.ROTTEN_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(com.limitless.prism.block.ModBlocks.ROT_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}