package net.dakotapride.boleatte.common.init;

import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class TagInit {

    public static final TagKey<Biome> IS_PROTOSTERM_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_protosterm_forest"));
    public static final TagKey<Biome> IS_QUANTILA_BARRENS = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_quantila_barrens"));
    public static final TagKey<Biome> IS_BOTAKOA_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_botakoa_forest"));
    public static final TagKey<Biome> IS_ARBUNE_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_arbune_forest"));

}
