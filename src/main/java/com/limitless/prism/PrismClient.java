package com.limitless.prism;

import com.limitless.prism.block.ModBlocks;
import com.limitless.prism.entity.ModEntities;
import com.limitless.prism.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;

public class PrismClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Block render layers
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_PALM_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THIN_STRIPPED_PALM_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GARDEN_CROTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TALL_GARDEN_CROTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GARDEN_CROTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.FIREFLY_BOTTLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.COLUMBINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.ROTTEN_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.IVY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.UNDERGROWTH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_WHITE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_LILAC, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_PINK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_PURPLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(com.limitless.prism.block.ModBlocks.CALLALILY_YELLOW, RenderLayer.getCutout());

        // Color providers
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor(),
                ModBlocks.GRASS_TERRAIN,
                ModBlocks.GARDEN_CROTON,
                ModBlocks.TALL_GARDEN_CROTON
        );

        // Entity renderers
        EntityRendererRegistry.register(ModEntities.BUTTERFLY, ButterflyRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BUTTERFLY, Butterfly::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CATERPILLAR, CaterpillarRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CATERPILLAR, Caterpillar::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.DRAGONFLY, DragonflyRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DRAGONFLY, DragonFly::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.FIRE_FLY_SWARM, FireflyRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.FIRE_FLY_SWARM, Fireflies::getTexturedModelData);
    }
}