package net.solarelixir.swe;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.solarelixir.swe.block.ModBlocks;
import net.solarelixir.swe.component.ModDataComponentTypes;
import net.solarelixir.swe.component.SoulStoringCodec;
import net.solarelixir.swe.item.ModItemGroups;
import net.solarelixir.swe.item.ModItems;
import net.solarelixir.swe.util.ModTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;


public class SolarsWeaponExpansion implements ModInitializer {
	public static final String MOD_ID = "swe";
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