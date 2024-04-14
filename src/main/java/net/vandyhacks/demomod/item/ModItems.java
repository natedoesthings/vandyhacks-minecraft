package net.vandyhacks.demomod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vandyhacks.demomod.DemoMod;


public class ModItems {
    public static final Item VANDY = registerItem("vandy", new SwordItem(ToolMaterials.IRON,
            9996, 1.6f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DemoMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        DemoMod.LOGGER.info("Registering Mod Items");
    }
}
