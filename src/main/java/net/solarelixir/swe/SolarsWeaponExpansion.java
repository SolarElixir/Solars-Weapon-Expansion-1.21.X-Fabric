package net.solarelixir.swe;
import net.fabricmc.api.ModInitializer;
import net.solarelixir.swe.block.ModBlocks;
import net.solarelixir.swe.item.ModItemGroups;
import net.solarelixir.swe.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolarsWeaponExpansion implements ModInitializer {
	public static final String MOD_ID = "swe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}