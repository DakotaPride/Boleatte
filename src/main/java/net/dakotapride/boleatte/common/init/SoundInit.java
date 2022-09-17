package net.dakotapride.boleatte.common.init;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundInit {

    // The Owl House Easter Egg
    public static final SoundEvent HOOT_HOOT = register("ambient.boleatte.hoot_hoot");


    private static SoundEvent register(String id) {
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(new Identifier(id)));
    }

}
