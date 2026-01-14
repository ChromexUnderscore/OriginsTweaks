package com.chromexunderscore.originstweaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "OriginsTweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		/*FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container -> {
			ResourceManagerHelper.registerBuiltinResourcePack(
					Identifier.of("respackid"),
					container, Text.translatable("resourcepack.originstweaks.packname.name"),
					ResourcePackActivationType.NORMAL);
		});*/
		LOGGER.info(
				"For the best OriginsTweaks experience, enable flying in the server.properties and set \"mixin.entity.collisions.suffocation=false\" in lithium.properties when using lithium.");
	}
}