package net.dakotapride.boleatte.common.gen;

import net.dakotapride.boleatte.common.init.FeaturesInit;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class ProtostermSaplingGenerator extends SaplingGenerator {
    private final float tallChance;

    public ProtostermSaplingGenerator(float tallChance) {
        this.tallChance = tallChance;
    }


    @Nullable
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        if (random.nextFloat() < this.tallChance) {
            return FeaturesInit.TALL_PROTOSTERM_TREE;
        }
        return FeaturesInit.PROTOSTERM_TREE;
    }
}
