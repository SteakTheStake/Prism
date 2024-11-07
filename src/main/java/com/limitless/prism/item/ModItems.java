package com.limitless.prism.item;

import com.limitless.prism.Prism;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
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
