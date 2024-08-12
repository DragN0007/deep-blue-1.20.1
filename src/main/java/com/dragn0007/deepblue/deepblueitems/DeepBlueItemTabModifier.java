package com.dragn0007.deepblue.deepblueitems;

import com.dragn.bettas.BettasMain;
import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DeepBlueItemTabModifier {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeepBlueMain.MODID);

    public static final RegistryObject<CreativeModeTab> DEEPBLUE_TAB = CREATIVE_MODE_TABS.register("deepblue_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DeepBlueItems.GREATWHITE_NET.get())).title(Component.translatable("itemGroup.deepblue_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(DeepBlueItems.GREATWHITE_SPAWN_EGG.get());
                        output.accept(DeepBlueItems.GREATWHITE_NET.get());
                        output.accept(DeepBlueItems.HAMMERHEAD_SPAWN_EGG.get());
                        output.accept(DeepBlueItems.HAMMERHEAD_NET.get());
                        output.accept(DeepBlueItems.MAKO_SPAWN_EGG.get());
                        output.accept(DeepBlueItems.MAKO_NET.get());
                        output.accept(DeepBlueItems.WHALESHARK_SPAWN_EGG.get());
                        output.accept(DeepBlueItems.WHALESHARK_NET.get());
                        output.accept(DeepBlueItems.BLUEWHALE_SPAWN_EGG.get());
                        output.accept(DeepBlueItems.BLUEWHALE_NET.get());
                        output.accept(DeepBlueItems.COEL_SPAWN_EGG.get());
                        output.accept(DeepBlueItems.COEL_BUCKET.get());
                        output.accept(DeepBlueItems.SHRIMP_SPAWN_EGG.get());
                        output.accept(DeepBlueItems.KRILL_SPAWN_EGG.get());

                        output.accept(DeepBlueItems.SHARK_MEAT.get());
                        output.accept(DeepBlueItems.COOKED_SHARK_MEAT.get());
                        output.accept(DeepBlueItems.WHALE_MEAT.get());
                        output.accept(DeepBlueItems.COOKED_WHALE_MEAT.get());
                        output.accept(DeepBlueItems.WHALE_BALEEN.get());
                        output.accept(DeepBlueItems.BLUBBER.get());
                        output.accept(DeepBlueItems.SHARK_LEATHER.get());
                        output.accept(DeepBlueItems.SHARK_FIN.get());
                        output.accept(DeepBlueItems.SHRIMP_ITEM.get());
                        output.accept(DeepBlueItems.COOKED_SHRIMP.get());
                        output.accept(DeepBlueItems.KRILL_ITEM.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
