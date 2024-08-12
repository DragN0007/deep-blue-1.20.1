package com.dragn0007.deepblue.world.gen;

import com.dragn.bettas.BettasMain;
import com.dragn.bettas.util.config.BettasCommonConfig;
import com.dragn0007.deepblue.DeepBlueMain;
import com.dragn0007.deepblue.deepblueevent.DeepBlueEvent;
import com.dragn0007.deepblue.util.config.DeepBlueCommonConfig;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;

import java.util.List;

public record SpawnBiomeModifier(HolderSet<Biome> biomes) implements BiomeModifier {

    public static List<MobSpawnSettings.SpawnerData> OCEANS_SPAWNS = List.of(
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.BLUEWHALE.get(), DeepBlueCommonConfig.BLUEWHALE_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.GREATWHITE.get(), DeepBlueCommonConfig.GREATWHITE_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.MAKO.get(), DeepBlueCommonConfig.MAKO_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.COEL.get(), DeepBlueCommonConfig.COELACANTH_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.WHALESHARK.get(), DeepBlueCommonConfig.WHALESHARK_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.SHRIMP.get(), DeepBlueCommonConfig.SHRIMPSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.KRILL.get(), DeepBlueCommonConfig.KRILLSWARM_WEIGHT.get(), 1, 3)
    );

    public static List<MobSpawnSettings.SpawnerData> WARM_OCEANS_SPAWNS = List.of(
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.GREATWHITE.get(), DeepBlueCommonConfig.GREATWHITE_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.MAKO.get(), DeepBlueCommonConfig.MAKO_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.SHRIMP.get(), DeepBlueCommonConfig.SHRIMPSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.KRILL.get(), DeepBlueCommonConfig.KRILLSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.HAMMERHEAD.get(), DeepBlueCommonConfig.HAMMERHEAD_WEIGHT.get(), 1, 1)
    );

    public static List<MobSpawnSettings.SpawnerData> LUKEWARM_OCEANS_SPAWNS = List.of(
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.GREATWHITE.get(), DeepBlueCommonConfig.GREATWHITE_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.MAKO.get(), DeepBlueCommonConfig.MAKO_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.COEL.get(), DeepBlueCommonConfig.COELACANTH_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.SHRIMP.get(), DeepBlueCommonConfig.SHRIMPSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.KRILL.get(), DeepBlueCommonConfig.KRILLSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.HAMMERHEAD.get(), DeepBlueCommonConfig.HAMMERHEAD_WEIGHT.get(), 1, 1)
    );

    public static List<MobSpawnSettings.SpawnerData> COLD_OCEAN_SPAWNS = List.of(
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.BLUEWHALE.get(), DeepBlueCommonConfig.BLUEWHALE_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.GREATWHITE.get(), DeepBlueCommonConfig.GREATWHITE_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.MAKO.get(), DeepBlueCommonConfig.MAKO_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.COEL.get(), DeepBlueCommonConfig.COELACANTH_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.WHALESHARK.get(), DeepBlueCommonConfig.WHALESHARK_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.SHRIMP.get(), DeepBlueCommonConfig.SHRIMPSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.KRILL.get(), DeepBlueCommonConfig.KRILLSWARM_WEIGHT.get(), 1, 3)
    );

    public static List<MobSpawnSettings.SpawnerData> FROZEN_OCEAN_SPAWNS = List.of(
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.BLUEWHALE.get(), DeepBlueCommonConfig.BLUEWHALE_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.COEL.get(), DeepBlueCommonConfig.COELACANTH_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.WHALESHARK.get(), DeepBlueCommonConfig.WHALESHARK_WEIGHT.get(), 1, 1),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.SHRIMP.get(), DeepBlueCommonConfig.SHRIMPSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.KRILL.get(), DeepBlueCommonConfig.KRILLSWARM_WEIGHT.get(), 1, 3),
            new MobSpawnSettings.SpawnerData(DeepBlueEvent.HAMMERHEAD.get(), DeepBlueCommonConfig.HAMMERHEAD_WEIGHT.get(), 1, 1)
    );


    @Override
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if(phase == Phase.ADD && biomes.contains(biome)) {
            List<MobSpawnSettings.SpawnerData> spawner = builder.getMobSpawnSettings().getSpawner(MobCategory.WATER_AMBIENT);

            if(biome.is(Biomes.OCEAN) || biome.is(Biomes.DEEP_OCEAN)) {
                spawner.addAll(OCEANS_SPAWNS);

            } else if(biome.is(Biomes.WARM_OCEAN)) {
                spawner.addAll(WARM_OCEANS_SPAWNS);

            } else if(biome.is(Biomes.LUKEWARM_OCEAN) || biome.is(Biomes.DEEP_LUKEWARM_OCEAN)) {
                spawner.addAll(LUKEWARM_OCEANS_SPAWNS);

            } else if(biome.is(Biomes.COLD_OCEAN) || biome.is(Biomes.DEEP_COLD_OCEAN)) {
                spawner.addAll(COLD_OCEAN_SPAWNS);

            } else if(biome.is(Biomes.FROZEN_OCEAN) || biome.is(Biomes.DEEP_FROZEN_OCEAN)) {
                spawner.addAll(FROZEN_OCEAN_SPAWNS);

            }
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return DeepBlueMain.DEEPBLUE_CODEC.get();
    }
}
