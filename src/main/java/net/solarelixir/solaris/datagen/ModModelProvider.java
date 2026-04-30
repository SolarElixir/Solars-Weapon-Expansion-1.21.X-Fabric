package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.item.ModItems;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
        System.out.println("Starting Mod Model Provider");

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        System.out.println("Generating Block State Models");

        //Jade
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_BLOCK);

        //Ruby
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);

        //Aquamarine
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AQUAMARINE_ORE);

        //Topaz
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TOPAZ_ORE);

        //Onyx
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ONYX_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ONYX_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ONYX_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        System.out.println("Generating Item State Models");
        //Jade
        itemModelGenerator.register(ModItems.JADE_CHISEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JADE_KATANA, Models.HANDHELD);

        itemModelGenerator.register(ModItems.IMPURE_JADE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PERFECT_JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.JADE_TOKEN, Models.GENERATED);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.JADE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.JADE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.JADE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.JADE_BOOTS);


        //Ruby

        //Aquamarine
        itemModelGenerator.register(ModItems.IMPURE_AQUAMARINE_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLAWLESS_AQUAMARINE, Models.GENERATED);
        //Citrine
        itemModelGenerator.register(ModItems.FLAWLESS_CITRINE, Models.GENERATED);

        //Onyx
        itemModelGenerator.register(ModItems.IMPURE_ONYX_CHUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_ONYX, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLAWLESS_ONYX, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONYX_TOKEN, Models.GENERATED);


        itemModelGenerator.register(ModItems.REINFORCED_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDER_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_KATANA, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_BOOTS);


        itemModelGenerator.register(ModItems.SPIRITUS_CONDUIT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SCARLETT, Models.GENERATED);

    }
}
