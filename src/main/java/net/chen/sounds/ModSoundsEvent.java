package net.chen.sounds;

import net.chen.LegacyWorld;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static net.minecraft.world.event.GameEvent.BLOCK_PLACE;

public class ModSoundsEvent {
    public static final SoundEvent PLAYER_RUN_ON_DIRTY_STONE = register("player_run_on_dirty_stone");
    private static final SoundEvent BLOCK_BREAK = register("block_break");
    private static final SoundEvent BLOCK_STEP = register("block_step");
    private static final SoundEvent BLOCK_HIT = register("block_hit");
    private static final SoundEvent BLOCK_FALL = register("block_fall");
    public static final SoundEvent BLOCK_PLACE = register("block_place");
    private static SoundEvent register(String name) {
        Identifier id = Identifier.of(LegacyWorld.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerModSoundEvents() {

    }

    public static final BlockSoundGroup BLOCK_SOUND_GROUP = new BlockSoundGroup(1.0F, 1.0F, BLOCK_BREAK, BLOCK_STEP, BLOCK_PLACE, BLOCK_HIT, BLOCK_FALL);
}
