package net.solarelixir.solaris.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.solarelixir.solaris.block.ModBlocks;
import net.solarelixir.solaris.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
        System.out.println("Starting Mod Recipe Provider");

    }

    @Override
    public void generate(RecipeExporter exporter) {
        //Jade items, blocks and weapons

        List<ItemConvertible> REFINED_JADE_BLASTING = List.of(ModItems.IMPURE_JADE_CHUNK);
         offerBlasting(exporter, REFINED_JADE_BLASTING, RecipeCategory.MISC, ModItems.REFINED_JADE, 0.25f, 200, "jade_refining");

         offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PERFECT_JADE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADE_BLOCK);
         ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_DAGGER)
                         .pattern("G")
                         .pattern("J")
                         .pattern("J")
                         .input('G', Items.GOLD_INGOT)
                         .input('J', ModItems.PERFECT_JADE)
                         .criterion(hasItem(ModItems.PERFECT_JADE), conditionsFromItem(ModItems.JADE_DAGGER))
                         .offerTo(exporter);

         ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_SHIELD)
                .pattern("GJG")
                .pattern("GJG")
                .pattern(" G ")
                .input('G', Items.GOLD_INGOT)
                .input('J', ModItems.PERFECT_JADE)
                 .criterion(hasItem(ModItems.PERFECT_JADE), conditionsFromItem(ModItems.JADE_SHIELD))
                .offerTo(exporter); //If there are  multiple ways to craft an item, use a comma and then name it (like: (exporter, refined_jade_from_smelting)).

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_SWORD)
                .pattern("J")
                .pattern("J")
                .pattern("G")
                .input('G', Items.GOLD_INGOT)
                .input('J', ModItems.PERFECT_JADE)
                .criterion(hasItem(ModItems.PERFECT_JADE), conditionsFromItem(ModItems.JADE_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.JADE_CLAYMORE)
                .pattern("  J")
                .pattern(" J ")
                .pattern("GJ ")
                .input('G', Items.GOLD_INGOT)
                .input('J', ModItems.PERFECT_JADE)
                .criterion(hasItem(ModItems.PERFECT_JADE), conditionsFromItem(ModItems.JADE_CLAYMORE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.JADE_CHISEL)
                .pattern(" J")
                .pattern("G ")
                .input('G', Items.GOLD_INGOT)
                .input('J', ModItems.PERFECT_JADE)
                .criterion(hasItem(ModItems.PERFECT_JADE), conditionsFromItem(ModItems.JADE_CHISEL))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.PERFECT_JADE, ModItems.REFINED_JADE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.JADE_TOKEN, ModItems.PERFECT_JADE, 4);

        //Ruby items, blocks and weapons

        //Aquamarine items, blocks and weapons

        //Onyx items, blocks and weapons
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_DAGGER)
                        .pattern("S")
                        .pattern("O")
                        .pattern("O")
                        .input('S', Items.STICK)
                        .input('O', ModItems.FLAWLESS_ONYX)
                        .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_DAGGER))
                        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_SCYTHE)
                .pattern(" OO")
                .pattern(" SO")
                .pattern("S O")
                .input('O', ModItems.FLAWLESS_ONYX)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_KATANA)
                .pattern("SOO")
                .input('S', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ONYX_LONGSWORD)
                .pattern("  O")
                .pattern(" O ")
                .pattern("S  ")
                .input('S', Items.STICK)
                .input('O', ModItems.FLAWLESS_ONYX)
                .criterion(hasItem(ModItems.FLAWLESS_ONYX), conditionsFromItem(ModItems.ONYX_LONGSWORD))
                .offerTo(exporter);



        List<ItemConvertible> REFINED_ONYX_BLASTING = List.of(ModItems.IMPURE_ONYX_CHUNK);
            offerBlasting(exporter, REFINED_ONYX_BLASTING, RecipeCategory.MISC, ModItems.REFINED_ONYX, 0.25f, 200, "onyx_refining");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.FLAWLESS_ONYX, ModItems.REFINED_ONYX);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModItems.ONYX_TOKEN, ModItems.FLAWLESS_ONYX, 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.FLAWLESS_ONYX, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ONYX_BLOCK);

        //Steel items, blocks and weapons
        List<ItemConvertible> STEEL_SMELTING = List.of(Items.IRON_INGOT);
        offerSmelting(exporter, STEEL_SMELTING, RecipeCategory.MISC, ModItems.STEEL, 0.25f, 200, "steel");
        List<ItemConvertible> STEEL_BLASTING = List.of(Items.IRON_INGOT);
        offerBlasting(exporter, STEEL_BLASTING, RecipeCategory.MISC, ModItems.STEEL, 0.25f, 100, "steel");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("-")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL),conditionsFromItem(ModItems.STEEL_SWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_DAGGER)
                .pattern("-")
                .pattern("S")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_DAGGER))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_KATANA)
                .pattern("-SS")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL),conditionsFromItem(ModItems.STEEL_KATANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_LONGSWORD)
                .pattern("  S")
                .pattern(" S ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL),conditionsFromItem(ModItems.STEEL_LONGSWORD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_HALBERD)
                .pattern(" SS")
                .pattern("S- ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_HALBERD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_SCYTHE)
                .pattern("SSS")
                .pattern(" - ")
                .pattern("-  ")
                .input('-', Items.STICK)
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_SCYTHE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SHIELD)
                .pattern("SS")
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_SHIELD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_HELMET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_CHESTPLATE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_LEGGINGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS)
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.STEEL)
                .criterion(hasItem(ModItems.STEEL), conditionsFromItem(ModItems.STEEL_BOOTS))
                .offerTo(exporter);
    }
}
