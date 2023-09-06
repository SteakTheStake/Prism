package com.limitless.prism;

import com.limitless.prism.block.ModBlocks;
import com.limitless.prism.item.ModItemGroups;
import com.limitless.prism.item.ModItems;
import com.limitless.prism.util.ModRegistries;
import com.limitless.prism.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

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
	}
}