package com.dragn0007.deepblue.entities.coelacanth;


import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CoelRender extends GeoEntityRenderer<Coel> {
    public CoelRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CoelModel());
    }
}
