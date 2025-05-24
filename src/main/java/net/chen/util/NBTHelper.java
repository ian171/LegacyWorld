package net.chen.util;

import com.mojang.serialization.Codec;
import net.chen.LegacyWorld;
import net.minecraft.component.ComponentType;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NBTHelper {
    public static ComponentType<Integer> ELEC = Registry.register(Registries.DATA_COMPONENT_TYPE,
            Identifier.of(LegacyWorld.MOD_ID,"electronic"),
            ComponentType.<Integer>builder().codec(Codec.INT).build());
    public static ComponentType<Integer> QUALITY = register(Registries.DATA_COMPONENT_TYPE,"quality");

    public static ComponentType<Integer> register(Registry registries,String path){
        return Registry.register((Registry<ComponentType<?>>)registries,
                Identifier.of(LegacyWorld.MOD_ID,path),
                ComponentType.<Integer>builder().codec(Codec.INT).build());
    }
    public static void init(){
        LegacyWorld.LOGGER.info("NBTHelper init");
    }
}
