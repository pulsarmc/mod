package com.skytner.pulsar;

import com.mojang.logging.LogUtils;
import com.skytner.pulsar.registry.ModBlocks;
import com.skytner.pulsar.registry.ModCreativeTabs;
import com.skytner.pulsar.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(Pulsar.MODID)

public class Pulsar {

    public static final String MODID = "pulsar";

    public static final Logger LOGGER = LogUtils.getLogger();

    public Pulsar(IEventBus modEventBus, ModContainer modContainer) {

        ModBlocks.BLOCKS.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

    }

    @SubscribeEvent

    public void onServerStarting(ServerStartingEvent event) {

        LOGGER.info("Pulsar server starting!");

    }

}

