package com.skytner.pulsar.registry;

import com.skytner.pulsar.Pulsar;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
        DeferredRegister.createBlocks(Pulsar.MODID);

    public static final DeferredBlock<Block> BAUXITE_ORE =
        BLOCKS.registerSimpleBlock("bauxite_ore",
            BlockBehaviour.Properties.of()
                .strength(6.0f)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
}
