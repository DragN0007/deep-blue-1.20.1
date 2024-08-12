package com.dragn0007.deepblue;

import com.dragn.bettas.biome.BettaBiomeModifier;
import com.dragn.bettas.item.BettasItemTab;
import com.dragn0007.deepblue.deepblueblocks.DeepBlueBlocks;
import com.dragn0007.deepblue.deepblueevent.DeepBlueEvent;
import com.dragn0007.deepblue.deepblueitems.DeepBlueItemTabModifier;
import com.dragn0007.deepblue.deepblueitems.DeepBlueItems;
import com.dragn0007.deepblue.util.config.DeepBlueCommonConfig;
import com.dragn0007.deepblue.world.gen.SpawnBiomeModifier;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod(DeepBlueMain.MODID)
public class DeepBlueMain
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "deepblue";

    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MODID);

    public static final RegistryObject<Codec<SpawnBiomeModifier>> DEEPBLUE_CODEC = BIOME_MODIFIER_SERIALIZERS.register("spawn_biome_modifier",
            () -> RecordCodecBuilder.create(builder ->
                    builder.group(Biome.LIST_CODEC.fieldOf("biomes").forGetter(SpawnBiomeModifier::biomes)).apply(builder, SpawnBiomeModifier::new)));

    public DeepBlueMain()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);

        eventBus.addListener(this::setup);
        DeepBlueItems.register(eventBus);
        DeepBlueBlocks.register(eventBus);
        DeepBlueEvent.ENTITY_TYPES.register(eventBus);
        BIOME_MODIFIER_SERIALIZERS.register(eventBus);
        DeepBlueItemTabModifier.register(eventBus);

        GeckoLib.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DeepBlueCommonConfig.SPEC, "deepblue-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }
}