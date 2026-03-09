package com.skytner.pulsar.registry;

import com.skytner.pulsar.Pulsar;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Pulsar.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PULSAR_TAB =
            CREATIVE_MODE_TABS.register("pulsar_tab", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.pulsar"))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> ModItems.BAUXITE_ORE_ITEM.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.BAUXITE_ORE_ITEM.get());
                            })
                            .build()
            );
}