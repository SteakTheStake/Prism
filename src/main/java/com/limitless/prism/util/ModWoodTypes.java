package com.limitless.prism.util;

import com.limitless.prism.Prism;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWoodTypes {
    public static final WoodType PALM = WoodTypeRegistry.register(new Identifier(Prism.MOD_ID, "palm"), BlockSetType.OAK);
}