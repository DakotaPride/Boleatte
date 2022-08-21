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
    public static final TagKey<Biome> IS_QUANTILA_BARRENS = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_quantila_barrens"));
    public static final TagKey<Biome> IS_BOTAKOA_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_botakoa_forest"));
    public static final TagKey<Biome> IS_ARBUNE_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_arbune_forest"));
    public static final TagKey<Biome> IS_RASIORE_FOREST = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_rasiore_forest"));
    public static final TagKey<Biome> IS_BABURBEN_WASTES = TagKey.of(Registry.BIOME_KEY, new Identifier(ID, "is_baburben_wastes"));

    public static final TagKey<Item> ACCEPTABLE_DIMATIS = TagKey.of(Registry.ITEM_KEY, new Identifier(ID, "acceptable_dimatis"));

    public static final TagKey<Block> IS_ACCESSOR = TagKey.of(Registry.BLOCK_KEY, new Identifier(ID, "is_accessor"));

}
