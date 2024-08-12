package com.dragn0007.deepblue.entities.hammerhead;


import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HammerheadRender extends GeoEntityRenderer<Hammerhead> {
    public HammerheadRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HammerheadModel());
    }
}
