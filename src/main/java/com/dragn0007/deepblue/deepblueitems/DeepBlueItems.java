package com.dragn0007.deepblue.deepblueitems;


import com.dragn0007.deepblue.DeepBlueMain;
import com.dragn0007.deepblue.deepblueevent.DeepBlueEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class DeepBlueItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DeepBlueMain.MODID);

    public static final RegistryObject<ForgeSpawnEggItem> GREATWHITE_SPAWN_EGG = ITEMS.register("greatwhite_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.GREATWHITE, 0xb0b0b0, 0xd6d6d6, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<BucketItem> GREATWHITE_NET = ITEMS.register("greatwhite_net", () -> new MobBucketItem(DeepBlueEvent.GREATWHITE, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> MAKO_SPAWN_EGG = ITEMS.register("mako_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.MAKO, 0x5f83a5, 0xd6d6d6, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<BucketItem> MAKO_NET = ITEMS.register("mako_net", () -> new MobBucketItem(DeepBlueEvent.MAKO, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> BLUEWHALE_SPAWN_EGG = ITEMS.register("bluewhale_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.BLUEWHALE, 0x314457, 0xc9c9c0, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<BucketItem> BLUEWHALE_NET = ITEMS.register("bluewhale_net", () -> new MobBucketItem(DeepBlueEvent.BLUEWHALE, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> WHALESHARK_SPAWN_EGG = ITEMS.register("whaleshark_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.WHALESHARK, 0x6795ad, 0xb0c7d1, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<BucketItem> WHALESHARK_NET = ITEMS.register("whaleshark_net", () -> new MobBucketItem(DeepBlueEvent.WHALESHARK, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> HAMMERHEAD_SPAWN_EGG = ITEMS.register("hammerhead_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.HAMMERHEAD, 0x757575, 0xd4d4d4, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<BucketItem> HAMMERHEAD_NET = ITEMS.register("hammerhead_net", () -> new MobBucketItem(DeepBlueEvent.HAMMERHEAD, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> COEL_SPAWN_EGG = ITEMS.register("coel_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.COEL, 0x5681a8, 0xa3cb40, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<BucketItem> COEL_BUCKET = ITEMS.register("coel_bucket", () -> new MobBucketItem(DeepBlueEvent.COEL, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ForgeSpawnEggItem> KRILL_SPAWN_EGG = ITEMS.register("krill_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.KRILL, 0xe87171, 0xcec9b9b, new Item.Properties().stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> SHRIMP_SPAWN_EGG = ITEMS.register("shrimp_spawn_egg", () -> new ForgeSpawnEggItem(DeepBlueEvent.SHRIMP, 0xef644e, 0xf9a48d, new Item.Properties().stacksTo(64)));


    //Loot
    public static final RegistryObject<Item> SHARK_MEAT = ITEMS.register("shark_meat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().build())));
    public static final RegistryObject<Item> COOKED_SHARK_MEAT = ITEMS.register("cooked_shark_meat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).meat().build())));

    public static final RegistryObject<Item> WHALE_MEAT = ITEMS.register("whale_meat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().build())));
    public static final RegistryObject<Item> COOKED_WHALE_MEAT = ITEMS.register("cooked_whale_meat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).meat().build())));

    public static final RegistryObject<Item> KRILL_ITEM = ITEMS.register("krill_item",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0).meat().build())));

    public static final RegistryObject<Item> SHRIMP_ITEM = ITEMS.register("shrimp_item",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0).meat().build())));
    public static final RegistryObject<Item> COOKED_SHRIMP = ITEMS.register("cooked_shrimp",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).meat().build())));


    public static final RegistryObject<Item> WHALE_BALEEN = ITEMS.register("whale_baleen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUBBER = ITEMS.register("blubber",
            () -> new BlubberItem(new Item.Properties()));
    public static final RegistryObject<Item> SHARK_LEATHER = ITEMS.register("shark_leather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARK_FIN = ITEMS.register("shark_fin",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}