package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.solarelixir.solaris.item.ModItems;
import net.solarelixir.solaris.item.custom.OnyxKatana;
import net.solarelixir.solaris.util.ModTags;

import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        System.out.println("Generating Mod Item tag provider");

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.STEEL_BOOTS)

                .add(ModItems.JADE_HELMET)
                .add(ModItems.JADE_CHESTPLATE)
                .add(ModItems.JADE_LEGGINGS)
                .add(ModItems.JADE_BOOTS)
        ;

        getOrCreateTagBuilder(ModTags.Items.IS_JADE_ITEM)
                .add(ModItems.JADE_DAGGER)
                .add(ModItems.JADE_SWORD)
                .add(ModItems.JADE_KATANA)
                .add(ModItems.JADE_GREATSWORD)
                .add(ModItems.JADE_HALBERD)
                .add(ModItems.JADE_SCYTHE)
                .add(ModItems.ENERGIZED_JADE_SWORD)
        ;

        getOrCreateTagBuilder(ModTags.Items.SOUL_CARRYING_WEAPONS)
                .add(ModItems.ONYX_DAGGER)
                //.add(ModItems.ONYX_SWORD)
                .add(ModItems.ONYX_KATANA)
                .add(ModItems.ONYX_LONGSWORD)
                //.add(ModItems.ONYX_HALBERD)
                .add(ModItems.ONYX_SCYTHE)
        ;

    }
}
