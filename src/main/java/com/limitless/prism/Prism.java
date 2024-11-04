package com.limitless.prism;

import com.limitless.prism.block.ModBlocks;
import com.limitless.prism.entity.ModEntities;
import com.limitless.prism.entity.custom.ButterflyEntity;
import com.limitless.prism.entity.custom.CaterpillarEntity;
import com.limitless.prism.entity.custom.DragonflyEntity;
import com.limitless.prism.entity.custom.FireFlySwarmEntity;
import com.limitless.prism.item.ModItemGroups;
import com.limitless.prism.screen.ModScreenHandlers;
import com.limitless.prism.util.ModRegistries;
import com.limitless.prism.world.gen.ModTreeDecorator;
import com.limitless.prism.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prism implements ModInitializer {
	public static final String MOD_ID = "prism";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItemGroups.registerModItems();
		ModRegistries.registerModStuffs();
		ModWorldGeneration.generateModWorldGeneration();
		ModScreenHandlers.registerScreenHandler();
		ModTreeDecorator.register();


		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x82BD5F, ModBlocks.GRASS_TERRAIN);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x82BD5F, ModBlocks.GRASS_TERRAIN);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x82BD5F, ModBlocks.GARDEN_CROTON);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x82BD5F, ModBlocks.GARDEN_CROTON);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x82BD5F, ModBlocks.TALL_GARDEN_CROTON);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x82BD5F, ModBlocks.TALL_GARDEN_CROTON);


		//Burnables
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_LOG, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_WOOD, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_PLANKS, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_SLAB, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_STAIRS, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_FENCE_GATE, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_TRAPDOOR, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(com.limitless.prism.block.ModBlocks.ROTTEN_DOOR, 6, 10);


		//Entities
		FabricDefaultAttributeRegistry.register(ModEntities.CATERPILLAR, CaterpillarEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.BUTTERFLY, ButterflyEntity.createButterflyAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DRAGONFLY, DragonflyEntity.createDragonflyAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.FIRE_FLY_SWARM, FireFlySwarmEntity.createFireflyAttributes());

		//Strippable
		StrippableBlockRegistry.register(com.limitless.prism.block.ModBlocks.ROTTEN_LOG, com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_LOG);
		StrippableBlockRegistry.register(com.limitless.prism.block.ModBlocks.ROTTEN_WOOD, com.limitless.prism.block.ModBlocks.STRIPPED_ROTTEN_WOOD);
	}
}
