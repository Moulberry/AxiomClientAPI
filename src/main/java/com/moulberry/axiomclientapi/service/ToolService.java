package com.moulberry.axiomclientapi.service;

import com.moulberry.axiomclientapi.regions.BlockRegion;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

public interface ToolService {

    void pushBlockRegionChange(BlockRegion blockRegion);

    BlockState getActiveBlock();
    Vec3 getLookDirection();
    boolean isMouseDown(int button);

    ForkJoinPool getSharedPoolThreadExecutor();
    ExecutorService getSharedSingleThreadExecutor();

    void acquireChunkRenderOverrider(String id);
    void releaseChunkRenderOverrider(String id);
    void setBlockRenderOverride(int x, int y, int z, BlockState blockState);

}
