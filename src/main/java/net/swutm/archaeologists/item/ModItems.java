package net.swutm.archaeologists.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.archaeologists.archaeologists;
import net.swutm.archaeologists.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, archaeologists.MOD_ID);

    public static final RegistryObject<Item> FIRESHARD = ITEMS.register("fireshard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS)));

    public static final RegistryObject<Item> PLANTSHARD = ITEMS.register("plantshard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS)));

    public static final RegistryObject<Item> SPLASHSHARD = ITEMS.register("splashshard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS)));

    public static final RegistryObject<Item> DETECTORSHARD = ITEMS.register("detectorshard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS)));

    public static final RegistryObject<Item> RANDOMRESOURSESHARD = ITEMS.register("radomresourceshard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS)));

    public static final RegistryObject<Item> LARGEBRUSH = ITEMS.register("largebrush",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS).stacksTo(1)));

    public static final RegistryObject<Item> MEDIUMBRUSH = ITEMS.register("mediumbrush",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS).stacksTo(1)));

    public static final RegistryObject<Item> MINIBRUSH = ITEMS.register("minibrush",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS).stacksTo(1)));

    public static final RegistryObject<Item> PARTOFNOTE = ITEMS.register("partofnote",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS)));

    public static final RegistryObject<Item> METALDETECTOR = ITEMS.register("metaldetector",
            () -> new MetalDetectorItem(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS).stacksTo(1)));

    public static final RegistryObject<Item> NOTE = ITEMS.register("note",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARCHAEOLOGISTS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
