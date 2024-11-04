package com.limitless.prism.world.gen;

import com.limitless.prism.block.ModBlocks;
import com.limitless.prism.block.custom.IvyBlock;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class IvyDecorator extends TreeDecorator {

    public static final Codec<IvyDecorator> CODEC = RecordCodecBuilder.create((instance) -> instance.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(p -> p.probability),
            Codec.intRange(0, 16).fieldOf("treeHeight").forGetter(p -> p.treeHeight))
            .apply(instance, IvyDecorator::new));

    private final float probability;
    private final int treeHeight;

    public IvyDecorator(float f, int treeHeight){
        this.probability = f;
        this.treeHeight = treeHeight;
    }

    protected TreeDecoratorType<?> getType() {return ModTreeDecorator.IVY;}

    @Override
    public void generate(Generator generator) {
        Random random = generator.getRandom();
        if (!(random.nextFloat() >= this.probability)) {
            generator.getLogPositions().forEach(pos -> {
                BlockPos blockPos;
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.west())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.EAST, true));
                }
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.east())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.WEST, true));
                }
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.north())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.SOUTH, true));
                }
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.south())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.NORTH, true));
                }
            });
        }
    }
}


