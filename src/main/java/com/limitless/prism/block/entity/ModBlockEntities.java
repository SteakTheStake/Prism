package com.limitless.prism.block.entity;

import com.limitless.prism.Prism;
import com.limitless.prism.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {



    public static void registerBlockEntities() {
        Prism.LOGGER.info("Registering Block Entities for " + Prism.MOD_ID);
    }
}