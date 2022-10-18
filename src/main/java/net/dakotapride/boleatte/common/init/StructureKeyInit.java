package net.dakotapride.boleatte.common.init;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.structure.Structure;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class StructureKeyInit {
    public static final RegistryKey<Structure> OVERGROWN_RAGE = of("beusere_dungeon");
    public static final RegistryKey<Structure> PUTRESCENT_BEGINNINGS = of("gela_dungeon");
    public static final RegistryKey<Structure> HARVESTING = of("veret_dungeon");
    public static final RegistryKey<Structure> MYSTICAL_CARVINGS = of("oritem_dungeon");
    public static final RegistryKey<Structure> BARREN_LANDS = of("sterres_dungeon");
    public static final RegistryKey<Structure> FRIGID_PUNISHMENT = of("laide_dungeon");

    private static RegistryKey<Structure> of(String name) {
        return RegistryKey.of(Registry.STRUCTURE_KEY, new Identifier(ID, name));
    }
}
