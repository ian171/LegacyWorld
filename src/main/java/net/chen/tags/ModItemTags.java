package net.chen.tags;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags{
    public static final TagKey<Item> RAW_ORES = ModItemTags.of("raw_ores");
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.ofVanilla(id));
    }
}
