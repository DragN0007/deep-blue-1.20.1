package com.dragn0007.deepblue.deepblueevent;


import com.dragn.bettas.BettasMain;
import com.dragn.bettas.betta.BettaEntity;
import com.dragn.bettas.betta.BettaRender;
import com.dragn.bettas.fish.freshwater.cherrybarb.CherryBarbRender;
import com.dragn.bettas.fish.freshwater.crystalshrimp.CrystalShrimpRender;
import com.dragn.bettas.fish.freshwater.ghostshrimp.GhostShrimpRender;
import com.dragn.bettas.fish.freshwater.glowfish.GlowFishRender;
import com.dragn.bettas.fish.freshwater.goldfish.GoldfishRender;
import com.dragn.bettas.fish.freshwater.guppy.GuppyRender;
import com.dragn.bettas.fish.freshwater.isopod.IsopodRender;
import com.dragn.bettas.fish.freshwater.koi.KoiRender;
import com.dragn.bettas.fish.freshwater.pleco.PlecoRender;
import com.dragn.bettas.fish.freshwater.salamander.SalamanderRender;
import com.dragn.bettas.fish.freshwater.silvershark.SilverSharkRender;
import com.dragn.bettas.fish.freshwater.snail.SnailRender;
import com.dragn.bettas.fish.freshwater.snakehead.SnakeheadRender;
import com.dragn.bettas.fish.freshwater.tetra.TetraRender;
import com.dragn.bettas.fish.saltwater.angelfish.AngelfishRender;
import com.dragn.bettas.fish.saltwater.clownfish.ClownfishRender;
import com.dragn.bettas.fish.saltwater.crab.CrabRender;
import com.dragn.bettas.fish.saltwater.filefish.FilefishRender;
import com.dragn.bettas.fish.saltwater.glaucus.GlaucusRender;
import com.dragn.bettas.fish.saltwater.jelly.JellyRender;
import com.dragn.bettas.fish.saltwater.peacockshrimp.PeacockShrimpRender;
import com.dragn.bettas.fish.saltwater.seadragon.SeadragonRender;
import com.dragn.bettas.fish.saltwater.seahorse.SeaHorseRender;
import com.dragn.bettas.fish.saltwater.seaslug.SeaSlugRender;
import com.dragn.bettas.fish.saltwater.seastar.SeaStarRender;
import com.dragn0007.deepblue.DeepBlueMain;
import com.dragn0007.deepblue.deepblueblocks.DeepBlueBlocks;
import com.dragn0007.deepblue.entities.AbstractMarineMammal;
import com.dragn0007.deepblue.entities.AbstractShark;
import com.dragn0007.deepblue.entities.bluewhale.BlueWhale;
import com.dragn0007.deepblue.entities.bluewhale.BlueWhaleRender;
import com.dragn0007.deepblue.entities.coelacanth.Coel;
import com.dragn0007.deepblue.entities.coelacanth.CoelRender;
import com.dragn0007.deepblue.entities.greatwhite.GreatWhite;
import com.dragn0007.deepblue.entities.greatwhite.GreatWhiteRender;
import com.dragn0007.deepblue.entities.hammerhead.Hammerhead;
import com.dragn0007.deepblue.entities.hammerhead.HammerheadRender;
import com.dragn0007.deepblue.entities.krill_swarm.KrillSwarm;
import com.dragn0007.deepblue.entities.krill_swarm.KrillSwarmRender;
import com.dragn0007.deepblue.entities.mako.Mako;
import com.dragn0007.deepblue.entities.mako.MakoRender;
import com.dragn0007.deepblue.entities.shrimp_swarm.ShrimpSwarm;
import com.dragn0007.deepblue.entities.shrimp_swarm.ShrimpSwarmRender;
import com.dragn0007.deepblue.entities.whaleshark.WhaleShark;
import com.dragn0007.deepblue.entities.whaleshark.WhaleSharkRender;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = DeepBlueMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DeepBlueEvent {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DeepBlueMain.MODID);

    public static final RegistryObject<EntityType<GreatWhite>> GREATWHITE = ENTITY_TYPES.register
            ("greatwhite", () -> EntityType.Builder.of
                    (GreatWhite::new, MobCategory.WATER_AMBIENT).sized(2f, 2f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "greatwhite").toString()));
    public static final RegistryObject<EntityType<Mako>> MAKO = ENTITY_TYPES.register
            ("mako", () -> EntityType.Builder.of
                    (Mako::new, MobCategory.WATER_AMBIENT).sized(1f, 1f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "mako").toString()));
    public static final RegistryObject<EntityType<BlueWhale>> BLUEWHALE = ENTITY_TYPES.register
            ("bluewhale", () -> EntityType.Builder.of
                    (BlueWhale::new, MobCategory.WATER_AMBIENT).sized(8f, 8f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "bluewhale").toString()));
    public static final RegistryObject<EntityType<WhaleShark>> WHALESHARK = ENTITY_TYPES.register
            ("whaleshark", () -> EntityType.Builder.of
                    (WhaleShark::new, MobCategory.WATER_AMBIENT).sized(4f, 4f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "whaleshark").toString()));
    public static final RegistryObject<EntityType<Hammerhead>> HAMMERHEAD = ENTITY_TYPES.register
            ("hammerhead", () -> EntityType.Builder.of
                    (Hammerhead::new, MobCategory.WATER_AMBIENT).sized(1.5f, 1.5f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "hammerhead").toString()));
    public static final RegistryObject<EntityType<Coel>> COEL = ENTITY_TYPES.register
            ("coel", () -> EntityType.Builder.of
                    (Coel::new, MobCategory.WATER_AMBIENT).sized(0.7f, 0.7f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "coel").toString()));
    public static final RegistryObject<EntityType<KrillSwarm>> KRILL = ENTITY_TYPES.register
            ("krill", () -> EntityType.Builder.of
                    (KrillSwarm::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.5f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "krill").toString()));
    public static final RegistryObject<EntityType<ShrimpSwarm>> SHRIMP = ENTITY_TYPES.register
            ("shrimp", () -> EntityType.Builder.of
                    (ShrimpSwarm::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.5f).build(new ResourceLocation(DeepBlueMain.MODID,
                    "shrimp").toString()));

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {
        event.put(GREATWHITE.get(), GreatWhite.createAttributes().build());
        event.put(MAKO.get(), GreatWhite.createAttributes().build());
        event.put(BLUEWHALE.get(), BlueWhale.createAttributes().build());
        event.put(WHALESHARK.get(), WhaleShark.createAttributes().build());
        event.put(HAMMERHEAD.get(), Hammerhead.createAttributes().build());
        event.put(COEL.get(), Coel.createAttributes().build());
        event.put(KRILL.get(), KrillSwarm.createAttributes().build());
        event.put(SHRIMP.get(), ShrimpSwarm.createAttributes().build());
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        /* REGISTER RENDERERS */
        EntityRenderers.register(GREATWHITE.get(), GreatWhiteRender::new);
        EntityRenderers.register(MAKO.get(), MakoRender::new);
        EntityRenderers.register(BLUEWHALE.get(), BlueWhaleRender::new);
        EntityRenderers.register(WHALESHARK.get(), WhaleSharkRender::new);
        EntityRenderers.register(HAMMERHEAD.get(), HammerheadRender::new);
        EntityRenderers.register(COEL.get(), CoelRender::new);
        EntityRenderers.register(KRILL.get(), KrillSwarmRender::new);
        EntityRenderers.register(SHRIMP.get(), ShrimpSwarmRender::new);

        /* BLOCK REGISTER RENDERERS */
        ItemBlockRenderTypes.setRenderLayer(DeepBlueBlocks.AQUA_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(DeepBlueBlocks.AQUA_GLASS_SLAB.get(), RenderType.translucent());
    }

    public static void spawnPlacementRegisterEvent(SpawnPlacementRegisterEvent event) {
        /* ENTITY REGISTER RENDERERS & SPAWN PLACEMENTS */
        event.register(GREATWHITE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);

        event.register(MAKO.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);

        event.register(BLUEWHALE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);

        event.register(WHALESHARK.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);

        event.register(HAMMERHEAD.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);

        event.register(COEL.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);

        event.register(KRILL.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);

        event.register(SHRIMP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.AND);
    }

}
