package com.limitless.prism;

import com.limitless.prism.block.ModBlocks;
import com.limitless.prism.item.ModItemGroups;
import com.limitless.prism.item.ModItems;
import com.limitless.prism.screen.ModScreenHandlers;
import com.limitless.prism.util.ModRegistries;
import com.limitless.prism.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prism implements ModInitializer {
	public static final String MOD_ID = "prism";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModRegistries.registerModStuffs();
		ModItems.registerModItems();
		ModWorldGeneration.generateModWorldGeneration();
		ModScreenHandlers.registerScreenHandler();

		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x82BD5F, ModBlocks.GRASS_TERRAIN);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x82BD5F, ModBlocks.GRASS_TERRAIN);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x82BD5F, ModBlocks.GARDEN_CROTON);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x82BD5F, ModBlocks.GARDEN_CROTON);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x82BD5F, ModBlocks.TALL_GARDEN_CROTON);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x82BD5F, ModBlocks.TALL_GARDEN_CROTON);
	}
}