package com.moulberry.axiomclientapi.service;

import com.moulberry.axiomclientapi.BallShapeType;
import com.moulberry.axiomclientapi.pathers.ToolPatherUnique;

public interface ToolPatherUniqueProvider {

    ToolPatherUnique create(int radius, BallShapeType ballShapeType);

}
