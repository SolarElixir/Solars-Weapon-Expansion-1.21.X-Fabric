package net.solarelixir.solaris.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class OnyxKatana extends SoulCarryingItems {
    public OnyxKatana(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }


    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);

        String itemName = Registries.ITEM.getId(stack.getItem()).getPath();
        new CustomTooltips(itemName).appendTooltip(stack, tooltip);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player){
            boolean isHeld = player.getMainHandStack() == stack;
            if (isHeld) {
                if (player.getHealth() <= player.getMaxHealth()/2){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1, 1, true, false));
                } else {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1, 0, true, false));
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
