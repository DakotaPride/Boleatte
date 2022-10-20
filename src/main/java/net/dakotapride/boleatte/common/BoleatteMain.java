package net.dakotapride.boleatte.common;

import net.dakotapride.boleatte.common.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class BoleatteMain implements ModInitializer {
	public static String ID = "boleatte";

	@Override
	public void onInitialize() {
		ItemInit.init();
		BlockInit.init();
		FeaturesInit.init();
		EffectInit.init();
		StrippableInit.init();
		DimensionInit.init();

		// Rementio Variant Generation
		BiomeModifications.addFeature(BiomeSelectors.tag(TagInit.IS_BOLEATTE_DIM),
				GenerationStep.Feature.UNDERGROUND_ORES, FeaturesInit.ADENTISK_PLACED.getKey().get());
		BiomeModifications.addFeature(BiomeSelectors.tag(TagInit.IS_BOLEATTE_DIM),
				GenerationStep.Feature.UNDERGROUND_ORES, FeaturesInit.MELITEMF_PLACED.getKey().get());
	}
}
