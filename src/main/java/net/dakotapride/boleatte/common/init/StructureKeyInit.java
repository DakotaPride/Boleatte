package net.dakotapride.boleatte.common.init;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.structure.Structure;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class StructureKeyInit {
    public static final RegistryKey<Structure> OVERGROWN_RAGE = of("dungeon_botakoa");
    public static final RegistryKey<Structure> PUTRESCENT_BEGINNINGS = of("dungeon_rasiore");
    public static final RegistryKey<Structure> HARVESTIVAL = of("dungeon_arbune");
    public static final RegistryKey<Structure> MYSTICAL_CARVER = of("dungeon_protosterm");
    public static final RegistryKey<Structure> BARREN_LANDS = of("dungeon_quantila");
    public static final RegistryKey<Structure> FRIGID_PUNISHMENT = of("dungeon_baburben");

    private static RegistryKey<Structure> of(String name) {
        return RegistryKey.of(Registry.STRUCTURE_KEY, new Identifier(ID, name));
    }
}
