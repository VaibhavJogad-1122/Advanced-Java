package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Railway;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {
	
	@Autowired
	private RailwayRepository rwr;
	
	@Override
	public List<Railway> getRailwayDetails() {

		return rwr.findAll();
	}

	@Override
	public Railway addRailway(Railway r) {
		
		return rwr.save(r);
	}
	
	
	
	

}
