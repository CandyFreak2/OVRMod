package com.ovr.itemgroups;

import com.ovr.OVRMod;
import com.ovr.block.BlockInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroupInit {
    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OVRMod.MOD_ID, "ovr"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ovr"))
                    .icon(() -> Items.ACACIA_STAIRS.getDefaultStack()).entries((displayContext, entries) -> {
                        entries.add(BlockInit.OVR_BLOCK);
            }).build());

    public static void registerGroups() {
        OVRMod.LOGGER.info("Item Group Registered");
    }
}
