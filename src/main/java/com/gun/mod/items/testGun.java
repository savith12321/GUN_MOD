package com.gun.mod.items;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class testGun extends BowItem {
    public testGun() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
