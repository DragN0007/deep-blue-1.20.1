package com.dragn0007.deepblue.entities.whaleshark;

import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WhaleSharkModel extends GeoModel<WhaleShark> {

    public static final ResourceLocation MODEL_RESOURCE_LOCATION = new ResourceLocation(DeepBlueMain.MODID, "geo/whaleshark.geo.json");
    public static final ResourceLocation animationResource = new ResourceLocation(DeepBlueMain.MODID, "animations/shark1.animation.json");

    @Override
    public ResourceLocation getModelResource(WhaleShark greatWhite) {
        return MODEL_RESOURCE_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(WhaleShark greatWhite) {
        return WhaleSharkVariant.patternFromOrdinal(greatWhite.getTexture()).resourceLocation;
    }

    @Override
    public ResourceLocation getAnimationResource(WhaleShark greatWhite) {
        return animationResource;
    }
}
