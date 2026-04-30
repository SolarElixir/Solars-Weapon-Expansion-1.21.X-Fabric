package net.solarelixir.solaris.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.item.custom.*;

public class ModItems {

    private static final float fastAttackSpeed = -2f;
    private static final float mediumAttackSpeed = -2.4f;
    private static final float slowAttackSpeed = -2.8f;
    private static final float verySlowAttackSpeed = -3.2f;

    private static final int daggerDamage = 2;
    private static final int swordDamage = 3;
    private static final int katanaDamage = 4;
    private static final int bigSwordDamage = 5;
    private static final int halberdDamage = 6;
    private static final int scytheDamage = 7;

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
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, daggerDamage, fastAttackSpeed))));
        public static final Item ONYX_LONGSWORD = registerItem("onyx_longsword", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, bigSwordDamage, slowAttackSpeed))));
        public static final Item ONYX_SCYTHE = registerItem("onyx_scythe", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, scytheDamage, verySlowAttackSpeed))));
        public static final Item ONYX_KATANA = registerItem("onyx_katana", new OnyxKatana(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, katanaDamage, mediumAttackSpeed))));
    //Opal Items

    //Jade weapons
        public static final Item JADE_DAGGER = registerItem("jade_dagger", new JadeDagger(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, daggerDamage, fastAttackSpeed)),
            new CustomTooltips("jade_dagger")));
        public static final Item JADE_GREATSWORD = registerItem("jade_greatsword", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, bigSwordDamage, verySlowAttackSpeed))));
        public static final Item JADE_SHIELD = registerItem("jade_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(2512)));
        public static final Item JADE_SWORD = registerItem("jade_sword", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, swordDamage, mediumAttackSpeed))));
        public static final Item JADE_KATANA = registerItem("jade_katana", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, katanaDamage, mediumAttackSpeed))));
        public static final Item JADE_HALBERD = registerItem("jade_halberd", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, halberdDamage, verySlowAttackSpeed))));
        public static final Item JADE_SCYTHE = registerItem("jade_scythe", new SwordItem(ModToolMaterials.JADE, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.JADE, scytheDamage, verySlowAttackSpeed))));


    public static final Item ENERGIZED_JADE_SWORD = registerItem("energized_jade_sword", new SwordItem(ModToolMaterials.ENERGIZED_JADE, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ENERGIZED_JADE, swordDamage, mediumAttackSpeed))));

        public static final Item JADE_HELMET = registerItem("jade_helmet", new ModArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42))));
        public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate", new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42))));
        public static final Item JADE_LEGGINGS = registerItem("jade_leggings", new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));
        public static final Item JADE_BOOTS = registerItem("jade_boots", new ArmorItem(ModArmorMaterials.JADE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42))));


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

        //BLACK WIND SPEAR REWORK, WEAPON+TEXTURE
        public static final Item BLACKWIND_SPEAR = registerItem("blackwind", new Blackwind(new Item.Settings().maxCount(1).maxDamage(1024)));
        public static final Item SILVER_ONI_MASK = registerItem("silver_oni_mask", new Item(new Item.Settings()));

    //Steel items
        public static final Item STEEL = registerItem("steel", new Item(new Item.Settings()));
        public static final Item STEEL_DAGGER = registerItem("steel_dagger", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, daggerDamage, fastAttackSpeed))));
        public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, swordDamage, mediumAttackSpeed))));
        public static final Item STEEL_KATANA = registerItem("steel_katana", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, katanaDamage, mediumAttackSpeed))));
        public static final Item STEEL_LONGSWORD = registerItem("steel_longsword", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, bigSwordDamage, slowAttackSpeed))));
        public static final Item STEEL_HALBERD = registerItem("steel_halberd", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, halberdDamage, verySlowAttackSpeed))));
        public static final Item STEEL_SCYTHE = registerItem("steel_scythe", new SwordItem(ModToolMaterials.STEEL, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, scytheDamage, verySlowAttackSpeed))));
        public static final Item STEEL_SHIELD = registerItem("steel_shield", new ShieldItem(new Item.Settings().maxCount(1).maxDamage(1024)));

        public static final Item STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(19))));
        public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(19))));
        public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(19))));
        public static final Item STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(19))));
        // ~

        public static final Item AMETHYST_HALBERD = registerItem("amethyst_halberd", new SwordItem(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, scytheDamage, verySlowAttackSpeed))));


        public static final Item SCARLETT = registerItem("scarlett", new Item(new Item.Settings()));
        public static final Item SCARLETT_HAZE = registerItem("scarlett_haze", new ScarlettHazeSword(ModToolMaterials.ONYX, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ONYX, swordDamage, mediumAttackSpeed))));


    //register
private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(TelumSolaris.MOD_ID, name), item);
}

    public static void registerModItems () {
    TelumSolaris.LOGGER.info("Registering Mod Items for " + TelumSolaris.MOD_ID);

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
            entries.add(STEEL);

            entries.add(SCARLETT);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            //JADE

            entries.add(JADE_HELMET);
            entries.add(JADE_CHESTPLATE);
            entries.add(JADE_LEGGINGS);
            entries.add(JADE_BOOTS);

            entries.add(JADE_DAGGER);
            entries.add(JADE_SWORD);
            entries.add(JADE_KATANA);
            entries.add(JADE_SHIELD);
            entries.add(JADE_GREATSWORD);
            entries.add(JADE_HALBERD);
            entries.add(JADE_SCYTHE);
            entries.add(ENERGIZED_JADE_SWORD);

            //CITRINE


            //ONYX
            entries.add(ONYX_DAGGER);
            entries.add(ONYX_KATANA);
            entries.add(ONYX_LONGSWORD);
            entries.add(ONYX_SCYTHE);

            //STEEL
            entries.add(STEEL_HELMET);
            entries.add(STEEL_CHESTPLATE);
            entries.add(STEEL_LEGGINGS);
            entries.add(STEEL_BOOTS);

            entries.add(STEEL_DAGGER);
            entries.add(STEEL_SWORD);
            entries.add(STEEL_KATANA);
            entries.add(STEEL_LONGSWORD);
            entries.add(STEEL_HALBERD);
            entries.add(STEEL_SCYTHE);
            entries.add(STEEL_SHIELD);

            entries.add(DUSTWORM_LONGBOW);

            entries.add(BLACKWIND_SPEAR);
            entries.add(SILVER_ONI_MASK);

            entries.add(STORM_DAGGER);


            entries.add(SCARLETT_HAZE);
            entries.add(AMETHYST_HALBERD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(JADE_CHISEL);

        });

    }
}
