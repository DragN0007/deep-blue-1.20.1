package com.dragn0007.deepblue.entities.bluewhale;

import com.dragn0007.deepblue.DeepBlueMain;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlueWhaleModel extends GeoModel<BlueWhale> {

    public static final ResourceLocation MODEL_RESOURCE_LOCATION = new ResourceLocation(DeepBlueMain.MODID, "geo/bluewhale.geo.json");
    public static final ResourceLocation animationResource = new ResourceLocation(DeepBlueMain.MODID, "animations/whale1.animation.json");

    @Override
    public ResourceLocation getModelResource(BlueWhale greatWhite) {
        return MODEL_RESOURCE_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(BlueWhale BlueWhale) {
        return BlueWhaleVariant.patternFromOrdinal(BlueWhale.getTexture()).resourceLocation;
    }

    @Override
    public ResourceLocation getAnimationResource(BlueWhale greatWhite) {
        return animationResource;
    }
}
