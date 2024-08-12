package com.dragn0007.deepblue.entities.krill_swarm;


import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KrillSwarmRender extends GeoEntityRenderer<KrillSwarm> {
    public KrillSwarmRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KrillSwarmModel());
    }
}
