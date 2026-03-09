package com.skytner.pulsar;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = Pulsar.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Pulsar.MODID, value = Dist.CLIENT)
public class PulsarClient {

    public PulsarClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        Pulsar.LOGGER.info("Pulsar client setup!");
    }
}