package com.limitless.prism.item;

import com.limitless.prism.Prism;
import com.limitless.prism.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PILE_OF_SAND = registerItem("pile_of_sand", new Item(new FabricItemSettings()));
    public static final Item PILE_OF_GRAVEL = registerItem("pile_of_gravel", new Item(new FabricItemSettings()));


    public static final Item CATERPILLAR_SPAWN_EGG = registerItem("caterpillar_spawn_egg", new SpawnEggItem(ModEntities.CATERPILLAR, 0x308723, 0xF0DA1B, new FabricItemSettings()));
    public static final Item BUTTERFLY_SPAWN_EGG = registerItem("butterfly_spawn_egg", new SpawnEggItem(ModEntities.BUTTERFLY, 0x261007, 0xD56C24, new FabricItemSettings()));
    public static final Item FIREFLY_SWARM_SPAWN_EGG = registerItem("firefly_swarm_spawn_egg", new SpawnEggItem(ModEntities.FIRE_FLY_SWARM, 0x0E0709, 0x9DFF18, new FabricItemSettings()));
    public static final Item DRAGONFLY_SPAWN_EGG = registerItem("dragonfly_spawn_egg", new SpawnEggItem(ModEntities.DRAGONFLY, 0x2C0818, 0x658DD3, new FabricItemSettings()));


    private static void addItemsToIngredientTabGroup(FabricItemGroupEntries entries) {
        entries.add(PILE_OF_SAND);

    }

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
        entries.add(ModItems.CATERPILLAR_SPAWN_EGG);
        entries.add(ModItems.BUTTERFLY_SPAWN_EGG);
        entries.add(ModItems.DRAGONFLY_SPAWN_EGG);
        entries.add(ModItems.FIREFLY_SWARM_SPAWN_EGG);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Prism.MOD_ID, name), item);
    }
}
