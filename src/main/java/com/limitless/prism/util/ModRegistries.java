package com.limitless.prism.util;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammables();
    }
    private static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.THIN_PALM_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.THIN_STRIPPED_PALM_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PALM_WOOD, 5, 5);


        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESS_SET, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WOODEN_CRATE, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WOODEN_BASKET, 5, 5);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PALM_LEAVES, 30, 60);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG);
        StrippableBlockRegistry.register(ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_WOOD);
        StrippableBlockRegistry.register(ModBlocks.THIN_PALM_LOG, ModBlocks.THIN_STRIPPED_PALM_LOG);
    }
}
