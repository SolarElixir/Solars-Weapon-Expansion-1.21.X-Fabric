package net.solarelixir.swe.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.solarelixir.swe.SolarsWeaponExpansion;

public class ModBlocks {
public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
        new Block(AbstractBlock.Settings.create().strength(4.5F, 3.0F)
                .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
public static final Block JADE_ORE = registerBlock("jade_ore",
        new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)));

private static Block registerBlock(String name, Block block){
    registerBlockItems(name, block);
    return Registry.register(Registries.BLOCK, Identifier.of(SolarsWeaponExpansion.MOD_ID, name), block);
}



public static void registerBlockItems(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(SolarsWeaponExpansion.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
}

    public static void registerModBlocks(){
        SolarsWeaponExpansion.LOGGER.info("Registering Mod Blocks for" + SolarsWeaponExpansion.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries-> {

            entries.add(DEEPSLATE_JADE_ORE);
            entries.add(JADE_ORE);


        });
    }
}
