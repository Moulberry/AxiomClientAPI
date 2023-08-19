package com.moulberry.axiomclientapi.service;

import com.moulberry.axiomclientapi.pathers.ToolPatherPoint;
import com.moulberry.axiomclientapi.regions.BlockRegion;

public interface ToolPatherPointProvider {

    /**
     * @param includeNonSolid Whether to include non-solid blocks eg. tall grass in the raycast
     */
    ToolPatherPoint create(boolean includeNonSolid);

}
