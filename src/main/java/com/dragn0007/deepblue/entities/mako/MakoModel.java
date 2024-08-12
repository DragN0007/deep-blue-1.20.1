package com.dragn0007.deepblue.entities.mako;

import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MakoModel extends GeoModel<Mako> {

    public static final ResourceLocation MODEL_RESOURCE_LOCATION = new ResourceLocation(DeepBlueMain.MODID, "geo/mako.geo.json");
    public static final ResourceLocation animationResource = new ResourceLocation(DeepBlueMain.MODID, "animations/shark1.animation.json");

    @Override
    public ResourceLocation getModelResource(Mako mako) {
        return MODEL_RESOURCE_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(Mako mako) {
        return MakoVariant.patternFromOrdinal(mako.getTexture()).resourceLocation;
    }

    @Override
    public ResourceLocation getAnimationResource(Mako mako) {
        return animationResource;
    }
}
