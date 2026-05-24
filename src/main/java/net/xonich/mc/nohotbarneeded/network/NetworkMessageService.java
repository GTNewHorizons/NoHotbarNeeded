package net.xonich.mc.nohotbarneeded.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

/**
 * Service which handles client-server messages.
 */
public class NetworkMessageService {

    private final SimpleNetworkWrapper channel;

    public NetworkMessageService(String channelName) {
        channel = NetworkRegistry.INSTANCE.newSimpleChannel(channelName);
        channel.registerMessage(ActivateItemHandler.class, ActivateItemRequest.class, 0, Side.SERVER);
    }

    public void sentActivateItemMessage(ActivateItemRequest msg) {
        channel.sendToServer(msg);
    }
}
