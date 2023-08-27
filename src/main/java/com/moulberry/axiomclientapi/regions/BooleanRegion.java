package com.moulberry.axiomclientapi.regions;

import com.mojang.blaze3d.vertex.PoseStack;
import com.moulberry.axiomclientapi.funcinterfaces.TriIntConsumer;
import net.minecraft.client.Camera;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public interface BooleanRegion {

    void render(Camera camera, Vec3 translation, PoseStack matrix, Matrix4f projection, long time, int effects);
    void forEach(TriIntConsumer consumer);

    boolean add(int x, int y, int z);

    void close();
    void clear();
    boolean contains(int x, int y, int z);

}
