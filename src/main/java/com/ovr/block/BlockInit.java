package com.ovr.block;

import com.ovr.OVRMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockInit {
    public static final Block OVR_BLOCK = registerBlock("ovr_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OVRMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OVRMod.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        OVRMod.LOGGER.info("Blocks Registered");
    }
}
