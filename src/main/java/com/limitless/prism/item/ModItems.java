package com.limitless.prism.item;

import com.limitless.prism.Prism;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PILE_OF_SAND = registerItem("pile_of_sand", new Item(new FabricItemSettings()));
    public static final Item PILE_OF_GRAVEL = registerItem("pile_of_gravel", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabGroup(FabricItemGroupEntries entries) {
        entries.add(PILE_OF_SAND);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Prism.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Prism.LOGGER.info("Registering Mod Items for " + Prism.MOD_ID + "...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabGroup);
    }
}
