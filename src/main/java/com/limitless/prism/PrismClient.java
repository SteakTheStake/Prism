package com.limitless.prism;

import com.limitless.prism.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;

public class PrismClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Block render layers
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_SAPLING, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_PALM_LOG, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_STRIPPED_PALM_LOG, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARDEN_CROTON, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TALL_GARDEN_CROTON, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GARDEN_CROTON, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.COLUMBINE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.ROTTEN_LOG, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.IVY, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.UNDERGROWTH, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_WHITE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_LILAC, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_PINK, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_PURPLE, RenderLayer.getCutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_YELLOW, RenderLayer.getCutoutMipped());

        // Color providers
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor(),
                ModBlocks.GRASS_TERRAIN,
                ModBlocks.GARDEN_CROTON,
                ModBlocks.TALL_GARDEN_CROTON
        );

        // Entity renderers

    }
}