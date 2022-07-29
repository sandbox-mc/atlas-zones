package io.sandbox.atlas_zones.items;

import io.sandbox.atlas_zones.Main;
import io.sandbox.atlas_zones.blocks.AtlasDeviceBlock;
import io.sandbox.atlas_zones.blocks.BlockLoader;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ItemLoader {
  public static BlockItem ATLAS_DEVICE_BOCK_ITEM = new BlockItem(BlockLoader.ATLAS_DEVICE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC));
  public static ZoneOut ZONE_OUT = new ZoneOut(
    new Item.Settings().group(ItemGroup.MISC).maxCount(1)
  );
  
  public static void init() {
    Registry.register(Registry.ITEM, Main.id(AtlasDeviceBlock.name), ATLAS_DEVICE_BOCK_ITEM);
    Registry.register(Registry.ITEM, Main.id(ZoneOut.name), ZONE_OUT);
  }
}
