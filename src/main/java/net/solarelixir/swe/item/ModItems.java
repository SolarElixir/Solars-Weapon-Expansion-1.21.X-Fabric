package net.solarelixir.swe.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.solarelixir.swe.SolarsWeaponExpansion;
import net.solarelixir.swe.item.custom.Jade_Chisel;

//Jade items
    public class ModItems {
    public static final Item IMPURE_JADE_CHUNK = registerItem("impure_jade_chunk", new Item(new Item.Settings()));
    public static final Item REFINED_JADE = registerItem("refined_jade", new Item(new Item.Settings()));
    public static final Item PERFECT_JADE = registerItem("perfect_jade", new Item(new Item.Settings()));
    public static final Item JADE_BLADE = registerItem("jade_blade", new Item(new Item.Settings()));
    public static final Item JADE_CHISEL = registerItem("jade_chisel", new Jade_Chisel(new Item.Settings().maxCount(1).maxDamage(1048)));
    public static final Item JADE_TOKEN = registerItem("jade_token", new Item(new Item.Settings()));

//Jade weapons
    public static final Item JADE_DAGGER = registerItem("jade_dagger", new TridentItem(new Item.Settings().maxCount(1)));
    public static final Item JADE_TALES = registerItem("jade_tales", new Item(new Item.Settings().maxCount(1)));
    public static final Item JADE_SHIELD = registerItem("jade_shield", new ShieldItem(new Item.Settings().maxCount(1)));
//Boss items
    public static final Item DUSTWORM_BOW = registerItem("dustworm_bow", new BowItem(new Item.Settings().maxDamage(500)));

//Storm items
    public static final Item REINFORCED_BOTTLE = registerItem("reinforced_bottle", new Item(new Item.Settings().maxCount(64)));
    public static final Item THUNDER_BOTTLE = registerItem("thunder_bottle", new Item(new Item.Settings().maxCount(16)));
//Storm Weapons
    public static final Item STORM_DAGGER = registerItem("storm_dagger", new TridentItem(new Item.Settings().maxDamage(500).maxCount(1)));

//register
private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(SolarsWeaponExpansion.MOD_ID, name), item);
}

    public static void registerModItems () {
    SolarsWeaponExpansion.LOGGER.info("Registering Mod Items for " + SolarsWeaponExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(IMPURE_JADE_CHUNK);
            entries.add(REFINED_JADE);
            entries.add(PERFECT_JADE);
            entries.add(JADE_CHISEL);
            entries.add(JADE_TOKEN);

            entries.add(JADE_BLADE);

            entries.add(JADE_DAGGER);
            entries.add(JADE_TALES);
            entries.add(JADE_SHIELD);

            entries.add(DUSTWORM_BOW);

            entries.add(REINFORCED_BOTTLE);
            entries.add(THUNDER_BOTTLE);
            entries.add(STORM_DAGGER);
        });

    }
}
