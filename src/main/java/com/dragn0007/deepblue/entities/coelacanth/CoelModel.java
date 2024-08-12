package com.dragn0007.deepblue.entities.coelacanth;

import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CoelModel extends GeoModel<Coel> {

    public static final ResourceLocation MODEL_RESOURCE_LOCATION = new ResourceLocation(DeepBlueMain.MODID, "geo/coelacanth.geo.json");
    public static final ResourceLocation animationResource = new ResourceLocation(DeepBlueMain.MODID, "animations/coelacanth.animation.json");

    @Override
    public ResourceLocation getModelResource(Coel koiEntity) {
        return MODEL_RESOURCE_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(Coel koiEntity) {
        return CoelVariant.patternFromOrdinal(koiEntity.getTexture()).resourceLocation;
    }

    @Override
    public ResourceLocation getAnimationResource(Coel koiEntity) {
        return animationResource;
    }
}
