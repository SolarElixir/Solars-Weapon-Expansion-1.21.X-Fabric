package net.solarelixir.swe.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.solarelixir.swe.SolarsWeaponExpansion;
import net.solarelixir.swe.item.custom.*;


public class ModItems {
    //Jade items
        public static final Item IMPURE_JADE_CHUNK = registerItem("impure_jade_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_JADE = registerItem("refined_jade", new Item(new Item.Settings()));
        public static final Item PERFECT_JADE = registerItem("perfect_jade", new Item(new Item.Settings()));
        public static final Item JADE_CHISEL = registerItem("jade_chisel", new JadeChisel(new Item.Settings().maxCount(1).maxDamage(1024)));
        public static final Item JADE_TOKEN = registerItem("jade_token", new Item(new Item.Settings()));
    //Ruby Items

    //Aquamarine Items
        public static final Item IMPURE_AQUAMARINE_CHUNK = registerItem("impure_aquamarine_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_AQUAMARINE = registerItem("refined_aquamarine", new Item(new Item.Settings()));
        public static final Item FLAWLESS_AQUAMARINE = registerItem("flawless_aquamarine", new Item(new Item.Settings()));
    //Citrine Items
        public static final Item FLAWLESS_CITRINE = registerItem("flawless_citrine", new Item(new Item.Settings()));

    //Onyx Items
        public static final Item IMPURE_ONYX_CHUNK = registerItem("impure_onyx_chunk", new Item(new Item.Settings()));
        public static final Item REFINED_ONYX = registerItem("refined_onyx", new Item(new Item.Settings()));
        public static final Item FLAWLESS_ONYX = registerItem("flawless_onyx", new Item(new Item.Settings()));
        public static final Item ONYX_TOKEN = registerItem("onyx_token", new Item(new Item.Settings()));

    //Onyx Weapons
        public static final Item ONYX_DAGGER = registerItem("onyx_dagger", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, 1, -1.5F))));
        public static final Item ONYX_LONGSWORD = registerItem("onyx_longsword", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, 5, -3.0f))));
        public static final Item ONYX_SCYTHE = registerItem("onyx_scythe", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, 10, -3))));
        public static final Item ONYX_KATANA = registerItem("onyx_katana", new OnyxKatana(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, 6, -2.2f))));
    //Opal Items

    //Jade weapons
        public static final Item JADE_DAGGER = registerItem("jade_dagger", new JadeDagger(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, 1, -1.5f)),
            new CustomTooltips("jade_dagger")));
        public static final Item JADE_TALES = registerItem("jade_tales", new Item(new Item.Settings().maxCount(1)));
        public static final Item JADE_CLAYMORE = registerItem("jade_claymore", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, 7, -3.5f))));
        public static final Item JADE_SHIELD = registerItem("jade_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(2048)));
        public static final Item JADE_SWORD = registerItem("jade_sword", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, 3, -2.4f))));

    //Boss weapons
        public static final Item DUSTWORM_LONGBOW = registerItem("dustworm_longbow", new BowItem(new Item.Settings().maxDamage(500)));

    //Storm items
        public static final Item REINFORCED_BOTTLE = registerItem("reinforced_bottle", new Item(new Item.Settings().maxCount(64)));
        public static final Item THUNDER_BOTTLE = registerItem("thunder_bottle", new Item(new Item.Settings().maxCount(16)));

    //Storm Weapons
        public static final Item STORM_DAGGER = registerItem("storm_dagger", new TridentItem(new Item.Settings().maxDamage(500).maxCount(1)));

    //Spiritus items
        public static final Item SPIRITUS_CONDUIT = registerItem("spiritus_conduit", new Item(new Item.Settings()));

    //Hybrid Weapons
        public static final Item BLACKWIND_SPEAR = registerItem("blackwind_spear", new Blackwind(new Item.Settings()));
        public static final Item SILVER_ONI_MASK = registerItem("silver_oni_mask", new Item(new Item.Settings()));

    //Steel items
        public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));

    //Steel Weapons
        public static final Item STEEL_KATANA = registerItem("steel_katana", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 6, -2.2F))));

    //register
private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(SolarsWeaponExpansion.MOD_ID, name), item);
}

    public static void registerModItems () {
    SolarsWeaponExpansion.LOGGER.info("Registering Mod Items for " + SolarsWeaponExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //JADE
            entries.add(IMPURE_JADE_CHUNK);
            entries.add(REFINED_JADE);
            entries.add(PERFECT_JADE);
            entries.add(JADE_TOKEN);

            //RUBY

            //AQUAMARINE
            entries.add(IMPURE_AQUAMARINE_CHUNK);
            entries.add(REFINED_AQUAMARINE);
            entries.add(FLAWLESS_AQUAMARINE);

            //CITRINE
            entries.add(FLAWLESS_CITRINE);

            //ONYX
            entries.add(IMPURE_ONYX_CHUNK);
            entries.add(REFINED_ONYX);
            entries.add(FLAWLESS_ONYX);
            entries.add(ONYX_TOKEN);

            //OPAL

            entries.add(REINFORCED_BOTTLE);
            entries.add(THUNDER_BOTTLE);

            entries.add(SPIRITUS_CONDUIT);

            //STEEL
            entries.add(STEEL_INGOT);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            //JADE
            entries.add(JADE_DAGGER);
            entries.add(JADE_TALES);
            entries.add(JADE_SHIELD);
            entries.add(JADE_CLAYMORE);

            //CITRINE


            //ONYX
            entries.add(ONYX_DAGGER);

            entries.add(ONYX_LONGSWORD);
            entries.add(ONYX_SCYTHE);
            entries.add(ONYX_KATANA);

            //STEEL
            entries.add(STEEL_KATANA);

            entries.add(DUSTWORM_LONGBOW);

            entries.add(BLACKWIND_SPEAR);
            entries.add(SILVER_ONI_MASK);

            entries.add(STORM_DAGGER);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(JADE_CHISEL);
        });
    }
}
