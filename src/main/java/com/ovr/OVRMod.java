package com.ovr;

import com.ovr.block.BlockInit;
import com.ovr.itemgroups.ItemGroupInit;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OVRMod implements ModInitializer {
	public static final String MOD_ID = "ovrmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ItemGroupInit.registerGroups();
		BlockInit.registerBlocks();
	}
}