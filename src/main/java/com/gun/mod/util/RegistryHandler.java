package com.gun.mod.util;

import com.gun.mod.GunMod;
import com.gun.mod.items.testGun;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GunMod.MOD_ID);
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //ITEMS
    public static final RegistryObject<Item> TEST_GUN = ITEMS.register("testgun", testGun::new);
}
