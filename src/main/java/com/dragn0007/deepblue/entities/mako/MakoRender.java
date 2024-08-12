package com.dragn0007.deepblue.entities.mako;


import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MakoRender extends GeoEntityRenderer<Mako> {
    public MakoRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MakoModel());
    }
}
