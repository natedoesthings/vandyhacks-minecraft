package net.vandyhacks.demomodsolutions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RANDWHICH = new FoodComponent.Builder().hunger(5).saturationModifier(0.2F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).build();

}