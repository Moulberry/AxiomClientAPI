package com.moulberry.axiomclientapi.service;

import com.moulberry.axiomclientapi.regions.BlockRegion;
import com.moulberry.axiomclientapi.regions.BooleanRegion;

public interface RegionProvider {

    BlockRegion createBlock();

    BooleanRegion createBoolean();

}
