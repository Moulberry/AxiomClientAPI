package com.moulberry.axiomclientapi.regions;

import com.moulberry.axiomclientapi.IAxiomWorldRenderContext;
import com.moulberry.axiomclientapi.funcinterfaces.TriIntConsumer;
import net.minecraft.world.phys.Vec3;

public interface BooleanRegion {

    void render(IAxiomWorldRenderContext rc, Vec3 translation, long time, int effects);
    void forEach(TriIntConsumer consumer);

    boolean add(int x, int y, int z);

    void close();
    void clear();
    boolean contains(int x, int y, int z);

}
