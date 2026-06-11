package com.chromexunderscore.originstweaks;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "OriginsTweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(
				"For OriginsTweaks to work properly, enable flying in the server.properties and set \"mixin.entity.collisions.suffocation=false\" in lithium.properties when using lithium.");
	}
}