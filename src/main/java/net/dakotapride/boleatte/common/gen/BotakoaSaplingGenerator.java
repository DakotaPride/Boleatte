package net.dakotapride.boleatte.common.gen;

import net.dakotapride.boleatte.common.init.FeaturesInit;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class BotakoaSaplingGenerator extends SaplingGenerator {


    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return bees ? FeaturesInit.BOTAKOA_BEES_005 : FeaturesInit.BOTAKOA;
    }
}
