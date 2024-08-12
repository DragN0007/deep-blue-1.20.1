package com.dragn0007.deepblue.entities.shrimp_swarm;

import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShrimpSwarmModel extends GeoModel<ShrimpSwarm> {

    public static final ResourceLocation MODEL_RESOURCE_LOCATION = new ResourceLocation(DeepBlueMain.MODID, "geo/krill.geo.json");
    public static final ResourceLocation animationResource = new ResourceLocation(DeepBlueMain.MODID, "animations/krill.animation.json");

    @Override
    public ResourceLocation getModelResource(ShrimpSwarm ShrimpSwarm) {
        return MODEL_RESOURCE_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(ShrimpSwarm ShrimpSwarm) {
        return ShrimpSwarmVariant.patternFromOrdinal(ShrimpSwarm.getTexture()).resourceLocation;
    }

    @Override
    public ResourceLocation getAnimationResource(ShrimpSwarm ShrimpSwarm) {
        return animationResource;
    }
}
