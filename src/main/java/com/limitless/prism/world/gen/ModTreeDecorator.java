package com.limitless.prism.world.gen;

import com.limitless.prism.Prism;
import com.limitless.prism.mixin.TreeDecoratorTypeMixin;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class ModTreeDecorator {

    public static final TreeDecoratorType<?> SHROOMS = TreeDecoratorTypeMixin.callRegister("shrooms",
            MushroomDecorator.CODEC);

    public static final TreeDecoratorType<?> IVY =
            TreeDecoratorTypeMixin.callRegister("ivy", IvyDecorator.CODEC);

    public static final TreeDecoratorType<?> BIRCH_BRANCH =
            TreeDecoratorTypeMixin.callRegister("birch_branch", BirchBranchDecorator.CODEC);

    public static final TreeDecoratorType<?> OAK_BRANCH =
            TreeDecoratorTypeMixin.callRegister("oak_branch", OakBranchDecorator.CODEC);

    public static void register() {
        Prism.LOGGER.info("Registering the Tree Decorator for " + Prism.MOD_ID);
    }

}
