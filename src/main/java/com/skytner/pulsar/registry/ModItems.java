package com.skytner.pulsar.registry;

import com.skytner.pulsar.Pulsar;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
        DeferredRegister.createItems(Pulsar.MODID);

    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM =
        ITEMS.registerSimpleBlockItem(ModBlocks.EXAMPLE_BLOCK);

    public static final DeferredItem<Item> EXAMPLE_ITEM =
        ITEMS.registerSimpleItem("example_item");
}
