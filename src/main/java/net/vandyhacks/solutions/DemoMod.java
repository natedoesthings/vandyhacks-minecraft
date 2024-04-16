package net.vandyhacks.solutions;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoMod implements ModInitializer {

	public static final String MOD_ID = "demomod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerItems();
		ModItemGroups.registerModItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}