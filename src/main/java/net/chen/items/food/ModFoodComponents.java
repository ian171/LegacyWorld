package net.chen.items.food;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHICKEN = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent HONEY_BERRY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15F).snack().build();

}
