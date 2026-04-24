package com.nemonotfound.nemos.progression;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosProgression implements ModInitializer {

	public static final String MOD_ID = "nemos_progression";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("I forgot how to craft tools, weapons and armor from copper onward.. I hope I'll find upgrade templates..");
	}
}