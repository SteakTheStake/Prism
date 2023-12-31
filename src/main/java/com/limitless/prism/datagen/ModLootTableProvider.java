package com.limitless.prism.datagen;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

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
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}