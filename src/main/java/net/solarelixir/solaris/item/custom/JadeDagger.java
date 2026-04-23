package net.solarelixir.solaris.item.custom;

import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;

import java.util.List;

public class JadeDagger extends  SwordItem{
    private final CustomTooltips tooltipHelper;
    public JadeDagger(ToolMaterial toolMaterial, Item.Settings settings, CustomTooltips tooltipHelper) {
        super(toolMaterial, settings);
        this.tooltipHelper = tooltipHelper;

    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type){
        tooltipHelper.appendTooltip(stack, tooltip);
        super.appendTooltip(stack, context, tooltip, type);
    }

    @Override
    public boolean canBeEnchantedWith(ItemStack stack, RegistryEntry<Enchantment> enchantment, EnchantingContext context) {
        if (enchantment.value().isAcceptableItem(stack)){
            return true;
        }
        return super.canBeEnchantedWith(stack, enchantment, context);
    }
}
