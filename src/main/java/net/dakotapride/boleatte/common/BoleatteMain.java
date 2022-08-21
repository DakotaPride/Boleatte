package net.dakotapride.boleatte.common;

import net.dakotapride.boleatte.common.init.*;
import net.fabricmc.api.ModInitializer;

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
	}
}
