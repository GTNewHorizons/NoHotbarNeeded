package net.xonich.mc.nohotbarneeded;

import net.xonich.mc.nohotbarneeded.handlers.KeyboardEventHandler;

import codechicken.nei.guihook.GuiContainerManager;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        GuiContainerManager.addInputHandler(KeyboardEventHandler.INSTANCE);
    }
}
