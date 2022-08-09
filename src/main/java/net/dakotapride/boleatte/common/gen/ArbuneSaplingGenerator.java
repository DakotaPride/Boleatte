package net.dakotapride.boleatte.common.gen;

import net.dakotapride.boleatte.common.init.FeaturesInit;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class ArbuneSaplingGenerator extends SaplingGenerator {
    public ArbuneSaplingGenerator() {
    }

    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return FeaturesInit.ARBUNE;
    }
}
