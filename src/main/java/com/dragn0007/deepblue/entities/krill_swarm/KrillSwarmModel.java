package com.dragn0007.deepblue.entities.krill_swarm;

import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class KrillSwarmModel extends GeoModel<KrillSwarm> {

    public static final ResourceLocation MODEL_RESOURCE_LOCATION = new ResourceLocation(DeepBlueMain.MODID, "geo/krill.geo.json");
    public static final ResourceLocation animationResource = new ResourceLocation(DeepBlueMain.MODID, "animations/krill.animation.json");

    @Override
    public ResourceLocation getModelResource(KrillSwarm KrillSwarm) {
        return MODEL_RESOURCE_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(KrillSwarm KrillSwarm) {
        return KrillSwarmVariant.patternFromOrdinal(KrillSwarm.getTexture()).resourceLocation;
    }

    @Override
    public ResourceLocation getAnimationResource(KrillSwarm KrillSwarm) {
        return animationResource;
    }
}
