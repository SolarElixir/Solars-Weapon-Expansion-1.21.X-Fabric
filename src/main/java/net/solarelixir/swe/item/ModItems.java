package net.solarelixir.swe.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.solarelixir.swe.SolarsWeaponExpansion;


public class ModItems {
public static final Item IMPURE_JADE_CHUNK = registerItem("impure_jade_chunk", new Item(new Item.Settings()));
public static final Item REFINED_JADE = registerItem("refined_jade", new Item(new Item.Settings()));
public static final Item PERFECT_JADE = registerItem("perfect_jade", new Item(new Item.Settings()));
public static final Item GOLDEN_HANDLE = registerItem("golden_handle", new Item(new Item.Settings()));
public static final Item GOLDEN_HILT = registerItem("golden_hilt", new Item(new Item.Settings()));
public static final Item GOLDEN_POLE = registerItem("golden_pole", new Item(new Item.Settings()));
public static final Item JADE_BLADE = registerItem("jade_blade", new Item(new Item.Settings()));
public static final Item JADE_SLAB = registerItem("jade_slab", new Item(new Item.Settings()));

private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(SolarsWeaponExpansion.MOD_ID, name), item);
}

    public static void registerModItems () {
    SolarsWeaponExpansion.LOGGER.info("Registering Mod Items for " + SolarsWeaponExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(IMPURE_JADE_CHUNK);
            entries.add(REFINED_JADE);
            entries.add(PERFECT_JADE);
            entries.add(GOLDEN_HANDLE);
            entries.add(GOLDEN_HILT);
            entries.add(GOLDEN_POLE);
            entries.add(JADE_BLADE);
            entries.add(JADE_SLAB);

        });

    }
}
