package com.limitless.prism.item;

import com.limitless.prism.Prism;
import com.limitless.prism.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CATERPILLAR_SPAWN_EGG = registerModItem("caterpillar_spawn_egg", new SpawnEggItem(ModEntities.CATERPILLAR, 0x308723, 0xF0DA1B, new FabricItemSettings()));
    public static final Item BUTTERFLY_SPAWN_EGG = registerModItem("butterfly_spawn_egg", new SpawnEggItem(ModEntities.BUTTERFLY, 0x261007, 0xD56C24, new FabricItemSettings()));
    public static final Item FIREFLY_SWARM_SPAWN_EGG = registerModItem("firefly_swarm_spawn_egg", new SpawnEggItem(ModEntities.FIRE_FLY_SWARM, 0x0E0709, 0x9DFF18, new FabricItemSettings()));
    public static final Item DRAGONFLY_SPAWN_EGG = registerModItem("dragonfly_spawn_egg", new SpawnEggItem(ModEntities.DRAGONFLY, 0x2C0818, 0x658DD3, new FabricItemSettings()));

    static void addItemsToCombatTabGroup(FabricItemGroupEntries entries) {

    }
    static void addItemsToColorBlockTabGroup(FabricItemGroupEntries entries) {

    }

    static void addItemsToBuildingBlockTabGroup(FabricItemGroupEntries entries) {

    }

    static void addItemsToNaturalBlockTabGroup(FabricItemGroupEntries entries) {

    }

    static void addItemsToFunctionalBlockTabGroup(FabricItemGroupEntries entries) {

    }

    static void addItemsToIngredientsTabGroup(FabricItemGroupEntries entries) {

    }

    static void addItemsToToolsTabGroup(FabricItemGroupEntries entries) {

    }

    static void addItemsToEggItemTabGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerModItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Prism.MOD_ID, name), item);
    }

    private static Item registerModItems(String name, Item item) {
        registerModItem(name, item);
        return Registry.register(Registries.ITEM, new Identifier(Prism.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Prism.LOGGER.info("Registering ModItems for " + Prism.MOD_ID);
    }
}
