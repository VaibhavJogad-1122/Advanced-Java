package com.app.services;

import java.util.List;

import com.app.entities.Railway;

public interface RailwayService {

    List<Railway> getRailwayDetails();
    Railway addRailway(Railway r);
    
}
