package com.app.service;

import java.util.List;

import com.app.dto.RailwayDto;
import com.app.entities.Category;

public interface RailwayService {

	RailwayDto addrailway(RailwayDto new_railway);
	
	RailwayDto deleteRailway(Long railway_id);
	
	List<RailwayDto> getAllRailwayByCategory(Category category);
}
