package com.moulberry.axiomclientapi;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

public interface IAxiomWorldRenderContext {

    PoseStack poseStack();
    float partialTick();
    long nanos();
    Vec3 position();
    BlockPos blockPosition();
    float xRot();
    float yRot();
    Quaternionfc rotation();
    Matrix4fc projection();

}
