package com.skytner.pulsar.registry;

import com.skytner.pulsar.Pulsar;
import com.skytner.pulsar.entity.ExampleEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, Pulsar.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<ExampleEntity>> EXAMPLE_ENTITY =
        ENTITY_TYPES.register("example_entity", () ->
            EntityType.Builder.<ExampleEntity>of(ExampleEntity::new, MobCategory.CREATURE)
                .sized(0.9f, 1.3f)
                .build("example_entity")
        );
}
