package net.dakotapride.boleatte.common.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

import static net.dakotapride.boleatte.common.BoleatteMain.ID;

public class TagInit {

    public static final TagKey<Biome> IS_PROTOSTERM_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_protosterm_forest"));
    public static final TagKey<Biome> IS_DENTICIUS_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_denticius_forest"));
    public static final TagKey<Biome> IS_QUANTILA_BARRENS = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_quantila_barrens"));
    public static final TagKey<Biome> IS_BOTAKOA_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_botakoa_forest"));
    public static final TagKey<Biome> IS_ARBUNE_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_arbune_forest"));
    public static final TagKey<Biome> IS_RASIORE_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_rasiore_forest"));
    public static final TagKey<Biome> IS_BABURBEN_WASTES = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_baburben_wastes"));
    public static final TagKey<Biome> IS_ETTERAVE_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_etterave_forest"));
    public static final TagKey<Biome> IS_ARBUNE_PLAINS = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_arbune_plains"));
    public static final TagKey<Biome> IS_SANTIFICT_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_santifict_forest"));
    public static final TagKey<Biome> IS_BOLEATTE_DIM = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_boleatte"));

    public static final TagKey<Item> SAFE_BOLEATTE = TagKey.of(Registry.ITEM_KEY, new Identifier(ID, "safe_boleatte"));
    public static final TagKey<Item> IS_DIMATIS = TagKey.of(Registry.ITEM_KEY, new Identifier(ID, "is_dimatis"));
    public static final TagKey<Item> IS_EIDOLON = TagKey.of(Registry.ITEM_KEY, new Identifier(ID, "is_eidolon"));

    public static final TagKey<Block> MOSSY_REMENTIO = TagKey.of(Registry.BLOCK_KEY, new Identifier(ID, "rementio_moss_blocks"));
    public static final TagKey<Block> REMENTIO_REPLACEABLES = TagKey.of(Registry.BLOCK_KEY, new Identifier(ID, "rementio_replaceables"));

}
