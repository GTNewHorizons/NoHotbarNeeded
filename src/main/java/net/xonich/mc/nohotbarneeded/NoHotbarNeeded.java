package net.xonich.mc.nohotbarneeded;

import net.xonich.mc.nohotbarneeded.network.NetworkMessageService;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = NoHotbarNeeded.MODID,
    version = Tags.VERSION,
    name = "NoHotbarNeeded",
    dependencies = "required-after:NotEnoughItems@[2.8.93,);",
    acceptedMinecraftVersions = "[1.7.10]")
public class NoHotbarNeeded {

    public static final String MODID = "nohotbarneeded";
    public static NetworkMessageService NETWORK;

    @SidedProxy(
        clientSide = "net.xonich.mc.nohotbarneeded.ClientProxy",
        serverSide = "net.xonich.mc.nohotbarneeded.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        NETWORK = new NetworkMessageService(MODID);
        proxy.init(event);
    }
}
