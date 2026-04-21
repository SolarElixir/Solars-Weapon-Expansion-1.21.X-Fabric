package net.solarelixir.solaris;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.component.ModDataComponentTypes;
import net.solarelixir.solaris.component.SoulStoringCodec;
import net.solarelixir.solaris.item.ModItemGroups;
import net.solarelixir.solaris.item.ModItems;
import net.solarelixir.solaris.util.ModTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TelumSolaris implements ModInitializer {
	public static final String MOD_ID = "solaris";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
        ModDataComponentTypes.registerDataComponentTypes();

        ServerLivingEntityEvents.AFTER_DEATH.register((livingEntity, damageSource) -> {
            if (damageSource.getAttacker() instanceof PlayerEntity player) {
                ItemStack stack = player.getMainHandStack();
                if (stack.isIn(ModTags.Items.SOUL_CARRYING_WEAPONS)) {
                    SoulStoringCodec data = stack.get(ModDataComponentTypes.SOUL_INVENTORY_INFO);
                    SoulStoringCodec updated = (data == null)
                            ? new SoulStoringCodec(true, 1, 10000)
                            : data.addSoul();

                    stack.set(ModDataComponentTypes.SOUL_INVENTORY_INFO, updated);
                }
            }
        });
    }
}