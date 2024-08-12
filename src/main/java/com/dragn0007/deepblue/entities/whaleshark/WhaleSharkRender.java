package com.dragn0007.deepblue.entities.whaleshark;


import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WhaleSharkRender extends GeoEntityRenderer<WhaleShark> {
    public WhaleSharkRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WhaleSharkModel());
    }
}
