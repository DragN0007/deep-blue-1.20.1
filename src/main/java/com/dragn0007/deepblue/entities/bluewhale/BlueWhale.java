package com.dragn0007.deepblue.entities.bluewhale;

import com.dragn.bettas.BettasMain;
import com.dragn0007.deepblue.deepblueitems.DeepBlueItems;
import com.dragn0007.deepblue.entities.AbstractSchoolingMarineMammal;
import com.dragn0007.deepblue.util.DeepBlueAnimations;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;

public class BlueWhale extends AbstractSchoolingMarineMammal implements GeoEntity {

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 50d)
                .add(Attributes.MOVEMENT_SPEED, 20d)
                .add(Attributes.ATTACK_DAMAGE, 20f);
    }

    public BlueWhale(EntityType<? extends AbstractSchoolingMarineMammal> entity, Level level) {
        super(entity, level);
        this.noCulling = true;
    }

    public int getMaxSchoolSize() {
        return 2;
    }

    //Net
    public void saveToBucketTag(ItemStack itemStack) {
        super.saveToBucketTag(itemStack);
        CompoundTag compoundTag = itemStack.getOrCreateTag();
        compoundTag.putInt("Variant", getTexture());
    }
    @Override
    public ItemStack getBucketItemStack() {
        return DeepBlueItems.BLUEWHALE_NET.get().getDefaultInstance();
    }


    //Animation
    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    private <T extends GeoAnimatable> PlayState predicate(software.bernie.geckolib.core.animation.AnimationState<T> tAnimationState) {
        if(tAnimationState.isMoving()) {
            if (isAggressive())
                tAnimationState.getController().setAnimation(RawAnimation.begin().then("swim", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        } else
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("swim", Animation.LoopType.LOOP));

        tAnimationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(final AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 2, this::predicate));
        controllers.add(DeepBlueAnimations.genericAttackAnimation(this, DeepBlueAnimations.ATTACK));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }


    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(BlueWhale.class, EntityDataSerializers.INT);
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
    }

    public int getTexture() {
        return this.entityData.get(VARIANT);
    }

    public void setTexture(int texture) {
        this.entityData.set(VARIANT, texture);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putInt("Variant", getTexture());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if(compoundTag.contains("Variant")) {
            setTexture(compoundTag.getInt("Variant"));
        }
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor levelAccessor, DifficultyInstance difficultyInstance, MobSpawnType mobSpawnType, @Nullable SpawnGroupData spawnGroupData, @Nullable CompoundTag compoundTag) {
        if(compoundTag != null && compoundTag.contains("Variant")) {
            setTexture(compoundTag.getInt("Variant"));
        } else {
            setTexture(BettasMain.RANDOM.nextInt(BlueWhaleVariant.values().length));
        }
        return super.finalizeSpawn(levelAccessor, difficultyInstance, mobSpawnType, spawnGroupData, compoundTag);
    }

}

