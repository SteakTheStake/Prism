package com.limitless.prism.datagen;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CASTLE_BRICK_STAIRS);
        addDrop(ModBlocks.CASTLE_BRICK_WALL);
        addDrop(ModBlocks.CASTLE_BRICK_BUTTON);
        addDrop(ModBlocks.CASTLE_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.CASTLE_BRICK_SLAB, slabDrops(ModBlocks.CASTLE_BRICK_SLAB));

        addDrop(ModBlocks.DESERT_BRICK_STAIRS);
        addDrop(ModBlocks.DESERT_BRICK_WALL);
        addDrop(ModBlocks.DESERT_BRICK_BUTTON);
        addDrop(ModBlocks.DESERT_BRICK_PRESSURE_PLATE);
        addDrop(ModBlocks.DESERT_BRICK_SLAB, slabDrops(ModBlocks.DESERT_BRICK_SLAB));


        addDrop(ModBlocks.MARBLE_TILE_STAIRS);
        addDrop(ModBlocks.MARBLE_TILE_SLAB, slabDrops(ModBlocks.MARBLE_TILE_SLAB));


        addDrop(ModBlocks.STONE_TILE_STAIRS);
        addDrop(ModBlocks.STONE_TILE_SLAB, slabDrops(ModBlocks.STONE_TILE_SLAB));

        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_SLAB, slabDrops(ModBlocks.PALM_SLAB));



        addDrop(ModBlocks.SHELF_MUSHROOM_BLOCK);
        addDrop(ModBlocks.COLUMBINE);

        addDrop(ModBlocks.ROTTEN_WOOD);
        addDrop(ModBlocks.STRIPPED_ROTTEN_WOOD);
        addDrop(ModBlocks.ROTTEN_LOG);
        addDrop(ModBlocks.STRIPPED_ROTTEN_LOG);
        addDrop(ModBlocks.ROTTEN_PLANKS);
        addDrop(ModBlocks.ROT_BLOCK);

        addDrop(ModBlocks.IVY, grassDrops(ModBlocks.IVY));
        addDrop(ModBlocks.UNDERGROWTH, grassDrops(ModBlocks.UNDERGROWTH));

        addDrop(ModBlocks.ROTTEN_DOOR, doorDrops(ModBlocks.ROTTEN_DOOR));
        addDrop(ModBlocks.ROTTEN_SLAB, slabDrops(ModBlocks.ROTTEN_SLAB));
        addDrop(ModBlocks.ROTTEN_TRAPDOOR);
        addDrop(ModBlocks.ROTTEN_FENCE);
        addDrop(ModBlocks.ROTTEN_STAIRS);
        addDrop(ModBlocks.ROTTEN_FENCE_GATE);
    }
}