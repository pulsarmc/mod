package com.skytner.pulsar.registry;

import com.skytner.pulsar.Pulsar;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES =
        DeferredRegister.create(Registries.BIOME, Pulsar.MODID);

    public static final ResourceKey<Biome> EXAMPLE_BIOME =
        ResourceKey.create(Registries.BIOME,
            ResourceLocation.fromNamespaceAndPath(Pulsar.MODID, "example_biome"));
}
