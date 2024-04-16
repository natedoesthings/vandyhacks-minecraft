package net.vandyhacks.solutions;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VANDY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DemoMod.MOD_ID, "vandy"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vandy"))
                    .icon(() -> new ItemStack(net.vandyhacks.demomod.item.ModItems.VANDY)).entries((displayContext, entries) -> {

                        //entries.add(ModItems.VANDY);
                        entries.add(ModBlocks.LUCKY_BLOCK);
                        entries.add(ModItems.RANDWICH);


                    }).build());

    public static void registerModItemGroups() {
        DemoMod.LOGGER.info("Registering Mod Item Groups");
    }
}
