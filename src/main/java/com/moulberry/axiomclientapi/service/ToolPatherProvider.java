package com.moulberry.axiomclientapi.service;

import com.moulberry.axiomclientapi.pathers.BallShape;
import com.moulberry.axiomclientapi.pathers.ToolPatherPoint;
import com.moulberry.axiomclientapi.pathers.ToolPatherUnique;

public interface ToolPatherProvider {

    /**
     * @param includeNonSolid Whether to include non-solid blocks eg. tall grass in the raycast
     */
    ToolPatherPoint createPoint(boolean includeNonSolid);

    ToolPatherUnique createUnique(int radius, BallShape ballShape);

}
