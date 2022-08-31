package net.dakotapride.boleatte.common.init;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.structure.Structure;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class StructureKeyInit {
    public static final RegistryKey<Structure> BEUSERE_DUNGEON = of("beusere_dungeon");
    public static final RegistryKey<Structure> GELA_DUNGEON = of("gela_dungeon");
    public static final RegistryKey<Structure> VERET_DUNGEON = of("veret_dungeon");
    public static final RegistryKey<Structure> ORITEM_DUNGEON = of("oritem_dungeon");
    public static final RegistryKey<Structure> STERRES_DUNGEON = of("sterres_dungeon");
    public static final RegistryKey<Structure> LAIDE_DUNGEON = of("laide_dungeon");

    private static RegistryKey<Structure> of(String name) {
        return RegistryKey.of(Registry.STRUCTURE_KEY, new Identifier(ID, name));
    }
}
