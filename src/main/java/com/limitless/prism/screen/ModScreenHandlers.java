package com.limitless.prism.screen;

import com.limitless.prism.Prism;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<TelescopeScreenHandler> TELESCOPE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Prism.MOD_ID, "telescope_screen_handler"),
                    new ExtendedScreenHandlerType<>(TelescopeScreenHandler::new));


    public static void registerScreenHandler() {
        Prism.LOGGER.info("Registering Screen Handlers for " + Prism.MOD_ID);
    }
}