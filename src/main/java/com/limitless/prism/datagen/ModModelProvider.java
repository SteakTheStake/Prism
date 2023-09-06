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


        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GARDEN_CROTON, ModBlocks.POTTED_GARDEN_CROTON, BlockStateModelGenerator.TintType.NOT_TINTED);


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

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}