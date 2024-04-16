package net.vandyhacks.demomodsolutions;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vandyhacks.demomod.DemoMod;


public class ModItems {
    public static final Item VANDY = registerItem("vandy", new SwordItem(ToolMaterials.IRON,
            9996, 1.6f, new FabricItemSettings()));

    public static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        entries.add(VANDY);
    }


    public static final Item RANDWHICH = registerItem("randwhich", new Item(new FabricItemSettings().food(ModFoodComponents.RANDWHICH)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DemoMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        DemoMod.LOGGER.info("Registering Mod Items");














        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToItemGroup);
    }
}
