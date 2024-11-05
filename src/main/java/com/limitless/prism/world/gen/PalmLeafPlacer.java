package com.limitless.prism.world.gen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.function.BiConsumer;

public class PalmLeafPlacer extends FoliagePlacer {
    public static final Codec<PalmLeafPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillFoliagePlacerFields(instance).apply(instance, PalmLeafPlacer::new));

    public PalmLeafPlacer(IntProvider radius, IntProvider offset) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.PALM_LEAF_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {

    }

    protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer,
                            Random random, TreeFeatureConfig config, int trunkHeight,
                            TreeNode treeNode, int foliageHeight, int radius, int offset) {
        BlockPos center = treeNode.getCenter();

        // Place center leaf block
        replacer.accept(center, config.foliageProvider.get(random, center));

        // Place the cross pattern
        replacer.accept(center.north(), config.foliageProvider.get(random, center.north()));
        replacer.accept(center.south(), config.foliageProvider.get(random, center.south()));
        replacer.accept(center.east(), config.foliageProvider.get(random, center.east()));
        replacer.accept(center.west(), config.foliageProvider.get(random, center.west()));

        // Place diagonal leaves
        replacer.accept(center.north().east(), config.foliageProvider.get(random, center.north().east()));
        replacer.accept(center.north().west(), config.foliageProvider.get(random, center.north().west()));
        replacer.accept(center.south().east(), config.foliageProvider.get(random, center.south().east()));
        replacer.accept(center.south().west(), config.foliageProvider.get(random, center.south().west()));
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return 1;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}