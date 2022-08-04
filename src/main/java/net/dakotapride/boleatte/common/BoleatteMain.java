package net.dakotapride.boleatte.common;

import net.dakotapride.boleatte.common.init.BlockInit;
import net.dakotapride.boleatte.common.init.FeaturesInit;
import net.dakotapride.boleatte.common.init.ItemInit;
import net.fabricmc.api.ModInitializer;

public class BoleatteMain implements ModInitializer {
	public static String ID = "boleatte";

	@Override
	public void onInitialize() {
		ItemInit.init();
		BlockInit.init();
		FeaturesInit.init();
	}
}
