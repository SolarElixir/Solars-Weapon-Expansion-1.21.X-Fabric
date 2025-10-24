package net.solarelixir.swe.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.solarelixir.swe.SolarsWeaponExpansion;
import net.solarelixir.swe.block.ModBlocks;

public class ModItemGroups {
public static final ItemGroup SOLARS_WEAPONS_MOD = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(SolarsWeaponExpansion.MOD_ID, "solars_weapons_mod"),
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.JADE_TOKEN))
                .displayName(Text.translatable("itemgroup.swe.solars_weapons_mod"))
                .entries((displayContext, entries) -> {
                    //Important blocks
                    entries.add(ModBlocks.GEMSTONE_INFUSER);

                    //Jade items and blocks
                    entries.add(ModBlocks.JADE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                    entries.add(ModBlocks.JADE_BLOCK);

                    entries.add(ModItems.PERFECT_JADE);
                    entries.add(ModItems.REFINED_JADE);
                    entries.add(ModItems.IMPURE_JADE_CHUNK);
                    entries.add(ModItems.JADE_CHISEL);
                    entries.add(ModItems.JADE_TOKEN);

                    //Jade weapons
                    entries.add(ModItems.JADE_TALES);
                    entries.add(ModItems.JADE_DAGGER);
                    entries.add(ModItems.JADE_SHIELD);
                    entries.add(ModItems.JADE_CLAYMORE);


                    //Boss weapons
                    entries.add(ModItems.DUSTWORM_BOW);


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
                    entries.add(ModItems.STEEL_INGOT);
                })
                .build());


    public static void registerItemGroups() {
        SolarsWeaponExpansion.LOGGER.info("registering Item Groups for" + SolarsWeaponExpansion.MOD_ID);}
}
