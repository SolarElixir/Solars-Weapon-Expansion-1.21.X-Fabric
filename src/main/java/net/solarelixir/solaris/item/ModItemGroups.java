package net.solarelixir.solaris.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.block.ModBlocks;

public class ModItemGroups {
public static final ItemGroup TELUM_SOLARIS = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(TelumSolaris.MOD_ID, "telum_solaris"),
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.JADE_TOKEN))
                .displayName(Text.translatable("itemgroup.solaris.telum_solaris"))
                .entries((displayContext, entries) -> {

                    //Important blocks
                    //entries.add(ModBlocks.GEMSTONE_INFUSER);

                    //Jade items and blocks
                    entries.add(ModBlocks.JADE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                    entries.add(ModBlocks.JADE_BLOCK);

                    entries.add(ModItems.IMPURE_JADE_CHUNK);
                    entries.add(ModItems.REFINED_JADE);
                    entries.add(ModItems.PERFECT_JADE);
                    entries.add(ModItems.JADE_TOKEN);

                    //Jade tools
                    entries.add(ModItems.JADE_CHISEL);

                    //Jade weapons
                    entries.add(ModItems.JADE_TALES);
                    entries.add(ModItems.JADE_DAGGER);
                    entries.add(ModItems.JADE_SWORD);
                    //entries.add(ModItems.JADE_LONGSWORD);
                    entries.add(ModItems.JADE_CLAYMORE);
                    entries.add(ModItems.JADE_SHIELD);



                    //Ruby items/blocks
                    entries.add(ModBlocks.RUBY_ORE);
                    entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);

                    //Aquamarine items/blocks
                    entries.add(ModBlocks.AQUAMARINE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE);
                    entries.add(ModItems.IMPURE_AQUAMARINE_CHUNK);
                    entries.add(ModItems.REFINED_AQUAMARINE);
                    entries.add(ModItems.FLAWLESS_AQUAMARINE);

                    //Citrine items/blocks
                    entries.add(ModBlocks.TOPAZ_ORE);
                    entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                    entries.add(ModItems.FLAWLESS_CITRINE);


                    //Onyx items/blocks
                    entries.add(ModBlocks.ONYX_ORE);
                    entries.add(ModBlocks.DEEPSLATE_ONYX_ORE);
                    entries.add(ModBlocks.ONYX_BLOCK);

                    entries.add(ModItems.IMPURE_ONYX_CHUNK);
                    entries.add(ModItems.REFINED_ONYX);
                    entries.add(ModItems.FLAWLESS_ONYX);
                    entries.add(ModItems.ONYX_TOKEN);

                    entries.add(ModItems.ONYX_DAGGER);
                    //entries.add(ModItems.ONYX_SWORD);
                    entries.add(ModItems.ONYX_LONGSWORD);
                    //entries.add(ModItems.ONYX_CLAYMORE);
                    entries.add(ModItems.ONYX_KATANA);
                    entries.add(ModItems.ONYX_SCYTHE);


                    //Boss weapons
                    entries.add(ModItems.DUSTWORM_LONGBOW);

                    //Storm items
                    entries.add(ModItems.REINFORCED_BOTTLE);
                    entries.add(ModItems.THUNDER_BOTTLE);

                    //Storm weapons
                    entries.add(ModItems.STORM_DAGGER);

                    //Spiritus items
                    entries.add(ModItems.SPIRITUS_CONDUIT);

                    //Hybrid weapons
                    entries.add(ModItems.BLACKWIND_SPEAR);
                    entries.add(ModItems.SILVER_ONI_MASK);

                    //Steel items
                    entries.add(ModItems.STEEL_HELMET);
                    entries.add(ModItems.STEEL_CHESTPLATE);
                    entries.add(ModItems.STEEL_LEGGINGS);
                    entries.add(ModItems.STEEL_BOOTS);
                    entries.add(ModItems.STEEL);
                    entries.add(ModBlocks.STEEL_BLOCK);
                    entries.add(ModItems.STEEL_SWORD);
                    entries.add(ModItems.STEEL_DAGGER);
                    entries.add(ModItems.STEEL_KATANA);
                    entries.add(ModItems.STEEL_LONGSWORD);
                    entries.add(ModItems.STEEL_HALBERD);
                    entries.add(ModItems.STEEL_SCYTHE);
                    entries.add(ModItems.STEEL_SHIELD);

                    entries.add(ModItems.AMETHYST_HALBERD);

                    entries.add(ModItems.SCARLETT);
                    entries.add(ModItems.SCARLETT_HAZE);

                })
                .build());


    public static void registerItemGroups() {
        TelumSolaris.LOGGER.info("registering Item Groups for " + TelumSolaris.MOD_ID);}
}
