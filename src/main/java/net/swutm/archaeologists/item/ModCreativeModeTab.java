package net.swutm.archaeologists.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab ARCHAEOLOGISTS = new CreativeModeTab("archaeologists") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.MINIBRUSH.get());
        }
    };
}
