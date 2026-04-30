package net.solarelixir.solaris.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_GEMSTONE_TOOL = createTag("needs_gemstone_tool");
        public static final TagKey<Block> INCORRECT_FOR_GEMSTONE_TOOLS = createTag("incorrect_for_gemstone_tools");

        public static final TagKey<Block> NEEDS_STEEL_TOOL = BlockTags.NEEDS_IRON_TOOL;
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = BlockTags.INCORRECT_FOR_IRON_TOOL;

        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TelumSolaris.MOD_ID, name));
        }

    }
    public static class Items{

        public static final TagKey<Item> SOUL_CARRYING_WEAPONS = createTag("soul_carrying_weapons");
        public static final TagKey<Item> IS_JADE_ITEM = createTag("is_jade_item");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TelumSolaris.MOD_ID, name));
        }

    }
}
