package com.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.RailwayDto;
import com.app.entities.Category;
import com.app.entities.Railway;
import com.app.repossitory.RailwayRepo;
@Service
@Transactional
public class RailwayServiceImpl implements RailwayService{

	@Autowired
	private RailwayRepo railwayrepo;
	
	@Autowired
	private ModelMapper mapper;
	@Override
	public RailwayDto addrailway(RailwayDto new_railway) {
		// TODO Auto-generated method stub
		Railway valid_railway = mapper.map(new_railway, Railway.class);
		return mapper.map(railwayrepo.save(valid_railway),RailwayDto.class);
		
	}

	@Override
	public RailwayDto deleteRailway(Long railway_id) {
		// TODO Auto-generated method stub
		Railway railway = railwayrepo.findById(railway_id).orElseThrow(()-> new ResourceNotFoundException("Invalid Id"));
		railwayrepo.delete(railway);
		return mapper.map(railway, RailwayDto.class);
	}

	@Override
	public List<RailwayDto> getAllRailwayByCategory(Category category) {
		// TODO Auto-generated method stub
		List<RailwayDto> r = new ArrayList<RailwayDto>();
		List<Railway> railways = railwayrepo.findByCategory(category);
		railways.forEach((s)-> r.add(mapper.map(s, RailwayDto.class)));
		return r ;
	}

}
