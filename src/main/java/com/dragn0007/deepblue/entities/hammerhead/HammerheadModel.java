package com.dragn0007.deepblue.entities.hammerhead;

import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HammerheadModel extends GeoModel<Hammerhead> {

    public static final ResourceLocation MODEL_RESOURCE_LOCATION = new ResourceLocation(DeepBlueMain.MODID, "geo/hammerhead.geo.json");
    public static final ResourceLocation animationResource = new ResourceLocation(DeepBlueMain.MODID, "animations/shark1.animation.json");

    @Override
    public ResourceLocation getModelResource(Hammerhead greatWhite) {
        return MODEL_RESOURCE_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(Hammerhead greatWhite) {
        return HammerheadVariant.patternFromOrdinal(greatWhite.getTexture()).resourceLocation;
    }

    @Override
    public ResourceLocation getAnimationResource(Hammerhead greatWhite) {
        return animationResource;
    }
}
